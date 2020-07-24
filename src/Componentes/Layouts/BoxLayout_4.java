
package Componentes.Layouts;

import Principal.Constantes;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BoxLayout_4 {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA ------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400);
            this.setLocationRelativeTo(null);

            //Añadimps el Panel
                Panel panel = new Panel();
                
                this.add(panel);
                
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }
     //Fin de Clase Ventana
    }
    
    //PANEL --------------------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{

        public Panel(){
            
            JButton boton1 = new JButton("Boton 1");
            JButton boton2 = new JButton("Boton 2");
            JButton boton3 = new JButton("Boton 3");
            JButton boton4 = new JButton("Boton 4");
            JButton boton5 = new JButton("Boton 5");
            

            //Definimos el Layout ----------------------------------------------
            
                BoxLayout A = new BoxLayout(this, BoxLayout.X_AXIS);
                
                BoxLayout B = new BoxLayout(this, BoxLayout.Y_AXIS);

                //Establecemos el Layout       
                this.setLayout(B);


                //Agremos los Botones en Orden
                this.add(boton1); 
                this.add(boton2);
                this.add(boton3);
                this.add(boton4); 
                this.add(boton5);  

                Obtener(A);    
            //------------------------------------------------------------------     
        }
        
        Constantes W = new Constantes();
        
        void Obtener(BoxLayout A){
            
            //Obtener el Eje en que se ubican los Componentes
            int eje = A.getAxis();
            System.out.println("Eje: " + W.boxAxis(eje));
            
            //Obtener Componente en el que se aplica el Layout
            Component comp = A.getTarget();
            
            System.out.println("Componente: " + comp);
            
        }
        
     //Fin de Clase Panel   
    }
 
 //Fin de Clase BoxLayout
}
