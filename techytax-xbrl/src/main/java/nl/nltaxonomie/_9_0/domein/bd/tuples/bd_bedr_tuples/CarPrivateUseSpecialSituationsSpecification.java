//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring60VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}CarPrivateUseSpecialSituationsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}CarPrivateUseSpecialSituationsDescription" minOccurs="0"/>
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
    "carPrivateUseSpecialSituationsAmount",
    "carPrivateUseSpecialSituationsDescription"
})
public class CarPrivateUseSpecialSituationsSpecification
    extends Placeholder
{

    @XmlElement(name = "CarPrivateUseSpecialSituationsAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType carPrivateUseSpecialSituationsAmount;
    @XmlElement(name = "CarPrivateUseSpecialSituationsDescription", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring60VItemType carPrivateUseSpecialSituationsDescription;

    /**
     * Gets the value of the carPrivateUseSpecialSituationsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getCarPrivateUseSpecialSituationsAmount() {
        return carPrivateUseSpecialSituationsAmount;
    }

    /**
     * Sets the value of the carPrivateUseSpecialSituationsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setCarPrivateUseSpecialSituationsAmount(MonetaryNoDecimalsItemType value) {
        this.carPrivateUseSpecialSituationsAmount = value;
    }

    /**
     * Gets the value of the carPrivateUseSpecialSituationsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getCarPrivateUseSpecialSituationsDescription() {
        return carPrivateUseSpecialSituationsDescription;
    }

    /**
     * Sets the value of the carPrivateUseSpecialSituationsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setCarPrivateUseSpecialSituationsDescription(Anstring60VItemType value) {
        this.carPrivateUseSpecialSituationsDescription = value;
    }

}