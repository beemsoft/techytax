//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:06:01 PM CET 
//


package nl.nltaxonomie._7_0_b_1.domein.kvk.tuples.kvk_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import org.xbrl._2003.instance.DateItemType;
import org.xbrl._2003.instance.StringItemType;
import org.xbrl.dtr.type.numeric.PercentItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsNameAcquiree" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsDescriptionAcquiree" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsMethodProcessing" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsDateAcquisition" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsPercentageVotingRightsAcquired" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsPurchasePriceDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data}MergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation" minOccurs="0"/>
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
    "mergersAcquisitionsNameAcquiree",
    "mergersAcquisitionsDescriptionAcquiree",
    "mergersAcquisitionsMethodProcessing",
    "mergersAcquisitionsDateAcquisition",
    "mergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition",
    "mergersAcquisitionsPercentageVotingRightsAcquired",
    "mergersAcquisitionsPurchasePriceDescription",
    "mergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities",
    "mergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation"
})
public class MergersAcquisitionsSpecification
    extends Placeholder
{

    @XmlElement(name = "MergersAcquisitionsNameAcquiree", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected StringItemType mergersAcquisitionsNameAcquiree;
    @XmlElement(name = "MergersAcquisitionsDescriptionAcquiree", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected StringItemType mergersAcquisitionsDescriptionAcquiree;
    @XmlElement(name = "MergersAcquisitionsMethodProcessing", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected StringItemType mergersAcquisitionsMethodProcessing;
    @XmlElement(name = "MergersAcquisitionsDateAcquisition", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected DateItemType mergersAcquisitionsDateAcquisition;
    @XmlElement(name = "MergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected StringItemType mergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition;
    @XmlElement(name = "MergersAcquisitionsPercentageVotingRightsAcquired", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected PercentItemType mergersAcquisitionsPercentageVotingRightsAcquired;
    @XmlElement(name = "MergersAcquisitionsPurchasePriceDescription", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected StringItemType mergersAcquisitionsPurchasePriceDescription;
    @XmlElement(name = "MergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected StringItemType mergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities;
    @XmlElement(name = "MergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation", namespace = "http://www.nltaxonomie.nl/7.0.b.1/basis/kvk/items/kvk-data")
    protected StringItemType mergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation;

    /**
     * Gets the value of the mergersAcquisitionsNameAcquiree property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getMergersAcquisitionsNameAcquiree() {
        return mergersAcquisitionsNameAcquiree;
    }

    /**
     * Sets the value of the mergersAcquisitionsNameAcquiree property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setMergersAcquisitionsNameAcquiree(StringItemType value) {
        this.mergersAcquisitionsNameAcquiree = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsDescriptionAcquiree property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getMergersAcquisitionsDescriptionAcquiree() {
        return mergersAcquisitionsDescriptionAcquiree;
    }

    /**
     * Sets the value of the mergersAcquisitionsDescriptionAcquiree property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setMergersAcquisitionsDescriptionAcquiree(StringItemType value) {
        this.mergersAcquisitionsDescriptionAcquiree = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsMethodProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getMergersAcquisitionsMethodProcessing() {
        return mergersAcquisitionsMethodProcessing;
    }

    /**
     * Sets the value of the mergersAcquisitionsMethodProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setMergersAcquisitionsMethodProcessing(StringItemType value) {
        this.mergersAcquisitionsMethodProcessing = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsDateAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getMergersAcquisitionsDateAcquisition() {
        return mergersAcquisitionsDateAcquisition;
    }

    /**
     * Sets the value of the mergersAcquisitionsDateAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setMergersAcquisitionsDateAcquisition(DateItemType value) {
        this.mergersAcquisitionsDateAcquisition = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getMergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition() {
        return mergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition;
    }

    /**
     * Sets the value of the mergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setMergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition(StringItemType value) {
        this.mergersAcquisitionsDiscontinuedOperationsFollowingMergerAcquisition = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsPercentageVotingRightsAcquired property.
     * 
     * @return
     *     possible object is
     *     {@link PercentItemType }
     *     
     */
    public PercentItemType getMergersAcquisitionsPercentageVotingRightsAcquired() {
        return mergersAcquisitionsPercentageVotingRightsAcquired;
    }

    /**
     * Sets the value of the mergersAcquisitionsPercentageVotingRightsAcquired property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentItemType }
     *     
     */
    public void setMergersAcquisitionsPercentageVotingRightsAcquired(PercentItemType value) {
        this.mergersAcquisitionsPercentageVotingRightsAcquired = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsPurchasePriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getMergersAcquisitionsPurchasePriceDescription() {
        return mergersAcquisitionsPurchasePriceDescription;
    }

    /**
     * Sets the value of the mergersAcquisitionsPurchasePriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setMergersAcquisitionsPurchasePriceDescription(StringItemType value) {
        this.mergersAcquisitionsPurchasePriceDescription = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getMergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities() {
        return mergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities;
    }

    /**
     * Sets the value of the mergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setMergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities(StringItemType value) {
        this.mergersAcquisitionsEstimateFairValueIdentifiableAssetsLiabilities = value;
    }

    /**
     * Gets the value of the mergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StringItemType }
     *     
     */
    public StringItemType getMergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation() {
        return mergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation;
    }

    /**
     * Sets the value of the mergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringItemType }
     *     
     */
    public void setMergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation(StringItemType value) {
        this.mergersAcquisitionsPoolingOfInterestsMethodAdditionalInformation = value;
    }

}
