
package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ejemplo_WindowListener {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
            A.setLocation(480, 100);
            
        Ventana B = new Ventana();    
            B.setLocation(A.getX() - 400, A.getY());
            
        Ventana C = new Ventana();    
            C.setLocation(A.getX() + 400, A.getY());
            
        
     //Fin de Programa
    }
    
    private static class Ventana extends JFrame {
    
        private static int cont = 0;
        
        public Ventana(){
            
            cont++;
            
            this.setName("Ventana " + cont); this.setTitle(getName());
            
            this.setSize(400, 400); 
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Añadimos el Oyente
                AccionesVentana A = new AccionesVentana();
                this.addWindowListener(A);
            
            this.setVisible(true);
        }
        
        private class AccionesVentana implements WindowListener{

            @Override
            public void windowOpened(WindowEvent e) {
                
                JFrame origen = (JFrame)e.getSource();
                System.out.println(origen.getName() + ": abierta");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                
                JFrame origen = (JFrame)e.getSource();
                System.out.println("Cerrando " + origen.getName() + "...");    
            }

            @Override
            public void windowClosed(WindowEvent e) {
                
                JFrame origen = (JFrame)e.getSource();
                System.out.println(origen.getName() + ": Cerrada");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                
                JFrame origen = (JFrame)e.getSource();
                System.out.println(origen.getName() + ": Minimizada");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                
                JFrame origen = (JFrame)e.getSource();
                System.out.println(origen.getName() + ": DesMinimizada");
            }

            @Override
            public void windowActivated(WindowEvent e) {
               
                JFrame origen = (JFrame)e.getSource();
                System.out.println(origen.getName() + ": Activada");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                
                JFrame origen = (JFrame)e.getSource();
                System.out.println(origen.getName() + ": Desactivada");
            }
        
         //Fin de Clase AccionesVentana
        }  
     //Fin de Clase Ventana
    }
 //Fin de Clase
}
