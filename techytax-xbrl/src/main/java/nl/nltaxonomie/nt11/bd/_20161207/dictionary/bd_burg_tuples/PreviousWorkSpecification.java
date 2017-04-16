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
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PreviousWorkBenefitsAgencyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PreviousWorkIncomeAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PreviousWorkLifecycleLeaveReductionApplied" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}PreviousWorkWithheldWageLevy" minOccurs="0"/>
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
    "previousWorkBenefitsAgencyName",
    "previousWorkIncomeAmount",
    "previousWorkLifecycleLeaveReductionApplied",
    "previousWorkWithheldWageLevy"
})
public class PreviousWorkSpecification
    extends Placeholder
{

    @XmlElement(name = "PreviousWorkBenefitsAgencyName", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring70VItemType previousWorkBenefitsAgencyName;
    @XmlElement(name = "PreviousWorkIncomeAmount", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected MonetaryNoDecimalsItemType previousWorkIncomeAmount;
    @XmlElement(name = "PreviousWorkLifecycleLeaveReductionApplied", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected MonetaryNoDecimalsItemType previousWorkLifecycleLeaveReductionApplied;
    @XmlElement(name = "PreviousWorkWithheldWageLevy", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType previousWorkWithheldWageLevy;

    /**
     * Gets the value of the previousWorkBenefitsAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getPreviousWorkBenefitsAgencyName() {
        return previousWorkBenefitsAgencyName;
    }

    /**
     * Sets the value of the previousWorkBenefitsAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setPreviousWorkBenefitsAgencyName(Anstring70VItemType value) {
        this.previousWorkBenefitsAgencyName = value;
    }

    /**
     * Gets the value of the previousWorkIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPreviousWorkIncomeAmount() {
        return previousWorkIncomeAmount;
    }

    /**
     * Sets the value of the previousWorkIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPreviousWorkIncomeAmount(MonetaryNoDecimalsItemType value) {
        this.previousWorkIncomeAmount = value;
    }

    /**
     * Gets the value of the previousWorkLifecycleLeaveReductionApplied property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPreviousWorkLifecycleLeaveReductionApplied() {
        return previousWorkLifecycleLeaveReductionApplied;
    }

    /**
     * Sets the value of the previousWorkLifecycleLeaveReductionApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPreviousWorkLifecycleLeaveReductionApplied(MonetaryNoDecimalsItemType value) {
        this.previousWorkLifecycleLeaveReductionApplied = value;
    }

    /**
     * Gets the value of the previousWorkWithheldWageLevy property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getPreviousWorkWithheldWageLevy() {
        return previousWorkWithheldWageLevy;
    }

    /**
     * Sets the value of the previousWorkWithheldWageLevy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setPreviousWorkWithheldWageLevy(NonNegativeMonetaryNoDecimalsItemType value) {
        this.previousWorkWithheldWageLevy = value;
    }

}