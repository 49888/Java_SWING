
package Principal;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Constantes {
    
    //Determinar Boton del Mouse
    public String detClick(int var){

        switch(var){

            case MouseEvent.BUTTON1:

                return("Izquierdo"); 

            case MouseEvent.BUTTON2:

                    return("Ruedita");

            case MouseEvent.BUTTON3:

                return("Derecho");
        }
        return("");
    }
    
    //
    public String estadoVentana(int A){

        switch(A){

            case JFrame.MAXIMIZED_BOTH:

                return("Maximizada"); 

            case JFrame.ICONIFIED:

                return("Minimizada");

            case JFrame.NORMAL:

                return("Normal");
        }
        return("");
    }
    
    //
    public String cierreVentana(int A){

        switch(A){

            case JFrame.EXIT_ON_CLOSE:

                return("Terminar Programa"); 

            case JFrame.DO_NOTHING_ON_CLOSE:

                return("No hacer nada");

            case JFrame.DISPOSE_ON_CLOSE:

                return("Ocultar y Borrar");
                
            case JFrame.HIDE_ON_CLOSE:
                
                return("Ocultar");
        }
        return("");
    }
    
    
    //
    public String flowAlign(int A){

        switch(A){

            case FlowLayout.CENTER:

                return("Centro"); 

            case FlowLayout.LEFT:

                return("Izquierda");

            case FlowLayout.RIGHT:

                return("Derecha");
        }
        return("");
    }
    
    
    
    //
    public String estiloFuente(int A){

        switch(A){

            case Font.BOLD:

                return("Negrita"); 

            case Font.ITALIC:

                return("Cursiva");

            case Font.PLAIN:

                return("Plana");
        }
        return("");
    }
    
    
 //Fin de Clase Constantes   
}
