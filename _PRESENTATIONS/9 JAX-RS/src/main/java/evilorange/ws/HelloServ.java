
package evilorange.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloServ", targetNamespace = "http://ws.evilorange/", wsdlLocation = "http://localhost:8080/build/HelloServ?wsdl")
public class HelloServ
    extends Service
{

    private final static URL HELLOSERV_WSDL_LOCATION;
    private final static WebServiceException HELLOSERV_EXCEPTION;
    private final static QName HELLOSERV_QNAME = new QName("http://ws.evilorange/", "HelloServ");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/build/HelloServ?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOSERV_WSDL_LOCATION = url;
        HELLOSERV_EXCEPTION = e;
    }

    public HelloServ() {
        super(__getWsdlLocation(), HELLOSERV_QNAME);
    }

    public HelloServ(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOSERV_QNAME, features);
    }

    public HelloServ(URL wsdlLocation) {
        super(wsdlLocation, HELLOSERV_QNAME);
    }

    public HelloServ(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOSERV_QNAME, features);
    }

    public HelloServ(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServ(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsExampleInterface
     */
    @WebEndpoint(name = "HelloPort")
    public WsExampleInterface getHelloPort() {
        return super.getPort(new QName("http://ws.evilorange/", "HelloPort"), WsExampleInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsExampleInterface
     */
    @WebEndpoint(name = "HelloPort")
    public WsExampleInterface getHelloPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.evilorange/", "HelloPort"), WsExampleInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSERV_EXCEPTION!= null) {
            throw HELLOSERV_EXCEPTION;
        }
        return HELLOSERV_WSDL_LOCATION;
    }

}