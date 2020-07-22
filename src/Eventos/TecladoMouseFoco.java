
package Eventos;

import Principal.Constantes;//Clase Propia

import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;

public class TecladoMouseFoco {
    
    Constantes W = new Constantes();
    
    //EVENTOS DE FOCO COMPONENTES --------------------------------------------------------------------------------------- 
    FocusListener Foco = new FocusListener(){

        @Override
        public void focusGained(FocusEvent e){
            
            Component origen = (Component)e.getSource();
                
            System.out.println("->Foco: " + origen.getName() + ": Tiene el Foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
                
            Component origen = (Component)e.getSource();
            
            System.out.println("\n->Foco: " + origen.getName() + ": Ha perdico el Foco");
        }
    };
    
    //EVENTOS DE TECLADO -----------------------------------------------------------------------------------------------
    
    KeyListener EventosTeclado = new KeyListener() {
            
        @Override
        public void keyTyped(KeyEvent e){
            
            //System.out.println("->Teclado: Has presionado la tecla: " + e.getKeyChar() );
        }

        @Override
        public void keyPressed(KeyEvent e){
            
            System.out.println("->Teclado: Presionando la Tecla: " + e.getKeyChar() );
        }

        @Override
        public void keyReleased(KeyEvent e){
            
            System.out.println("->Teclado: Has soltado la Tecla: " + e.getKeyChar() );
        }
    };
        
    //CLASE ADAPTADORA
        private KeyAdapter Teclado = new KeyAdapter(){};
        
    //EVENTOS DE MOUSE -----------------------------------------------------------------------------------------------------
    MouseListener Mouse = new MouseListener(){
            
        @Override
        public void mouseClicked(MouseEvent e){
            
            //Obtener boton del Mouse pulsado
                String boton = W.detClick( e.getButton() );
            
            System.out.println(" Mouse: Click " + boton );    
        }

        @Override
        public void mousePressed(MouseEvent e){
            
            //Obtener boton del Mouse pulsado
                String boton = W.detClick( e.getButton() );
            
            //System.out.println("->Mouse: Presionando Click " + boton );
        }

        @Override
        public void mouseReleased(MouseEvent e){
           
            //Obtener boton del Mouse pulsado
                String boton = W.detClick( e.getButton() );
            
            //Obtener cantidad de Clicks
                int clickCont = e.getClickCount();
            
            System.out.println("->Mouse: Has soltado Click " + boton );
            System.out.println("  Cantidad de Clicks: " + clickCont );
        }

        @Override
        public void mouseEntered(MouseEvent e){
            
            System.out.println("->Mouse: Estas dentro de la Ventana...");
        }

        @Override
        public void mouseExited(MouseEvent e){
            
            System.out.println("->Mouse: Estas fuera de la Ventana...");
        }
   
     //Fin Clase anonima MouseListener
    };
        
    MouseMotionListener MouseMotion = new MouseMotionListener(){
            
        @Override
        public void mouseDragged(MouseEvent e){
            
            System.out.println("->Mouse: Estas arrastrando...");
            
            //Obtener posicion del Cursor en Pantalla
                Point puntoPantalla = e.getLocationOnScreen();
                int X = e.getXOnScreen(), Y = e.getYOnScreen();
                
            //Obtener posicion del Cursor dentro del Componente
                Point puntoComp = e.getPoint();
                int x = e.getX(), y = e.getY();
                
            ///*
                System.out.println("  Pos. Pantalla:  X = " + X + " Y = " + Y);
                //System.out.println("  Pos. Pantalla: " + puntoPantalla);
                
                System.out.println("  pos. Componente:  X = " + x + " Y = " + y);
                //System.out.println("  pos. Componente: " + puntoComp);
            //*/    
        }

        @Override
        public void mouseMoved(MouseEvent e){
            
            System.out.println("->Mouse: Te estas Moviento...");   
        }
    };
    
    MouseWheelListener MouseRuedita = new MouseWheelListener(){
            
        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
                
            System.out.println("->Mouse: Moviendo la Ruedita...");
        }
    };
 
 //Fin de Clase   
}
