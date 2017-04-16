//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring24VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring4VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring9VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.NonNegativeInteger5VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.NonNegativeInteger6VItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.iso3166_countrycodes_2016_03_31.IsoCountryCodes3CharactersItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.NlzipItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingDeductibleExpenses" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingHouseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingHouseNumberAbroad" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingHouseNumberAddition" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingMaintenanceCostsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingPlace" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingPostalCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingPostalCodeAbroad" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingStreetName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ListedBuildingSubsidy" minOccurs="0"/>
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
    "listedBuildingCountryCode",
    "listedBuildingDeductibleExpenses",
    "listedBuildingHouseNumber",
    "listedBuildingHouseNumberAbroad",
    "listedBuildingHouseNumberAddition",
    "listedBuildingMaintenanceCostsAmount",
    "listedBuildingNumber",
    "listedBuildingPlace",
    "listedBuildingPostalCode",
    "listedBuildingPostalCodeAbroad",
    "listedBuildingStreetName",
    "listedBuildingSubsidy"
})
public class ListedBuildingCostsSpecification
    extends Placeholder
{

    @XmlElement(name = "ListedBuildingCountryCode", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected IsoCountryCodes3CharactersItemType listedBuildingCountryCode;
    @XmlElement(name = "ListedBuildingDeductibleExpenses", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType listedBuildingDeductibleExpenses;
    @XmlElement(name = "ListedBuildingHouseNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeInteger5VItemType listedBuildingHouseNumber;
    @XmlElement(name = "ListedBuildingHouseNumberAbroad", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring9VItemType listedBuildingHouseNumberAbroad;
    @XmlElement(name = "ListedBuildingHouseNumberAddition", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring4VItemType listedBuildingHouseNumberAddition;
    @XmlElement(name = "ListedBuildingMaintenanceCostsAmount", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType listedBuildingMaintenanceCostsAmount;
    @XmlElement(name = "ListedBuildingNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeInteger6VItemType listedBuildingNumber;
    @XmlElement(name = "ListedBuildingPlace", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring24VItemType listedBuildingPlace;
    @XmlElement(name = "ListedBuildingPostalCode", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NlzipItemType listedBuildingPostalCode;
    @XmlElement(name = "ListedBuildingPostalCodeAbroad", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring9VItemType listedBuildingPostalCodeAbroad;
    @XmlElement(name = "ListedBuildingStreetName", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring24VItemType listedBuildingStreetName;
    @XmlElement(name = "ListedBuildingSubsidy", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType listedBuildingSubsidy;

    /**
     * Gets the value of the listedBuildingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getListedBuildingCountryCode() {
        return listedBuildingCountryCode;
    }

    /**
     * Sets the value of the listedBuildingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setListedBuildingCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.listedBuildingCountryCode = value;
    }

    /**
     * Gets the value of the listedBuildingDeductibleExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getListedBuildingDeductibleExpenses() {
        return listedBuildingDeductibleExpenses;
    }

    /**
     * Sets the value of the listedBuildingDeductibleExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingDeductibleExpenses(NonNegativeMonetaryNoDecimalsItemType value) {
        this.listedBuildingDeductibleExpenses = value;
    }

    /**
     * Gets the value of the listedBuildingHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public NonNegativeInteger5VItemType getListedBuildingHouseNumber() {
        return listedBuildingHouseNumber;
    }

    /**
     * Sets the value of the listedBuildingHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public void setListedBuildingHouseNumber(NonNegativeInteger5VItemType value) {
        this.listedBuildingHouseNumber = value;
    }

    /**
     * Gets the value of the listedBuildingHouseNumberAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring9VItemType }
     *     
     */
    public Anstring9VItemType getListedBuildingHouseNumberAbroad() {
        return listedBuildingHouseNumberAbroad;
    }

    /**
     * Sets the value of the listedBuildingHouseNumberAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring9VItemType }
     *     
     */
    public void setListedBuildingHouseNumberAbroad(Anstring9VItemType value) {
        this.listedBuildingHouseNumberAbroad = value;
    }

    /**
     * Gets the value of the listedBuildingHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getListedBuildingHouseNumberAddition() {
        return listedBuildingHouseNumberAddition;
    }

    /**
     * Sets the value of the listedBuildingHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setListedBuildingHouseNumberAddition(Anstring4VItemType value) {
        this.listedBuildingHouseNumberAddition = value;
    }

    /**
     * Gets the value of the listedBuildingMaintenanceCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getListedBuildingMaintenanceCostsAmount() {
        return listedBuildingMaintenanceCostsAmount;
    }

    /**
     * Sets the value of the listedBuildingMaintenanceCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingMaintenanceCostsAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.listedBuildingMaintenanceCostsAmount = value;
    }

    /**
     * Gets the value of the listedBuildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger6VItemType }
     *     
     */
    public NonNegativeInteger6VItemType getListedBuildingNumber() {
        return listedBuildingNumber;
    }

    /**
     * Sets the value of the listedBuildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger6VItemType }
     *     
     */
    public void setListedBuildingNumber(NonNegativeInteger6VItemType value) {
        this.listedBuildingNumber = value;
    }

    /**
     * Gets the value of the listedBuildingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getListedBuildingPlace() {
        return listedBuildingPlace;
    }

    /**
     * Sets the value of the listedBuildingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setListedBuildingPlace(Anstring24VItemType value) {
        this.listedBuildingPlace = value;
    }

    /**
     * Gets the value of the listedBuildingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link NlzipItemType }
     *     
     */
    public NlzipItemType getListedBuildingPostalCode() {
        return listedBuildingPostalCode;
    }

    /**
     * Sets the value of the listedBuildingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NlzipItemType }
     *     
     */
    public void setListedBuildingPostalCode(NlzipItemType value) {
        this.listedBuildingPostalCode = value;
    }

    /**
     * Gets the value of the listedBuildingPostalCodeAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring9VItemType }
     *     
     */
    public Anstring9VItemType getListedBuildingPostalCodeAbroad() {
        return listedBuildingPostalCodeAbroad;
    }

    /**
     * Sets the value of the listedBuildingPostalCodeAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring9VItemType }
     *     
     */
    public void setListedBuildingPostalCodeAbroad(Anstring9VItemType value) {
        this.listedBuildingPostalCodeAbroad = value;
    }

    /**
     * Gets the value of the listedBuildingStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getListedBuildingStreetName() {
        return listedBuildingStreetName;
    }

    /**
     * Sets the value of the listedBuildingStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setListedBuildingStreetName(Anstring24VItemType value) {
        this.listedBuildingStreetName = value;
    }

    /**
     * Gets the value of the listedBuildingSubsidy property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getListedBuildingSubsidy() {
        return listedBuildingSubsidy;
    }

    /**
     * Sets the value of the listedBuildingSubsidy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setListedBuildingSubsidy(NonNegativeMonetaryNoDecimalsItemType value) {
        this.listedBuildingSubsidy = value;
    }

}
