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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers}SubstantialInterestTransferPriceDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers}SubstantialInterestTransferPriceValue" minOccurs="0"/>
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
    "substantialInterestTransferPriceDescription",
    "substantialInterestTransferPriceValue"
})
public class SubstantialInterestTransferPriceSpecification
    extends Placeholder
{

    @XmlElement(name = "SubstantialInterestTransferPriceDescription", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers")
    protected Anstring60VItemType substantialInterestTransferPriceDescription;
    @XmlElement(name = "SubstantialInterestTransferPriceValue", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType substantialInterestTransferPriceValue;

    /**
     * Gets the value of the substantialInterestTransferPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getSubstantialInterestTransferPriceDescription() {
        return substantialInterestTransferPriceDescription;
    }

    /**
     * Sets the value of the substantialInterestTransferPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setSubstantialInterestTransferPriceDescription(Anstring60VItemType value) {
        this.substantialInterestTransferPriceDescription = value;
    }

    /**
     * Gets the value of the substantialInterestTransferPriceValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getSubstantialInterestTransferPriceValue() {
        return substantialInterestTransferPriceValue;
    }

    /**
     * Sets the value of the substantialInterestTransferPriceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setSubstantialInterestTransferPriceValue(MonetaryNoDecimalsItemType value) {
        this.substantialInterestTransferPriceValue = value;
    }

}
