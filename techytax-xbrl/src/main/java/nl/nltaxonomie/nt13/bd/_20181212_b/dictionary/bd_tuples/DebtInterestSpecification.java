//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}DebtInterestAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}DebtInterestAmountOriginalCurrency" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}DebtInterestAmountOwnHouseDebt" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}DebtInterestBalanceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}DebtInterestRestDebt" minOccurs="0"/>
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
    "debtInterestAmount",
    "debtInterestAmountOriginalCurrency",
    "debtInterestAmountOwnHouseDebt",
    "debtInterestBalanceType",
    "debtInterestRestDebt"
})
public class DebtInterestSpecification
    extends Placeholder
{

    @XmlElement(name = "DebtInterestAmount", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType debtInterestAmount;
    @XmlElement(name = "DebtInterestAmountOriginalCurrency", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType debtInterestAmountOriginalCurrency;
    @XmlElement(name = "DebtInterestAmountOwnHouseDebt", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType debtInterestAmountOwnHouseDebt;
    @XmlElement(name = "DebtInterestBalanceType", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected NonNegativeInteger2FItemType debtInterestBalanceType;
    @XmlElement(name = "DebtInterestRestDebt", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType debtInterestRestDebt;

    /**
     * Gets the value of the debtInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDebtInterestAmount() {
        return debtInterestAmount;
    }

    /**
     * Sets the value of the debtInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtInterestAmount(MonetaryNoDecimalsItemType value) {
        this.debtInterestAmount = value;
    }

    /**
     * Gets the value of the debtInterestAmountOriginalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDebtInterestAmountOriginalCurrency() {
        return debtInterestAmountOriginalCurrency;
    }

    /**
     * Sets the value of the debtInterestAmountOriginalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtInterestAmountOriginalCurrency(MonetaryNoDecimalsItemType value) {
        this.debtInterestAmountOriginalCurrency = value;
    }

    /**
     * Gets the value of the debtInterestAmountOwnHouseDebt property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDebtInterestAmountOwnHouseDebt() {
        return debtInterestAmountOwnHouseDebt;
    }

    /**
     * Sets the value of the debtInterestAmountOwnHouseDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtInterestAmountOwnHouseDebt(MonetaryNoDecimalsItemType value) {
        this.debtInterestAmountOwnHouseDebt = value;
    }

    /**
     * Gets the value of the debtInterestBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getDebtInterestBalanceType() {
        return debtInterestBalanceType;
    }

    /**
     * Sets the value of the debtInterestBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setDebtInterestBalanceType(NonNegativeInteger2FItemType value) {
        this.debtInterestBalanceType = value;
    }

    /**
     * Gets the value of the debtInterestRestDebt property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getDebtInterestRestDebt() {
        return debtInterestRestDebt;
    }

    /**
     * Sets the value of the debtInterestRestDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setDebtInterestRestDebt(MonetaryNoDecimalsItemType value) {
        this.debtInterestRestDebt = value;
    }

}
