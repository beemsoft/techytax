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
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.Anstring70VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PenaltiesNonDeductibleDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}PenaltiesNonDeductibleTotal" minOccurs="0"/>
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
    "penaltiesNonDeductibleDescription",
    "penaltiesNonDeductibleTotal"
})
public class PenaltiesNonDeductibleSpecification
    extends Placeholder
{

    @XmlElement(name = "PenaltiesNonDeductibleDescription", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected Anstring70VItemType penaltiesNonDeductibleDescription;
    @XmlElement(name = "PenaltiesNonDeductibleTotal", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType penaltiesNonDeductibleTotal;

    /**
     * Gets the value of the penaltiesNonDeductibleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getPenaltiesNonDeductibleDescription() {
        return penaltiesNonDeductibleDescription;
    }

    /**
     * Sets the value of the penaltiesNonDeductibleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setPenaltiesNonDeductibleDescription(Anstring70VItemType value) {
        this.penaltiesNonDeductibleDescription = value;
    }

    /**
     * Gets the value of the penaltiesNonDeductibleTotal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPenaltiesNonDeductibleTotal() {
        return penaltiesNonDeductibleTotal;
    }

    /**
     * Sets the value of the penaltiesNonDeductibleTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPenaltiesNonDeductibleTotal(MonetaryNoDecimalsItemType value) {
        this.penaltiesNonDeductibleTotal = value;
    }

}