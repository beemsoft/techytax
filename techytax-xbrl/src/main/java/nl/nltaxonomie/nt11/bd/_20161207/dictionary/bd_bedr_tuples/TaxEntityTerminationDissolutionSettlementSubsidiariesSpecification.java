//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt11.sbr._20160610.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}SettlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}SettlementSubsidiaryUnpaidDebts" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven}SubsidiaryName" minOccurs="0"/>
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
    "settlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle",
    "settlementSubsidiaryUnpaidDebts",
    "subsidiaryName"
})
public class TaxEntityTerminationDissolutionSettlementSubsidiariesSpecification
    extends Placeholder
{

    @XmlElement(name = "SettlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected DateItemType settlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle;
    @XmlElement(name = "SettlementSubsidiaryUnpaidDebts", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType settlementSubsidiaryUnpaidDebts;
    @XmlElement(name = "SubsidiaryName", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-bedrijven")
    protected Anstring70VItemType subsidiaryName;

    /**
     * Gets the value of the settlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getSettlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle() {
        return settlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle;
    }

    /**
     * Sets the value of the settlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setSettlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle(DateItemType value) {
        this.settlementDateSubsidiariesTerminationFromTaxentityByDissolutionAndSettlementTitle = value;
    }

    /**
     * Gets the value of the settlementSubsidiaryUnpaidDebts property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getSettlementSubsidiaryUnpaidDebts() {
        return settlementSubsidiaryUnpaidDebts;
    }

    /**
     * Sets the value of the settlementSubsidiaryUnpaidDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setSettlementSubsidiaryUnpaidDebts(NonNegativeMonetaryNoDecimalsItemType value) {
        this.settlementSubsidiaryUnpaidDebts = value;
    }

    /**
     * Gets the value of the subsidiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getSubsidiaryName() {
        return subsidiaryName;
    }

    /**
     * Sets the value of the subsidiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setSubsidiaryName(Anstring70VItemType value) {
        this.subsidiaryName = value;
    }

}