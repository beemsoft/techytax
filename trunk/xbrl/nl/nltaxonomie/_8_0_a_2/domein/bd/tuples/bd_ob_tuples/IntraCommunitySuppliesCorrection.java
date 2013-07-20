//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 01:15:21 PM CEST 
//


package nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_ob_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_codes.IsoCountrycodeECMemberStatesItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.MonetaryNoDecimalsNoZero10VItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.VatIdentificationNumberItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting}CorrectionsSuppliesAmount"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting}CountryCodeISO-EC"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting}VATIdentificationNumberNational"/>
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
    "correctionsSuppliesAmount",
    "countryCodeISOEC",
    "vatIdentificationNumberNational"
})
public class IntraCommunitySuppliesCorrection
    extends Placeholder
{

    @XmlElement(name = "CorrectionsSuppliesAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting", required = true)
    protected MonetaryNoDecimalsNoZero10VItemType correctionsSuppliesAmount;
    @XmlElement(name = "CountryCodeISO-EC", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting", required = true)
    protected IsoCountrycodeECMemberStatesItemType countryCodeISOEC;
    @XmlElement(name = "VATIdentificationNumberNational", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting", required = true)
    protected VatIdentificationNumberItemType vatIdentificationNumberNational;

    /**
     * Gets the value of the correctionsSuppliesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsNoZero10VItemType }
     *     
     */
    public MonetaryNoDecimalsNoZero10VItemType getCorrectionsSuppliesAmount() {
        return correctionsSuppliesAmount;
    }

    /**
     * Sets the value of the correctionsSuppliesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsNoZero10VItemType }
     *     
     */
    public void setCorrectionsSuppliesAmount(MonetaryNoDecimalsNoZero10VItemType value) {
        this.correctionsSuppliesAmount = value;
    }

    /**
     * Gets the value of the countryCodeISOEC property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public IsoCountrycodeECMemberStatesItemType getCountryCodeISOEC() {
        return countryCodeISOEC;
    }

    /**
     * Sets the value of the countryCodeISOEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public void setCountryCodeISOEC(IsoCountrycodeECMemberStatesItemType value) {
        this.countryCodeISOEC = value;
    }

    /**
     * Gets the value of the vatIdentificationNumberNational property.
     * 
     * @return
     *     possible object is
     *     {@link VatIdentificationNumberItemType }
     *     
     */
    public VatIdentificationNumberItemType getVATIdentificationNumberNational() {
        return vatIdentificationNumberNational;
    }

    /**
     * Sets the value of the vatIdentificationNumberNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatIdentificationNumberItemType }
     *     
     */
    public void setVATIdentificationNumberNational(VatIdentificationNumberItemType value) {
        this.vatIdentificationNumberNational = value;
    }

}
