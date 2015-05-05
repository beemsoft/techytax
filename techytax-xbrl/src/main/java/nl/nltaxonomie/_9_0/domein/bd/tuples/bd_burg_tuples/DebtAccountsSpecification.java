//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_burg_tuples;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring20VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring34VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.InterestRateItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Test11ItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import org.xbrl._2003.instance.BooleanItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsAccountHolderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsBalanceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsBankName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsBankProductLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsCommonInterestIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsInstalmentIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsLoanInterestRate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsLoanPlannedEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsLoanStartAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsLoanStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsMortgageIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsRecordType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtAccountsSourceProductID" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-burg-tuples}DebtInterestSpecification" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-burg-tuples}DebtPositionSpecification" maxOccurs="99" minOccurs="0"/>
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
    "debtAccountsAccountHolderIdentificationNumber",
    "debtAccountsBalanceType",
    "debtAccountsBankAccountNumber",
    "debtAccountsBankName",
    "debtAccountsBankProductLabel",
    "debtAccountsCommonInterestIndication",
    "debtAccountsInstalmentIndication",
    "debtAccountsLoanInterestRate",
    "debtAccountsLoanPlannedEndDate",
    "debtAccountsLoanStartAmount",
    "debtAccountsLoanStartDate",
    "debtAccountsMortgageIndication",
    "debtAccountsRecordType",
    "debtAccountsSourceProductID",
    "debtInterestSpecification",
    "debtPositionSpecification"
})
public class DebtAccountsSpecification
    extends Placeholder
{

    @XmlElement(name = "DebtAccountsAccountHolderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Test11ItemType debtAccountsAccountHolderIdentificationNumber;
    @XmlElement(name = "DebtAccountsBalanceType", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeInteger2FItemType debtAccountsBalanceType;
    @XmlElement(name = "DebtAccountsBankAccountNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring34VItemType debtAccountsBankAccountNumber;
    @XmlElement(name = "DebtAccountsBankName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType debtAccountsBankName;
    @XmlElement(name = "DebtAccountsBankProductLabel", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType debtAccountsBankProductLabel;
    @XmlElement(name = "DebtAccountsCommonInterestIndication", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeInteger2FItemType debtAccountsCommonInterestIndication;
    @XmlElement(name = "DebtAccountsInstalmentIndication", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType debtAccountsInstalmentIndication;
    @XmlElement(name = "DebtAccountsLoanInterestRate", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected InterestRateItemType debtAccountsLoanInterestRate;
    @XmlElement(name = "DebtAccountsLoanPlannedEndDate", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType debtAccountsLoanPlannedEndDate;
    @XmlElement(name = "DebtAccountsLoanStartAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType debtAccountsLoanStartAmount;
    @XmlElement(name = "DebtAccountsLoanStartDate", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType debtAccountsLoanStartDate;
    @XmlElement(name = "DebtAccountsMortgageIndication", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected BooleanItemType debtAccountsMortgageIndication;
    @XmlElement(name = "DebtAccountsRecordType", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeInteger2FItemType debtAccountsRecordType;
    @XmlElement(name = "DebtAccountsSourceProductID", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring20VItemType debtAccountsSourceProductID;
    @XmlElement(name = "DebtInterestSpecification", namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-burg-tuples")
    protected List<DebtInterestSpecification> debtInterestSpecification;
    @XmlElement(name = "DebtPositionSpecification", namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-burg-tuples")
    protected List<DebtPositionSpecification> debtPositionSpecification;

    /**
     * Gets the value of the debtAccountsAccountHolderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getDebtAccountsAccountHolderIdentificationNumber() {
        return debtAccountsAccountHolderIdentificationNumber;
    }

    /**
     * Sets the value of the debtAccountsAccountHolderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setDebtAccountsAccountHolderIdentificationNumber(Test11ItemType value) {
        this.debtAccountsAccountHolderIdentificationNumber = value;
    }

    /**
     * Gets the value of the debtAccountsBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getDebtAccountsBalanceType() {
        return debtAccountsBalanceType;
    }

    /**
     * Sets the value of the debtAccountsBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setDebtAccountsBalanceType(NonNegativeInteger2FItemType value) {
        this.debtAccountsBalanceType = value;
    }

    /**
     * Gets the value of the debtAccountsBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getDebtAccountsBankAccountNumber() {
        return debtAccountsBankAccountNumber;
    }

    /**
     * Sets the value of the debtAccountsBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setDebtAccountsBankAccountNumber(Anstring34VItemType value) {
        this.debtAccountsBankAccountNumber = value;
    }

    /**
     * Gets the value of the debtAccountsBankName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getDebtAccountsBankName() {
        return debtAccountsBankName;
    }

    /**
     * Sets the value of the debtAccountsBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setDebtAccountsBankName(Anstring70VItemType value) {
        this.debtAccountsBankName = value;
    }

    /**
     * Gets the value of the debtAccountsBankProductLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getDebtAccountsBankProductLabel() {
        return debtAccountsBankProductLabel;
    }

    /**
     * Sets the value of the debtAccountsBankProductLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setDebtAccountsBankProductLabel(Anstring70VItemType value) {
        this.debtAccountsBankProductLabel = value;
    }

    /**
     * Gets the value of the debtAccountsCommonInterestIndication property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getDebtAccountsCommonInterestIndication() {
        return debtAccountsCommonInterestIndication;
    }

    /**
     * Sets the value of the debtAccountsCommonInterestIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setDebtAccountsCommonInterestIndication(NonNegativeInteger2FItemType value) {
        this.debtAccountsCommonInterestIndication = value;
    }

    /**
     * Gets the value of the debtAccountsInstalmentIndication property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getDebtAccountsInstalmentIndication() {
        return debtAccountsInstalmentIndication;
    }

    /**
     * Sets the value of the debtAccountsInstalmentIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setDebtAccountsInstalmentIndication(BooleanItemType value) {
        this.debtAccountsInstalmentIndication = value;
    }

    /**
     * Gets the value of the debtAccountsLoanInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateItemType }
     *     
     */
    public InterestRateItemType getDebtAccountsLoanInterestRate() {
        return debtAccountsLoanInterestRate;
    }

    /**
     * Sets the value of the debtAccountsLoanInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateItemType }
     *     
     */
    public void setDebtAccountsLoanInterestRate(InterestRateItemType value) {
        this.debtAccountsLoanInterestRate = value;
    }

    /**
     * Gets the value of the debtAccountsLoanPlannedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getDebtAccountsLoanPlannedEndDate() {
        return debtAccountsLoanPlannedEndDate;
    }

    /**
     * Sets the value of the debtAccountsLoanPlannedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setDebtAccountsLoanPlannedEndDate(DateItemType value) {
        this.debtAccountsLoanPlannedEndDate = value;
    }

    /**
     * Gets the value of the debtAccountsLoanStartAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDebtAccountsLoanStartAmount() {
        return debtAccountsLoanStartAmount;
    }

    /**
     * Sets the value of the debtAccountsLoanStartAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtAccountsLoanStartAmount(MonetaryNoDecimalsItemType value) {
        this.debtAccountsLoanStartAmount = value;
    }

    /**
     * Gets the value of the debtAccountsLoanStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getDebtAccountsLoanStartDate() {
        return debtAccountsLoanStartDate;
    }

    /**
     * Sets the value of the debtAccountsLoanStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setDebtAccountsLoanStartDate(DateItemType value) {
        this.debtAccountsLoanStartDate = value;
    }

    /**
     * Gets the value of the debtAccountsMortgageIndication property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getDebtAccountsMortgageIndication() {
        return debtAccountsMortgageIndication;
    }

    /**
     * Sets the value of the debtAccountsMortgageIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setDebtAccountsMortgageIndication(BooleanItemType value) {
        this.debtAccountsMortgageIndication = value;
    }

    /**
     * Gets the value of the debtAccountsRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getDebtAccountsRecordType() {
        return debtAccountsRecordType;
    }

    /**
     * Sets the value of the debtAccountsRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setDebtAccountsRecordType(NonNegativeInteger2FItemType value) {
        this.debtAccountsRecordType = value;
    }

    /**
     * Gets the value of the debtAccountsSourceProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getDebtAccountsSourceProductID() {
        return debtAccountsSourceProductID;
    }

    /**
     * Sets the value of the debtAccountsSourceProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setDebtAccountsSourceProductID(Anstring20VItemType value) {
        this.debtAccountsSourceProductID = value;
    }

    /**
     * Gets the value of the debtInterestSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtInterestSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtInterestSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtInterestSpecification }
     * 
     * 
     */
    public List<DebtInterestSpecification> getDebtInterestSpecification() {
        if (debtInterestSpecification == null) {
            debtInterestSpecification = new ArrayList<DebtInterestSpecification>();
        }
        return this.debtInterestSpecification;
    }

    /**
     * Gets the value of the debtPositionSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtPositionSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtPositionSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtPositionSpecification }
     * 
     * 
     */
    public List<DebtPositionSpecification> getDebtPositionSpecification() {
        if (debtPositionSpecification == null) {
            debtPositionSpecification = new ArrayList<DebtPositionSpecification>();
        }
        return this.debtPositionSpecification;
    }

}
