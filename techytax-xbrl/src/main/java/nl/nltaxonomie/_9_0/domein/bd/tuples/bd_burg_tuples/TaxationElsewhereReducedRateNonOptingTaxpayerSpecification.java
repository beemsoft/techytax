//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring35VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Pure30ItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
//import org.iso.iso3166.iso3166_countrycodes_2013_07_11.IsoCountryCodes3CharactersItemType;
import nl.nltaxonomie.iso.iso3166.IsoCountryCodes3CharactersItemType;

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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereReducedRateNonOptingTaxpayerCountry" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereReducedRateNonOptingTaxpayerPercentage" minOccurs="0"/>
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
    "taxationElsewhereReducedRateNonOptingTaxpayerCountry",
    "taxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount",
    "taxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription",
    "taxationElsewhereReducedRateNonOptingTaxpayerPercentage"
})
public class TaxationElsewhereReducedRateNonOptingTaxpayerSpecification
    extends Placeholder
{

    @XmlElement(name = "TaxationElsewhereReducedRateNonOptingTaxpayerCountry", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected IsoCountryCodes3CharactersItemType taxationElsewhereReducedRateNonOptingTaxpayerCountry;
    @XmlElement(name = "TaxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount;
    @XmlElement(name = "TaxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring35VItemType taxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription;
    @XmlElement(name = "TaxationElsewhereReducedRateNonOptingTaxpayerPercentage", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Pure30ItemType taxationElsewhereReducedRateNonOptingTaxpayerPercentage;

    /**
     * Gets the value of the taxationElsewhereReducedRateNonOptingTaxpayerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getTaxationElsewhereReducedRateNonOptingTaxpayerCountry() {
        return taxationElsewhereReducedRateNonOptingTaxpayerCountry;
    }

    /**
     * Sets the value of the taxationElsewhereReducedRateNonOptingTaxpayerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setTaxationElsewhereReducedRateNonOptingTaxpayerCountry(IsoCountryCodes3CharactersItemType value) {
        this.taxationElsewhereReducedRateNonOptingTaxpayerCountry = value;
    }

    /**
     * Gets the value of the taxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount() {
        return taxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount;
    }

    /**
     * Sets the value of the taxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereReducedRateNonOptingTaxpayerIncomeAmount = value;
    }

    /**
     * Gets the value of the taxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getTaxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription() {
        return taxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription;
    }

    /**
     * Sets the value of the taxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setTaxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription(Anstring35VItemType value) {
        this.taxationElsewhereReducedRateNonOptingTaxpayerIncomeDescription = value;
    }

    /**
     * Gets the value of the taxationElsewhereReducedRateNonOptingTaxpayerPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Pure30ItemType }
     *     
     */
    public Pure30ItemType getTaxationElsewhereReducedRateNonOptingTaxpayerPercentage() {
        return taxationElsewhereReducedRateNonOptingTaxpayerPercentage;
    }

    /**
     * Sets the value of the taxationElsewhereReducedRateNonOptingTaxpayerPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure30ItemType }
     *     
     */
    public void setTaxationElsewhereReducedRateNonOptingTaxpayerPercentage(Pure30ItemType value) {
        this.taxationElsewhereReducedRateNonOptingTaxpayerPercentage = value;
    }

}
