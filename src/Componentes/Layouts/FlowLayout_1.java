
package Componentes.Layouts;

import Principal.Constantes;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlowLayout_1 {
 
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
            
            this.add(boton1); this.add(boton2); this.add(boton3);
            
            //Definimos el Layout ----------------------------------------------
                FlowLayout A = new FlowLayout();
                
                //Establecemos el Layout       
                this.setLayout(A);

                //Distancia entre los Objetos y los Bordes
                    A.setHgap(20);//Horizontal
                    A.setVgap(50);//Vertical

                //Definimos la Alineacion
                    A.setAlignment(FlowLayout.LEFT);
                
                Obtener(A);    
            //------------------------------------------------------------------
        }
        
        Constantes W = new Constantes();
        
        void Obtener(FlowLayout A){

            //Obtener el espaciado
                int Hgap = A.getHgap(), Vgap = A.getVgap();
                
                System.out.println("Espaciado: " + Hgap + " - " + Vgap);
            
            
            //Obtener la Alineacion
                int Align = A.getAlignment();
                System.out.println("Alineacion: " + W.flowAlign(Align));
        }
        
     //Fin de Clase Panel
    }
    
    
 //Fin de FlowLayout
}
