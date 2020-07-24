
package Eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo1 {
    
    public static void main(String[] args){

        Ventana2 B = new Ventana2();
        
            B.setLocation(480, 100);
            
        
        Ventana1 A = new Ventana1();    
        
            A.setLocation(B.getX() - 400, B.getY());
            
        Ventana3 C = new Ventana3();    
        
            C.setLocation(B.getX() + 400, B.getY());
       
     //Fin de Programa
    }
    
    static EventosTecladoMouseFoco Oyente = new EventosTecladoMouseFoco();
    static EventosVentanas OyenteVentanas = new EventosVentanas();
    
    //VENTANA 1: EVENTOS DE TECLADO --------------------------------------------------------------------------------    
    private static class Ventana1 extends JFrame {

        public Ventana1(){
            
            this.setName("Ventana 1"); this.setTitle( getName() );
            
            this.setSize(400, 400);
            
            setLayout(new FlowLayout(FlowLayout.CENTER, 5, 170));

            //BOTON
                JToggleButton boton = new JToggleButton("Eventos de Teclado");
                    
                boton.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                            
                        if(boton.isSelected()){
                            
                            addKeyListener(Oyente.EventosTeclado);
                        }
                        else{
                            
                            removeKeyListener(Oyente.EventosTeclado);
                        }
                    }
                });

                boton.setFocusable(false);
            
            this.add(boton);

            //EVENTOS VENTANAS
            this.addWindowListener(OyenteVentanas.eventosVentanas);
            this.addWindowFocusListener(OyenteVentanas.FocoVentanas);
            this.addWindowStateListener(OyenteVentanas.estadoVentanas);
            
            
            this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            this.setVisible(true);
        }
     //Fin de Clase Ventana1
    }
    
    //VENTANA 2: EVENTOS DE MOUSE ----------------------------------------------------------------------------------------------   
    private static class Ventana2 extends JFrame {

        public Ventana2(){
            
            this.setName("Ventana 2"); this.setTitle( getName() );
            
            this.setSize(400, 400);
            
            setLayout(new FlowLayout(FlowLayout.CENTER, 5, 170));

            //BOTON
                JToggleButton boton = new JToggleButton("Eventos de Mouse");
                    
                boton.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                            
                        if(boton.isSelected()){
                            
                            addMouseListener(Oyente.Mouse);
                            addMouseMotionListener(Oyente.MouseMotion);
                            addMouseWheelListener(Oyente.MouseRuedita);
                        }
                        else {
                            
                            removeMouseListener(Oyente.Mouse);
                            removeMouseMotionListener(Oyente.MouseMotion);
                            removeMouseWheelListener(Oyente.MouseRuedita);
                        }
                    }
                });

                boton.setFocusable(false);
            
            this.add(boton);
            
            //EVENTOS VENTANAS
            this.addWindowListener(OyenteVentanas.eventosVentanas);
            this.addWindowFocusListener(OyenteVentanas.FocoVentanas);
            this.addWindowStateListener(OyenteVentanas.estadoVentanas);
            
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        } 
     //Fin de Clase Ventana2
    }
    
    //VENTANA 3: EVENTOS DE FOCO CON COMPONENTES -------------------------------------------------------------------------------
    private static class Ventana3 extends JFrame {

        public Ventana3(){
            
            this.setName("Ventana 3"); this.setTitle( getName() );
            
            this.setSize(400, 400);
            
            setLayout(new FlowLayout(FlowLayout.CENTER, 50, 70));

            //Componentes
                JTextField cuadro1 = new JTextField(20);
                    cuadro1.setName("Cuadro de Texto 1");
                    cuadro1.setText( cuadro1.getName());


                JTextField cuadro2 = new JTextField(20);
                    cuadro2.setName("Cuadro de Texto 2");
                    cuadro2.setText( cuadro1.getName());
            
            //BOTON
                JToggleButton boton = new JToggleButton("Eventos de Foco con Componentes");
                    
                boton.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e){
                            
                        if(boton.isSelected()){
                            
                            cuadro1.addFocusListener(Oyente.Foco);
                            cuadro2.addFocusListener(Oyente.Foco);
                        }
                        else {
                            
                            cuadro1.removeFocusListener(Oyente.Foco);
                            cuadro2.removeFocusListener(Oyente.Foco);
                        }
                    }
                });

                boton.setFocusable(false);
            
            this.add(boton);
            this.add(cuadro1);
            this.add(cuadro2);

            //EVENTOS VENTANAS
            this.addWindowListener(OyenteVentanas.eventosVentanas);
            this.addWindowFocusListener(OyenteVentanas.FocoVentanas);
            this.addWindowStateListener(OyenteVentanas.estadoVentanas);
            
            
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setVisible(true);
        }
     //Fin de Clase Ventana3
    }
 //Fin de Clase Ejemplo1  
}