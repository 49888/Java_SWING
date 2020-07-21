
package Java_Swing.Componentes;

import java.awt.*;
import javax.swing.*;

public class Deslizador {

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
        
        public Panel(){
            
            this.add(Deslizadores());
        }
 
     //Fin de Clase Panel
    }
    
    //DESLIZADOR ---------------------------------------------------------------------------------------------------
    private static JSlider Deslizadores(){
    
        JSlider A = new JSlider();
        
        //Establecer Nombre
        A.setName("Boton");
        
        //Establecer valores minimo y maximo
            A.setMinimum(0);
            A.setMaximum(150);
            
        //Establecer Valor inicial
            A.setValue(20);
        
        //Establecer intervalo para las Marcas mayores
        A.setMajorTickSpacing(25);
        
        //Establecer intervalo para las Marcas menores
        A.setMinorTickSpacing(5);
            
        //Mostrar marcas    
            A.setPaintTicks(true);
        
        //Mostrar numeros (Marcas mayores)
            A.setPaintLabels(true);
            
       
        //Habilitar Iman de marcas
            A.setSnapToTicks(true);
        
        //Establecer Orientacion
            //deslizador.setOrientation(SwingConstants.VERTICAL);
        
            
        //Establecer Color
            A.setBackground(Color.LIGHT_GRAY);
        
        //Estblecer Color de la Letra y Marcas
            A.setForeground(Color.RED);
            
        //Establecer Fuente
            Font fuente = new Font("Consolas", Font.PLAIN, 12);
         
            A.setFont(fuente);
            
        return(A);
    }

 //Fin de Clase  
}
