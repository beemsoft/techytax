//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 01:15:21 PM CEST 
//


package nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_alg_tuples;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_alg_tuples package. 
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

    private final static QName _AppointPostsSpecification_QNAME = new QName("http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", "AppointPostsSpecification");
    private final static QName _AddressAbroadSpecification_QNAME = new QName("http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", "AddressAbroadSpecification");
    private final static QName _AddressDutchSpecification_QNAME = new QName("http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", "AddressDutchSpecification");
    private final static QName _PostponementSpecification_QNAME = new QName("http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", "PostponementSpecification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_alg_tuples
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostponementSpecification }
     * 
     */
    public PostponementSpecification createPostponementSpecification() {
        return new PostponementSpecification();
    }

    /**
     * Create an instance of {@link AddressDutchSpecification }
     * 
     */
    public AddressDutchSpecification createAddressDutchSpecification() {
        return new AddressDutchSpecification();
    }

    /**
     * Create an instance of {@link AddressAbroadSpecification }
     * 
     */
    public AddressAbroadSpecification createAddressAbroadSpecification() {
        return new AddressAbroadSpecification();
    }

    /**
     * Create an instance of {@link AppointPostsSpecification }
     * 
     */
    public AppointPostsSpecification createAppointPostsSpecification() {
        return new AppointPostsSpecification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointPostsSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", name = "AppointPostsSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<AppointPostsSpecification> createAppointPostsSpecification(AppointPostsSpecification value) {
        return new JAXBElement<AppointPostsSpecification>(_AppointPostsSpecification_QNAME, AppointPostsSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressAbroadSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", name = "AddressAbroadSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationTuple")
    public JAXBElement<AddressAbroadSpecification> createAddressAbroadSpecification(AddressAbroadSpecification value) {
        return new JAXBElement<AddressAbroadSpecification>(_AddressAbroadSpecification_QNAME, AddressAbroadSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDutchSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", name = "AddressDutchSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "presentationTuple")
    public JAXBElement<AddressDutchSpecification> createAddressDutchSpecification(AddressDutchSpecification value) {
        return new JAXBElement<AddressDutchSpecification>(_AddressDutchSpecification_QNAME, AddressDutchSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostponementSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/8.0.a.2/domein/bd/tuples/bd-alg-tuples", name = "PostponementSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<PostponementSpecification> createPostponementSpecification(PostponementSpecification value) {
        return new JAXBElement<PostponementSpecification>(_PostponementSpecification_QNAME, PostponementSpecification.class, null, value);
    }

}
