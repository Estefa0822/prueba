/*
 * Esta área contiene las diferentes áreas con las que cuenta e taller de 
 *mecánica
 */

package pkgModelo;

import java.util.LinkedList;


/**
 * Nombre: Nombre del área
 * descripcion: descripción de area
 * duración: Duración del servicio del área
 * servicios: Lista de servicios con los que cuenta el área
 * @author Estefanía Gómez Cárdenas
 */

public class Area {
   protected  String nombre;
   protected int duracion;
   protected Servicio[] servicios;
      
    public Area() {
        
    }

    public Area(String nombre, int duracion, Servicio[] servicios) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCosto(){
        return 0;
    }
    
    public int getDuracion() {
        //Recorrer todas los servicios dentro de esa área
        return duracion;
    }
    
    public LinkedList getAutos(){
        return null;
    }

    public void getServicios() {
        System.out.println("\nServicios del area: ");
        for (int i = 0; i < servicios.length; i++) {
            System.out.println("Nombre del servicio: "+ servicios[i].getNombre());
            System.out.println("Costo del servicio: "+ servicios[i].getCosto());
            System.out.println("Duración del servicio: "+ servicios[i].getDuracion());
        }        
    }

   
    
           
    
    /**
     * Este método se encarga de buscar un servicio dentro de la lista de servicios
     * @param servicio Nombre del servicio a buscar
     * @return indice del servicio que estaba buscando
     */
//    public int obtenerServicio(String servicio){
//        int i=0;
//        boolean encontrado = false;
//        int indiceServicio=-1;
//        
//        while (encontrado || i < servicio.length()) {
//            if(servicios[i].getNombre().equals(servicio)){
//                encontrado= true;
//                indiceServicio = i;
//            }
//            i++;
//        }
//        return indiceServicio;        
//    }
    
}
