
package Componentes.Layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;


public class Resorte_Ejemplo {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Añadimos el Panel
                Panel panel = new Panel();

                this.add(panel);
            
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    //PANEL ---------------------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{
        
        public Panel(){
            
            //Establecemos el Layout
                SpringLayout layout = new SpringLayout();

                this.setLayout(layout);
            
            //Creamos el Resorte Elastico
                Spring elastico = Spring.constant(0, 10, 100);
                
            //Creamos un Resorte fijo
                Spring fijo = Spring.constant(50);
            
            //Componentes    
                JButton A = new JButton("Boton A"); 
                JButton B = new JButton("Boton B");
                JButton C = new JButton("Boton C");
                
            this.add(A); this.add(B); this.add(C);
            
            //putConstraint(aristaDependiente, Comp.Dependiente, resorte, aristaAncla, Comp.Ancla);
            //Se debe Colocar de Derecha a Izquierda para que Funcione
            
            //  Ancla <----- Comp.Principal
            
            //           || <----- Boton A        Boton B        Boton C        ||
            layout.putConstraint(SpringLayout.WEST, A, elastico, SpringLayout.WEST, this);
            
            
            //           ||        Boton A <----- Boton B        Boton C        ||
            layout.putConstraint(SpringLayout.WEST, B, elastico, SpringLayout.EAST, A);
        
            
            //           ||        Boton A        Boton B <----- Boton C        ||
            layout.putConstraint(SpringLayout.WEST, C, elastico, SpringLayout.EAST, B);
            
            
            //           ||        Boton A        Boton B        Boton C <----- ||
            layout.putConstraint(SpringLayout.EAST, this, elastico, SpringLayout.EAST, C);    
        }

     //Fin de Clase Panel
    }
    
 //Fin de Clase Resorte
}
