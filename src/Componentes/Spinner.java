
package Java_Swing.Componentes;

import java.awt.*;
import javax.swing.*;

public class Spinner {

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
            
            this.add(Spinner());
        }
 
     //Fin de Clase Panel
    }
    
    //SPINNER ------------------------------------------------------------------------------------------------------
    private static JSpinner Spinner(){
        
        //
            SpinnerNumberModel NUMBER = new SpinnerNumberModel();
                
            //Establecer Valor inicial
            NUMBER.setValue(21);
                    
            //Establecer Valor maximo
            NUMBER.setMinimum(10);
                    
            //Establecer Valor minimo
            NUMBER.setMaximum(30);
                    
            //Establecer incremento
            NUMBER.setStepSize(2);
            
        //
            String[] nombres = {"Majo", "Milagros", "Javier", "Lucho", "Mitsuha"};
            
            SpinnerListModel LIST = new SpinnerListModel(nombres);
                
            //Establecer Valor inicial
            LIST.setValue(nombres[1]);
            
        //
            SpinnerDateModel DATE =  new SpinnerDateModel();
        
        // ------------------------------------------------------------------------------------------------------
        
        JSpinner A = new JSpinner(LIST);
       
        //Modificar Tamaño predeterminado
            Dimension D = A.getPreferredSize(); 
                   
            int largo = (int)D.getWidth() + 20;
            int alto = (int)D.getHeight() + 10;
                    
            A.setPreferredSize(new Dimension(largo, alto));
        
        
            
        //Ajustar alineacion del Texto
            JSpinner.DefaultEditor Editor = (JSpinner.DefaultEditor)A.getEditor();
                    
            JFormattedTextField texto = (JFormattedTextField)Editor.getComponent(0);
                    
            texto.setHorizontalAlignment(JTextField.CENTER);
        //*/
            
        //Establecer Fuente
            Font fuente = new Font("Consolas", Font.PLAIN, 12);
         
            A.setFont(fuente);
        

       return(A);
    }

 //Fin de Clase  
}
