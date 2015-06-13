/*
 * Agente con comportamiento paralelo 
 */

package pkgagente;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.SequentialBehaviour;



/**
 *
 * @author Estefanía Gómez Cárdenas
 */
public class AgenteParalelo extends Agent{
    
    public void setup(){
        SequentialBehaviour secuencial = new SequentialBehaviour(this);
        secuencial.addSubBehaviour(new OneShotBehaviour() {

            @Override
            public void action() {
                System.out.println("DO");
            }
        });
        secuencial.addSubBehaviour(new OneShotBehaviour() {

            @Override
            public void action() {
                System.out.println("RE");
            }
        });
        secuencial.addSubBehaviour(new OneShotBehaviour() {

            @Override
            public void action() {
                System.out.println("MI");
            }
        });
        
        SequentialBehaviour secuencial2 = new SequentialBehaviour(this);
        secuencial2.addSubBehaviour(new OneShotBehaviour(this) {
            
            @Override
            public void action() {
                System.out.println("Este es el segundo ");
            }
        });
        secuencial2.addSubBehaviour(new OneShotBehaviour(this) {
            
            @Override
            public void action() {
                System.out.println("2. Este es el segundo ");
            }
        });
        
        ParallelBehaviour paralelo = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ALL);
        paralelo.addSubBehaviour(secuencial);
        paralelo.addSubBehaviour(secuencial2);
        addBehaviour(paralelo);
        
    }
    
}
