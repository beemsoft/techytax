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
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring20VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring34VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}AssetBankAccountSavingsAccountnumberBox3" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}AssetBankAccountSavingsCertificateEtcCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}AssetBankAccountSavingsCertificateEtcCreditUndivided" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}AssetBankAccountSavingsCertificateEtcDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}AssetBankAccountSavingsCertificateEtcValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}AssetBankAccountSavingsProductID" minOccurs="0"/>
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
    "assetBankAccountSavingsAccountnumberBox3",
    "assetBankAccountSavingsCertificateEtcCountryCode",
    "assetBankAccountSavingsCertificateEtcCreditUndivided",
    "assetBankAccountSavingsCertificateEtcDescription",
    "assetBankAccountSavingsCertificateEtcValue",
    "assetBankAccountSavingsProductID"
})
public class AssetBankAccountSavingsCertificateEtcSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetBankAccountSavingsAccountnumberBox3", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring34VItemType assetBankAccountSavingsAccountnumberBox3;
    @XmlElement(name = "AssetBankAccountSavingsCertificateEtcCountryCode", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected IsoCountryCodes3CharactersItemType assetBankAccountSavingsCertificateEtcCountryCode;
    @XmlElement(name = "AssetBankAccountSavingsCertificateEtcCreditUndivided", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType assetBankAccountSavingsCertificateEtcCreditUndivided;
    @XmlElement(name = "AssetBankAccountSavingsCertificateEtcDescription", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType assetBankAccountSavingsCertificateEtcDescription;
    @XmlElement(name = "AssetBankAccountSavingsCertificateEtcValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType assetBankAccountSavingsCertificateEtcValue;
    @XmlElement(name = "AssetBankAccountSavingsProductID", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring20VItemType assetBankAccountSavingsProductID;

    /**
     * Gets the value of the assetBankAccountSavingsAccountnumberBox3 property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getAssetBankAccountSavingsAccountnumberBox3() {
        return assetBankAccountSavingsAccountnumberBox3;
    }

    /**
     * Sets the value of the assetBankAccountSavingsAccountnumberBox3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setAssetBankAccountSavingsAccountnumberBox3(Anstring34VItemType value) {
        this.assetBankAccountSavingsAccountnumberBox3 = value;
    }

    /**
     * Gets the value of the assetBankAccountSavingsCertificateEtcCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getAssetBankAccountSavingsCertificateEtcCountryCode() {
        return assetBankAccountSavingsCertificateEtcCountryCode;
    }

    /**
     * Sets the value of the assetBankAccountSavingsCertificateEtcCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setAssetBankAccountSavingsCertificateEtcCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.assetBankAccountSavingsCertificateEtcCountryCode = value;
    }

    /**
     * Gets the value of the assetBankAccountSavingsCertificateEtcCreditUndivided property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getAssetBankAccountSavingsCertificateEtcCreditUndivided() {
        return assetBankAccountSavingsCertificateEtcCreditUndivided;
    }

    /**
     * Sets the value of the assetBankAccountSavingsCertificateEtcCreditUndivided property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetBankAccountSavingsCertificateEtcCreditUndivided(MonetaryNoDecimalsItemType value) {
        this.assetBankAccountSavingsCertificateEtcCreditUndivided = value;
    }

    /**
     * Gets the value of the assetBankAccountSavingsCertificateEtcDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAssetBankAccountSavingsCertificateEtcDescription() {
        return assetBankAccountSavingsCertificateEtcDescription;
    }

    /**
     * Sets the value of the assetBankAccountSavingsCertificateEtcDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAssetBankAccountSavingsCertificateEtcDescription(Anstring70VItemType value) {
        this.assetBankAccountSavingsCertificateEtcDescription = value;
    }

    /**
     * Gets the value of the assetBankAccountSavingsCertificateEtcValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getAssetBankAccountSavingsCertificateEtcValue() {
        return assetBankAccountSavingsCertificateEtcValue;
    }

    /**
     * Sets the value of the assetBankAccountSavingsCertificateEtcValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetBankAccountSavingsCertificateEtcValue(MonetaryNoDecimalsItemType value) {
        this.assetBankAccountSavingsCertificateEtcValue = value;
    }

    /**
     * Gets the value of the assetBankAccountSavingsProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getAssetBankAccountSavingsProductID() {
        return assetBankAccountSavingsProductID;
    }

    /**
     * Sets the value of the assetBankAccountSavingsProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setAssetBankAccountSavingsProductID(Anstring20VItemType value) {
        this.assetBankAccountSavingsProductID = value;
    }

}
