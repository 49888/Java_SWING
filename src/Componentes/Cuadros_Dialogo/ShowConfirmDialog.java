
package Componentes.Cuadros_Dialogo;

import Principal.Constantes;
import java.awt.*;
import javax.swing.*;


public class ShowConfirmDialog extends JOptionPane{
    
    private static Constantes W = new Constantes();
    
    public static void main(String[] args){
        
        Ventana ventana = new Ventana();
        
        int A;//Respuesta
        
        //PARAMETROS
            Component componente = null;
            
                //componente = ventana;
                //componente = ventana.getContentPane().getComponent(2);

            String mensaje = "Responde Si o No";

            String titulo = "Dudas...";

            int tipoOpcion = JOptionPane.YES_NO_OPTION;

            int tipoMensaje = JOptionPane.ERROR_MESSAGE;

            ImageIcon icono = new ImageIcon("Iconos\\32x32\\facebook.png");

                

        //static int showConfirmDialog(Component , Object )
            //respuesta = showConfirmDialog(componente, mensaje);

        //static int showConfirmDialog(Component , Object , String , int ) 
            //respuesta = showConfirmDialog(componente, mensaje, titulo, tipoOpcion);

        //static int showConfirmDialog(Component , Object , String , int , int) 
            //respuesta = showConfirmDialog(componente, mensaje, titulo, tipoOpcion, tipoMensaje);    


        //static int showConfirmDialog(Component , Object , String , int , int , Icon)     
            A = showConfirmDialog(componente, mensaje, titulo, tipoOpcion, tipoMensaje, icono);
                
                
        System.out.println("Respuesta: " + W.showConfirm(A));     
     //Fin de Programa
    }
 //Fin de Clase  
}
