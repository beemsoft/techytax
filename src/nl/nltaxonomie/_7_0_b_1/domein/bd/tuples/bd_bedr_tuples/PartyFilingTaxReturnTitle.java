//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.Anstring10VItemType;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.Anstring14VItemType;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.Anstring200VItemType;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.CustomDateItemType;
import nl.nltaxonomie._7_0_b_1.basis.bd.types.bd_types.NonNegativeInteger6FItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen}IntermediaryBeconNumber" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen}DateOfBirth"/>
 *             &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen}Initials" minOccurs="0"/>
 *             &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen}Prefix" minOccurs="0"/>
 *             &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen}SurnameSignificantPart"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven}LegalPersonName"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen}TelephoneNumber" minOccurs="0"/>
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
    "intermediaryBeconNumber",
    "dateOfBirth",
    "initials",
    "prefix",
    "surnameSignificantPart",
    "legalPersonName",
    "telephoneNumber"
})
public class PartyFilingTaxReturnTitle
    extends Placeholder
{

    @XmlElement(name = "IntermediaryBeconNumber", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen")
    protected NonNegativeInteger6FItemType intermediaryBeconNumber;
    @XmlElement(name = "DateOfBirth", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen")
    protected CustomDateItemType dateOfBirth;
    @XmlElement(name = "Initials", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen")
    protected Anstring10VItemType initials;
    @XmlElement(name = "Prefix", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen")
    protected Anstring10VItemType prefix;
    @XmlElement(name = "SurnameSignificantPart", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen")
    protected Anstring200VItemType surnameSignificantPart;
    @XmlElement(name = "LegalPersonName", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-bedrijven")
    protected Anstring200VItemType legalPersonName;
    @XmlElement(name = "TelephoneNumber", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/bd/items/bd-algemeen")
    protected Anstring14VItemType telephoneNumber;

    /**
     * Gets the value of the intermediaryBeconNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger6FItemType }
     *     
     */
    public NonNegativeInteger6FItemType getIntermediaryBeconNumber() {
        return intermediaryBeconNumber;
    }

    /**
     * Sets the value of the intermediaryBeconNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger6FItemType }
     *     
     */
    public void setIntermediaryBeconNumber(NonNegativeInteger6FItemType value) {
        this.intermediaryBeconNumber = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateItemType }
     *     
     */
    public CustomDateItemType getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateItemType }
     *     
     */
    public void setDateOfBirth(CustomDateItemType value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setInitials(Anstring10VItemType value) {
        this.initials = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setPrefix(Anstring10VItemType value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the surnameSignificantPart property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getSurnameSignificantPart() {
        return surnameSignificantPart;
    }

    /**
     * Sets the value of the surnameSignificantPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setSurnameSignificantPart(Anstring200VItemType value) {
        this.surnameSignificantPart = value;
    }

    /**
     * Gets the value of the legalPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * Sets the value of the legalPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setLegalPersonName(Anstring200VItemType value) {
        this.legalPersonName = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring14VItemType }
     *     
     */
    public Anstring14VItemType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring14VItemType }
     *     
     */
    public void setTelephoneNumber(Anstring14VItemType value) {
        this.telephoneNumber = value;
    }

}