
package Componentes.Cuadros_Dialogo;

import java.awt.*;
import javax.swing.*;



public class ShowMessageDialog extends JOptionPane {
    
    public static void main(String[] args) {
        
        Ventana ventana = new Ventana();
        
        //PARAMETROS
            Component componente = null;
                
                //componente = ventana;
                //componente = ventana.getContentPane().getComponent(2);
                    
            String mensaje = "La cultura siempre te dara mejor perspectiva";
            
            String titulo = "Dudas...";

            int tipoMensaje = JOptionPane.ERROR_MESSAGE;
    
            ImageIcon icono = new ImageIcon("Iconos\\32x32\\facebook.png");
        
            
        //static void showMessageDialog(Component , Object );    
            showMessageDialog(componente, mensaje);
                      
        //static void showMessageDialog(Component , Object , String , int ); 
            //showMessageDialog(componente, mensaje, titulo, tipoMensaje);
            
        //static void showMessageDialog(Component , Object , String , int , Icon );
            //showMessageDialog(componente, mensaje, titulo, tipoMensaje, icono);
        
     //Fin de Programa
    }
    
    
 
 //Fin de Clase
}
