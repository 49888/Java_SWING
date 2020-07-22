package Principal;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prueba {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400);
            
            
            
            this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Añadimos el Panel
                Panel panel = new Panel();

                this.add(panel);
            //*/
                
            
            
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    //PANEL ---------------------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{
        
        public Panel(){
        
            this.setLayout(null);
            
            JButton A = new JButton("Milagros");
            
            System.out.println( A.getPreferredSize() );
            
            Dimension c = A.getPreferredSize();
            
            //A.setSize(c);
            
            A.setSize(A.getPreferredSize());
            
            //A. setSize(50, 50);
            
            A.setLocation(150, 80);
            
            this.add(A);
        
        }
        
        
        
        
     //Fin de Clase Panel
    }
 
 //Fin de Clase  
}