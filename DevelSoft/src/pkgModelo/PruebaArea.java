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

        //Crear area de mecanica general
        MecanicaGeneral mecGeneral = new MecanicaGeneral();
        areas.add(mecGeneral);

        //Recorrer las areas adicionadas
        System.out.println("Voy a recorrer las áreas");
        for (int i = 0; i < areas.size(); i++) {
            System.out.println("Areas: " + i);
            System.out.print("Nombre: " + areas.get(i).getNombre());
            System.out.print("Duración Total: " + areas.get(i).getDuracion());
            areas.get(i).getServicios();
        }

        //Adicionar un área
        Auto automovil1 = new Auto("ABC", "AUDI", "Negro");
        String nombreArea = "Mecánica general";

        int i = 0;
        int indice = -1;
        do {
            if (areas.get(i).getNombre().equals(nombreArea)) {
                indice = i;
                if (nombreArea.equals("Pintura")) {
                    Pintura p = new Pintura();
                    p = (Pintura) areas.get(indice);
                    p.adicionarAutos(automovil1);
                } else if (nombreArea.equals("Mecánica general")) {
                    MecanicaGeneral mecGen = new MecanicaGeneral();
                    mecGen = (MecanicaGeneral) areas.get(indice);
                    mecGen.adicionarAutos(automovil1);
                }
                else{
                    System.out.println("No se encontró el área");
                }
            }
            i++;

        } while (indice == -1 && i < areas.size());

    }

}
