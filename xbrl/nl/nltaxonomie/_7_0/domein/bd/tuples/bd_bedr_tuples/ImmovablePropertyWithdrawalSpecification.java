//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.16 at 05:37:42 PM CET 
//


package nl.nltaxonomie._7_0.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._7_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._7_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._7_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import nl.nltaxonomie._7_0.domein.bd.tuples.bd_alg_tuples.AddressDutchTitle;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/domein/bd/tuples/bd-alg-tuples}AddressDutchTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven}EstimationValuer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven}ImmovablePropertyBookValueWithdrawal" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven}ImmovablePropertyCommercialValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven}ImmovablePropertyProfitsAndLossesWithdrawal" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven}ValuerName" minOccurs="0"/>
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
    "addressDutchTitle",
    "estimationValuer",
    "immovablePropertyBookValueWithdrawal",
    "immovablePropertyCommercialValue",
    "immovablePropertyProfitsAndLossesWithdrawal",
    "valuerName"
})
public class ImmovablePropertyWithdrawalSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressDutchTitle", namespace = "http://www.nltaxonomie.nl/7.0/domein/bd/tuples/bd-alg-tuples")
    protected AddressDutchTitle addressDutchTitle;
    @XmlElement(name = "EstimationValuer", namespace = "http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven")
    protected BooleanItemType estimationValuer;
    @XmlElement(name = "ImmovablePropertyBookValueWithdrawal", namespace = "http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyBookValueWithdrawal;
    @XmlElement(name = "ImmovablePropertyCommercialValue", namespace = "http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyCommercialValue;
    @XmlElement(name = "ImmovablePropertyProfitsAndLossesWithdrawal", namespace = "http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType immovablePropertyProfitsAndLossesWithdrawal;
    @XmlElement(name = "ValuerName", namespace = "http://www.nltaxonomie.nl/7.0/basis/bd/items/bd-bedrijven")
    protected Anstring70VItemType valuerName;

    /**
     * Gets the value of the addressDutchTitle property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDutchTitle }
     *     
     */
    public AddressDutchTitle getAddressDutchTitle() {
        return addressDutchTitle;
    }

    /**
     * Sets the value of the addressDutchTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDutchTitle }
     *     
     */
    public void setAddressDutchTitle(AddressDutchTitle value) {
        this.addressDutchTitle = value;
    }

    /**
     * Gets the value of the estimationValuer property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getEstimationValuer() {
        return estimationValuer;
    }

    /**
     * Sets the value of the estimationValuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setEstimationValuer(BooleanItemType value) {
        this.estimationValuer = value;
    }

    /**
     * Gets the value of the immovablePropertyBookValueWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyBookValueWithdrawal() {
        return immovablePropertyBookValueWithdrawal;
    }

    /**
     * Sets the value of the immovablePropertyBookValueWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyBookValueWithdrawal(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyBookValueWithdrawal = value;
    }

    /**
     * Gets the value of the immovablePropertyCommercialValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyCommercialValue() {
        return immovablePropertyCommercialValue;
    }

    /**
     * Sets the value of the immovablePropertyCommercialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyCommercialValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyCommercialValue = value;
    }

    /**
     * Gets the value of the immovablePropertyProfitsAndLossesWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getImmovablePropertyProfitsAndLossesWithdrawal() {
        return immovablePropertyProfitsAndLossesWithdrawal;
    }

    /**
     * Sets the value of the immovablePropertyProfitsAndLossesWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyProfitsAndLossesWithdrawal(MonetaryNoDecimalsItemType value) {
        this.immovablePropertyProfitsAndLossesWithdrawal = value;
    }

    /**
     * Gets the value of the valuerName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getValuerName() {
        return valuerName;
    }

    /**
     * Sets the value of the valuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setValuerName(Anstring70VItemType value) {
        this.valuerName = value;
    }

}