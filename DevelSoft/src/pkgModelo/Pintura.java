/*
 * Área de pintura 
 */

package pkgModelo;

import java.awt.Color;
import java.util.LinkedList;
import javax.accessibility.AccessibleState;



/**
 * autos: Lista de autos que van a recibir servicios dentro de esta area
 * @author Estefanía Gómez Cárdenas
 */

public class Pintura extends Area{
    private LinkedList<Auto> autos; //La lista se va a comportar como una cola
    
    
    public Pintura() {
        this.autos = new LinkedList<>();
        super.servicios = new Servicio[1];
        super.duracion = 60;
        super.nombre="Pintura";        
        addServicios();
    }
    
    
    /**
     * Este método se encarga de adicionar los servicios al área
     */
    private void addServicios(){        
        Servicio pintura = new Servicio("pintura", 2000000, 60);
        servicios = new Servicio[1];
        servicios[0] = pintura;
    }
    
    /**
     * Se encarga de adicionar un auto a la "cola" de autos que están esperando
     * ser atendidos
     * @param auto Auto que va a ingresar a la cola de espera
     */
    public void adicionarAutos(Auto auto){
        autos.add(auto);
    }
    
    /**
     * Información del auto que ingresa a la cola de espera
     * @param placa Placa del auto
     * @param modelo Placa del auto
     * @param color Color del auto
     */
    public void adicionarAutos(String placa, String modelo, Color color){
        Auto auto = new Auto(placa, modelo, "Azul");
        autos.add(auto);
    
    }
    
    public LinkedList<Auto> obtenerAutos(){
        return autos;
    }
    
    
    

    
    /**
     * Este método se encarga de añadir un auto a la lista de autos 
     * @param auto se adiciona a la lista de autos
     */
//    public void adicionarAutos(Auto auto){
//        //Adiciono el auto a la lista de autos
//        autos.add(auto);
//        super.servicios[0].adicionarAuto(auto);
////        Adiciono el auto a la estructura de datos de servicio 
////        for (int i = 0; i < serviciosAuto.length; i++) {            
////            super.servicios[super.obtenerServicio(serviciosAuto[i].getNombre())].adicionarAuto(auto);
////        }
//    }
    
    
    
    /**
     * Se encarga de adicionar servicios al área de pintura
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
