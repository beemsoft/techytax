/**
 * Copyright 2014 Hans Beemsterboer
 * 
 * This file is part of the TechyTax program.
 *
 * TechyTax is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * TechyTax is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TechyTax; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.techytax.helper;

import static org.techytax.domain.BalanceType.CAR;
import static org.techytax.domain.BalanceType.CURRENT_ASSETS;
import static org.techytax.domain.BalanceType.INVOICES_TO_BE_PAID;
import static org.techytax.domain.BalanceType.MACHINERY;
import static org.techytax.domain.BalanceType.OFFICE;
import static org.techytax.domain.BalanceType.STOCK;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.techytax.cache.CostCache;
import org.techytax.dao.ActivumDao;
import org.techytax.dao.BookValueDao;
import org.techytax.domain.Activum;
import org.techytax.domain.BalanceType;
import org.techytax.domain.BookValue;
import org.techytax.domain.Cost;
import org.techytax.domain.DeductableCostGroup;
import org.techytax.domain.FiscalBalance;
import org.techytax.domain.FiscalOverview;
import org.techytax.domain.Liquiditeit;
import org.techytax.util.DateHelper;
import org.techytax.zk.login.UserCredentialManager;

@Component
public class ActivaHelper {

	public FiscalOverview getFiscalOverview() {
		return fiscalOverview;
	}

	public void setFiscalOverview(FiscalOverview fiscalOverview) {
		this.fiscalOverview = fiscalOverview;
	}

	public CostCache getCostCache() {
		return costCache;
	}

	public void setCostCache(CostCache costCache) {
		this.costCache = costCache;
	}

	@Autowired
	private BookValueDao bookValueDao;
	
	@Autowired
	private ActivumDao activumDao;
	
	private FiscalOverview fiscalOverview;
	private CostCache costCache;
	private int bookYear = DateHelper.getYear(new Date()) - 1;
	private Map<BalanceType, FiscalBalance> activaMap = new HashMap<>();
	
	@Autowired
	private BalanceCalculator balanceCalculator;

	public Map<BalanceType, FiscalBalance> handleActiva(Properties props, List<DeductableCostGroup> deductableCosts, List<Cost> rekeningLijst) throws Exception {

		handleCurrentAssets(props, rekeningLijst);

		handleMachinery();

		handleSettlement(deductableCosts);

		handleBusinessCar();

		handleStock();

		handleInvoicesToBePaid();

		return activaMap;

	}

	public List<Activum> getActiveActiva() throws Exception {
		return activumDao.getActiveActiva();
	}

	private void handleInvoicesToBePaid() throws Exception {
		BookValue currentBookValue = bookValueDao.getBookValue(INVOICES_TO_BE_PAID, bookYear);
		BookValue previousBookValue = bookValueDao.getBookValue(INVOICES_TO_BE_PAID, bookYear - 1);

		BigDecimal turnOverUnpaid = fiscalOverview.getTurnOverUnpaid();
		if (turnOverUnpaid != null && turnOverUnpaid.compareTo(BigDecimal.ZERO) != 0) {
			BigInteger saldo = AmountHelper.roundToInteger(turnOverUnpaid);
			BookValue newBookValue = new BookValue(INVOICES_TO_BE_PAID, bookYear, saldo);
			newBookValue.setUser(UserCredentialManager.getUser());

			if (currentBookValue == null) {
				bookValueDao.persistEntity(newBookValue);
			} else {
				currentBookValue.setSaldo(saldo);
			}
		}
		if (previousBookValue != null || currentBookValue != null) {
			FiscalBalance fiscalBalance = new FiscalBalance();
			if (previousBookValue != null) {
				fiscalBalance.setBeginSaldo(previousBookValue.getSaldo());
			}
			if (currentBookValue != null) {
				fiscalBalance.setEndSaldo(currentBookValue.getSaldo());
			}
			activaMap.put(INVOICES_TO_BE_PAID, fiscalBalance);
		}
	}

	private void handleStock() throws Exception {
		BookValue currentBookValue = bookValueDao.getBookValue(BalanceType.STOCK, bookYear);
		BookValue previousBookValue = bookValueDao.getBookValue(BalanceType.STOCK, bookYear - 1);
		if (fiscalOverview.getRepurchase() != null && fiscalOverview.getRepurchase().intValue() > 0) {
			if (currentBookValue == null) {
				if (previousBookValue == null) {
					BookValue newBookValue = new BookValue(STOCK, bookYear, fiscalOverview.getRepurchase());
					newBookValue.setUser(UserCredentialManager.getUser());
					bookValueDao.persistEntity(newBookValue);
				} else {
					BookValue newBookValue = new BookValue(STOCK, bookYear, fiscalOverview.getRepurchase());
					newBookValue.setSaldo(previousBookValue.getSaldo().add(fiscalOverview.getRepurchase()));
					bookValueDao.persistEntity(newBookValue);
				}
			}
		}
		if (previousBookValue != null || currentBookValue != null) {
			FiscalBalance fiscalBalance = new FiscalBalance();
			if (previousBookValue != null) {
				fiscalBalance.setBeginSaldo(previousBookValue.getSaldo());
			}
			if (currentBookValue != null) {
				fiscalBalance.setEndSaldo(currentBookValue.getSaldo());
			}
			activaMap.put(STOCK, fiscalBalance);
		}
	}

	private void handleBusinessCar() throws Exception {
		BigInteger carDepreciation = fiscalOverview.getAfschrijvingAuto();
		BookValue currentBookValue = bookValueDao.getBookValue(CAR, bookYear);
		BookValue previousBookValue = bookValueDao.getBookValue(CAR, bookYear - 1);

		List<Activum> allActiva = activumDao.getActiveActiva(CAR);
		BigDecimal totalPurchaseCostForAllActiva = BigDecimal.ZERO;
		BigInteger totalRemainingValue = BigInteger.ZERO;
		for (Activum activum2 : allActiva) {
			totalPurchaseCostForAllActiva = totalPurchaseCostForAllActiva.add(activum2.getCost().getAmount());
			totalRemainingValue = totalRemainingValue.add(activum2.getRemainingValue());
		}

		if (previousBookValue != null) {
			BigInteger carBookValue = previousBookValue.getSaldo();
			if (currentBookValue == null) {
				BookValue newValue = new BookValue();
				newValue.setBalanceType(CAR);
				newValue.setUser(UserCredentialManager.getUser());
				newValue.setJaar(bookYear);
				newValue.setSaldo(carBookValue.subtract(carDepreciation));
				bookValueDao.persistEntity(newValue);
			} else {
				currentBookValue.setSaldo(carBookValue.subtract(carDepreciation));
			}
		}
		if (previousBookValue != null || currentBookValue != null) {
			FiscalBalance fiscalBalance = new FiscalBalance();
			fiscalBalance.setBeginSaldo(previousBookValue.getSaldo());
			fiscalBalance.setEndSaldo(currentBookValue.getSaldo());
			fiscalBalance.setTotalPurchaseCost(totalPurchaseCostForAllActiva);
			fiscalBalance.setTotalRemainingValue(totalRemainingValue);
			activaMap.put(CAR, fiscalBalance);
		}
	}

	private void handleMachinery() throws Exception {
		BalanceType balanceType = MACHINERY;

		BookValue previousBookValue = bookValueDao.getBookValue(balanceType, bookYear - 1);
		BookValue currentBookValue = bookValueDao.getBookValue(balanceType, bookYear);

		Activum activum = createActivum(balanceType);
		activum.setEndDate(costCache.getBeginDatum());
		List<Activum> newActiva = activumDao.getNewActiva(balanceType, costCache.getBeginDatum(), costCache.getEindDatum());
		BigDecimal totalCost = BigDecimal.ZERO;
		for (Activum activum2 : newActiva) {
			totalCost = totalCost.add(activum2.getCost().getAmount());
		}
		BigInteger totalCostForNewActiva = AmountHelper.roundToInteger(totalCost);

		List<Activum> allActiva = activumDao.getActiveActiva(balanceType);
		BigDecimal totalPurchaseCostForAllActiva = BigDecimal.ZERO;
		BigInteger totalRemainingValue = BigInteger.ZERO;
		for (Activum activum2 : allActiva) {
			totalPurchaseCostForAllActiva = totalPurchaseCostForAllActiva.add(activum2.getCost().getAmount());
			totalRemainingValue = totalRemainingValue.add(activum2.getRemainingValue());
		}
		if (currentBookValue != null && previousBookValue != null) {
			BigInteger newSaldo = previousBookValue.getSaldo().add(totalCostForNewActiva).subtract(fiscalOverview.getAfschrijvingOverig());
			if (totalRemainingValue.compareTo(newSaldo) == -1) {
				currentBookValue.setSaldo(newSaldo);
			} else {
				currentBookValue.setSaldo(totalRemainingValue);
			}
		} else {
			insertOrUpdateBookValue(balanceType, currentBookValue, totalCostForNewActiva);
		}
		if (previousBookValue != null || currentBookValue != null) {
			FiscalBalance fiscalBalance = new FiscalBalance();
			fiscalBalance.setBeginSaldo(previousBookValue.getSaldo());
			fiscalBalance.setEndSaldo(currentBookValue.getSaldo());
			fiscalBalance.setTotalPurchaseCost(totalPurchaseCostForAllActiva);
			fiscalBalance.setTotalRemainingValue(totalRemainingValue);
			activaMap.put(balanceType, fiscalBalance);
		}
	}

	private void insertOrUpdateBookValue(BalanceType balanceType, BookValue currentBookValue, BigInteger totalCost) {
		if (totalCost.compareTo(BigInteger.ZERO) == 1) {
			if (currentBookValue == null) {
				BookValue bookValue = createBookValue(balanceType);
				bookValue.setSaldo(totalCost);
				bookValueDao.persistEntity(bookValue);
			} else {
				currentBookValue.setSaldo(totalCost);
			}
		}
	}

	private Activum createActivum(BalanceType balanceType) {
		Activum activum = new Activum();
		activum.setUser(UserCredentialManager.getUser());
		activum.setBalanceType(balanceType);
		return activum;
	}

	private BookValue createBookValue(BalanceType balanceType) {
		BookValue bookValue = new BookValue();
		bookValue.setJaar(bookYear);
		bookValue.setBalanceType(balanceType);
		bookValue.setUser(UserCredentialManager.getUser());
		return bookValue;
	}

	private void handleSettlement(List<DeductableCostGroup> deductableCosts) throws Exception {
		BookValue previousBookValue = bookValueDao.getBookValue(BalanceType.OFFICE, bookYear - 1);
		BookValue currentBookValue = bookValueDao.getBookValue(BalanceType.OFFICE, bookYear);

		List<Activum> allActiva = activumDao.getActiveActiva(OFFICE);
		BigDecimal totalCostForActivum = BigDecimal.ZERO;
		for (Activum activum2 : allActiva) {
			totalCostForActivum = totalCostForActivum.add(activum2.getCost().getAmount());
		}
		BigInteger totalCost = AmountHelper.roundToInteger(totalCostForActivum);

		if (previousBookValue != null) {
			BigDecimal depreciationSettlement = balanceCalculator.getDepreciationSettlement(deductableCosts);
			BigInteger newSaldo = previousBookValue.getSaldo().subtract(depreciationSettlement.toBigInteger());
			if (currentBookValue == null) {
			} else {
				currentBookValue.setSaldo(newSaldo);
				bookValueDao.merge(currentBookValue);
			}

		} else {
			if (totalCost.compareTo(BigInteger.ZERO) == 1) {
				if (currentBookValue == null) {
					BookValue newBookValue = new BookValue(OFFICE, bookYear, totalCost);
					newBookValue.setUser(UserCredentialManager.getUser());
					bookValueDao.persistEntity(newBookValue);
				} else {
					currentBookValue.setSaldo(totalCost);
					bookValueDao.merge(currentBookValue);
				}
			}
		}
		if (previousBookValue != null || currentBookValue != null) {
			FiscalBalance fiscalBalance = new FiscalBalance();
			fiscalBalance.setBeginSaldo(previousBookValue.getSaldo());
			fiscalBalance.setEndSaldo(currentBookValue.getSaldo());
			activaMap.put(OFFICE, fiscalBalance);
		}

	}

	private void handleCurrentAssets(Properties props, List<Cost> rekeningLijst) throws Exception {
		Liquiditeit liquiditeit = balanceCalculator.calculateAccountBalance(rekeningLijst);
		BookValue previousBookValue = bookValueDao.getBookValue(BalanceType.CURRENT_ASSETS, bookYear - 1);
		BookValue currentBookValue = bookValueDao.getBookValue(BalanceType.CURRENT_ASSETS, bookYear);
		if (currentBookValue == null) {
			BigInteger saldo = liquiditeit.getRekeningBalans().toBigInteger();
			saldo = saldo.add(liquiditeit.getSpaarBalans().toBigInteger());
			BookValue newBookValue = new BookValue(CURRENT_ASSETS, bookYear, saldo);
			newBookValue.setUser(UserCredentialManager.getUser());
			bookValueDao.persistEntity(newBookValue);
		} else {
			BigInteger saldo = BigInteger.ZERO;
			if (previousBookValue != null) {
				saldo = previousBookValue.getSaldo();
			}
			saldo = saldo.add(liquiditeit.getRekeningBalans().toBigInteger());
			saldo = saldo.add(liquiditeit.getSpaarBalans().toBigInteger());
			currentBookValue.setSaldo(saldo);
		}
		if (previousBookValue != null || currentBookValue != null) {
			FiscalBalance fiscalBalance = new FiscalBalance();
			if (previousBookValue != null) {
				fiscalBalance.setBeginSaldo(previousBookValue.getSaldo());
			}
			fiscalBalance.setEndSaldo(currentBookValue.getSaldo());
			activaMap.put(CURRENT_ASSETS, fiscalBalance);
		}
	}

}