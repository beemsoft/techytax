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
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Test11ItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}GuestParentAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}GuestParentName"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}GuestParentNationalRegisterDayCareIdentificationNumber" minOccurs="0"/>
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
    "guestParentAmount",
    "guestParentName",
    "guestParentNationalRegisterDayCareIdentificationNumber"
})
public class GuestParentSpecification
    extends Placeholder
{

    @XmlElement(name = "GuestParentAmount", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected MonetaryNoDecimalsItemType guestParentAmount;
    @XmlElement(name = "GuestParentName", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers", required = true)
    protected Anstring70VItemType guestParentName;
    @XmlElement(name = "GuestParentNationalRegisterDayCareIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Test11ItemType guestParentNationalRegisterDayCareIdentificationNumber;

    /**
     * Gets the value of the guestParentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getGuestParentAmount() {
        return guestParentAmount;
    }

    /**
     * Sets the value of the guestParentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setGuestParentAmount(MonetaryNoDecimalsItemType value) {
        this.guestParentAmount = value;
    }

    /**
     * Gets the value of the guestParentName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getGuestParentName() {
        return guestParentName;
    }

    /**
     * Sets the value of the guestParentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setGuestParentName(Anstring70VItemType value) {
        this.guestParentName = value;
    }

    /**
     * Gets the value of the guestParentNationalRegisterDayCareIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getGuestParentNationalRegisterDayCareIdentificationNumber() {
        return guestParentNationalRegisterDayCareIdentificationNumber;
    }

    /**
     * Sets the value of the guestParentNationalRegisterDayCareIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setGuestParentNationalRegisterDayCareIdentificationNumber(Test11ItemType value) {
        this.guestParentNationalRegisterDayCareIdentificationNumber = value;
    }

}
