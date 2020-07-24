
package Componentes.Cuadros_Dialogo;

import java.awt.*;
import javax.swing.*;


public class ShowOptionDialog extends JOptionPane{
    
    public static void main(String[] args) {
        
        Ventana ventana = new Ventana();
        
        int A;//Respuesta

        //PARAMETROS
            Component componente = null;
                
                //componente = ventana;
                //componente = ventana.getContentPane().getComponent(2);
                    
            String mensaje = "Eligue al salvador: ";

            String titulo = "Dudas...";

            int tipo = JOptionPane.OK_CANCEL_OPTION;

            int tipoMensaje = JOptionPane.ERROR_MESSAGE;

            ImageIcon icono = new ImageIcon("Iconos\\32x32\\facebook.png");

            String[] opciones = {"Majo", "1812", "Mili", "Javier", "Lucho"};
        
            
        //static int showOptionDialog(Component , Object , String , int , int , Icon , Object[] , Object[n])
        
            A = showOptionDialog(componente, mensaje, titulo, tipo, tipoMensaje, icono, opciones, opciones[2]);

            //respuesta = showOptionDialog(null, mensaje, titulo, 0, tipoMensaje, null, opciones, 1);
            
               
        if(A >= 0 ){

            System.out.println( opciones[A] );
        }
        
     //Fin de Programa
    }
 //Fin de Clase
}
