package soapwrapper

import org.apache.cxf.interceptor.LoggingInInterceptor
import org.apache.cxf.interceptor.LoggingMessage
import org.apache.cxf.phase.Phase;

public class FileInInterceptor extends LoggingInInterceptor {
    private LoggingMessage message;

    public FileInInterceptor() {
        super(Phase.PRE_STREAM);
    }

    @Override
    protected String formatLoggingMessage(LoggingMessage loggingMessage) {

        message = loggingMessage

        return super.formatLoggingMessage(loggingMessage);
    }

    public String getXmlString(){
        String soapXmlPayload = message.getPayload() != null ? message.getPayload().toString() : null;

        return soapXmlPayload;
    }

    public generateFile(String soapXmlPayload, String date){

        String filePathResponse = "/tmp/Response" + date + ".xml";
        File file = new File(filePathResponse);
        file.write soapXmlPayload;
    }
}