
package Componentes.Layouts;

import Principal.Constantes;

import java.awt.*;
import javax.swing.*;



public class GridBagLayout_5 {
    
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
            
            JTextField texto = new JTextField();
            

            //Definimos el Layout ----------------------------------------------
            
                GridBagLayout A = new GridBagLayout();

                GridBagConstraints B1 = new GridBagConstraints();
                GridBagConstraints B2 = new GridBagConstraints();
                GridBagConstraints B3 = new GridBagConstraints();
                GridBagConstraints B4 = new GridBagConstraints();

                //Establecemos el Layout       
                this.setLayout(A);

                B1.gridx = 0; B1.gridy = 0;
                
                B1.gridwidth = 1; B1.gridheight = 1;
                
                //B1.anchor = GridBagConstraints.ABOVE_BASELINE;
                B1.fill = GridBagConstraints.BOTH;

                
                B2.gridx = 0; B2.gridy = 1;
                B2.gridwidth = 3; B1.gridheight = 2;
                B2.fill = GridBagConstraints.BOTH;
                
                B3.gridx = 1; B3.gridy = 0;
                //B3.gridwidth = 1; B3.gridheight = 2;
                
                B4.gridx = 1; B4.gridy = 1;
                //B4.gridwidth = 1; B4.gridheight = 1;
                
                //Agremos los Botones en Orden
                this.add(boton1, B1);
                this.add(boton2, B2);
                this.add(boton3, B3);
                this.add(boton4, B4);
                
                

                Obtener(A);    
            //------------------------------------------------------------------     
        }
        
        Constantes W = new Constantes();
        
        void Obtener(GridBagLayout A){
            
            //fill = NONE
            

            
        }
        
     //Fin de Clase Panel   
    }
 //Fin de Clase GridBagLayout    
}
