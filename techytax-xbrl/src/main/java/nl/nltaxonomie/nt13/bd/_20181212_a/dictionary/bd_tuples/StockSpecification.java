//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.iso3166_countrycodes_2017_11_23.IsoCountryCodes3CharactersItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBalanceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}StockAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}StockAccountNumberCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}StockDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}StockProductID" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}StockValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}StockValueUndividedValue" minOccurs="0"/>
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
    "assetsOnStockAccountsBalanceType",
    "stockAccountNumber",
    "stockAccountNumberCountryCode",
    "stockDescription",
    "stockProductID",
    "stockValue",
    "stockValueUndividedValue"
})
public class StockSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetsOnStockAccountsBalanceType", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeInteger2FItemType assetsOnStockAccountsBalanceType;
    @XmlElement(name = "StockAccountNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring34VItemType stockAccountNumber;
    @XmlElement(name = "StockAccountNumberCountryCode", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected IsoCountryCodes3CharactersItemType stockAccountNumberCountryCode;
    @XmlElement(name = "StockDescription", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring70VItemType stockDescription;
    @XmlElement(name = "StockProductID", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring20VItemType stockProductID;
    @XmlElement(name = "StockValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType stockValue;
    @XmlElement(name = "StockValueUndividedValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType stockValueUndividedValue;

    /**
     * Gets the value of the assetsOnStockAccountsBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getAssetsOnStockAccountsBalanceType() {
        return assetsOnStockAccountsBalanceType;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setAssetsOnStockAccountsBalanceType(NonNegativeInteger2FItemType value) {
        this.assetsOnStockAccountsBalanceType = value;
    }

    /**
     * Gets the value of the stockAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getStockAccountNumber() {
        return stockAccountNumber;
    }

    /**
     * Sets the value of the stockAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setStockAccountNumber(Anstring34VItemType value) {
        this.stockAccountNumber = value;
    }

    /**
     * Gets the value of the stockAccountNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getStockAccountNumberCountryCode() {
        return stockAccountNumberCountryCode;
    }

    /**
     * Sets the value of the stockAccountNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setStockAccountNumberCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.stockAccountNumberCountryCode = value;
    }

    /**
     * Gets the value of the stockDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getStockDescription() {
        return stockDescription;
    }

    /**
     * Sets the value of the stockDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setStockDescription(Anstring70VItemType value) {
        this.stockDescription = value;
    }

    /**
     * Gets the value of the stockProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getStockProductID() {
        return stockProductID;
    }

    /**
     * Sets the value of the stockProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setStockProductID(Anstring20VItemType value) {
        this.stockProductID = value;
    }

    /**
     * Gets the value of the stockValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getStockValue() {
        return stockValue;
    }

    /**
     * Sets the value of the stockValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setStockValue(MonetaryNoDecimalsItemType value) {
        this.stockValue = value;
    }

    /**
     * Gets the value of the stockValueUndividedValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getStockValueUndividedValue() {
        return stockValueUndividedValue;
    }

    /**
     * Sets the value of the stockValueUndividedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setStockValueUndividedValue(MonetaryNoDecimalsItemType value) {
        this.stockValueUndividedValue = value;
    }

}