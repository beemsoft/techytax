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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodCarryForwardAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodCountry" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodDeductibleCosts" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodGrossDividend" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodGrossInterest" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodGrossRoyalties" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven}DoubleTaxationAvoidanceSetoffMethodOtherGrossAmounts" minOccurs="0"/>
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
    "doubleTaxationAvoidanceSetoffMethodCarryForwardAmount",
    "doubleTaxationAvoidanceSetoffMethodCountry",
    "doubleTaxationAvoidanceSetoffMethodDeductibleCosts",
    "doubleTaxationAvoidanceSetoffMethodGrossDividend",
    "doubleTaxationAvoidanceSetoffMethodGrossInterest",
    "doubleTaxationAvoidanceSetoffMethodGrossRoyalties",
    "doubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount",
    "doubleTaxationAvoidanceSetoffMethodOtherGrossAmounts"
})
public class DoubleTaxationAvoidanceSetoffMethodSpecification
    extends Placeholder
{

    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodCarryForwardAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType doubleTaxationAvoidanceSetoffMethodCarryForwardAmount;
    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodCountry", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected IsoCountryCodes3CharactersItemType doubleTaxationAvoidanceSetoffMethodCountry;
    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodDeductibleCosts", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType doubleTaxationAvoidanceSetoffMethodDeductibleCosts;
    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodGrossDividend", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType doubleTaxationAvoidanceSetoffMethodGrossDividend;
    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodGrossInterest", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType doubleTaxationAvoidanceSetoffMethodGrossInterest;
    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodGrossRoyalties", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType doubleTaxationAvoidanceSetoffMethodGrossRoyalties;
    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType doubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount;
    @XmlElement(name = "DoubleTaxationAvoidanceSetoffMethodOtherGrossAmounts", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType doubleTaxationAvoidanceSetoffMethodOtherGrossAmounts;

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodCarryForwardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSetoffMethodCarryForwardAmount() {
        return doubleTaxationAvoidanceSetoffMethodCarryForwardAmount;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodCarryForwardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodCarryForwardAmount(MonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodCarryForwardAmount = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getDoubleTaxationAvoidanceSetoffMethodCountry() {
        return doubleTaxationAvoidanceSetoffMethodCountry;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodCountry(IsoCountryCodes3CharactersItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodCountry = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodDeductibleCosts property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSetoffMethodDeductibleCosts() {
        return doubleTaxationAvoidanceSetoffMethodDeductibleCosts;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodDeductibleCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodDeductibleCosts(MonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodDeductibleCosts = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodGrossDividend property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSetoffMethodGrossDividend() {
        return doubleTaxationAvoidanceSetoffMethodGrossDividend;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodGrossDividend property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodGrossDividend(MonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodGrossDividend = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodGrossInterest property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSetoffMethodGrossInterest() {
        return doubleTaxationAvoidanceSetoffMethodGrossInterest;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodGrossInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodGrossInterest(MonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodGrossInterest = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodGrossRoyalties property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSetoffMethodGrossRoyalties() {
        return doubleTaxationAvoidanceSetoffMethodGrossRoyalties;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodGrossRoyalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodGrossRoyalties(MonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodGrossRoyalties = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount() {
        return doubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount(MonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodNonRecoverableTaxAmount = value;
    }

    /**
     * Gets the value of the doubleTaxationAvoidanceSetoffMethodOtherGrossAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDoubleTaxationAvoidanceSetoffMethodOtherGrossAmounts() {
        return doubleTaxationAvoidanceSetoffMethodOtherGrossAmounts;
    }

    /**
     * Sets the value of the doubleTaxationAvoidanceSetoffMethodOtherGrossAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDoubleTaxationAvoidanceSetoffMethodOtherGrossAmounts(MonetaryNoDecimalsItemType value) {
        this.doubleTaxationAvoidanceSetoffMethodOtherGrossAmounts = value;
    }

}
