//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_burg_tuples;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt11.bd._20161207.dictionary.bd_types.Test11ItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotAccountHolderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotBalance" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotCommonInterestIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotInterest" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotProductID" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers}ConstructionDepotSourceBankTaxReferenceNumber" minOccurs="0"/>
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
    "constructionDepotAccountHolderIdentificationNumber",
    "constructionDepotBalance",
    "constructionDepotBankAccountNumber",
    "constructionDepotCommonInterestIndication",
    "constructionDepotInterest",
    "constructionDepotLabel",
    "constructionDepotProductID",
    "constructionDepotSourceBankTaxReferenceNumber"
})
public class ConstructionDepotSpecification
    extends Placeholder
{

    @XmlElement(name = "ConstructionDepotAccountHolderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Test11ItemType constructionDepotAccountHolderIdentificationNumber;
    @XmlElement(name = "ConstructionDepotBalance", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected List<MonetaryNoDecimalsItemType> constructionDepotBalance;
    @XmlElement(name = "ConstructionDepotBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring34VItemType constructionDepotBankAccountNumber;
    @XmlElement(name = "ConstructionDepotCommonInterestIndication", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected NonNegativeInteger2FItemType constructionDepotCommonInterestIndication;
    @XmlElement(name = "ConstructionDepotInterest", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected MonetaryNoDecimalsItemType constructionDepotInterest;
    @XmlElement(name = "ConstructionDepotLabel", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring70VItemType constructionDepotLabel;
    @XmlElement(name = "ConstructionDepotProductID", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Anstring20VItemType constructionDepotProductID;
    @XmlElement(name = "ConstructionDepotSourceBankTaxReferenceNumber", namespace = "http://www.nltaxonomie.nl/nt11/bd/20161207/dictionary/bd-burgers")
    protected Test11ItemType constructionDepotSourceBankTaxReferenceNumber;

    /**
     * Gets the value of the constructionDepotAccountHolderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getConstructionDepotAccountHolderIdentificationNumber() {
        return constructionDepotAccountHolderIdentificationNumber;
    }

    /**
     * Sets the value of the constructionDepotAccountHolderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setConstructionDepotAccountHolderIdentificationNumber(Test11ItemType value) {
        this.constructionDepotAccountHolderIdentificationNumber = value;
    }

    /**
     * Gets the value of the constructionDepotBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructionDepotBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructionDepotBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryNoDecimalsItemType }
     * 
     * 
     */
    public List<MonetaryNoDecimalsItemType> getConstructionDepotBalance() {
        if (constructionDepotBalance == null) {
            constructionDepotBalance = new ArrayList<MonetaryNoDecimalsItemType>();
        }
        return this.constructionDepotBalance;
    }

    /**
     * Gets the value of the constructionDepotBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getConstructionDepotBankAccountNumber() {
        return constructionDepotBankAccountNumber;
    }

    /**
     * Sets the value of the constructionDepotBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setConstructionDepotBankAccountNumber(Anstring34VItemType value) {
        this.constructionDepotBankAccountNumber = value;
    }

    /**
     * Gets the value of the constructionDepotCommonInterestIndication property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getConstructionDepotCommonInterestIndication() {
        return constructionDepotCommonInterestIndication;
    }

    /**
     * Sets the value of the constructionDepotCommonInterestIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setConstructionDepotCommonInterestIndication(NonNegativeInteger2FItemType value) {
        this.constructionDepotCommonInterestIndication = value;
    }

    /**
     * Gets the value of the constructionDepotInterest property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getConstructionDepotInterest() {
        return constructionDepotInterest;
    }

    /**
     * Sets the value of the constructionDepotInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setConstructionDepotInterest(MonetaryNoDecimalsItemType value) {
        this.constructionDepotInterest = value;
    }

    /**
     * Gets the value of the constructionDepotLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getConstructionDepotLabel() {
        return constructionDepotLabel;
    }

    /**
     * Sets the value of the constructionDepotLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setConstructionDepotLabel(Anstring70VItemType value) {
        this.constructionDepotLabel = value;
    }

    /**
     * Gets the value of the constructionDepotProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getConstructionDepotProductID() {
        return constructionDepotProductID;
    }

    /**
     * Sets the value of the constructionDepotProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setConstructionDepotProductID(Anstring20VItemType value) {
        this.constructionDepotProductID = value;
    }

    /**
     * Gets the value of the constructionDepotSourceBankTaxReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getConstructionDepotSourceBankTaxReferenceNumber() {
        return constructionDepotSourceBankTaxReferenceNumber;
    }

    /**
     * Sets the value of the constructionDepotSourceBankTaxReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setConstructionDepotSourceBankTaxReferenceNumber(Test11ItemType value) {
        this.constructionDepotSourceBankTaxReferenceNumber = value;
    }

}
