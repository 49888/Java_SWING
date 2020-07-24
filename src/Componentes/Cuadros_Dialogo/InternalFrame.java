
package Componentes.Cuadros_Dialogo;

import java.awt.*;
import javax.swing.*;

public class InternalFrame extends JOptionPane {
    
    public static void main(String[] args) {
        
        int A;
        
        //Parametros
               
            Component componente = null;
                    
            String mensaje = "Eligue al salvador: ";

            String titulo = "Dudas...";

            int tipo = JOptionPane.OK_CANCEL_OPTION;

            int tipoMensaje = JOptionPane.ERROR_MESSAGE;

            ImageIcon icono = new ImageIcon("Imagenes y Iconos\\64x64\\java.png");

            String[] opciones = {"Majo", "1812", "Mili", "Javier", "Lucho"};
        
            
        //int showOptionDialog(Component , Object , String , int , int , Icon , Object[] , Object[n])
            
            A = showInternalOptionDialog(componente, mensaje, titulo, tipo, tipoMensaje, icono, opciones, opciones[0]);
            
               
        if(A >= 0 ){

            System.out.println( opciones[A] );
        }
        
     //Fin de Programa
    }
    
}
