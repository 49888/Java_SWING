
package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Botones1 {
    
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
    
    private static class Panel extends JPanel implements ActionListener {
        
        JButton boton1 = new JButton("AZUL");
        JButton boton2 = new JButton("ROJO");
        JButton boton3 = new JButton("AMARILLO");
        JButton boton4 = new JButton("NORMAL");
        
        public Panel(){
        
            this.add(boton1); this.add(boton2);
            this.add(boton3); this.add(boton4);
            
            //Añadimos los Oyentes a los Botones
                boton1.addActionListener(this);
                boton2.addActionListener(this);
                boton3.addActionListener(this);
                boton4.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            Object fuente = e.getSource();
            
            if(fuente.equals(boton1)){
            
                this.setBackground(Color.BLUE); 
            }
            
            if(fuente.equals(boton2)){
            
                this.setBackground(Color.RED); 
            }
            
            if(fuente.equals(boton3)){
            
                this.setBackground(Color.YELLOW); 
            }
            
            if(fuente.equals(boton4)){
            
                this.setBackground(SystemColor.window); 
            }       
        }
        
     //Fin de Clase Panel
    }
 //Fin de Clase  
}