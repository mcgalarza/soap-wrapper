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

    def serviceMethod(body) {
        def neotelWS = createWSNeotelExecute(body)

        URL url = getClass().getResource(urlWSNeotel)
//        WebService service = new WebService(url)
//
//        def client = service.getWebServiceSoap12()
        def client = new WebService(url).getWebServiceSoap12()
//        Client clientProxy = Cli/entProxy.getClient(client)
//        clientProxy.getInInterceptors().add(new FileInInterceptor())
//        clientProxy.getOutInterceptors().add(new FileOutInterceptor())

        java.util.Map<String, Object> requestContext = ((javax.xml.ws.BindingProvider) client).getRequestContext()
        requestContext.put("set-jaxb-validation-event-handler", "false")
        def response = client.executeTask12(neotelWS.getIdTask(), neotelWS.getParam1(), neotelWS.getParam2(),
                neotelWS.getParam3(), neotelWS.getParam4(), neotelWS.getParam5(), neotelWS.getParam6(),
                neotelWS.getParam7(), neotelWS.getParam8(), neotelWS.getParam9(), neotelWS.getParam10(),
                neotelWS.getParam11(), neotelWS.getParam12())

        def resultado = new org.grails.web.json.JSONObject(response)

        resultado
    }

    def createWSNeotelExecute(body) {
        def neotelWS = factory.createExecuteTask12()

        neotelWS.setIdTask(body.idTask) //idTarea: 14 produccion / 20 test
        neotelWS.setParam1(body.param1) //idCanal:1=landingPage RCMoto, 2=chatBot, 3=ecommerce, 4=Chat-Lead Incompleto
        neotelWS.setParam2(body.param2) //idCampaña: 20-ventas
        neotelWS.setParam3(body.param3) //idProducto
        neotelWS.setParam4(body.param4) //Telefono
        neotelWS.setParam5(body.param5) //Email
        neotelWS.setParam6(body.param6) //Nombre
        neotelWS.setParam7(body.param7) //Apellido
        neotelWS.setParam8(body.param8) //DNI
        neotelWS.setParam9(body.param9) //Notas:Descripcion del Producto + todos los datos recuperados
        neotelWS.setParam10(body.param10) //IdFacebook
        neotelWS.setParam11(body.param11) //IDMessenger
        neotelWS.setParam12(body.param12) //Horario Llamada agenda: 0-Llamar ahora 1-de 9 a 15 2-de 15 a 21

        neotelWS
    }
}