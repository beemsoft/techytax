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
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_codes.SignatureIndicationItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Test11ItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}InhabitantIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}InhabitantSignatureIndication" minOccurs="0"/>
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
    "inhabitantIdentificationNumber",
    "inhabitantSignatureIndication"
})
public class InhabitantSpecification
    extends Placeholder
{

    @XmlElement(name = "InhabitantIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Test11ItemType inhabitantIdentificationNumber;
    @XmlElement(name = "InhabitantSignatureIndication", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected SignatureIndicationItemType inhabitantSignatureIndication;

    /**
     * Gets the value of the inhabitantIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getInhabitantIdentificationNumber() {
        return inhabitantIdentificationNumber;
    }

    /**
     * Sets the value of the inhabitantIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setInhabitantIdentificationNumber(Test11ItemType value) {
        this.inhabitantIdentificationNumber = value;
    }

    /**
     * Gets the value of the inhabitantSignatureIndication property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureIndicationItemType }
     *     
     */
    public SignatureIndicationItemType getInhabitantSignatureIndication() {
        return inhabitantSignatureIndication;
    }

    /**
     * Sets the value of the inhabitantSignatureIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureIndicationItemType }
     *     
     */
    public void setInhabitantSignatureIndication(SignatureIndicationItemType value) {
        this.inhabitantSignatureIndication = value;
    }

}
