//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.kvk.tuples.kvk_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._7_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._7_0_b_1.basis.kvk.types.kvk_codes.RemunerationDirectorsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}RemunerationManagingSupervisoryDirectorsTypeRemuneration" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}RemunerationManagingDirectorsCurrentFormer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}RemunerationSupervisoryDirectorsCurrentFormer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}RemunerationManagingSupervisoryDirectors" minOccurs="0"/>
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
    "remunerationManagingSupervisoryDirectorsTypeRemuneration",
    "remunerationManagingDirectorsCurrentFormer",
    "remunerationSupervisoryDirectorsCurrentFormer",
    "remunerationManagingSupervisoryDirectors"
})
public class RemunerationManagingSupervisoryDirectorsSpecification
    extends Placeholder
{

    @XmlElement(name = "RemunerationManagingSupervisoryDirectorsTypeRemuneration", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected RemunerationDirectorsItemType remunerationManagingSupervisoryDirectorsTypeRemuneration;
    @XmlElement(name = "RemunerationManagingDirectorsCurrentFormer", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected MonetaryNoDecimalsItemType remunerationManagingDirectorsCurrentFormer;
    @XmlElement(name = "RemunerationSupervisoryDirectorsCurrentFormer", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected MonetaryNoDecimalsItemType remunerationSupervisoryDirectorsCurrentFormer;
    @XmlElement(name = "RemunerationManagingSupervisoryDirectors", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected MonetaryNoDecimalsItemType remunerationManagingSupervisoryDirectors;

    /**
     * Gets the value of the remunerationManagingSupervisoryDirectorsTypeRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link RemunerationDirectorsItemType }
     *     
     */
    public RemunerationDirectorsItemType getRemunerationManagingSupervisoryDirectorsTypeRemuneration() {
        return remunerationManagingSupervisoryDirectorsTypeRemuneration;
    }

    /**
     * Sets the value of the remunerationManagingSupervisoryDirectorsTypeRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemunerationDirectorsItemType }
     *     
     */
    public void setRemunerationManagingSupervisoryDirectorsTypeRemuneration(RemunerationDirectorsItemType value) {
        this.remunerationManagingSupervisoryDirectorsTypeRemuneration = value;
    }

    /**
     * Gets the value of the remunerationManagingDirectorsCurrentFormer property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getRemunerationManagingDirectorsCurrentFormer() {
        return remunerationManagingDirectorsCurrentFormer;
    }

    /**
     * Sets the value of the remunerationManagingDirectorsCurrentFormer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setRemunerationManagingDirectorsCurrentFormer(MonetaryNoDecimalsItemType value) {
        this.remunerationManagingDirectorsCurrentFormer = value;
    }

    /**
     * Gets the value of the remunerationSupervisoryDirectorsCurrentFormer property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getRemunerationSupervisoryDirectorsCurrentFormer() {
        return remunerationSupervisoryDirectorsCurrentFormer;
    }

    /**
     * Sets the value of the remunerationSupervisoryDirectorsCurrentFormer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setRemunerationSupervisoryDirectorsCurrentFormer(MonetaryNoDecimalsItemType value) {
        this.remunerationSupervisoryDirectorsCurrentFormer = value;
    }

    /**
     * Gets the value of the remunerationManagingSupervisoryDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getRemunerationManagingSupervisoryDirectors() {
        return remunerationManagingSupervisoryDirectors;
    }

    /**
     * Sets the value of the remunerationManagingSupervisoryDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setRemunerationManagingSupervisoryDirectors(MonetaryNoDecimalsItemType value) {
        this.remunerationManagingSupervisoryDirectors = value;
    }

}
