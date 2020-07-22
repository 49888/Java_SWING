
package Eventos;

import Principal.Constantes;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;


public class Ventanas{
    
    Constantes W = new Constantes();
    
    public WindowFocusListener FocoVentanas = new WindowFocusListener(){
        
        @Override
        public void windowGainedFocus(WindowEvent e) {
            
            JFrame origen = (JFrame)e.getSource();
            
            origen.setTitle(origen.getName() + ": Tiene el Foco");
        }

        @Override
        public void windowLostFocus(WindowEvent e) {
            
           JFrame origen = (JFrame)e.getSource();
            
           origen.setTitle(origen.getName());
        }
    };
    
    public WindowStateListener estadoVentanas = new WindowStateListener(){
        
        @Override
        public void windowStateChanged(WindowEvent e){
            
            JFrame origen = (JFrame)e.getSource();
            
            String nombre = origen.getName();
            String estado = W.estadoVentana(origen.getExtendedState());
            
            System.out.println("--->" +  nombre + " estado: " + estado);
        }
    };
    
    public WindowListener eventosVentanas = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent e){
            
            JFrame origen = (JFrame)e.getSource();
            String nombre = origen.getName();
            
            System.out.println("--->" + nombre + " Abierta");
        }

        @Override
        public void windowClosing(WindowEvent e){
            
            JFrame origen = (JFrame)e.getSource();
            String nombre = origen.getName();
            
            System.out.println("--->" + nombre + " Cerrando...");    
        }

        @Override
        public void windowClosed(WindowEvent e){
            //Funciona solo si el cierre es: DIPOSE_ON_CLOSE
            
            JFrame origen = (JFrame)e.getSource();
            String nombre = origen.getName();
            
            System.out.println("--->" + nombre + " Cerrada");    
        }

        @Override
        public void windowIconified(WindowEvent e){
            
            JFrame origen = (JFrame)e.getSource();
            String nombre = origen.getName();
            
            System.out.println("--->" + nombre + " Minimizada");
        }

        @Override
        public void windowDeiconified(WindowEvent e){
          
            JFrame origen = (JFrame)e.getSource();
            String nombre = origen.getName();
            
            System.out.println("--->" + nombre + " DesMinimizada");
        }

        @Override
        public void windowActivated(WindowEvent e){
            
            JFrame origen = (JFrame)e.getSource();
            String nombre = origen.getName();
            
            System.out.println("--->" + nombre + " Activada");
        }

        @Override
        public void windowDeactivated(WindowEvent e){
            
            JFrame origen = (JFrame)e.getSource();
            String nombre = origen.getName();
            
            System.out.println("--->" + nombre + " Desactivada");    
        }
    };
    
 //Fin de Clase Ventanas 
}
