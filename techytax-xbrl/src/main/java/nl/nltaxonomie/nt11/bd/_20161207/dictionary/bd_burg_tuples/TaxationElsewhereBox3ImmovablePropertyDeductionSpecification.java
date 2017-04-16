//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.iso3166_countrycodes_2016_03_31.IsoCountryCodes3CharactersItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}TaxationElsewhereBox3ImmovablePropertyDeductionAssets" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}TaxationElsewhereBox3ImmovablePropertyDeductionCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}TaxationElsewhereBox3ImmovablePropertyDeductionDescripton" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}TaxationElsewhereBox3ImmovablePropertyDeductionValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}TaxationElsewhereBox3ReductionAssetImmovablePropertyDebt" minOccurs="0"/>
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
    "taxationElsewhereBox3ImmovablePropertyDeductionAssets",
    "taxationElsewhereBox3ImmovablePropertyDeductionCountryCode",
    "taxationElsewhereBox3ImmovablePropertyDeductionDescripton",
    "taxationElsewhereBox3ImmovablePropertyDeductionValue",
    "taxationElsewhereBox3ReductionAssetImmovablePropertyDebt"
})
public class TaxationElsewhereBox3ImmovablePropertyDeductionSpecification
    extends Placeholder
{

    @XmlElement(name = "TaxationElsewhereBox3ImmovablePropertyDeductionAssets", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox3ImmovablePropertyDeductionAssets;
    @XmlElement(name = "TaxationElsewhereBox3ImmovablePropertyDeductionCountryCode", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected IsoCountryCodes3CharactersItemType taxationElsewhereBox3ImmovablePropertyDeductionCountryCode;
    @XmlElement(name = "TaxationElsewhereBox3ImmovablePropertyDeductionDescripton", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring70VItemType taxationElsewhereBox3ImmovablePropertyDeductionDescripton;
    @XmlElement(name = "TaxationElsewhereBox3ImmovablePropertyDeductionValue", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox3ImmovablePropertyDeductionValue;
    @XmlElement(name = "TaxationElsewhereBox3ReductionAssetImmovablePropertyDebt", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox3ReductionAssetImmovablePropertyDebt;

    /**
     * Gets the value of the taxationElsewhereBox3ImmovablePropertyDeductionAssets property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox3ImmovablePropertyDeductionAssets() {
        return taxationElsewhereBox3ImmovablePropertyDeductionAssets;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ImmovablePropertyDeductionAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3ImmovablePropertyDeductionAssets(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3ImmovablePropertyDeductionAssets = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ImmovablePropertyDeductionCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getTaxationElsewhereBox3ImmovablePropertyDeductionCountryCode() {
        return taxationElsewhereBox3ImmovablePropertyDeductionCountryCode;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ImmovablePropertyDeductionCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setTaxationElsewhereBox3ImmovablePropertyDeductionCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.taxationElsewhereBox3ImmovablePropertyDeductionCountryCode = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ImmovablePropertyDeductionDescripton property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getTaxationElsewhereBox3ImmovablePropertyDeductionDescripton() {
        return taxationElsewhereBox3ImmovablePropertyDeductionDescripton;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ImmovablePropertyDeductionDescripton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setTaxationElsewhereBox3ImmovablePropertyDeductionDescripton(Anstring70VItemType value) {
        this.taxationElsewhereBox3ImmovablePropertyDeductionDescripton = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ImmovablePropertyDeductionValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox3ImmovablePropertyDeductionValue() {
        return taxationElsewhereBox3ImmovablePropertyDeductionValue;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ImmovablePropertyDeductionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3ImmovablePropertyDeductionValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3ImmovablePropertyDeductionValue = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ReductionAssetImmovablePropertyDebt property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox3ReductionAssetImmovablePropertyDebt() {
        return taxationElsewhereBox3ReductionAssetImmovablePropertyDebt;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ReductionAssetImmovablePropertyDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3ReductionAssetImmovablePropertyDebt(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3ReductionAssetImmovablePropertyDebt = value;
    }

}
