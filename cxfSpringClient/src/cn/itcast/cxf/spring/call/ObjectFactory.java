
package cn.itcast.cxf.spring.call;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.itcast.cxf.spring.call package. 
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

    private final static QName _MakeCallerResponse_QNAME = new QName("http://call.spring.cxf.itcast.cn/", "makeCallerResponse");
    private final static QName _MakeCaller_QNAME = new QName("http://call.spring.cxf.itcast.cn/", "makeCaller");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.itcast.cxf.spring.call
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakeCallerResponse }
     * 
     */
    public MakeCallerResponse createMakeCallerResponse() {
        return new MakeCallerResponse();
    }

    /**
     * Create an instance of {@link MakeCaller }
     * 
     */
    public MakeCaller createMakeCaller() {
        return new MakeCaller();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeCallerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://call.spring.cxf.itcast.cn/", name = "makeCallerResponse")
    public JAXBElement<MakeCallerResponse> createMakeCallerResponse(MakeCallerResponse value) {
        return new JAXBElement<MakeCallerResponse>(_MakeCallerResponse_QNAME, MakeCallerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeCaller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://call.spring.cxf.itcast.cn/", name = "makeCaller")
    public JAXBElement<MakeCaller> createMakeCaller(MakeCaller value) {
        return new JAXBElement<MakeCaller>(_MakeCaller_QNAME, MakeCaller.class, null, value);
    }

}
