/**
 * Copyright 2013 Hans Beemsterboer
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

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import nl.nltaxonomie._7_0.basis.bd.types.bd_types.ACAPITALstring4FItemType;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.Anstring25VItemType;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.Anstring2FItemType;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.Anstring35VItemType;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.DateTimeItemType;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.MessageReferenceSupplierVATItemType;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.MonetaryNoDecimals9VItemType;
import nl.nltaxonomie._7_0.domein.bd.tuples.bd_alg_tuples.CorrespondentDeclarant;
import nl.nltaxonomie._7_0.domein.bd.tuples.bd_ob_tuples.TaxData;
import nl.nltaxonomie._7_0.domein.bd.tuples.bd_ob_tuples.ValueAddedTaxDeclaration;

import org.techytax.domain.Balans;
import org.techytax.domain.Periode;
import org.techytax.domain.VatDeclarationData;
import org.techytax.util.DateHelper;
import org.xbrl._2003.instance.Context;
import org.xbrl._2003.instance.ContextEntityType;
import org.xbrl._2003.instance.ContextEntityType.Identifier;
import org.xbrl._2003.instance.ContextPeriodType;
import org.xbrl._2003.instance.ContextScenarioType;
import org.xbrl._2003.instance.ObjectFactory;
import org.xbrl._2003.instance.Unit;
import org.xbrl._2003.instance.Xbrl;
import org.xbrl._2003.xlink.SimpleType;
import org.xbrl._2006.xbrldi.ExplicitMember;

public class XbrlHelper {

	private static final String TEST_FISCAL_NUMBER = "001000045B93";

	public static String getTestFiscalNumber() {
		return TEST_FISCAL_NUMBER;
	}
	
	public static String createXbrlInstance(VatDeclarationData vatDeclarationData) {
		ObjectFactory xbrlObjectFactory = null;
		JAXBContext jc = null;
		Marshaller m = null;
		try {
			xbrlObjectFactory = new ObjectFactory();
			org.xbrl._2006.xbrldi.ObjectFactory xbrldiObjectFactory = new org.xbrl._2006.xbrldi.ObjectFactory();
			jc = JAXBContext.newInstance(new Class[] { org.xbrl._2003.instance.ObjectFactory.class,
					nl.nltaxonomie._7_0.domein.bd.tuples.bd_ob_tuples.ObjectFactory.class,
					nl.nltaxonomie._7_0.basis.bd.types.bd_types.ObjectFactory.class, org.xbrl._2006.xbrldi.ObjectFactory.class,
					org.xbrl._2003.xlink.ObjectFactory.class, nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.ObjectFactory.class,
					org.xbrl._2003.linkbase.ObjectFactory.class, org.xbrl._2005.xbrldt.ObjectFactory.class,
					nl.nltaxonomie._7_0.domein.bd.axes.bd_axes.ObjectFactory.class,
					nl.nltaxonomie._7_0.basis.bd.domains.bd_domains.ObjectFactory.class, nl.nltaxonomie.iso.iso4217.ObjectFactory.class,
					nl.nltaxonomie._7_0.basis.bd.items.bd_algemeen.ObjectFactory.class });
			m = jc.createMarshaller();
			StringWriter writer = new StringWriter();
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Xbrl xbrl = xbrlObjectFactory.createXbrl();

			org.xbrl._2003.xlink.ObjectFactory xlinkObjectFactory = new org.xbrl._2003.xlink.ObjectFactory();
			SimpleType simpleType = xlinkObjectFactory.createSimpleType();
			simpleType.setType("simple");
			simpleType.setHref("http://www.nltaxonomie.nl/7.0/report/bd/entrypoints/rpt-bd-omzetbelasting-2013.xsd");
			xbrl.getSchemaRef().add(simpleType);
			xbrl.getOtherAttributes().put(new QName("xml:lang"), "nl");

			Context context = xbrlObjectFactory.createContext();
			context.setId("Msg");

			ContextEntityType contextEntityType = xbrlObjectFactory.createContextEntityType();
			Identifier identifier = xbrlObjectFactory.createContextEntityTypeIdentifier();
			identifier.setScheme("www.belastingdienst.nl/omzetbelastingnummer");
			identifier.setValue(vatDeclarationData.getFiscalNumber());
			ContextPeriodType period = xbrlObjectFactory.createContextPeriodType();
			period.setStartDate(DateHelper.getDate(vatDeclarationData.getStartDate()));
			period.setEndDate(DateHelper.getDate(vatDeclarationData.getEndDate()));
			contextEntityType.setIdentifier(identifier);
			context.setEntity(contextEntityType);
			ContextScenarioType scenario = xbrlObjectFactory.createContextScenarioType();
			ExplicitMember explicitMember = xbrldiObjectFactory.createExplicitMember();

			QName qName = new QName("http://www.nltaxonomie.nl/7.0/domein/bd/axes/bd-axes", "PartyDimension", "bd-dim-dim");
			explicitMember.setDimension(qName);
			qName = new QName("bd-dim-dom:Declarant");
			explicitMember.setValue(qName);
			scenario.getAny().add(explicitMember);
			explicitMember = xbrldiObjectFactory.createExplicitMember();
			qName = new QName("bd-dim-dim:TimeDimension");
			explicitMember.setDimension(qName);
			qName = new QName("bd-dim-dom:Current");
			explicitMember.setValue(qName);
			scenario.getAny().add(explicitMember);
			context.setPeriod(period);
			context.setScenario(scenario);

			xbrl.getItemOrTupleOrContext().add(context);

			Unit unit = xbrlObjectFactory.createUnit();
			unit.setId("u0");
			qName = new QName("iso4217:EUR");
			unit.getMeasure().add(qName);
			xbrl.getItemOrTupleOrContext().add(unit);
			nl.nltaxonomie._7_0.domein.bd.tuples.bd_ob_tuples.ObjectFactory vatObjectFactory = new nl.nltaxonomie._7_0.domein.bd.tuples.bd_ob_tuples.ObjectFactory();
			TaxData taxData = vatObjectFactory.createTaxData();
			ValueAddedTaxDeclaration vatDeclaration = vatObjectFactory.createValueAddedTaxDeclaration();
			nl.nltaxonomie._7_0.basis.bd.types.bd_types.ObjectFactory bdTypeObjectFactory = new nl.nltaxonomie._7_0.basis.bd.types.bd_types.ObjectFactory();
			DateTimeItemType dateTime = bdTypeObjectFactory.createDateTimeItemType();
			dateTime.setValue(DateHelper.getTimeStamp(new Date()));
			dateTime.setContextRef(context);
			vatDeclaration.setDateTimeCreation(dateTime);

			MonetaryNoDecimals10VItemType valueAddedTaxOwed = bdTypeObjectFactory.createMonetaryNoDecimals10VItemType();
			valueAddedTaxOwed.setDecimals("INF");
			valueAddedTaxOwed.setContextRef(context);
			valueAddedTaxOwed.setUnitRef(unit);
			valueAddedTaxOwed.setValue(vatDeclarationData.getValueAddedTaxOwed());
			vatDeclaration.setValueAddedTaxOwed(valueAddedTaxOwed);
			
			MonetaryNoDecimals10VItemType valueAddedTaxOnInput = bdTypeObjectFactory.createMonetaryNoDecimals10VItemType();
			valueAddedTaxOnInput.setDecimals("INF");
			valueAddedTaxOnInput.setContextRef(context);
			valueAddedTaxOnInput.setUnitRef(unit);
			valueAddedTaxOnInput.setValue(vatDeclarationData.getValueAddedTaxOnInput());
			vatDeclaration.setValueAddedTaxOnInput(valueAddedTaxOnInput);			

			MonetaryNoDecimals9VItemType valueAddedTaxOwedToBePaidBack = bdTypeObjectFactory.createMonetaryNoDecimals9VItemType();
			valueAddedTaxOwedToBePaidBack.setDecimals("INF");
			valueAddedTaxOwedToBePaidBack.setContextRef(context);
			valueAddedTaxOwedToBePaidBack.setUnitRef(unit);
			valueAddedTaxOwedToBePaidBack.setValue(vatDeclarationData.getValueAddedTaxOwedToBePaidBack());
			vatDeclaration.setValueAddedTaxOwedToBePaidBack(valueAddedTaxOwedToBePaidBack);

			MonetaryNoDecimals9VItemType valueAddedTaxPrivateUse = bdTypeObjectFactory.createMonetaryNoDecimals9VItemType();
			valueAddedTaxPrivateUse.setDecimals("INF");
			valueAddedTaxPrivateUse.setContextRef(context);
			valueAddedTaxPrivateUse.setUnitRef(unit);
			valueAddedTaxPrivateUse.setValue(vatDeclarationData.getValueAddedTaxPrivateUse());
			vatDeclaration.setValueAddedTaxPrivateUse(valueAddedTaxPrivateUse);

			nl.nltaxonomie._7_0.domein.bd.tuples.bd_alg_tuples.ObjectFactory bdAlgObjectFactory = new nl.nltaxonomie._7_0.domein.bd.tuples.bd_alg_tuples.ObjectFactory();
			CorrespondentDeclarant declarant = bdAlgObjectFactory.createCorrespondentDeclarant();
			Anstring35VItemType name = bdTypeObjectFactory.createAnstring35VItemType();
			name.setValue(vatDeclarationData.getName());
			name.setContextRef(context);
			declarant.setNameContactSupplier(name);
			Anstring25VItemType phoneNumber = bdTypeObjectFactory.createAnstring25VItemType();
			phoneNumber.setValue(vatDeclarationData.getPhoneNumber());
			phoneNumber.setContextRef(context);
			declarant.setTelephoneNumberContactSupplier(phoneNumber);
			vatDeclaration.setCorrespondentDeclarant(declarant);

			ACAPITALstring4FItemType code = bdTypeObjectFactory.createACAPITALstring4FItemType();

			MessageReferenceSupplierVATItemType supplier = new MessageReferenceSupplierVATItemType();
			supplier.setValue("OB-TXTAX-11");
			supplier.setContextRef(context);
			vatDeclaration.setMessageReferenceSupplierVAT(supplier);
			code.setValue("TXTX");
			code.setContextRef(context);
			vatDeclaration.setSoftwareSupplierCode(code);

			MonetaryNoDecimals9VItemType valueAddedTaxSuppliesServicesGeneralTariff = bdTypeObjectFactory.createMonetaryNoDecimals9VItemType();
			valueAddedTaxSuppliesServicesGeneralTariff.setDecimals("INF");
			valueAddedTaxSuppliesServicesGeneralTariff.setContextRef(context);
			valueAddedTaxSuppliesServicesGeneralTariff.setUnitRef(unit);
			valueAddedTaxSuppliesServicesGeneralTariff.setValue(vatDeclarationData.getValueAddedTaxSuppliesServicesGeneralTariff());
			vatDeclaration.setValueAddedTaxSuppliesServicesGeneralTariff(valueAddedTaxSuppliesServicesGeneralTariff);

			Anstring2FItemType version = bdTypeObjectFactory.createAnstring2FItemType();
			version.setValue("11");
			version.setContextRef(context);
			vatDeclaration.setVersionApplication(version);

			taxData.setValueAddedTaxDeclaration(vatDeclaration);
			xbrl.getItemOrTupleOrContext().add(taxData);

			m.marshal(xbrl, writer);

			System.out.println(writer.toString());
			return writer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void addBalanceData(VatDeclarationData vatDeclarationData, Balans balans) {
		vatDeclarationData.setValueAddedTaxOwed(balans.getTotaleKosten().add(balans.getCorrection()));
		vatDeclarationData.setValueAddedTaxOnInput(balans.getTotaleBaten());
		vatDeclarationData.setValueAddedTaxOwedToBePaidBack(balans.getTotaleKosten().subtract(balans.getTotaleBaten()).add(balans.getCorrection()));
		vatDeclarationData.setValueAddedTaxPrivateUse(balans.getCorrection());
		vatDeclarationData.setValueAddedTaxSuppliesServicesGeneralTariff(balans.getTotaleKosten());
	}	
	
	public static void main(String[] args) {
		createTestXbrlInstance();
	}

	public static String createTestXbrlInstance() {
		VatDeclarationData vatDeclarationData = new VatDeclarationData();
		Periode period = DateHelper.getLatestVatPeriod();
		vatDeclarationData.setStartDate(period.getBeginDatum());
		vatDeclarationData.setEndDate(period.getEindDatum());
		vatDeclarationData.setFiscalNumber(TEST_FISCAL_NUMBER);
		vatDeclarationData.setName("Test");
		vatDeclarationData.setPhoneNumber("12345678");
		Balans balans = new Balans();
		balans.setTotaleKosten(BigDecimal.valueOf(95));
		balans.setCorrection(BigDecimal.valueOf(5));
		balans.setTotaleBaten(BigDecimal.valueOf(40));
		addBalanceData(vatDeclarationData, balans);
		return createXbrlInstance(vatDeclarationData);
	}
}