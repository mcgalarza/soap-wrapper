package com.redbee.wrapper

import grails.transaction.Transactional
import org.apache.cxf.endpoint.Client
import org.apache.cxf.frontend.ClientProxy
import org.springframework.beans.factory.annotation.Value
import org.tempuri.ObjectFactory
import org.tempuri.WebService
import soapwrapper.FileInInterceptor
import soapwrapper.FileOutInterceptor

@Transactional
class NeotelService {

    @Value('${urlWSNeotel}')
    String urlWSNeotel

    def factory = new ObjectFactory()

    def serviceMethod() {
        def neotelWS = createWSNeotelExecute()

        URL url = getClass().getResource(urlWSNeotel)
        WebService service = new WebService(url)

        def client = service.getWebServiceSoap12()
        Client clientProxy = ClientProxy.getClient(client)
        clientProxy.getInInterceptors().add(new FileInInterceptor())
        clientProxy.getOutInterceptors().add(new FileOutInterceptor())

        java.util.Map<String, Object> requestContext = ((javax.xml.ws.BindingProvider) client).getRequestContext()
        requestContext.put("set-jaxb-validation-event-handler", "false")
        def response = client.executeTask12(neotelWS.getIdTask(), neotelWS.getParam1(), neotelWS.getParam2(),
                neotelWS.getParam3(), neotelWS.getParam4(), neotelWS.getParam5(), neotelWS.getParam6(),
                neotelWS.getParam7(), neotelWS.getParam8(), neotelWS.getParam9(), neotelWS.getParam10(),
                neotelWS.getParam11(), neotelWS.getParam12())

        response
    }

    def createWSNeotelExecute() {
        def neotelWS = factory.createExecuteTask12()

        neotelWS.setIdTask(20) //idTarea: 14 produccion / 20 test
        neotelWS.setParam1("1") //idCanal:1=landingPage RCMoto, 2=chatBot, 3=ecommerce, 4=Chat-Lead Incompleto
        neotelWS.setParam2("20") //idCampaña: 20-ventas
        neotelWS.setParam3("2300") //idProducto
        neotelWS.setParam4("1163538152") //Telefono
        neotelWS.setParam5("morel.rodrigo@colonseguros.com.ar") //Email
        neotelWS.setParam6("Rodrigo") //Nombre
        neotelWS.setParam7("Morel") //Apellido
        neotelWS.setParam8("75395166") //DNI
        neotelWS.setParam9("RC Moto + AP") //Notas:Descripcion del Producto + todos los datos recuperados
        neotelWS.setParam10("mmrodrigo17") //IdFacebook
        neotelWS.setParam11("mmrodrigo17") //IDMessenger
        neotelWS.setParam12("1") //Horario Llamada agenda: 0-Llamar ahora 1-de 9 a 15 2-de 15 a 21

        neotelWS
    }
}