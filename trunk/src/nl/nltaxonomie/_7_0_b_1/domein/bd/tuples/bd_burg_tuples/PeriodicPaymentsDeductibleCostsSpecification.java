//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._7_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.Anstring60VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers}PeriodicPaymentDeductibleCostsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers}PeriodicPaymentDeductibleCostsDescription" minOccurs="0"/>
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
    "periodicPaymentDeductibleCostsAmount",
    "periodicPaymentDeductibleCostsDescription"
})
public class PeriodicPaymentsDeductibleCostsSpecification
    extends Placeholder
{

    @XmlElement(name = "PeriodicPaymentDeductibleCostsAmount", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType periodicPaymentDeductibleCostsAmount;
    @XmlElement(name = "PeriodicPaymentDeductibleCostsDescription", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers")
    protected Anstring60VItemType periodicPaymentDeductibleCostsDescription;

    /**
     * Gets the value of the periodicPaymentDeductibleCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPeriodicPaymentDeductibleCostsAmount() {
        return periodicPaymentDeductibleCostsAmount;
    }

    /**
     * Sets the value of the periodicPaymentDeductibleCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPeriodicPaymentDeductibleCostsAmount(MonetaryNoDecimalsItemType value) {
        this.periodicPaymentDeductibleCostsAmount = value;
    }

    /**
     * Gets the value of the periodicPaymentDeductibleCostsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getPeriodicPaymentDeductibleCostsDescription() {
        return periodicPaymentDeductibleCostsDescription;
    }

    /**
     * Sets the value of the periodicPaymentDeductibleCostsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setPeriodicPaymentDeductibleCostsDescription(Anstring60VItemType value) {
        this.periodicPaymentDeductibleCostsDescription = value;
    }

}
