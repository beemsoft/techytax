//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.cbs.tuples.cbs_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._7_0.basis.sbr.types.nl_types.EmailItemType;
import org.xbrl._2003.instance.StringItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/basis/sbr/items/nl-common-data}EmailAddressDescription"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0/basis/sbr/items/nl-common-data}EmailAddressFull"/>
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
    "emailAddressDescription",
    "emailAddressFull"
})
public class EntityEmailaddress
    extends Placeholder
{

    @XmlElement(name = "EmailAddressDescription", namespace = "http://www.nltaxonomie.nl/7.0/basis/sbr/items/nl-common-data", required = true)
    protected StringItemType emailAddressDescription;
    @XmlElement(name = "EmailAddressFull", namespace = "http://www.nltaxonomie.nl/7.0/basis/sbr/items/nl-common-data", required = true)
    protected EmailItemType emailAddressFull;

    /**
     * Gets the value of the emailAddressDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getEmailAddressDescription() {
        return emailAddressDescription;
    }

    /**
     * Sets the value of the emailAddressDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setEmailAddressDescription(StringItemType value) {
        this.emailAddressDescription = value;
    }

    /**
     * Gets the value of the emailAddressFull property.
     * 
     * @return
     *     possible object is
     *     {@link EmailItemType }
     *     
     */
    public EmailItemType getEmailAddressFull() {
        return emailAddressFull;
    }

    /**
     * Sets the value of the emailAddressFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailItemType }
     *     
     */
    public void setEmailAddressFull(EmailItemType value) {
        this.emailAddressFull = value;
    }

}
