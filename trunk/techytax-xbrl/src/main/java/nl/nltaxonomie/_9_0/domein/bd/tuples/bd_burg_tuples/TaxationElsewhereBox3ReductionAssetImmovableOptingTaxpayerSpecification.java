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
//import org.iso.iso3166.iso3166_countrycodes_2013_07_11.IsoCountryCodes3CharactersItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}TaxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer" minOccurs="0"/>
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
    "taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode",
    "taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt",
    "taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription",
    "taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue",
    "taxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer"
})
public class TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerSpecification
    extends Placeholder
{

    @XmlElement(name = "TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected IsoCountryCodes3CharactersItemType taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode;
    @XmlElement(name = "TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt;
    @XmlElement(name = "TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring35VItemType taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription;
    @XmlElement(name = "TaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue;
    @XmlElement(name = "TaxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType taxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer;

    /**
     * Gets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode() {
        return taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerCountryCode = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt() {
        return taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDebt = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription() {
        return taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription(Anstring35VItemType value) {
        this.taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerDescription = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue() {
        return taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3ReductionAssetImmovableOptingTaxpayerValue = value;
    }

    /**
     * Gets the value of the taxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getTaxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer() {
        return taxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer;
    }

    /**
     * Sets the value of the taxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setTaxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer(NonNegativeMonetaryNoDecimalsItemType value) {
        this.taxationElsewhereBox3ReductionAssetsImmovablePropertyOptingTaxpayer = value;
    }

}
