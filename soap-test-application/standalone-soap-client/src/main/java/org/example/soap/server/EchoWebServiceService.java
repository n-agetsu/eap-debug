
package org.example.soap.server;

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
@WebServiceClient(name = "EchoWebServiceService", targetNamespace = "http://server.soap.example.org/", wsdlLocation = "http://localhost:8080/jaxws-server/EchoWebService?wsdl")
public class EchoWebServiceService
    extends Service
{

    private final static URL ECHOWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ECHOWEBSERVICESERVICE_EXCEPTION;
    private final static QName ECHOWEBSERVICESERVICE_QNAME = new QName("http://server.soap.example.org/", "EchoWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/jaxws-server/EchoWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECHOWEBSERVICESERVICE_WSDL_LOCATION = url;
        ECHOWEBSERVICESERVICE_EXCEPTION = e;
    }

    public EchoWebServiceService() {
        super(__getWsdlLocation(), ECHOWEBSERVICESERVICE_QNAME);
    }

    public EchoWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECHOWEBSERVICESERVICE_QNAME, features);
    }

    public EchoWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, ECHOWEBSERVICESERVICE_QNAME);
    }

    public EchoWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECHOWEBSERVICESERVICE_QNAME, features);
    }

    public EchoWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EchoWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EchoWebService
     */
    @WebEndpoint(name = "EchoWebServicePort")
    public EchoWebService getEchoWebServicePort() {
        return super.getPort(new QName("http://server.soap.example.org/", "EchoWebServicePort"), EchoWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EchoWebService
     */
    @WebEndpoint(name = "EchoWebServicePort")
    public EchoWebService getEchoWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.soap.example.org/", "EchoWebServicePort"), EchoWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECHOWEBSERVICESERVICE_EXCEPTION!= null) {
            throw ECHOWEBSERVICESERVICE_EXCEPTION;
        }
        return ECHOWEBSERVICESERVICE_WSDL_LOCATION;
    }

}