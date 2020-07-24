
package Componentes.Cuadros_Dialogo;

import java.awt.*;
import javax.swing.*;


public class ShowInputDialog extends JOptionPane{
    
    public static void main(String[] args) {
        
        Ventana ventana = new Ventana();
        
        String A;//Respuesta
        
        //PARAMETROS
            Component componente = null;
            
                //componente = ventana;
                //componente = ventana.getContentPane().getComponent(2);
            
            String mensaje = "Tu mejor amiga es: ";
            
            String valorInicial = "21/04";
            
            String titulo = "Error inesperado";
            
            int tipoMensaje = JOptionPane.ERROR_MESSAGE;
            
            ImageIcon icono = new ImageIcon("Iconos\\32x32\\facebook.png");

            String[] opciones = {"Majo", "1812", "Mili", "Javier", "Lucho"};
            
            
        //static String showInputDialog(Object )
            //A = showInputDialog(mensaje);
       
        //static String showInputDialog(Object , Object )
            A = showInputDialog(mensaje, valorInicial);
            
        //static String showInputDialog(Component , Object )
            //A = showInputDialog(componente, mensaje);
            
        //static String showInputDialog(Component , Object , Object )
            A = showInputDialog(componente, mensaje, valorInicial);
            
        //static String showInputDialog(Component , Object , String , int )
            //A = showInputDialog(null, mensaje, titulo, tipoMensaje);
        
        //static Object showInputDialog(Component , Object , String , int , Icon , Object[] , Object[n])
            A = (String)showInputDialog(componente, mensaje, titulo, tipoMensaje, icono, opciones, opciones[3]);
        
            
        System.out.println( A );
     //Fin de Programa
    }

 //Fin de Clase
}
