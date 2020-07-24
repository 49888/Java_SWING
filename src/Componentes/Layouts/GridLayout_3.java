
package Componentes.Layouts;

import Principal.Constantes;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridLayout_3 {
    
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
                GridLayout A = new GridLayout();
                
                //Establecemos el Layout       
                this.setLayout(A);

                //Distancia entre los Objetos y los Bordes
                    A.setHgap(20);//Horizontal
                    A.setVgap(50);//Vertical
                
                //Establecer Filas y Columnas
                    A.setRows(3); A.setColumns(2);
                    
                //Agremos los Botones en Orden
                this.add(boton1); this.add(boton2);
                this.add(boton3); this.add(boton4); 
                this.add(boton5);  

                Obtener(A);    
            //------------------------------------------------------------------     
        }
        
        Constantes W = new Constantes();
        
        void Obtener(GridLayout A){

            //Obtener el espaciado
                int Hgap = A.getHgap(), Vgap = A.getVgap();
                
                System.out.println("Espaciado: " + Hgap + " - " + Vgap);
                
            //Obtener las Filas y Columnas
                int filas = A.getRows(), columnas = A.getColumns();
                
                System.out.println("Filas: " + filas + " Columnas: " + columnas);
        }
        
     //Fin de Clase Panel   
    }
 
 //Fin de Clase GridLayout
}
