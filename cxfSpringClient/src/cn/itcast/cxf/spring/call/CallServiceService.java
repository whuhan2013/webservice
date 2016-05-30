package cn.itcast.cxf.spring.call;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2016-05-30T10:48:08.975+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "CallServiceService", 
                  wsdlLocation = "http://localhost:8080/cxfspringweb/ws/makeCallService?wsdl",
                  targetNamespace = "http://call.spring.cxf.itcast.cn/") 
public class CallServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://call.spring.cxf.itcast.cn/", "CallServiceService");
    public final static QName CallServicePort = new QName("http://call.spring.cxf.itcast.cn/", "CallServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cxfspringweb/ws/makeCallService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CallServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/cxfspringweb/ws/makeCallService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CallServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CallServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CallServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CallServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CallServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CallServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CallService
     */
    @WebEndpoint(name = "CallServicePort")
    public CallService getCallServicePort() {
        return super.getPort(CallServicePort, CallService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CallService
     */
    @WebEndpoint(name = "CallServicePort")
    public CallService getCallServicePort(WebServiceFeature... features) {
        return super.getPort(CallServicePort, CallService.class, features);
    }

}
