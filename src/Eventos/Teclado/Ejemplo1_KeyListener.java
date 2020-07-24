
package Eventos.Teclado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo1_KeyListener {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();

     //Fin de Programa
    }
    
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocation(600, 200);

            this.setTitle("Ventana 1");
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            //Añadimos el Oyente de Eventos
                EventosTeclado A = new EventosTeclado();

                //this.addKeyListener(A);
            
            //Para que un Objeto este a la escucha debe tener el Foco
            
                JPanel panel = new JPanel();

                JButton boton1 = new JButton("Nada");
                JButton boton2 = new JButton("Eventos Teclado");
                
                boton2.addKeyListener(A);

                panel.add(boton1);
                panel.add(boton2);
                
            this.add(panel);//*/
            
            this.setVisible(true);
        }
        
        //EVENTOS DE TECLADO
        private class EventosTeclado implements KeyListener {
    
            @Override
            public void keyTyped(KeyEvent e){
                
                //System.out.println("Has presionado la tecla: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e){
                
                
                System.out.println("Estas presionando la Tecla:");
                
                //Obtenemos el Caracter de la Tecla
                
                    char caracter = e.getKeyChar();  
                    System.out.println(" Char: " + caracter);
                
                //Obtenemos el Codigo de la Tecla
                
                    int codigo = e.getKeyCode();
                    System.out.println(" Codigo: " + codigo); 
                //*/
            }

            @Override
            public void keyReleased(KeyEvent e){
                
                System.out.println("Haz dejado de presionar...\n");    
            }

         //Fin de Clase EventosTeclado
        }
     //Fin de Clase Ventana
    }
 //Fin de Clase     
}
