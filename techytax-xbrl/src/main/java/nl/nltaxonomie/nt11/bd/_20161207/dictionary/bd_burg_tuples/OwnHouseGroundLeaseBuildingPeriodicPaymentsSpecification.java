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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}OwnHouseGroundLeaseBuildingPeriodicPaymentsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}OwnHouseGroundLeaseBuildingPeriodicPaymentsDescription" minOccurs="0"/>
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
    "ownHouseGroundLeaseBuildingPeriodicPaymentsAmount",
    "ownHouseGroundLeaseBuildingPeriodicPaymentsDescription"
})
public class OwnHouseGroundLeaseBuildingPeriodicPaymentsSpecification
    extends Placeholder
{

    @XmlElement(name = "OwnHouseGroundLeaseBuildingPeriodicPaymentsAmount", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected MonetaryNoDecimalsItemType ownHouseGroundLeaseBuildingPeriodicPaymentsAmount;
    @XmlElement(name = "OwnHouseGroundLeaseBuildingPeriodicPaymentsDescription", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring70VItemType ownHouseGroundLeaseBuildingPeriodicPaymentsDescription;

    /**
     * Gets the value of the ownHouseGroundLeaseBuildingPeriodicPaymentsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getOwnHouseGroundLeaseBuildingPeriodicPaymentsAmount() {
        return ownHouseGroundLeaseBuildingPeriodicPaymentsAmount;
    }

    /**
     * Sets the value of the ownHouseGroundLeaseBuildingPeriodicPaymentsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setOwnHouseGroundLeaseBuildingPeriodicPaymentsAmount(MonetaryNoDecimalsItemType value) {
        this.ownHouseGroundLeaseBuildingPeriodicPaymentsAmount = value;
    }

    /**
     * Gets the value of the ownHouseGroundLeaseBuildingPeriodicPaymentsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getOwnHouseGroundLeaseBuildingPeriodicPaymentsDescription() {
        return ownHouseGroundLeaseBuildingPeriodicPaymentsDescription;
    }

    /**
     * Sets the value of the ownHouseGroundLeaseBuildingPeriodicPaymentsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setOwnHouseGroundLeaseBuildingPeriodicPaymentsDescription(Anstring70VItemType value) {
        this.ownHouseGroundLeaseBuildingPeriodicPaymentsDescription = value;
    }

}