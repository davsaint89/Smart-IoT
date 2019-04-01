
package red.nodos.ubicuos.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RNUWS", targetNamespace = "http://iot.servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RNUWS {


    /**
     * 
     * @param fecha
     * @param contenido
     * @param idObjeto
     * @param tipoNodo
     * @param tipoAccion
     * @param valor
     * @param objeto
     * @param visto
     * @param publicado
     */
    @WebMethod(operationName = "AgregarEventosSim")
    @RequestWrapper(localName = "AgregarEventosSim", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.AgregarEventosSim")
    @ResponseWrapper(localName = "AgregarEventosSimResponse", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.AgregarEventosSimResponse")
    @Action(input = "http://iot.servicio/RNUWS/AgregarEventosSimRequest", output = "http://iot.servicio/RNUWS/AgregarEventosSimResponse")
    public void agregarEventosSim(
        @WebParam(name = "tipoAccion", targetNamespace = "")
        String tipoAccion,
        @WebParam(name = "valor", targetNamespace = "")
        String valor,
        @WebParam(name = "tipoNodo", targetNamespace = "")
        String tipoNodo,
        @WebParam(name = "idObjeto", targetNamespace = "")
        String idObjeto,
        @WebParam(name = "objeto", targetNamespace = "")
        String objeto,
        @WebParam(name = "contenido", targetNamespace = "")
        String contenido,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "visto", targetNamespace = "")
        String visto,
        @WebParam(name = "publicado", targetNamespace = "")
        String publicado);

    /**
     * 
     * @param idSalud
     * @param pulso
     * @param respiracion
     * @param saturacion
     * @param temperatura
     * @param presion
     */
    @WebMethod(operationName = "Salud")
    @RequestWrapper(localName = "Salud", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.Salud")
    @ResponseWrapper(localName = "SaludResponse", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.SaludResponse")
    @Action(input = "http://iot.servicio/RNUWS/SaludRequest", output = "http://iot.servicio/RNUWS/SaludResponse")
    public void salud(
        @WebParam(name = "idSalud", targetNamespace = "")
        int idSalud,
        @WebParam(name = "presion", targetNamespace = "")
        String presion,
        @WebParam(name = "respiracion", targetNamespace = "")
        String respiracion,
        @WebParam(name = "pulso", targetNamespace = "")
        String pulso,
        @WebParam(name = "temperatura", targetNamespace = "")
        String temperatura,
        @WebParam(name = "saturacion", targetNamespace = "")
        String saturacion);

    /**
     * 
     * @param idBienestar
     * @param alimentacion
     * @param energia
     * @param ocio
     * @param fisico
     * @param salud
     */
    @WebMethod(operationName = "Bienestar")
    @RequestWrapper(localName = "Bienestar", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.Bienestar")
    @ResponseWrapper(localName = "BienestarResponse", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.BienestarResponse")
    @Action(input = "http://iot.servicio/RNUWS/BienestarRequest", output = "http://iot.servicio/RNUWS/BienestarResponse")
    public void bienestar(
        @WebParam(name = "idBienestar", targetNamespace = "")
        int idBienestar,
        @WebParam(name = "alimentacion", targetNamespace = "")
        String alimentacion,
        @WebParam(name = "energia", targetNamespace = "")
        String energia,
        @WebParam(name = "salud", targetNamespace = "")
        String salud,
        @WebParam(name = "fisico", targetNamespace = "")
        String fisico,
        @WebParam(name = "ocio", targetNamespace = "")
        String ocio);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "PrenderTV")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PrenderTV", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.PrenderTV")
    @ResponseWrapper(localName = "PrenderTVResponse", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.PrenderTVResponse")
    @Action(input = "http://iot.servicio/RNUWS/PrenderTVRequest", output = "http://iot.servicio/RNUWS/PrenderTVResponse")
    public boolean prenderTV();

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ApagarTV")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ApagarTV", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.ApagarTV")
    @ResponseWrapper(localName = "ApagarTVResponse", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.ApagarTVResponse")
    @Action(input = "http://iot.servicio/RNUWS/ApagarTVRequest", output = "http://iot.servicio/RNUWS/ApagarTVResponse")
    public boolean apagarTV();

    /**
     * 
     * @param fecha
     * @param contenido
     * @param idObjeto
     * @param tipoNodo
     * @param tipoAccion
     * @param valor
     * @param objeto
     * @param visto
     * @param publicado
     */
    @WebMethod(operationName = "AgregarEventos")
    @RequestWrapper(localName = "AgregarEventos", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.AgregarEventos")
    @ResponseWrapper(localName = "AgregarEventosResponse", targetNamespace = "http://iot.servicio/", className = "red.nodos.ubicuos.ws.AgregarEventosResponse")
    @Action(input = "http://iot.servicio/RNUWS/AgregarEventosRequest", output = "http://iot.servicio/RNUWS/AgregarEventosResponse")
    public void agregarEventos(
        @WebParam(name = "tipoAccion", targetNamespace = "")
        String tipoAccion,
        @WebParam(name = "valor", targetNamespace = "")
        String valor,
        @WebParam(name = "tipoNodo", targetNamespace = "")
        String tipoNodo,
        @WebParam(name = "idObjeto", targetNamespace = "")
        String idObjeto,
        @WebParam(name = "objeto", targetNamespace = "")
        String objeto,
        @WebParam(name = "contenido", targetNamespace = "")
        String contenido,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "visto", targetNamespace = "")
        String visto,
        @WebParam(name = "publicado", targetNamespace = "")
        String publicado);

}
