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
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring4VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PremiumDepotCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PremiumDepotInsurancePolicyNumberDepotNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PremiumDepotPoliciesNameInsurerFinancialAgency" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PremiumDepotValue" minOccurs="0"/>
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
    "premiumDepotCode",
    "premiumDepotInsurancePolicyNumberDepotNumber",
    "premiumDepotPoliciesNameInsurerFinancialAgency",
    "premiumDepotValue"
})
public class PremiumDepotSpecification
    extends Placeholder
{

    @XmlElement(name = "PremiumDepotCode", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring4VItemType premiumDepotCode;
    @XmlElement(name = "PremiumDepotInsurancePolicyNumberDepotNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring20VItemType premiumDepotInsurancePolicyNumberDepotNumber;
    @XmlElement(name = "PremiumDepotPoliciesNameInsurerFinancialAgency", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring70VItemType premiumDepotPoliciesNameInsurerFinancialAgency;
    @XmlElement(name = "PremiumDepotValue", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected MonetaryNoDecimalsItemType premiumDepotValue;

    /**
     * Gets the value of the premiumDepotCode property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getPremiumDepotCode() {
        return premiumDepotCode;
    }

    /**
     * Sets the value of the premiumDepotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setPremiumDepotCode(Anstring4VItemType value) {
        this.premiumDepotCode = value;
    }

    /**
     * Gets the value of the premiumDepotInsurancePolicyNumberDepotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getPremiumDepotInsurancePolicyNumberDepotNumber() {
        return premiumDepotInsurancePolicyNumberDepotNumber;
    }

    /**
     * Sets the value of the premiumDepotInsurancePolicyNumberDepotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setPremiumDepotInsurancePolicyNumberDepotNumber(Anstring20VItemType value) {
        this.premiumDepotInsurancePolicyNumberDepotNumber = value;
    }

    /**
     * Gets the value of the premiumDepotPoliciesNameInsurerFinancialAgency property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getPremiumDepotPoliciesNameInsurerFinancialAgency() {
        return premiumDepotPoliciesNameInsurerFinancialAgency;
    }

    /**
     * Sets the value of the premiumDepotPoliciesNameInsurerFinancialAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setPremiumDepotPoliciesNameInsurerFinancialAgency(Anstring70VItemType value) {
        this.premiumDepotPoliciesNameInsurerFinancialAgency = value;
    }

    /**
     * Gets the value of the premiumDepotValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPremiumDepotValue() {
        return premiumDepotValue;
    }

    /**
     * Sets the value of the premiumDepotValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPremiumDepotValue(MonetaryNoDecimalsItemType value) {
        this.premiumDepotValue = value;
    }

}