//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Pure52ItemType;
import org.xbrl._2003.instance.BooleanItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherBusinessCapitalCommonValuePart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherBusinessCapitalDeceasedPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherBusinessCapitalPartnerDeceasedPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherBusinessHiddenReservesValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherGoingConcernValueWholeCompany" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherHiddenReservesCommonValuePart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherLiquidationValueBusiness" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}BusinessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart" minOccurs="0"/>
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
    "businessCapitalOtherBusinessCapitalCommonValuePart",
    "businessCapitalOtherBusinessCapitalDeceasedPart",
    "businessCapitalOtherBusinessCapitalPartnerDeceasedPart",
    "businessCapitalOtherBusinessHiddenReservesValue",
    "businessCapitalOtherGoingConcernValueWholeCompany",
    "businessCapitalOtherHiddenReservesCommonValuePart",
    "businessCapitalOtherLiquidationValueBusiness",
    "businessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness",
    "businessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart"
})
public class BusinessCapitalOtherSpecification
    extends Placeholder
{

    @XmlElement(name = "BusinessCapitalOtherBusinessCapitalCommonValuePart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType businessCapitalOtherBusinessCapitalCommonValuePart;
    @XmlElement(name = "BusinessCapitalOtherBusinessCapitalDeceasedPart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Pure52ItemType businessCapitalOtherBusinessCapitalDeceasedPart;
    @XmlElement(name = "BusinessCapitalOtherBusinessCapitalPartnerDeceasedPart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Pure52ItemType businessCapitalOtherBusinessCapitalPartnerDeceasedPart;
    @XmlElement(name = "BusinessCapitalOtherBusinessHiddenReservesValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType businessCapitalOtherBusinessHiddenReservesValue;
    @XmlElement(name = "BusinessCapitalOtherGoingConcernValueWholeCompany", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType businessCapitalOtherGoingConcernValueWholeCompany;
    @XmlElement(name = "BusinessCapitalOtherHiddenReservesCommonValuePart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType businessCapitalOtherHiddenReservesCommonValuePart;
    @XmlElement(name = "BusinessCapitalOtherLiquidationValueBusiness", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType businessCapitalOtherLiquidationValueBusiness;
    @XmlElement(name = "BusinessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType businessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness;
    @XmlElement(name = "BusinessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimals10VItemType businessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart;

    /**
     * Gets the value of the businessCapitalOtherBusinessCapitalCommonValuePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessCapitalOtherBusinessCapitalCommonValuePart() {
        return businessCapitalOtherBusinessCapitalCommonValuePart;
    }

    /**
     * Sets the value of the businessCapitalOtherBusinessCapitalCommonValuePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessCapitalOtherBusinessCapitalCommonValuePart(MonetaryNoDecimals10VItemType value) {
        this.businessCapitalOtherBusinessCapitalCommonValuePart = value;
    }

    /**
     * Gets the value of the businessCapitalOtherBusinessCapitalDeceasedPart property.
     * 
     * @return
     *     possible object is
     *     {@link Pure52ItemType }
     *     
     */
    public Pure52ItemType getBusinessCapitalOtherBusinessCapitalDeceasedPart() {
        return businessCapitalOtherBusinessCapitalDeceasedPart;
    }

    /**
     * Sets the value of the businessCapitalOtherBusinessCapitalDeceasedPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure52ItemType }
     *     
     */
    public void setBusinessCapitalOtherBusinessCapitalDeceasedPart(Pure52ItemType value) {
        this.businessCapitalOtherBusinessCapitalDeceasedPart = value;
    }

    /**
     * Gets the value of the businessCapitalOtherBusinessCapitalPartnerDeceasedPart property.
     * 
     * @return
     *     possible object is
     *     {@link Pure52ItemType }
     *     
     */
    public Pure52ItemType getBusinessCapitalOtherBusinessCapitalPartnerDeceasedPart() {
        return businessCapitalOtherBusinessCapitalPartnerDeceasedPart;
    }

    /**
     * Sets the value of the businessCapitalOtherBusinessCapitalPartnerDeceasedPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure52ItemType }
     *     
     */
    public void setBusinessCapitalOtherBusinessCapitalPartnerDeceasedPart(Pure52ItemType value) {
        this.businessCapitalOtherBusinessCapitalPartnerDeceasedPart = value;
    }

    /**
     * Gets the value of the businessCapitalOtherBusinessHiddenReservesValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessCapitalOtherBusinessHiddenReservesValue() {
        return businessCapitalOtherBusinessHiddenReservesValue;
    }

    /**
     * Sets the value of the businessCapitalOtherBusinessHiddenReservesValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessCapitalOtherBusinessHiddenReservesValue(MonetaryNoDecimals10VItemType value) {
        this.businessCapitalOtherBusinessHiddenReservesValue = value;
    }

    /**
     * Gets the value of the businessCapitalOtherGoingConcernValueWholeCompany property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessCapitalOtherGoingConcernValueWholeCompany() {
        return businessCapitalOtherGoingConcernValueWholeCompany;
    }

    /**
     * Sets the value of the businessCapitalOtherGoingConcernValueWholeCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessCapitalOtherGoingConcernValueWholeCompany(MonetaryNoDecimals10VItemType value) {
        this.businessCapitalOtherGoingConcernValueWholeCompany = value;
    }

    /**
     * Gets the value of the businessCapitalOtherHiddenReservesCommonValuePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessCapitalOtherHiddenReservesCommonValuePart() {
        return businessCapitalOtherHiddenReservesCommonValuePart;
    }

    /**
     * Sets the value of the businessCapitalOtherHiddenReservesCommonValuePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessCapitalOtherHiddenReservesCommonValuePart(MonetaryNoDecimals10VItemType value) {
        this.businessCapitalOtherHiddenReservesCommonValuePart = value;
    }

    /**
     * Gets the value of the businessCapitalOtherLiquidationValueBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessCapitalOtherLiquidationValueBusiness() {
        return businessCapitalOtherLiquidationValueBusiness;
    }

    /**
     * Sets the value of the businessCapitalOtherLiquidationValueBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessCapitalOtherLiquidationValueBusiness(MonetaryNoDecimals10VItemType value) {
        this.businessCapitalOtherLiquidationValueBusiness = value;
    }

    /**
     * Gets the value of the businessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getBusinessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness() {
        return businessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness;
    }

    /**
     * Sets the value of the businessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setBusinessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness(BooleanItemType value) {
        this.businessCapitalOtherLiquidationValueHigherThanGoingConcernValueBusiness = value;
    }

    /**
     * Gets the value of the businessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart() {
        return businessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart;
    }

    /**
     * Sets the value of the businessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart(MonetaryNoDecimals10VItemType value) {
        this.businessCapitalOtherReservesDeferredTaxReturnIncomeTaxDeceasedPart = value;
    }

}
