//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_ob_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_codes.IsoCountrycodeECMemberStatesItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_codes.VatRateTypeItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Monetary102ItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Pure52ItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.VatNumberItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting}MSCONCountryCode"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting}TaxableAmount"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting}VATAmount"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting}VATNumber"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting}VATNumberCountryCode"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting}VATRate"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting}VATRateType"/>
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
    "msconCountryCode",
    "taxableAmount",
    "vatAmount",
    "vatNumber",
    "vatNumberCountryCode",
    "vatRate",
    "vatRateType"
})
public class MSESTSuppliesSpecification
    extends Placeholder
{

    @XmlElement(name = "MSCONCountryCode", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting", required = true)
    protected IsoCountrycodeECMemberStatesItemType msconCountryCode;
    @XmlElement(name = "TaxableAmount", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting", required = true)
    protected Monetary102ItemType taxableAmount;
    @XmlElement(name = "VATAmount", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting", required = true)
    protected Monetary102ItemType vatAmount;
    @XmlElement(name = "VATNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting", required = true)
    protected VatNumberItemType vatNumber;
    @XmlElement(name = "VATNumberCountryCode", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting", required = true)
    protected IsoCountrycodeECMemberStatesItemType vatNumberCountryCode;
    @XmlElement(name = "VATRate", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting", required = true)
    protected Pure52ItemType vatRate;
    @XmlElement(name = "VATRateType", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-omzetbelasting", required = true)
    protected VatRateTypeItemType vatRateType;

    /**
     * Gets the value of the msconCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public IsoCountrycodeECMemberStatesItemType getMSCONCountryCode() {
        return msconCountryCode;
    }

    /**
     * Sets the value of the msconCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public void setMSCONCountryCode(IsoCountrycodeECMemberStatesItemType value) {
        this.msconCountryCode = value;
    }

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Monetary102ItemType }
     *     
     */
    public Monetary102ItemType getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monetary102ItemType }
     *     
     */
    public void setTaxableAmount(Monetary102ItemType value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the vatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Monetary102ItemType }
     *     
     */
    public Monetary102ItemType getVATAmount() {
        return vatAmount;
    }

    /**
     * Sets the value of the vatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monetary102ItemType }
     *     
     */
    public void setVATAmount(Monetary102ItemType value) {
        this.vatAmount = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link VatNumberItemType }
     *     
     */
    public VatNumberItemType getVATNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatNumberItemType }
     *     
     */
    public void setVATNumber(VatNumberItemType value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the vatNumberCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public IsoCountrycodeECMemberStatesItemType getVATNumberCountryCode() {
        return vatNumberCountryCode;
    }

    /**
     * Sets the value of the vatNumberCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public void setVATNumberCountryCode(IsoCountrycodeECMemberStatesItemType value) {
        this.vatNumberCountryCode = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link Pure52ItemType }
     *     
     */
    public Pure52ItemType getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure52ItemType }
     *     
     */
    public void setVATRate(Pure52ItemType value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the vatRateType property.
     * 
     * @return
     *     possible object is
     *     {@link VatRateTypeItemType }
     *     
     */
    public VatRateTypeItemType getVATRateType() {
        return vatRateType;
    }

    /**
     * Sets the value of the vatRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRateTypeItemType }
     *     
     */
    public void setVATRateType(VatRateTypeItemType value) {
        this.vatRateType = value;
    }

}
