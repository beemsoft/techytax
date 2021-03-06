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
package org.techytax.digipoort;

import nl.nltaxonomie._9_0.basis.bd.types.bd_codes.ContactItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.*;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.DateTimeItemType;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.techytax.domain.*;
import org.techytax.helper.AmountHelper;
import org.techytax.util.DateHelper;
import org.techytax.util.VersionHelper;
import org.xbrl._2003.instance.*;
import org.xbrl._2003.instance.ContextEntityType.Identifier;
import org.xbrl._2003.instance.ObjectFactory;
import org.xbrl._2003.xlink.SimpleType;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Component
public class XbrlNtp9Helper {

	private static final String CONTEXT_ID = "Msg";
	private static final String ISO_EURO = "iso4217:EUR";
	private static final String UNIT_ID = "u0";
	private static final String DECIMALS_TYPE = "INF";
	private static final String PACKAGE_VERSION = VersionHelper.getXbrlVersion();
	private static final String PACKAGE_NAME = "TechyTax";
	private static final String BELASTING_PLICHTIGE = "BPL";
	private static final String TEST_FISCAL_NUMBER = "001000045B93";

	@Resource
	private Environment environment;

	public String createXbrlInstance(VatDeclarationData vatDeclarationData) {
		ObjectFactory xbrlObjectFactory;
		JAXBContext jc;
		Marshaller m;
		try {
			xbrlObjectFactory = new ObjectFactory();
			jc = JAXBContext.newInstance(ObjectFactory.class, nl.nltaxonomie._9_0.domein.bd.tuples.bd_ob_tuples.ObjectFactory.class,
					nl.nltaxonomie._9_0.basis.bd.types.bd_types.ObjectFactory.class, org.xbrl._2006.xbrldi.ObjectFactory.class, org.xbrl._2003.xlink.ObjectFactory.class,
					nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.ObjectFactory.class, org.xbrl._2003.linkbase.ObjectFactory.class, org.xbrl._2005.xbrldt.ObjectFactory.class,
					nl.nltaxonomie._9_0.domein.bd.axes.bd_axes.ObjectFactory.class, nl.nltaxonomie._9_0.basis.bd.domains.bd_domains.ObjectFactory.class,
					nl.nltaxonomie.iso.iso4217.ObjectFactory.class, nl.nltaxonomie._9_0.basis.bd.items.bd_algemeen.ObjectFactory.class,
					nl.nltaxonomie._9_0.basis.bd.items.bd_omzetbelasting.ObjectFactory.class);
			m = jc.createMarshaller();
			StringWriter writer = new StringWriter();
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Xbrl xbrl = xbrlObjectFactory.createXbrl();

			org.xbrl._2003.xlink.ObjectFactory xlinkObjectFactory = new org.xbrl._2003.xlink.ObjectFactory();
			SimpleType simpleType = xlinkObjectFactory.createSimpleType();
			simpleType.setType("simple");
			simpleType.setHref("http://www.nltaxonomie.nl/9.0/report/bd/entrypoints/bd-rpt-ob-aangifte-2015.xsd");
			xbrl.getSchemaRef().add(simpleType);
			xbrl.getOtherAttributes().put(new QName("xml:lang"), "nl");

			Context context = xbrlObjectFactory.createContext();
			context.setId(CONTEXT_ID);

			ContextEntityType contextEntityType = xbrlObjectFactory.createContextEntityType();
			Identifier identifier = xbrlObjectFactory.createContextEntityTypeIdentifier();
			identifier.setScheme("www.belastingdienst.nl/omzetbelastingnummer");
			identifier.setValue(vatDeclarationData.getFiscalNumber());
			ContextPeriodType period = xbrlObjectFactory.createContextPeriodType();
			period.setStartDate(DateHelper.getDate(vatDeclarationData.getStartDate()));
			period.setEndDate(DateHelper.getDate(vatDeclarationData.getEndDate()));
			contextEntityType.setIdentifier(identifier);
			context.setEntity(contextEntityType);
			context.setPeriod(period);
			xbrl.getItemOrTupleOrContext().add(context);

			Unit unit = xbrlObjectFactory.createUnit();
			unit.setId(UNIT_ID);
			QName qName = new QName(ISO_EURO);
			unit.getMeasure().add(qName);
			xbrl.getItemOrTupleOrContext().add(unit);

			nl.nltaxonomie._9_0.basis.bd.types.bd_types.ObjectFactory bdTypeObjectFactory = new nl.nltaxonomie._9_0.basis.bd.types.bd_types.ObjectFactory();
			nl.nltaxonomie._9_0.basis.bd.items.bd_omzetbelasting.ObjectFactory bdItemObjectFactory = new nl.nltaxonomie._9_0.basis.bd.items.bd_omzetbelasting.ObjectFactory();
			nl.nltaxonomie._9_0.basis.bd.items.bd_algemeen.ObjectFactory bdAlgemeenObjectFactory = new nl.nltaxonomie._9_0.basis.bd.items.bd_algemeen.ObjectFactory();

			ContactItemType contactType = new ContactItemType();
			contactType.setValue(BELASTING_PLICHTIGE);
			contactType.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createContactType(contactType));

			Anstring10VItemType initials = bdTypeObjectFactory.createAnstring10VItemType();
			initials.setValue(vatDeclarationData.getInitials());
			initials.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createContactInitials(initials));

			if (StringUtils.isNotEmpty(vatDeclarationData.getPrefix())) {
				Anstring10VItemType prefix = bdTypeObjectFactory.createAnstring10VItemType();
				prefix.setValue(vatDeclarationData.getPrefix());
				prefix.setContextRef(context);
				xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createContactPrefix(prefix));
			}

			Anstring200VItemType surname = bdTypeObjectFactory.createAnstring200VItemType();
			surname.setValue(vatDeclarationData.getSurname());
			surname.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createContactSurname(surname));

			Anstring14VItemType telephoneNumber = bdTypeObjectFactory.createAnstring14VItemType();
			telephoneNumber.setValue(vatDeclarationData.getPhoneNumber());
			telephoneNumber.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createContactTelephoneNumber(telephoneNumber));

			DateTimeItemType dateTime = bdTypeObjectFactory.createDateTimeItemType();
			dateTime.setValue(DateHelper.getTimeStamp(new Date()));
			dateTime.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createDateTimeCreation(dateTime));

			Anstring20VItemType supplier = bdTypeObjectFactory.createAnstring20VItemType();
			supplier.setValue("OB-TechyTax-Ref-1");
			supplier.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createMessageReferenceSupplierVAT(supplier));

			Anstring20VItemType packageVersion = bdTypeObjectFactory.createAnstring20VItemType();
			packageVersion.setValue(PACKAGE_VERSION);
			packageVersion.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createSoftwarePackageVersion(packageVersion));

			Anstring30VItemType packageName = bdTypeObjectFactory.createAnstring30VItemType();
			packageName.setValue(PACKAGE_NAME);
			packageName.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createSoftwarePackageName(packageName));

			String softwareVendorAccountNumber = environment.getProperty("software.vendor.account.number");
			Anstring8FItemType softwareVendor = bdTypeObjectFactory.createAnstring8FItemType();
			softwareVendor.setValue(softwareVendorAccountNumber);
			softwareVendor.setContextRef(context);
			xbrl.getItemOrTupleOrContext().add(bdAlgemeenObjectFactory.createSoftwareVendorAccountNumber(softwareVendor));

			MonetaryNoDecimals10VItemType valueAddedTaxOnInput = bdTypeObjectFactory.createMonetaryNoDecimals10VItemType();
			valueAddedTaxOnInput.setDecimals(DECIMALS_TYPE);
			valueAddedTaxOnInput.setContextRef(context);
			valueAddedTaxOnInput.setUnitRef(unit);
			valueAddedTaxOnInput.setValue(vatDeclarationData.getValueAddedTaxOnInput());
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createValueAddedTaxOnInput(valueAddedTaxOnInput));

			MonetaryNoDecimals10VItemType valueAddedTaxOwed = bdTypeObjectFactory.createMonetaryNoDecimals10VItemType();
			valueAddedTaxOwed.setDecimals(DECIMALS_TYPE);
			valueAddedTaxOwed.setContextRef(context);
			valueAddedTaxOwed.setUnitRef(unit);
			valueAddedTaxOwed.setValue(vatDeclarationData.getValueAddedTaxOwed());
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createValueAddedTaxOwed(valueAddedTaxOwed));

			MonetaryNoDecimals9VItemType valueAddedTaxOwedToBePaidBack = bdTypeObjectFactory.createMonetaryNoDecimals9VItemType();
			valueAddedTaxOwedToBePaidBack.setDecimals(DECIMALS_TYPE);
			valueAddedTaxOwedToBePaidBack.setContextRef(context);
			valueAddedTaxOwedToBePaidBack.setUnitRef(unit);
			valueAddedTaxOwedToBePaidBack.setValue(vatDeclarationData.getValueAddedTaxOwedToBePaidBack());
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createValueAddedTaxOwedToBePaidBack(valueAddedTaxOwedToBePaidBack));

			MonetaryNoDecimals9VItemType valueAddedTaxPrivateUse = bdTypeObjectFactory.createMonetaryNoDecimals9VItemType();
			valueAddedTaxPrivateUse.setDecimals(DECIMALS_TYPE);
			valueAddedTaxPrivateUse.setContextRef(context);
			valueAddedTaxPrivateUse.setUnitRef(unit);
			valueAddedTaxPrivateUse.setValue(vatDeclarationData.getValueAddedTaxPrivateUse());
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createValueAddedTaxPrivateUse(valueAddedTaxPrivateUse));

			MonetaryNoDecimals9VItemType valueAddedTaxSuppliesServicesGeneralTariff = bdTypeObjectFactory.createMonetaryNoDecimals9VItemType();
			valueAddedTaxSuppliesServicesGeneralTariff.setDecimals(DECIMALS_TYPE);
			valueAddedTaxSuppliesServicesGeneralTariff.setContextRef(context);
			valueAddedTaxSuppliesServicesGeneralTariff.setUnitRef(unit);
			valueAddedTaxSuppliesServicesGeneralTariff.setValue(vatDeclarationData.getValueAddedTaxSuppliesServicesGeneralTariff());
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createValueAddedTaxSuppliesServicesGeneralTariff(valueAddedTaxSuppliesServicesGeneralTariff));

			MonetaryNoDecimals10VItemType turnoverSuppliesServicesGenerallTariff = bdTypeObjectFactory.createMonetaryNoDecimals10VItemType();
			turnoverSuppliesServicesGenerallTariff.setDecimals(DECIMALS_TYPE);
			turnoverSuppliesServicesGenerallTariff.setContextRef(context);
			turnoverSuppliesServicesGenerallTariff.setUnitRef(unit);
			turnoverSuppliesServicesGenerallTariff.setValue(vatDeclarationData.getTaxedTurnoverSuppliesServicesGeneralTariff());
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createTaxedTurnoverSuppliesServicesGeneralTariff(turnoverSuppliesServicesGenerallTariff));
			
			MonetaryNoDecimals10VItemType turnoverFromTaxedSuppliesFromCountriesWithinTheEC = bdTypeObjectFactory.createMonetaryNoDecimals10VItemType();
			turnoverFromTaxedSuppliesFromCountriesWithinTheEC.setDecimals(DECIMALS_TYPE);
			turnoverFromTaxedSuppliesFromCountriesWithinTheEC.setContextRef(context);
			turnoverFromTaxedSuppliesFromCountriesWithinTheEC.setUnitRef(unit);
			turnoverFromTaxedSuppliesFromCountriesWithinTheEC.setValue(vatDeclarationData.getTurnoverFromTaxedSuppliesFromCountriesWithinTheEC());			
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createTurnoverFromTaxedSuppliesFromCountriesWithinTheEC(turnoverFromTaxedSuppliesFromCountriesWithinTheEC));
			
			MonetaryNoDecimals9VItemType valueAddedTaxOnSuppliesFromCountriesWithinTheEC = bdTypeObjectFactory.createMonetaryNoDecimals9VItemType();
			valueAddedTaxOnSuppliesFromCountriesWithinTheEC.setDecimals(DECIMALS_TYPE);
			valueAddedTaxOnSuppliesFromCountriesWithinTheEC.setContextRef(context);
			valueAddedTaxOnSuppliesFromCountriesWithinTheEC.setUnitRef(unit);
			valueAddedTaxOnSuppliesFromCountriesWithinTheEC.setValue(vatDeclarationData.getValueAddedTaxOnSuppliesFromCountriesWithinTheEC());
			xbrl.getItemOrTupleOrContext().add(bdItemObjectFactory.createValueAddedTaxOnSuppliesFromCountriesWithinTheEC(valueAddedTaxOnSuppliesFromCountriesWithinTheEC));

			m.marshal(xbrl, writer);

			System.out.println(writer.toString());
			return writer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addBalanceData(VatDeclarationData vatDeclarationData, VatBalanceWithinEu vatBalanceWithinEu) throws Exception {
		BigInteger totaleKosten = AmountHelper.roundToInteger(vatBalanceWithinEu.getTotaleKosten());
		BigInteger correction = AmountHelper.roundToInteger(vatBalanceWithinEu.getCorrection());
		BigInteger turnover = vatBalanceWithinEu.getNettoOmzet();
		BigInteger totaleBaten = AmountHelper.roundDownToInteger(new BigDecimal(turnover).multiply(BigDecimal.valueOf(VatType.HIGH.getValue(new Date()))));
		BigInteger vatOutEu = vatBalanceWithinEu.getVatOutEu();
		BigInteger owed = totaleBaten.add(correction).add(vatOutEu);
		BigInteger owedToBePaidBack = owed.subtract(totaleKosten.add(vatOutEu));
		vatDeclarationData.setValueAddedTaxOwed(owed);
		vatDeclarationData.setValueAddedTaxOnInput(totaleKosten.add(vatOutEu));
		vatDeclarationData.setValueAddedTaxOwedToBePaidBack(owedToBePaidBack);
		vatDeclarationData.setValueAddedTaxPrivateUse(correction);
		vatDeclarationData.setValueAddedTaxSuppliesServicesGeneralTariff(totaleBaten);
		vatDeclarationData.setTaxedTurnoverSuppliesServicesGeneralTariff(turnover);
		vatDeclarationData.setTurnoverFromTaxedSuppliesFromCountriesWithinTheEC(vatBalanceWithinEu.getTurnoverNetEu());
		vatDeclarationData.setValueAddedTaxOnSuppliesFromCountriesWithinTheEC(vatOutEu);
	}

	public static void main(String[] args) throws Exception {
		new XbrlNtp9Helper().createTestXbrlInstance();
	}

	public String createTestXbrlInstance() throws Exception {
		User user = new User();
		user.setFiscalNumber(TEST_FISCAL_NUMBER);
		user.setInitials("A.");
		user.setSurname("Tester");
		user.setPhoneNumber("12345678");
		VatDeclarationData vatDeclarationData = new VatDeclarationData();
		FiscalPeriod period = DateHelper.getLatestVatPeriod(VatPeriodType.PER_QUARTER);
		vatDeclarationData.setStartDate(period.getBeginDate());
		vatDeclarationData.setEndDate(period.getEndDate());
		VatBalanceWithinEu balans = new VatBalanceWithinEu();
		balans.setTotaleKosten(BigDecimal.valueOf(95));
		balans.setCorrection(BigDecimal.valueOf(5));
		balans.setNettoOmzet(BigInteger.valueOf(191));
		balans.setTurnoverNetEu(BigInteger.ZERO);
		balans.setVatOutEu(BigInteger.ZERO);
		addBalanceData(vatDeclarationData, balans);
		return createXbrlInstance(vatDeclarationData);
	}
}
