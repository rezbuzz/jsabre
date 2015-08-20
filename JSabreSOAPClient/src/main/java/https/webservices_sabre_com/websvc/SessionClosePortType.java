
package https.webservices_sabre_com.websvc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.opentravel.ota._2002._11.SessionCloseRQ;
import org.opentravel.ota._2002._11.SessionCloseRS;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SessionClosePortType", targetNamespace = "https://webservices.sabre.com/websvc")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.opentravel.ota._2002._11.ObjectFactory.class,
    org.xmlsoap.schemas.ws._2002._12.secext.ObjectFactory.class,
    org.ebxml.namespaces.messageheader.ObjectFactory.class,
    org.w3._2000._09.xmldsig.ObjectFactory.class,
    org.xmlsoap.schemas.soap.envelope.ObjectFactory.class
})
public interface SessionClosePortType {


    /**
     * 
     * @param header2
     * @param header
     * @param body
     * @return
     *     returns org.opentravel.ota._2002._11.SessionCloseRS
     */
    @WebMethod(operationName = "SessionCloseRQ", action = "OTA")
    @WebResult(name = "SessionCloseRS", targetNamespace = "http://www.opentravel.org/OTA/2002/11", partName = "body")
    public SessionCloseRS sessionCloseRQ(
        @WebParam(name = "MessageHeader", targetNamespace = "http://www.ebxml.org/namespaces/messageHeader", header = true, mode = WebParam.Mode.INOUT, partName = "header")
        Holder<MessageHeader> header,
        @WebParam(name = "Security", targetNamespace = "http://schemas.xmlsoap.org/ws/2002/12/secext", header = true, mode = WebParam.Mode.INOUT, partName = "header2")
        Holder<Security> header2,
        @WebParam(name = "SessionCloseRQ", targetNamespace = "http://www.opentravel.org/OTA/2002/11", partName = "body")
        SessionCloseRQ body);

}