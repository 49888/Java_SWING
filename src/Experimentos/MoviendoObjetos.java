package Experimentos;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoviendoObjetos {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400);
            this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Añadimos el Panel
                Panel panel = new Panel();

                this.add(panel);
             
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    //PANEL ---------------------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{
        
        JToggleButton boton;
        
        public Panel(){
            
            //this.setLayout(null);
            
            //BOTON
                boton = new JToggleButton("Jugador 1");
                
                boton.setSize(boton.getPreferredSize());
                boton.setLocation(10, 10);
                    
                boton.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                            
                        if(boton.isSelected()){
                            
                            boton.addKeyListener(Oyente);
                        }
                        else {
                            
                            boton.removeKeyListener(Oyente);
                        }
                    }
                });
            
            this.add(boton);
        }

        KeyAdapter Oyente = new KeyAdapter() {
            
            private int cont = 10;

            @Override
            public void keyPressed(KeyEvent e){
                
                cont++;//Aceleracion
                
                //cont = 10;//Velocidad constante

                if(e.getKeyChar() == 'w'){

                    boton.setLocation(boton.getX(), boton.getY() - cont);
                }
                
                if(e.getKeyChar() == 's'){
                
                    boton.setLocation(boton.getX(), boton.getY() + cont);
                }
                
                if(e.getKeyChar() == 'a'){
                
                    boton.setLocation(boton.getX() - cont, boton.getY());
                }
                
                if(e.getKeyChar() == 'd'){
                
                    boton.setLocation(boton.getX() + cont, boton.getY());
                }    
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cont = 10;
            }
        };

     //Fin de Clase Panel
    }
 
 //Fin de Clase  
}