//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 01:15:21 PM CEST 
//


package nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.NotificationNumberItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Pure52ItemType;
import org.xbrl._2003.instance.DateItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension}placeholder">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentFinancialYearAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentInitialStartingDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentNotificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}BusinessAssetEnvironmentalEnergyInvestmentPercentage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "businessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount",
    "businessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear",
    "businessAssetEnvironmentalEnergyInvestmentDescription",
    "businessAssetEnvironmentalEnergyInvestmentFinancialYearAmount",
    "businessAssetEnvironmentalEnergyInvestmentInitialStartingDate",
    "businessAssetEnvironmentalEnergyInvestmentNotificationNumber",
    "businessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear",
    "businessAssetEnvironmentalEnergyInvestmentPercentage"
})
public class BusinessAssetEnvironmentalEnergyInvestmentSpecification
    extends Placeholder
{

    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType businessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount;
    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType businessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear;
    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentDescription", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected Anstring70VItemType businessAssetEnvironmentalEnergyInvestmentDescription;
    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentFinancialYearAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType businessAssetEnvironmentalEnergyInvestmentFinancialYearAmount;
    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentInitialStartingDate", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected DateItemType businessAssetEnvironmentalEnergyInvestmentInitialStartingDate;
    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentNotificationNumber", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected NotificationNumberItemType businessAssetEnvironmentalEnergyInvestmentNotificationNumber;
    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType businessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear;
    @XmlElement(name = "BusinessAssetEnvironmentalEnergyInvestmentPercentage", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected Pure52ItemType businessAssetEnvironmentalEnergyInvestmentPercentage;

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getBusinessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount() {
        return businessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount(MonetaryNoDecimalsItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentAllowancePerInvestmentAmount = value;
    }

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getBusinessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear() {
        return businessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear(NonNegativeMonetaryNoDecimalsItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentAllowanceThisFinancialYear = value;
    }

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getBusinessAssetEnvironmentalEnergyInvestmentDescription() {
        return businessAssetEnvironmentalEnergyInvestmentDescription;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentDescription(Anstring70VItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentDescription = value;
    }

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentFinancialYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getBusinessAssetEnvironmentalEnergyInvestmentFinancialYearAmount() {
        return businessAssetEnvironmentalEnergyInvestmentFinancialYearAmount;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentFinancialYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentFinancialYearAmount(MonetaryNoDecimalsItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentFinancialYearAmount = value;
    }

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentInitialStartingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getBusinessAssetEnvironmentalEnergyInvestmentInitialStartingDate() {
        return businessAssetEnvironmentalEnergyInvestmentInitialStartingDate;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentInitialStartingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentInitialStartingDate(DateItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentInitialStartingDate = value;
    }

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentNotificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationNumberItemType }
     *     
     */
    public NotificationNumberItemType getBusinessAssetEnvironmentalEnergyInvestmentNotificationNumber() {
        return businessAssetEnvironmentalEnergyInvestmentNotificationNumber;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentNotificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationNumberItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentNotificationNumber(NotificationNumberItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentNotificationNumber = value;
    }

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getBusinessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear() {
        return businessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear(MonetaryNoDecimalsItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentPaidThisFinancialYear = value;
    }

    /**
     * Gets the value of the businessAssetEnvironmentalEnergyInvestmentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Pure52ItemType }
     *     
     */
    public Pure52ItemType getBusinessAssetEnvironmentalEnergyInvestmentPercentage() {
        return businessAssetEnvironmentalEnergyInvestmentPercentage;
    }

    /**
     * Sets the value of the businessAssetEnvironmentalEnergyInvestmentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure52ItemType }
     *     
     */
    public void setBusinessAssetEnvironmentalEnergyInvestmentPercentage(Pure52ItemType value) {
        this.businessAssetEnvironmentalEnergyInvestmentPercentage = value;
    }

}
