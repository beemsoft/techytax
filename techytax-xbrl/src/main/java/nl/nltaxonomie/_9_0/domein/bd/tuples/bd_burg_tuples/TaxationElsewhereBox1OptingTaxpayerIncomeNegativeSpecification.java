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
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription" minOccurs="0"/>
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
    "taxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount",
    "taxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription"
})
public class TaxationElsewhereBox1OptingTaxpayerIncomeNegativeSpecification
    extends Placeholder
{

    @XmlElement(name = "TaxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount;
    @XmlElement(name = "TaxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring35VItemType taxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription;

    /**
     * Gets the value of the taxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount() {
        return taxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount;
    }

    /**
     * Sets the value of the taxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox1OptingTaxpayerIncomeNegativeAmount = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getTaxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription() {
        return taxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription;
    }

    /**
     * Sets the value of the taxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setTaxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription(Anstring35VItemType value) {
        this.taxationElsewhereBox1OptingTaxpayerIncomeNegativeDescription = value;
    }

}
