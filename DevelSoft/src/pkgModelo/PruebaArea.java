/*
 * Clase utilizada para probar el funcionamiento de area
 */
package pkgModelo;

import java.util.LinkedList;

/**
 *
 * @author Estefanía Gómez Cárdenas
 */
public class PruebaArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Area> areas; //Lista de áreas
        areas = new LinkedList<>();
        
        //Crear área de pintura
        Pintura areaPintura = new Pintura(); 
        areas.add(areaPintura);
        
        
        //Recorrer las areas adicionadas
        System.out.println("Voy a recorrer las áreas");
        for (int i = 0; i < areas.size(); i++) {
            System.out.println("Areas: "+i);
            System.out.print("Nombre: "+areas.get(i).getNombre());
            System.out.print("Duración Total: "+areas.get(i).getDuracion());
            areas.get(i).getServicios();

            
            
        }
        
        
        
        
        
        
        
        
    }

}
