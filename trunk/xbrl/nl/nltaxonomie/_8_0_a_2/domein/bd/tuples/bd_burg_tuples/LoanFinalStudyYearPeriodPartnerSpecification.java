//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 01:15:21 PM CEST 
//


package nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_codes.TrainingItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodPartnerEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodPartnerForfaitAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodPartnerStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}LoanFinalStudyYearPeriodPartnerTrainingType" minOccurs="0"/>
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
    "loanFinalStudyYearPeriodPartnerEndDate",
    "loanFinalStudyYearPeriodPartnerForfaitAmount",
    "loanFinalStudyYearPeriodPartnerStartDate",
    "loanFinalStudyYearPeriodPartnerTrainingType"
})
public class LoanFinalStudyYearPeriodPartnerSpecification
    extends Placeholder
{

    @XmlElement(name = "LoanFinalStudyYearPeriodPartnerEndDate", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected DateItemType loanFinalStudyYearPeriodPartnerEndDate;
    @XmlElement(name = "LoanFinalStudyYearPeriodPartnerForfaitAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType loanFinalStudyYearPeriodPartnerForfaitAmount;
    @XmlElement(name = "LoanFinalStudyYearPeriodPartnerStartDate", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected DateItemType loanFinalStudyYearPeriodPartnerStartDate;
    @XmlElement(name = "LoanFinalStudyYearPeriodPartnerTrainingType", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected TrainingItemType loanFinalStudyYearPeriodPartnerTrainingType;

    /**
     * Gets the value of the loanFinalStudyYearPeriodPartnerEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getLoanFinalStudyYearPeriodPartnerEndDate() {
        return loanFinalStudyYearPeriodPartnerEndDate;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodPartnerEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodPartnerEndDate(DateItemType value) {
        this.loanFinalStudyYearPeriodPartnerEndDate = value;
    }

    /**
     * Gets the value of the loanFinalStudyYearPeriodPartnerForfaitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getLoanFinalStudyYearPeriodPartnerForfaitAmount() {
        return loanFinalStudyYearPeriodPartnerForfaitAmount;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodPartnerForfaitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodPartnerForfaitAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.loanFinalStudyYearPeriodPartnerForfaitAmount = value;
    }

    /**
     * Gets the value of the loanFinalStudyYearPeriodPartnerStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getLoanFinalStudyYearPeriodPartnerStartDate() {
        return loanFinalStudyYearPeriodPartnerStartDate;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodPartnerStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodPartnerStartDate(DateItemType value) {
        this.loanFinalStudyYearPeriodPartnerStartDate = value;
    }

    /**
     * Gets the value of the loanFinalStudyYearPeriodPartnerTrainingType property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingItemType }
     *     
     */
    public TrainingItemType getLoanFinalStudyYearPeriodPartnerTrainingType() {
        return loanFinalStudyYearPeriodPartnerTrainingType;
    }

    /**
     * Sets the value of the loanFinalStudyYearPeriodPartnerTrainingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingItemType }
     *     
     */
    public void setLoanFinalStudyYearPeriodPartnerTrainingType(TrainingItemType value) {
        this.loanFinalStudyYearPeriodPartnerTrainingType = value;
    }

}
