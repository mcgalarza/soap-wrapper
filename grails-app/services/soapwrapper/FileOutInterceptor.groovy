package soapwrapper

import groovy.xml.XmlUtil
import org.apache.cxf.interceptor.LoggingMessage
import org.apache.cxf.interceptor.LoggingOutInterceptor
import org.apache.cxf.phase.Phase

public class FileOutInterceptor extends LoggingOutInterceptor {
    private LoggingMessage message

    public FileOutInterceptor() {
        super(Phase.PRE_STREAM);
    }

    @Override
    protected String formatLoggingMessage(LoggingMessage loggingMessage) {
        message = loggingMessage

        return super.formatLoggingMessage(loggingMessage);
    }

    public String getXmlString(){
        String soapXmlPayload = message.getPayload() != null ? message.getPayload().toString() : null;
        String xmlFormatted = XmlUtil.serialize(soapXmlPayload)

        return xmlFormatted;
    }

    public generateFile(String soapXmlPayload, String date){

        String filePathResponse = "/tmp/Request" + date + ".xml";
        File file = new File(filePathResponse);
        file.write soapXmlPayload;
    }
}