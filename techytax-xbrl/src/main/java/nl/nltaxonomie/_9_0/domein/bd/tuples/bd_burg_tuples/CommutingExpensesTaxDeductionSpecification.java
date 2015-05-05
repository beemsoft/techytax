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
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring35VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.NonNegativeInteger1ItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.NonNegativeInteger3VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}CommutingExpensesDaysPerWeekCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}CommutingExpensesDistance" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}CommutingExpensesLocationOfActivities" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}CommutingExpensesTaxDeductionByPeriodAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}CommutingExpensesTaxDeductionPeriodEnd" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}CommutingExpensesTaxDeductionPeriodStart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}CountDaysCommutedMoreThanNinetyKilometresSingleTrip" minOccurs="0"/>
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
    "commutingExpensesDaysPerWeekCount",
    "commutingExpensesDistance",
    "commutingExpensesLocationOfActivities",
    "commutingExpensesTaxDeductionByPeriodAmount",
    "commutingExpensesTaxDeductionPeriodEnd",
    "commutingExpensesTaxDeductionPeriodStart",
    "countDaysCommutedMoreThanNinetyKilometresSingleTrip"
})
public class CommutingExpensesTaxDeductionSpecification
    extends Placeholder
{

    @XmlElement(name = "CommutingExpensesDaysPerWeekCount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeInteger1ItemType commutingExpensesDaysPerWeekCount;
    @XmlElement(name = "CommutingExpensesDistance", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeInteger3VItemType commutingExpensesDistance;
    @XmlElement(name = "CommutingExpensesLocationOfActivities", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring35VItemType commutingExpensesLocationOfActivities;
    @XmlElement(name = "CommutingExpensesTaxDeductionByPeriodAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType commutingExpensesTaxDeductionByPeriodAmount;
    @XmlElement(name = "CommutingExpensesTaxDeductionPeriodEnd", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType commutingExpensesTaxDeductionPeriodEnd;
    @XmlElement(name = "CommutingExpensesTaxDeductionPeriodStart", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType commutingExpensesTaxDeductionPeriodStart;
    @XmlElement(name = "CountDaysCommutedMoreThanNinetyKilometresSingleTrip", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeInteger3VItemType countDaysCommutedMoreThanNinetyKilometresSingleTrip;

    /**
     * Gets the value of the commutingExpensesDaysPerWeekCount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger1ItemType }
     *     
     */
    public NonNegativeInteger1ItemType getCommutingExpensesDaysPerWeekCount() {
        return commutingExpensesDaysPerWeekCount;
    }

    /**
     * Sets the value of the commutingExpensesDaysPerWeekCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger1ItemType }
     *     
     */
    public void setCommutingExpensesDaysPerWeekCount(NonNegativeInteger1ItemType value) {
        this.commutingExpensesDaysPerWeekCount = value;
    }

    /**
     * Gets the value of the commutingExpensesDistance property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public NonNegativeInteger3VItemType getCommutingExpensesDistance() {
        return commutingExpensesDistance;
    }

    /**
     * Sets the value of the commutingExpensesDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public void setCommutingExpensesDistance(NonNegativeInteger3VItemType value) {
        this.commutingExpensesDistance = value;
    }

    /**
     * Gets the value of the commutingExpensesLocationOfActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring35VItemType }
     *     
     */
    public Anstring35VItemType getCommutingExpensesLocationOfActivities() {
        return commutingExpensesLocationOfActivities;
    }

    /**
     * Sets the value of the commutingExpensesLocationOfActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring35VItemType }
     *     
     */
    public void setCommutingExpensesLocationOfActivities(Anstring35VItemType value) {
        this.commutingExpensesLocationOfActivities = value;
    }

    /**
     * Gets the value of the commutingExpensesTaxDeductionByPeriodAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getCommutingExpensesTaxDeductionByPeriodAmount() {
        return commutingExpensesTaxDeductionByPeriodAmount;
    }

    /**
     * Sets the value of the commutingExpensesTaxDeductionByPeriodAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setCommutingExpensesTaxDeductionByPeriodAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.commutingExpensesTaxDeductionByPeriodAmount = value;
    }

    /**
     * Gets the value of the commutingExpensesTaxDeductionPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getCommutingExpensesTaxDeductionPeriodEnd() {
        return commutingExpensesTaxDeductionPeriodEnd;
    }

    /**
     * Sets the value of the commutingExpensesTaxDeductionPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setCommutingExpensesTaxDeductionPeriodEnd(DateItemType value) {
        this.commutingExpensesTaxDeductionPeriodEnd = value;
    }

    /**
     * Gets the value of the commutingExpensesTaxDeductionPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getCommutingExpensesTaxDeductionPeriodStart() {
        return commutingExpensesTaxDeductionPeriodStart;
    }

    /**
     * Sets the value of the commutingExpensesTaxDeductionPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setCommutingExpensesTaxDeductionPeriodStart(DateItemType value) {
        this.commutingExpensesTaxDeductionPeriodStart = value;
    }

    /**
     * Gets the value of the countDaysCommutedMoreThanNinetyKilometresSingleTrip property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public NonNegativeInteger3VItemType getCountDaysCommutedMoreThanNinetyKilometresSingleTrip() {
        return countDaysCommutedMoreThanNinetyKilometresSingleTrip;
    }

    /**
     * Sets the value of the countDaysCommutedMoreThanNinetyKilometresSingleTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger3VItemType }
     *     
     */
    public void setCountDaysCommutedMoreThanNinetyKilometresSingleTrip(NonNegativeInteger3VItemType value) {
        this.countDaysCommutedMoreThanNinetyKilometresSingleTrip = value;
    }

}
