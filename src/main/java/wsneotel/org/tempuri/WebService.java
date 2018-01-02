package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2017-12-29T17:08:11.168-03:00
 * Generated source version: 3.1.1
 * 
 */
@WebServiceClient(name = "WebService", 
                  wsdlLocation = "file:/home/redbee/colonseguros/soap-wrapper/src/main/resources/file/ws_neotel.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class WebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "WebService");
    public final static QName WebServiceHttpGet = new QName("http://tempuri.org/", "WebServiceHttpGet");
    public final static QName WebServiceHttpPost = new QName("http://tempuri.org/", "WebServiceHttpPost");
    public final static QName WebServiceSoap = new QName("http://tempuri.org/", "WebServiceSoap");
    public final static QName WebServiceSoap12 = new QName("http://tempuri.org/", "WebServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/redbee/colonseguros/soap-wrapper/src/main/resources/file/ws_neotel.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/redbee/colonseguros/soap-wrapper/src/main/resources/file/ws_neotel.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WebServiceHttpGet
     */
    @WebEndpoint(name = "WebServiceHttpGet")
    public WebServiceHttpGet getWebServiceHttpGet() {
        return super.getPort(WebServiceHttpGet, WebServiceHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceHttpGet
     */
    @WebEndpoint(name = "WebServiceHttpGet")
    public WebServiceHttpGet getWebServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(WebServiceHttpGet, WebServiceHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns WebServiceHttpPost
     */
    @WebEndpoint(name = "WebServiceHttpPost")
    public WebServiceHttpPost getWebServiceHttpPost() {
        return super.getPort(WebServiceHttpPost, WebServiceHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceHttpPost
     */
    @WebEndpoint(name = "WebServiceHttpPost")
    public WebServiceHttpPost getWebServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(WebServiceHttpPost, WebServiceHttpPost.class, features);
    }


    /**
     *
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebServiceSoap() {
        return super.getPort(WebServiceSoap, WebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap, WebServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebServiceSoap12() {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSoap
     */
    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class, features);
    }

}
