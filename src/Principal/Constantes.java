
package Principal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


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
    
    
    //VENTANAS (JFrame) -------------------------------------------------------------------------------------------------------
    //Estado Inicial de la Ventana (getExtendState)
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
    
    
    //Que hace una Ventana cuando se Cierra (gertDefaultCloseOperation)
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
    
    //Alineacion del BoxLayout
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
    

    //Estilo de la Fuente (Font) 
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
    
    //Alineacion de un Cuadro de Texto (JTextField)
    public String alignJTextField(int A){

        switch(A){

            case JTextField.CENTER:

                return("Centrado"); 

            case JTextField.LEFT:

                return("Izquierda");

            case JTextField.RIGHT:

                return("Derecha");
        }
        return("");
    }
    
    
    //Opciones showConfirmDialog (JOptionPane)
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
    
    
    //Orientacion barra de herramientas (JToolBar) 
    public String barOrientacion(int A){
    
        switch(A){

            case JToolBar.HORIZONTAL://0

                return("Horizontal"); 

            case JToolBar.VERTICAL://1

                return("Vertical");
        }
        return("");
    }
    
    
    //Estado de Items (Interfaz ItemListener) 
    public static String estadoItem(int A){
        
        switch(A){
        
            case ItemEvent.DESELECTED:
                
                return("Deselecionado");
                
            case ItemEvent.SELECTED:
                
                return("Selecionado");
        }
        return("");
    }
    
 //Fin de Clase Constantes   
}