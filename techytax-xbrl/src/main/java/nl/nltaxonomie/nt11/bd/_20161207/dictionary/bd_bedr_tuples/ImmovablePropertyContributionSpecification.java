//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring24VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring4VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring9VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.NonNegativeInteger5VItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.NlzipItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import org.xbrl._2003.instance.BooleanItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionEstimationValuer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionLocationHouseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionLocationHouseNumberAddition" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionLocationPlace" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionLocationPostalCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionLocationPostalCodeAbroad" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionLocationStreetName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionValueOfTrade" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}ImmovablePropertyContributionValuerName" minOccurs="0"/>
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
    "immovablePropertyContributionEstimationValuer",
    "immovablePropertyContributionLocationHouseNumber",
    "immovablePropertyContributionLocationHouseNumberAddition",
    "immovablePropertyContributionLocationPlace",
    "immovablePropertyContributionLocationPostalCode",
    "immovablePropertyContributionLocationPostalCodeAbroad",
    "immovablePropertyContributionLocationStreetName",
    "immovablePropertyContributionValueOfTrade",
    "immovablePropertyContributionValuerName"
})
public class ImmovablePropertyContributionSpecification
    extends Placeholder
{

    @XmlElement(name = "ImmovablePropertyContributionEstimationValuer", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected BooleanItemType immovablePropertyContributionEstimationValuer;
    @XmlElement(name = "ImmovablePropertyContributionLocationHouseNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected NonNegativeInteger5VItemType immovablePropertyContributionLocationHouseNumber;
    @XmlElement(name = "ImmovablePropertyContributionLocationHouseNumberAddition", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected Anstring4VItemType immovablePropertyContributionLocationHouseNumberAddition;
    @XmlElement(name = "ImmovablePropertyContributionLocationPlace", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected Anstring24VItemType immovablePropertyContributionLocationPlace;
    @XmlElement(name = "ImmovablePropertyContributionLocationPostalCode", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected NlzipItemType immovablePropertyContributionLocationPostalCode;
    @XmlElement(name = "ImmovablePropertyContributionLocationPostalCodeAbroad", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected Anstring9VItemType immovablePropertyContributionLocationPostalCodeAbroad;
    @XmlElement(name = "ImmovablePropertyContributionLocationStreetName", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected Anstring24VItemType immovablePropertyContributionLocationStreetName;
    @XmlElement(name = "ImmovablePropertyContributionValueOfTrade", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyContributionValueOfTrade;
    @XmlElement(name = "ImmovablePropertyContributionValuerName", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected Anstring70VItemType immovablePropertyContributionValuerName;

    /**
     * Gets the value of the immovablePropertyContributionEstimationValuer property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyContributionEstimationValuer() {
        return immovablePropertyContributionEstimationValuer;
    }

    /**
     * Sets the value of the immovablePropertyContributionEstimationValuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyContributionEstimationValuer(BooleanItemType value) {
        this.immovablePropertyContributionEstimationValuer = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionLocationHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public NonNegativeInteger5VItemType getImmovablePropertyContributionLocationHouseNumber() {
        return immovablePropertyContributionLocationHouseNumber;
    }

    /**
     * Sets the value of the immovablePropertyContributionLocationHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public void setImmovablePropertyContributionLocationHouseNumber(NonNegativeInteger5VItemType value) {
        this.immovablePropertyContributionLocationHouseNumber = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionLocationHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getImmovablePropertyContributionLocationHouseNumberAddition() {
        return immovablePropertyContributionLocationHouseNumberAddition;
    }

    /**
     * Sets the value of the immovablePropertyContributionLocationHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setImmovablePropertyContributionLocationHouseNumberAddition(Anstring4VItemType value) {
        this.immovablePropertyContributionLocationHouseNumberAddition = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionLocationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getImmovablePropertyContributionLocationPlace() {
        return immovablePropertyContributionLocationPlace;
    }

    /**
     * Sets the value of the immovablePropertyContributionLocationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setImmovablePropertyContributionLocationPlace(Anstring24VItemType value) {
        this.immovablePropertyContributionLocationPlace = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionLocationPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link NlzipItemType }
     *     
     */
    public NlzipItemType getImmovablePropertyContributionLocationPostalCode() {
        return immovablePropertyContributionLocationPostalCode;
    }

    /**
     * Sets the value of the immovablePropertyContributionLocationPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NlzipItemType }
     *     
     */
    public void setImmovablePropertyContributionLocationPostalCode(NlzipItemType value) {
        this.immovablePropertyContributionLocationPostalCode = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionLocationPostalCodeAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring9VItemType }
     *     
     */
    public Anstring9VItemType getImmovablePropertyContributionLocationPostalCodeAbroad() {
        return immovablePropertyContributionLocationPostalCodeAbroad;
    }

    /**
     * Sets the value of the immovablePropertyContributionLocationPostalCodeAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring9VItemType }
     *     
     */
    public void setImmovablePropertyContributionLocationPostalCodeAbroad(Anstring9VItemType value) {
        this.immovablePropertyContributionLocationPostalCodeAbroad = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionLocationStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getImmovablePropertyContributionLocationStreetName() {
        return immovablePropertyContributionLocationStreetName;
    }

    /**
     * Sets the value of the immovablePropertyContributionLocationStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setImmovablePropertyContributionLocationStreetName(Anstring24VItemType value) {
        this.immovablePropertyContributionLocationStreetName = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionValueOfTrade property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyContributionValueOfTrade() {
        return immovablePropertyContributionValueOfTrade;
    }

    /**
     * Sets the value of the immovablePropertyContributionValueOfTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyContributionValueOfTrade(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyContributionValueOfTrade = value;
    }

    /**
     * Gets the value of the immovablePropertyContributionValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getImmovablePropertyContributionValuerName() {
        return immovablePropertyContributionValuerName;
    }

    /**
     * Sets the value of the immovablePropertyContributionValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setImmovablePropertyContributionValuerName(Anstring70VItemType value) {
        this.immovablePropertyContributionValuerName = value;
    }

}
