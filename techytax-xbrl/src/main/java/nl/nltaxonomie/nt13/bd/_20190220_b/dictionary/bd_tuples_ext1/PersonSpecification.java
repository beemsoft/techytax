//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Test11ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}GiftPeriodicalBenefitIdentificationNumber"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}PersonWhoseLifeDateOfBirth"/>
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
    "giftPeriodicalBenefitIdentificationNumber",
    "personWhoseLifeDateOfBirth"
})
public class PersonSpecification
    extends Placeholder
{

    @XmlElement(name = "GiftPeriodicalBenefitIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected Test11ItemType giftPeriodicalBenefitIdentificationNumber;
    @XmlElement(name = "PersonWhoseLifeDateOfBirth", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected DateItemType personWhoseLifeDateOfBirth;

    /**
     * Gets the value of the giftPeriodicalBenefitIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getGiftPeriodicalBenefitIdentificationNumber() {
        return giftPeriodicalBenefitIdentificationNumber;
    }

    /**
     * Sets the value of the giftPeriodicalBenefitIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setGiftPeriodicalBenefitIdentificationNumber(Test11ItemType value) {
        this.giftPeriodicalBenefitIdentificationNumber = value;
    }

    /**
     * Gets the value of the personWhoseLifeDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getPersonWhoseLifeDateOfBirth() {
        return personWhoseLifeDateOfBirth;
    }

    /**
     * Sets the value of the personWhoseLifeDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setPersonWhoseLifeDateOfBirth(DateItemType value) {
        this.personWhoseLifeDateOfBirth = value;
    }

}
