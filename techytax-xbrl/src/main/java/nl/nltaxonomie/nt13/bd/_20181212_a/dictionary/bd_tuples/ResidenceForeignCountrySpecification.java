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
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.iso3166_countrycodes_2017_11_23.IsoCountryCodes3CharactersItemType;
import org.xbrl._2003.instance.DateItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}CountryResidenceEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}CountryResidenceStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ResidenceForeignCountryCountryCodeISO" minOccurs="0"/>
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
    "countryResidenceEndDate",
    "countryResidenceStartDate",
    "residenceForeignCountryCountryCodeISO"
})
public class ResidenceForeignCountrySpecification
    extends Placeholder
{

    @XmlElement(name = "CountryResidenceEndDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected DateItemType countryResidenceEndDate;
    @XmlElement(name = "CountryResidenceStartDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected DateItemType countryResidenceStartDate;
    @XmlElement(name = "ResidenceForeignCountryCountryCodeISO", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected IsoCountryCodes3CharactersItemType residenceForeignCountryCountryCodeISO;

    /**
     * Gets the value of the countryResidenceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getCountryResidenceEndDate() {
        return countryResidenceEndDate;
    }

    /**
     * Sets the value of the countryResidenceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setCountryResidenceEndDate(DateItemType value) {
        this.countryResidenceEndDate = value;
    }

    /**
     * Gets the value of the countryResidenceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getCountryResidenceStartDate() {
        return countryResidenceStartDate;
    }

    /**
     * Sets the value of the countryResidenceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setCountryResidenceStartDate(DateItemType value) {
        this.countryResidenceStartDate = value;
    }

    /**
     * Gets the value of the residenceForeignCountryCountryCodeISO property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getResidenceForeignCountryCountryCodeISO() {
        return residenceForeignCountryCountryCodeISO;
    }

    /**
     * Sets the value of the residenceForeignCountryCountryCodeISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setResidenceForeignCountryCountryCodeISO(IsoCountryCodes3CharactersItemType value) {
        this.residenceForeignCountryCountryCodeISO = value;
    }

}
