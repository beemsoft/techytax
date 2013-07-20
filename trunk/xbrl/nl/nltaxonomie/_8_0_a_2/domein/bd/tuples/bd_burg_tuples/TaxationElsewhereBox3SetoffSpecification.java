//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 01:15:21 PM CEST 
//


package nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring35VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}TaxationElsewhereBox3SetoffAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}TaxationElsewhereBox3SetoffCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}TaxationElsewhereBox3SetoffDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}TaxationElsewhereBox3SetoffTaxAmount" minOccurs="0"/>
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
    "taxationElsewhereBox3SetoffAmount",
    "taxationElsewhereBox3SetoffCountryCode",
    "taxationElsewhereBox3SetoffDescription",
    "taxationElsewhereBox3SetoffTaxAmount"
})
public class TaxationElsewhereBox3SetoffSpecification
    extends Placeholder
{

    @XmlElement(name = "TaxationElsewhereBox3SetoffAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType taxationElsewhereBox3SetoffAmount;
    @XmlElement(name = "TaxationElsewhereBox3SetoffCountryCode", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected IsoCountryCodes3CharactersItemType taxationElsewhereBox3SetoffCountryCode;
    @XmlElement(name = "TaxationElsewhereBox3SetoffDescription", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring35VItemType taxationElsewhereBox3SetoffDescription;
    @XmlElement(name = "TaxationElsewhereBox3SetoffTaxAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox3SetoffTaxAmount;

    /**
     * Gets the value of the taxationElsewhereBox3SetoffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getTaxationElsewhereBox3SetoffAmount() {
        return taxationElsewhereBox3SetoffAmount;
    }

    /**
     * Sets the value of the taxationElsewhereBox3SetoffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3SetoffAmount(MonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3SetoffAmount = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3SetoffCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getTaxationElsewhereBox3SetoffCountryCode() {
        return taxationElsewhereBox3SetoffCountryCode;
    }

    /**
     * Sets the value of the taxationElsewhereBox3SetoffCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setTaxationElsewhereBox3SetoffCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.taxationElsewhereBox3SetoffCountryCode = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3SetoffDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getTaxationElsewhereBox3SetoffDescription() {
        return taxationElsewhereBox3SetoffDescription;
    }

    /**
     * Sets the value of the taxationElsewhereBox3SetoffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setTaxationElsewhereBox3SetoffDescription(Anstring35VItemType value) {
        this.taxationElsewhereBox3SetoffDescription = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3SetoffTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox3SetoffTaxAmount() {
        return taxationElsewhereBox3SetoffTaxAmount;
    }

    /**
     * Sets the value of the taxationElsewhereBox3SetoffTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3SetoffTaxAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3SetoffTaxAmount = value;
    }

}
