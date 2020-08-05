
package Componentes.Layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class BOX_Ejemplo {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            //CAJA HORIZONTAL 1 - Usuario
            
                Box A = Box.createHorizontalBox();
                
                JLabel user = new JLabel("        Usuario:"); 
                
                JTextField userText = new JTextField(10);
                
                    userText.setMaximumSize(userText.getPreferredSize());
    
            A.add(user); A.add(Box.createHorizontalStrut(10)); A.add(userText);
                
                
            //CAJA HORIZONTAL 2 - Contraseña
            
                Box B = Box.createHorizontalBox();
                
                JLabel pass = new JLabel("Contraseña:"); 
                
                JPasswordField passText = new JPasswordField(10); 
                
                    passText.setMaximumSize(passText.getPreferredSize());
  
            B.add(pass); B.add(Box.createHorizontalStrut(10)); B.add(passText);
            
            
            //CAJA HORIZONTAL 3 - Botones
            
                Box C = Box.createHorizontalBox();
                
                JButton aceptar = new JButton("Aceptar");
                JButton cancelar = new JButton("Cancelar");
                
                C.add(Box.createHorizontalStrut(30)); C.add(aceptar);  
                
                C.add(Box.createHorizontalGlue());
                
                C.add(cancelar); C.add(Box.createHorizontalStrut(30));
            
                
            //CAJA VERTICAL  
                Box caja = Box.createVerticalBox();
                
                caja.add(A); 
                caja.add(B);
                caja.add(C);

            this.add(caja, BorderLayout.CENTER);
                
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    private static Box cajaHorizontal(){
    
        Box A = Box.createHorizontalBox();
    
        return(A);
    }
    
    
 //Fin de Clase BOX
}
