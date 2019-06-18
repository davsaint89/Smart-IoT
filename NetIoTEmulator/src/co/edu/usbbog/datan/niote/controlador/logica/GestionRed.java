/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.datan.niote.controlador.logica;

import co.edu.usbbog.datan.niote.controlador.persistencia.ArchivoDeConfiguracionDeRed;
import co.edu.usbbog.datan.niote.modelo.PuertaDeEnlace;
import co.edu.usbbog.datan.niote.modelo.Red;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés Sánchez, Juan Ochoa, Sebastian Villanueva, Gabriel Peña.
 */
public class GestionRed implements Serializable {

    private Red red;
    private ArchivoDeConfiguracionDeRed archivoDeConfiguracionDeRed;

    //relaciones
    private GestionPuertasDeEnlace gestionPuertasDeEnlace;
    private GestionNodos gestionNodos;
    private GestionActuadores gestionActuadores;
    private GestionSensores gestionSensores;

    public GestionRed(String id, String nombre, String descripcion) {
        this.red = new Red(id, nombre, descripcion);
        this.archivoDeConfiguracionDeRed = new ArchivoDeConfiguracionDeRed();
        this.gestionPuertasDeEnlace = new GestionPuertasDeEnlace();
        this.gestionNodos = new GestionNodos();
        this.gestionActuadores = new GestionActuadores();
        this.gestionSensores = new GestionSensores();
    }

    public GestionRed(String ruta, String nombreArchivo) {
        this.archivoDeConfiguracionDeRed = new ArchivoDeConfiguracionDeRed(ruta, nombreArchivo);
        this.gestionPuertasDeEnlace = this.archivoDeConfiguracionDeRed.cargarPuertasDeEnlace();
        this.gestionNodos = this.archivoDeConfiguracionDeRed.cargarNodos();
        this.gestionActuadores = this.archivoDeConfiguracionDeRed.cargarActuadores();
        this.gestionSensores = this.archivoDeConfiguracionDeRed.cargarSensores();
        this.red = this.archivoDeConfiguracionDeRed.cargarRed();
    }

    public Red getRed() {
        return red;
    }

    public void setRed(Red red) {
        this.red = red;
    }

    public GestionNodos getGestionNodo() {
        return gestionNodos;
    }

    public GestionActuadores getGestionActuadores() {
        return gestionActuadores;
    }

    public GestionSensores getGestionSensores() {
        return gestionSensores;
    }

    public GestionPuertasDeEnlace getGestionPuertaDeEnlace() {
        return gestionPuertasDeEnlace;
    }

    public boolean verRed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean agregarPuertaDeEnlaceALaRed(String idPuertaDeEnlace) {
        PuertaDeEnlace puertaDeEnlace = getGestionPuertaDeEnlace().buscarPuertaDeEnlacePorID(idPuertaDeEnlace);
        if(puertaDeEnlace!=null){
            getGestionPuertaDeEnlace().eliminarPuertaDeEnlacePorID(idPuertaDeEnlace);
            getRed().getPuertasDeEnlace().add(puertaDeEnlace);
            return true;
        }else{
            return false;
        }      
    }

    public boolean verPuertasDeEnlaceDeLaRed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PuertaDeEnlace buscarPuertaDeEnlaceDeLaRedPorID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removerPuertaDeEnlaceDeLaRed(String idPuertaDeEnlace) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean agregarNodoALaRed(String idNodo, String idsPuertasDeEnlace) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String validarPuertasDeEnlace(String idsPuertasDeEnlace) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean verNodosDeLaRed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object buscarNodoDeLaRedPorID(String idNodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removerNodoDeLaRed(String idNodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean guardarRed(String ruta, String nombreArchivo) {
        archivoDeConfiguracionDeRed = new ArchivoDeConfiguracionDeRed(ruta, nombreArchivo,this);
        if(archivoDeConfiguracionDeRed!=null){
            return true;
        }else{
            return false;
        }
        
    }

    public boolean agregarSensorALaRed(String idSensor, String idNodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean verSensoresDeLaRed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object buscarSensorDeLaRedPorID(String idSensor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removerSensorDeLaRed(String idSensor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para ver el Actuador en la red
     * @return 
     */
    public boolean verActuadorDeLaRed() {
        List<Actuador> todosLosActuadoresDeLaRed = new ArrayList<>();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para buscar actuador en la red
     * @param idActuador
     * @return 
     */
    public Object buscarActuadorDeLaRedPorID(String idActuador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para Remover Actuador de la red
     * @param idActuador
     * @return 
     */
    public boolean removerActuadorDeLaRed(String idActuador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para agregar actuador en la red
     * @param idActuador
     * @param idNodo
     * @return 
     */
    public boolean agregarActuadorALaRed(String idActuador, String idNodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
