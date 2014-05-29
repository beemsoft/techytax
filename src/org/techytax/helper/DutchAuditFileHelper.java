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

import static org.techytax.log.AuditType.SEND_AUDIT_FILE;

import java.io.StringWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import nl.auditfiles.xaf._3.Auditfile;
import nl.auditfiles.xaf._3.Auditfile.Company;
import nl.auditfiles.xaf._3.Auditfile.Company.CustomersSuppliers;
import nl.auditfiles.xaf._3.Auditfile.Company.CustomersSuppliers.CustomerSupplier;
import nl.auditfiles.xaf._3.Auditfile.Company.CustomersSuppliers.CustomerSupplier.StreetAddress;
import nl.auditfiles.xaf._3.Auditfile.Company.GeneralLedger;
import nl.auditfiles.xaf._3.Auditfile.Company.GeneralLedger.Basics;
import nl.auditfiles.xaf._3.Auditfile.Company.GeneralLedger.Basics.Basic;
import nl.auditfiles.xaf._3.Auditfile.Company.OpeningBalance;
import nl.auditfiles.xaf._3.Auditfile.Company.Periods;
import nl.auditfiles.xaf._3.Auditfile.Company.Periods.Period;
import nl.auditfiles.xaf._3.Auditfile.Company.Transactions;
import nl.auditfiles.xaf._3.Auditfile.Company.Transactions.Journal;
import nl.auditfiles.xaf._3.Auditfile.Company.Transactions.Journal.Transaction;
import nl.auditfiles.xaf._3.Auditfile.Company.Transactions.Journal.Transaction.TrLine;
import nl.auditfiles.xaf._3.Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat;
import nl.auditfiles.xaf._3.Auditfile.Header;
import nl.auditfiles.xaf._3.CountrycodeIso3166;
import nl.auditfiles.xaf._3.CurrencycodeIso4217;
import nl.auditfiles.xaf._3.ObjectFactory;

import org.techytax.dao.CostDao;
import org.techytax.domain.Cost;
import org.techytax.domain.Customer;
import org.techytax.domain.FiscalPeriod;
import org.techytax.domain.User;
import org.techytax.jpa.dao.GenericDao;
import org.techytax.log.AuditLogger;
import org.techytax.mail.MailHelper;
import org.techytax.props.PropsFactory;
import org.techytax.util.DateHelper;

public class DutchAuditFileHelper {

	public static void sendAuditFile(User user, FiscalPeriod periode) {
		AuditLogger.log(SEND_AUDIT_FILE, user);
		try {
			List<Cost> allCosts = new ArrayList<>();
			if (periode != null) {
				CostDao costDao = new CostDao(Cost.class);				
				allCosts = costDao.getCostsInPeriod(periode);
				// TODO: sort costs
			}
			GenericDao<Customer> customerDao = new GenericDao<>(Customer.class);
			List<Customer> customers = customerDao.findAll(user);
			String message = DutchAuditFileHelper.createAuditFile(allCosts, customers, user);
			MailHelper.sendAuditReport(message, user.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Transaction createTransaction(Cost cost) throws Exception {
		ObjectFactory objectFactory = new ObjectFactory();
		Transaction transaction = objectFactory.createAuditfileCompanyTransactionsJournalTransaction();
		transaction.setAmnt(cost.getAmount());
		transaction.setDesc(cost.getDescription().trim());
		transaction.setNr(Long.toString(cost.getId()));
		transaction.setTrDt(DateHelper.getDate(DateHelper.getDate(cost.getDate())));
		if (cost.getVat() != null && cost.getVat().floatValue() > 0) {
			TrLine trLine = objectFactory.createAuditfileCompanyTransactionsJournalTransactionTrLine();
			Vat vat = objectFactory.createAuditfileCompanyTransactionsJournalTransactionTrLineVat();
			vat.setVatAmnt(cost.getVat());
			trLine.getVat().add(vat);
			transaction.getTrLine().add(trLine);
		}
		return transaction;
	}

	public static String createAuditFile(List<Cost> costList, List<Customer> customers, User user) throws DatatypeConfigurationException {

		JAXBContext jc = null;
		Marshaller m = null;
		try {
			jc = JAXBContext.newInstance("nl.auditfiles.xaf._3");
			m = jc.createMarshaller();
			StringWriter writer = new StringWriter();
			m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			ObjectFactory objectFactory = new ObjectFactory();
			Auditfile auditfile = objectFactory.createAuditfile();
			Company company = objectFactory.createAuditfileCompany();
			company.setCompanyName(user.getCompanyName());
			if (user.getChamberOfCommerceNumber() != null) {
				company.setCompanyIdent(Long.toString(user.getChamberOfCommerceNumber()));
			}
			company.setTaxRegIdent(user.getFiscalNumber());
			company.setTaxRegistrationCountry(CountrycodeIso3166.NL);

			CustomersSuppliers customersElement = objectFactory.createAuditfileCompanyCustomersSuppliers();
			for (Customer customer : customers) {
				CustomerSupplier customerElement = objectFactory.createAuditfileCompanyCustomersSuppliersCustomerSupplier();
				customerElement.setContact(customer.getContact());
				customerElement.setEMail(customer.getEmailInvoice());
				customerElement.setCustSupName(customer.getName());
				customerElement.setContact(customer.getContact());
				if (customer.getCommerceNr() != null) {
					customerElement.setCommerceNr(customer.getCommerceNr().toString());
				}
				customerElement.setFax(customer.getFax());
				customerElement.setTelephone(customer.getTelephone());
				customerElement.setWebsite(customer.getWebsite());
				StreetAddress address = objectFactory.createAuditfileCompanyCustomersSuppliersCustomerSupplierStreetAddress();
				address.setStreetname(customer.getAddress());
				address.setCity(customer.getCity());
				if (customer.getNumber() != null) {
					address.setNumber(customer.getNumber().toString());
				}
				address.setNumberExtension(customer.getNumberExtension());
				address.setPostalCode(customer.getPostalCode());
				address.setCountry(CountrycodeIso3166.NL);
				customerElement.getStreetAddress().add(address);
				customersElement.getCustomerSupplier().add(customerElement);
			}
			company.setCustomersSuppliers(customersElement);

			GeneralLedger generalLedger = objectFactory.createAuditfileCompanyGeneralLedger();
			Basics basics = objectFactory.createAuditfileCompanyGeneralLedgerBasics();
			// basics.
			Basic basic = objectFactory.createAuditfileCompanyGeneralLedgerBasicsBasic();

			generalLedger.setBasics(basics);
			// company.setGeneralLedger(generalLedger);

			OpeningBalance openingBalance = objectFactory.createAuditfileCompanyOpeningBalance();
			// company.setOpeningBalance(openingBalance);

			Periods periods = objectFactory.createAuditfileCompanyPeriods();
			Period period = objectFactory.createAuditfileCompanyPeriodsPeriod();
			period.setPeriodNumber(new BigInteger("1")); // referenced by
															// transactions
			period.setPeriodDesc("Period");
			periods.getPeriod().add(period);
			// company.setPeriods(periods);

			auditfile.setCompany(company);

			Header header = objectFactory.createAuditfileHeader();
			header.setCurCode(CurrencycodeIso4217.EUR);
			int year = 0;
			if (costList != null && costList.size() > 0) {
				Cost firstCost = (Cost) costList.get(0);
				Date firstDate = firstCost.getDate();
				year = DateHelper.getYear(firstDate);
			} else {
				year = DateHelper.getYear(new Date());
			}
			header.setFiscalYear(Integer.toString(year));
			header.setDateCreated(DateHelper.getDate(DateHelper.getDate(new Date())));
			header.setSoftwareDesc("TechyTax");
			header.setSoftwareVersion("2.1");

			auditfile.setHeader(header);

			// Transactions
			Transactions transactions = objectFactory.createAuditfileCompanyTransactions();
			transactions.setLinesCount(new BigInteger(Long.toString(costList.size())));

			String currentKostenSoortOmschrijving = null;
			Journal journal = null;

			for (Cost cost : costList) {
				String kostenSoortOmschrijving = cost.getCostType().getOmschrijving();
				Transaction transaction = createTransaction(cost);
				if (!kostenSoortOmschrijving.equals(currentKostenSoortOmschrijving)) {
					currentKostenSoortOmschrijving = kostenSoortOmschrijving;
					if (journal != null) {
						// Add the previous journal
						transactions.getJournal().add(journal);
					}
					// Start a new journal
					journal = objectFactory.createAuditfileCompanyTransactionsJournal();
					journal.setDesc(cost.getCostType().getOmschrijving().trim());
				}
				journal.getTransaction().add(transaction);
			}
			if (journal != null) {
				transactions.getJournal().add(journal);
			}
			company.setTransactions(transactions);
			auditfile.setCompany(company);

			m.marshal(auditfile, writer);
			System.out.println(writer.toString());
			return writer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
