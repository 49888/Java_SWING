
package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Botones2 {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Panel panel = new Panel();
            this.add(panel);
            
            this.setVisible(true);
        }
        
        
        
     //Fin de Clase Ventana
    }
    
    private static class Panel extends JPanel {
        
        JButton boton1 = new JButton("AZUL");
        JButton boton2 = new JButton("ROJO");
        JButton boton3 = new JButton("AMARILLO");
        JButton boton4 = new JButton("NORMAL");
        
        //Constructor
        public Panel(){
        
            this.add(boton1); this.add(boton2);
            this.add(boton3); this.add(boton4);
            
            //Definimos los Oyentes para los Botones
                ColorFondo Rojo = new ColorFondo(Color.RED);
                ColorFondo Azul = new ColorFondo(Color.BLUE);
                ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
                ColorFondo Normal = new ColorFondo(SystemColor.window);
            
            //Añadimos los Oyentes a los Botones
                boton1.addActionListener(Azul);
                boton2.addActionListener(Rojo);
                boton3.addActionListener(Amarillo);
                boton4.addActionListener(Normal);
        }
        
        
        private class ColorFondo implements ActionListener {
            
            private Color color;

            public ColorFondo(Color color) {
                this.color = color;
            }
            
            @Override
            public void actionPerformed(ActionEvent e) {

                setBackground(color);
            }
            
         //Fin de Clase Color Fondo
        }
     //Fin de Clase Panel
    } 
 //Fin de Clase  
}
