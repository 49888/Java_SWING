
package Componentes.Layouts;

import Principal.Constantes;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayout_2 {
    
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
                BorderLayout A = new BorderLayout();
                
                //Establecemos el Layout       
                this.setLayout(A);

                //Distancia entre los Objetos y los Bordes
                    A.setHgap(20);//Horizontal
                    A.setVgap(50);//Vertical

                //Agremos los Botones indicando su Posicion
                this.add(boton1, BorderLayout.NORTH); 
                this.add(boton2, BorderLayout.WEST); 
                this.add(boton3, BorderLayout.CENTER); 
                this.add(boton4, BorderLayout.EAST);  
                this.add(boton5, BorderLayout.SOUTH);  
                
                Obtener(A);    
            //------------------------------------------------------------------     
        }
        
        Constantes W = new Constantes();
        
        void Obtener(BorderLayout A){

            //Obtener el espaciado
                int Hgap = A.getHgap(), Vgap = A.getVgap();
                
                System.out.println("Espaciado: " + Hgap + " - " + Vgap);
        }
        
     //Fin de Clase Panel   
    }
 //Fin de Clase BorderLayout   
}
