//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._7_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._7_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.Anstring60VItemType;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.Pure52ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PrivateUseHouseAdditionAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PrivateUseHouseAdditionImmovablePropertyLawValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PrivateUseHouseAdditionOwnHouseValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PrivateUseHouseAdditionPeriodEnd" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PrivateUseHouseAdditionPeriodStart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PrivateUseHouseAdditionRightsPercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PrivateUseHouseAdditionWithdrawal" minOccurs="0"/>
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
    "privateUseHouseAdditionAddress",
    "privateUseHouseAdditionImmovablePropertyLawValue",
    "privateUseHouseAdditionOwnHouseValue",
    "privateUseHouseAdditionPeriodEnd",
    "privateUseHouseAdditionPeriodStart",
    "privateUseHouseAdditionRightsPercentage",
    "privateUseHouseAdditionWithdrawal"
})
public class PrivateUseHouseAdditionSpecification
    extends Placeholder
{

    @XmlElement(name = "PrivateUseHouseAdditionAddress", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected Anstring60VItemType privateUseHouseAdditionAddress;
    @XmlElement(name = "PrivateUseHouseAdditionImmovablePropertyLawValue", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType privateUseHouseAdditionImmovablePropertyLawValue;
    @XmlElement(name = "PrivateUseHouseAdditionOwnHouseValue", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType privateUseHouseAdditionOwnHouseValue;
    @XmlElement(name = "PrivateUseHouseAdditionPeriodEnd", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected DateItemType privateUseHouseAdditionPeriodEnd;
    @XmlElement(name = "PrivateUseHouseAdditionPeriodStart", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected DateItemType privateUseHouseAdditionPeriodStart;
    @XmlElement(name = "PrivateUseHouseAdditionRightsPercentage", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected Pure52ItemType privateUseHouseAdditionRightsPercentage;
    @XmlElement(name = "PrivateUseHouseAdditionWithdrawal", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType privateUseHouseAdditionWithdrawal;

    /**
     * Gets the value of the privateUseHouseAdditionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getPrivateUseHouseAdditionAddress() {
        return privateUseHouseAdditionAddress;
    }

    /**
     * Sets the value of the privateUseHouseAdditionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setPrivateUseHouseAdditionAddress(Anstring60VItemType value) {
        this.privateUseHouseAdditionAddress = value;
    }

    /**
     * Gets the value of the privateUseHouseAdditionImmovablePropertyLawValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPrivateUseHouseAdditionImmovablePropertyLawValue() {
        return privateUseHouseAdditionImmovablePropertyLawValue;
    }

    /**
     * Sets the value of the privateUseHouseAdditionImmovablePropertyLawValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPrivateUseHouseAdditionImmovablePropertyLawValue(MonetaryNoDecimalsItemType value) {
        this.privateUseHouseAdditionImmovablePropertyLawValue = value;
    }

    /**
     * Gets the value of the privateUseHouseAdditionOwnHouseValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getPrivateUseHouseAdditionOwnHouseValue() {
        return privateUseHouseAdditionOwnHouseValue;
    }

    /**
     * Sets the value of the privateUseHouseAdditionOwnHouseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setPrivateUseHouseAdditionOwnHouseValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.privateUseHouseAdditionOwnHouseValue = value;
    }

    /**
     * Gets the value of the privateUseHouseAdditionPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getPrivateUseHouseAdditionPeriodEnd() {
        return privateUseHouseAdditionPeriodEnd;
    }

    /**
     * Sets the value of the privateUseHouseAdditionPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setPrivateUseHouseAdditionPeriodEnd(DateItemType value) {
        this.privateUseHouseAdditionPeriodEnd = value;
    }

    /**
     * Gets the value of the privateUseHouseAdditionPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getPrivateUseHouseAdditionPeriodStart() {
        return privateUseHouseAdditionPeriodStart;
    }

    /**
     * Sets the value of the privateUseHouseAdditionPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setPrivateUseHouseAdditionPeriodStart(DateItemType value) {
        this.privateUseHouseAdditionPeriodStart = value;
    }

    /**
     * Gets the value of the privateUseHouseAdditionRightsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Pure52ItemType }
     *     
     */
    public Pure52ItemType getPrivateUseHouseAdditionRightsPercentage() {
        return privateUseHouseAdditionRightsPercentage;
    }

    /**
     * Sets the value of the privateUseHouseAdditionRightsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure52ItemType }
     *     
     */
    public void setPrivateUseHouseAdditionRightsPercentage(Pure52ItemType value) {
        this.privateUseHouseAdditionRightsPercentage = value;
    }

    /**
     * Gets the value of the privateUseHouseAdditionWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getPrivateUseHouseAdditionWithdrawal() {
        return privateUseHouseAdditionWithdrawal;
    }

    /**
     * Sets the value of the privateUseHouseAdditionWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setPrivateUseHouseAdditionWithdrawal(NonNegativeMonetaryNoDecimalsItemType value) {
        this.privateUseHouseAdditionWithdrawal = value;
    }

}
