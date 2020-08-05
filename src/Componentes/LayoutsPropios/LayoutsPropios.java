
package Componentes.LayoutsPropios;

import java.awt.*;
import javax.swing.*;

public class LayoutsPropios {
   
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
            
            CenterLayout layout = new CenterLayout();
                //layout.setAlign(SwingConstants.VERTICAL);
                layout.setDist(50);
            
            this.setLayout(layout);
            
            
            JButton A = new JButton("Boton A");
            JButton B = new JButton("Boton B");
            
            JButton C = new JButton("Boton C");
            JButton D = new JButton("Boton D");
            
            JButton E = new JButton("Boton E");
            JButton F = new JButton("Boton F");
            
            this.add(A); 
            this.add(B);
            this.add(C);
            this.add(D);
            //this.add(E); 
            //this.add(F);
        }
 
     //Fin de Clase Panel
    }
    
    
    
    
 //Fin de Clase Principal
}
