
package com.thalesgroup.rtti._2021_11_01.ldbsv;

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
 * JAX-WS RI 2.2.7-b73 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ldbsv", targetNamespace = "http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", wsdlLocation = "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2021-11-01")
public class Ldbsv
    extends Service
{

    private final static URL LDBSV_WSDL_LOCATION;
    private final static WebServiceException LDBSV_EXCEPTION;
    private final static QName LDBSV_QNAME = new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "ldbsv");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2021-11-01");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LDBSV_WSDL_LOCATION = url;
        LDBSV_EXCEPTION = e;
    }

    public Ldbsv() {
        super(__getWsdlLocation(), LDBSV_QNAME);
    }

    public Ldbsv(WebServiceFeature... features) {
        super(__getWsdlLocation(), LDBSV_QNAME, features);
    }

    public Ldbsv(URL wsdlLocation) {
        super(wsdlLocation, LDBSV_QNAME);
    }

    public Ldbsv(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LDBSV_QNAME, features);
    }

    public Ldbsv(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Ldbsv(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LDBSVServiceSoap
     */
    @WebEndpoint(name = "LDBSVServiceSoap")
    public LDBSVServiceSoap getLDBSVServiceSoap() {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVServiceSoap"), LDBSVServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LDBSVServiceSoap
     */
    @WebEndpoint(name = "LDBSVServiceSoap")
    public LDBSVServiceSoap getLDBSVServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVServiceSoap"), LDBSVServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns LDBSVServiceSoap
     */
    @WebEndpoint(name = "LDBSVServiceSoap12")
    public LDBSVServiceSoap getLDBSVServiceSoap12() {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVServiceSoap12"), LDBSVServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LDBSVServiceSoap
     */
    @WebEndpoint(name = "LDBSVServiceSoap12")
    public LDBSVServiceSoap getLDBSVServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVServiceSoap12"), LDBSVServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns LDBSVRefServiceSoap
     */
    @WebEndpoint(name = "LDBSVRefServiceSoap")
    public LDBSVRefServiceSoap getLDBSVRefServiceSoap() {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVRefServiceSoap"), LDBSVRefServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LDBSVRefServiceSoap
     */
    @WebEndpoint(name = "LDBSVRefServiceSoap")
    public LDBSVRefServiceSoap getLDBSVRefServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVRefServiceSoap"), LDBSVRefServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns LDBSVRefServiceSoap
     */
    @WebEndpoint(name = "LDBSVRefServiceSoap12")
    public LDBSVRefServiceSoap getLDBSVRefServiceSoap12() {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVRefServiceSoap12"), LDBSVRefServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LDBSVRefServiceSoap
     */
    @WebEndpoint(name = "LDBSVRefServiceSoap12")
    public LDBSVRefServiceSoap getLDBSVRefServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://thalesgroup.com/RTTI/2021-11-01/ldbsv/", "LDBSVRefServiceSoap12"), LDBSVRefServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LDBSV_EXCEPTION!= null) {
            throw LDBSV_EXCEPTION;
        }
        return LDBSV_WSDL_LOCATION;
    }

}
