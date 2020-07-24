
package Principal;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

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
                
            case MouseEvent.BUTTON1_DOWN_MASK:
                
                return("Izquierdo");
                
            case MouseEvent.BUTTON2_DOWN_MASK:
                
                return("Ruedita");
                
            case MouseEvent.BUTTON3_DOWN_MASK:
                
                return("Derecho");
        }
        return("");
    }
    
    //VENTANAS -------------------------------------------------------------------------------------------------------
    //Estado Inicial de la Ventana
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
    
    //Que hace una Ventana cuando se Cierra
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
    //----------------------------------------------------------------------------------------------------------------
    
    //Alineacion del FlowLayout
    public String flowAlign(int A){

        switch(A){

            case FlowLayout.CENTER:

                return("Centro"); 

            case FlowLayout.LEFT:

                return("Izquierda");

            case FlowLayout.RIGHT:

                return("Derecha");
                
            case FlowLayout.LEADING:

                return("LEADING");

            case FlowLayout.TRAILING:

                return("TRAILING");
        }
        return("");
    }
    
    //Alineacion del FlowLayout
    public String boxAxis(int A){

        switch(A){

            case BoxLayout.X_AXIS:

                return("X"); 

            case BoxLayout.Y_AXIS:

                return("Y");

            case BoxLayout.LINE_AXIS:

                return("Linea");
                
            case BoxLayout.PAGE_AXIS:

                return("Pagina");
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
    
    
    //JOptionPane - showConfirmDialog
    public String showConfirm(int A){

        switch(A){

            case JOptionPane.YES_OPTION://0

                return("SI"); 

            case JOptionPane.NO_OPTION://1

                return("NO");

            case JOptionPane.CANCEL_OPTION://2

                return("Cancelar");
                
            case JOptionPane.CLOSED_OPTION://-1

                return("Cancelar");
        }
        return("");
    }
    
    
    //Barras de Herramientas
    public String barOrientacion(int A){
    
        switch(A){

            case JToolBar.HORIZONTAL://0

                return("Horizontal"); 

            case JToolBar.VERTICAL://1

                return("Vertical");
        }
        return("");
    }
    
 //Fin de Clase Constantes   
}
