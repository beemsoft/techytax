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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtPositionBankAccountBalance" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtPositionBankAccountBalanceOriginalCurrency" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtPositionBankAccountBenefitTaxpayer" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtPositionBankAccountBox3Balance" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtPositionBankAccountOwnHouseDebtBalance" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}DebtPositionBankAccountRestDebt" minOccurs="0"/>
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
    "debtPositionBankAccountBalance",
    "debtPositionBankAccountBalanceOriginalCurrency",
    "debtPositionBankAccountBenefitTaxpayer",
    "debtPositionBankAccountBox3Balance",
    "debtPositionBankAccountOwnHouseDebtBalance",
    "debtPositionBankAccountRestDebt"
})
public class DebtPositionSpecification
    extends Placeholder
{

    @XmlElement(name = "DebtPositionBankAccountBalance", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected List<MonetaryNoDecimalsItemType> debtPositionBankAccountBalance;
    @XmlElement(name = "DebtPositionBankAccountBalanceOriginalCurrency", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected List<MonetaryNoDecimalsItemType> debtPositionBankAccountBalanceOriginalCurrency;
    @XmlElement(name = "DebtPositionBankAccountBenefitTaxpayer", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected List<MonetaryNoDecimalsItemType> debtPositionBankAccountBenefitTaxpayer;
    @XmlElement(name = "DebtPositionBankAccountBox3Balance", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected List<MonetaryNoDecimalsItemType> debtPositionBankAccountBox3Balance;
    @XmlElement(name = "DebtPositionBankAccountOwnHouseDebtBalance", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected List<MonetaryNoDecimalsItemType> debtPositionBankAccountOwnHouseDebtBalance;
    @XmlElement(name = "DebtPositionBankAccountRestDebt", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType debtPositionBankAccountRestDebt;

    /**
     * Gets the value of the debtPositionBankAccountBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtPositionBankAccountBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtPositionBankAccountBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getDebtPositionBankAccountBalance() {
        if (debtPositionBankAccountBalance == null) {
            debtPositionBankAccountBalance = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.debtPositionBankAccountBalance;
    }

    /**
     * Gets the value of the debtPositionBankAccountBalanceOriginalCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtPositionBankAccountBalanceOriginalCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtPositionBankAccountBalanceOriginalCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getDebtPositionBankAccountBalanceOriginalCurrency() {
        if (debtPositionBankAccountBalanceOriginalCurrency == null) {
            debtPositionBankAccountBalanceOriginalCurrency = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.debtPositionBankAccountBalanceOriginalCurrency;
    }

    /**
     * Gets the value of the debtPositionBankAccountBenefitTaxpayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtPositionBankAccountBenefitTaxpayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtPositionBankAccountBenefitTaxpayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getDebtPositionBankAccountBenefitTaxpayer() {
        if (debtPositionBankAccountBenefitTaxpayer == null) {
            debtPositionBankAccountBenefitTaxpayer = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.debtPositionBankAccountBenefitTaxpayer;
    }

    /**
     * Gets the value of the debtPositionBankAccountBox3Balance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtPositionBankAccountBox3Balance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtPositionBankAccountBox3Balance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getDebtPositionBankAccountBox3Balance() {
        if (debtPositionBankAccountBox3Balance == null) {
            debtPositionBankAccountBox3Balance = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.debtPositionBankAccountBox3Balance;
    }

    /**
     * Gets the value of the debtPositionBankAccountOwnHouseDebtBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtPositionBankAccountOwnHouseDebtBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtPositionBankAccountOwnHouseDebtBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getDebtPositionBankAccountOwnHouseDebtBalance() {
        if (debtPositionBankAccountOwnHouseDebtBalance == null) {
            debtPositionBankAccountOwnHouseDebtBalance = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.debtPositionBankAccountOwnHouseDebtBalance;
    }

    /**
     * Gets the value of the debtPositionBankAccountRestDebt property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDebtPositionBankAccountRestDebt() {
        return debtPositionBankAccountRestDebt;
    }

    /**
     * Sets the value of the debtPositionBankAccountRestDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtPositionBankAccountRestDebt(MonetaryNoDecimalsItemType value) {
        this.debtPositionBankAccountRestDebt = value;
    }

}
