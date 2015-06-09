/*
 * Área de pintura 
 */

package pkgModelo;

import java.util.LinkedList;
import javax.accessibility.AccessibleState;



/**
 * autos: Lista de autos que van a recibir servicios dentro de esta area
 * @author Estefanía Gómez Cárdenas
 */

public class Pintura extends Area{
    int duracion;
    LinkedList<Auto> autos; //La lista se va a comportar como una cola
    Servicio[] servicios;
    
    public Pintura() {
        autos = new LinkedList<>();
        duracion = 60; 
        servicios = new Servicio[1];
        
        
        
    }

    public Pintura(int duracion, LinkedList<Auto> autos) {
        this.duracion = duracion;
        this.autos = autos;
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
    
    public void addServicios(){
        Servicio pintura = new Servicio("pintura", 2000000, 60);
        servicios[0] = pintura;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
