//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 09:30:36 PM CEST 
//


package nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.xbrl._2003.instance.StringItemType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DomainItem_QNAME = new QName("http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", "domainItem");
    private final static QName _LinkroleOrder_QNAME = new QName("http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", "linkroleOrder");
    private final static QName _PresentationTuple_QNAME = new QName("http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", "presentationTuple");
    private final static QName _SpecificationTuple_QNAME = new QName("http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", "specificationTuple");
    private final static QName _PrimaryDomainItem_QNAME = new QName("http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", "primaryDomainItem");
    private final static QName _PresentationItem_QNAME = new QName("http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", "presentationItem");
    private final static QName _DomainMemberItem_QNAME = new QName("http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", "domainMemberItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Placeholder }
     * 
     */
    public Placeholder createPlaceholder() {
        return new Placeholder();
    }

    /**
     * Create an instance of {@link LinkroleOrder }
     * 
     */
    public LinkroleOrder createLinkroleOrder() {
        return new LinkroleOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", name = "domainItem", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createDomainItem(StringItemType value) {
        return new JAXBElement<StringItemType>(_DomainItem_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkroleOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", name = "linkroleOrder", substitutionHeadNamespace = "http://www.xbrl.org/2003/XLink", substitutionHeadName = "resource")
    public JAXBElement<LinkroleOrder> createLinkroleOrder(LinkroleOrder value) {
        return new JAXBElement<LinkroleOrder>(_LinkroleOrder_QNAME, LinkroleOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placeholder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", name = "presentationTuple", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "tuple")
    public JAXBElement<Placeholder> createPresentationTuple(Placeholder value) {
        return new JAXBElement<Placeholder>(_PresentationTuple_QNAME, Placeholder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placeholder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", name = "specificationTuple", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "tuple")
    public JAXBElement<Placeholder> createSpecificationTuple(Placeholder value) {
        return new JAXBElement<Placeholder>(_SpecificationTuple_QNAME, Placeholder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", name = "primaryDomainItem", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createPrimaryDomainItem(StringItemType value) {
        return new JAXBElement<StringItemType>(_PrimaryDomainItem_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", name = "presentationItem", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createPresentationItem(StringItemType value) {
        return new JAXBElement<StringItemType>(_PresentationItem_QNAME, StringItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", name = "domainMemberItem", substitutionHeadNamespace = "http://www.xbrl.org/2003/instance", substitutionHeadName = "item")
    public JAXBElement<StringItemType> createDomainMemberItem(StringItemType value) {
        return new JAXBElement<StringItemType>(_DomainMemberItem_QNAME, StringItemType.class, null, value);
    }

}
