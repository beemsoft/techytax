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
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring25VItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring35VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting}CorrespondentDeclarantContactName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting}CorrespondentDeclarantContactTelephoneNumber" minOccurs="0"/>
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
    "correspondentDeclarantContactName",
    "correspondentDeclarantContactTelephoneNumber"
})
public class CorrespondentDeclarantSpecification
    extends Placeholder
{

    @XmlElement(name = "CorrespondentDeclarantContactName", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting")
    protected Anstring35VItemType correspondentDeclarantContactName;
    @XmlElement(name = "CorrespondentDeclarantContactTelephoneNumber", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-omzetbelasting")
    protected Anstring25VItemType correspondentDeclarantContactTelephoneNumber;

    /**
     * Gets the value of the correspondentDeclarantContactName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getCorrespondentDeclarantContactName() {
        return correspondentDeclarantContactName;
    }

    /**
     * Sets the value of the correspondentDeclarantContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setCorrespondentDeclarantContactName(Anstring35VItemType value) {
        this.correspondentDeclarantContactName = value;
    }

    /**
     * Gets the value of the correspondentDeclarantContactTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring25VItemType }
     *     
     */
    public Anstring25VItemType getCorrespondentDeclarantContactTelephoneNumber() {
        return correspondentDeclarantContactTelephoneNumber;
    }

    /**
     * Sets the value of the correspondentDeclarantContactTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring25VItemType }
     *     
     */
    public void setCorrespondentDeclarantContactTelephoneNumber(Anstring25VItemType value) {
        this.correspondentDeclarantContactTelephoneNumber = value;
    }

}
