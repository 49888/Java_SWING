
package Componentes;

import Principal.Constantes;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spinner {

    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocationRelativeTo(null);
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
        
        //SPINNER DE NUMEROS
        
            SpinnerNumberModel NUMBER = new SpinnerNumberModel();
                
            //Establecer Valor inicial
                NUMBER.setValue(21);
                    
            //Establecer Valor maximo
                NUMBER.setMinimum(10);
                    
            //Establecer Valor minimo
                NUMBER.setMaximum(30);
                    
            //Establecer incremento
                NUMBER.setStepSize(2);
            
        //SPINNER DE LISTAS Y ARREGLOS
        
            String[] nombres = {"Majo", "Milagros", "Javier", "Lucho", "Mitsuha"};
            
            SpinnerListModel LIST = new SpinnerListModel(nombres);
                
            //Establecer Valor inicial
                LIST.setValue(nombres[1]);
            
        //SPINNER DE FECHAS
            SpinnerDateModel DATE =  new SpinnerDateModel();
        
        // ------------------------------------------------------------------------------------------------------
        
        JSpinner A = new JSpinner(LIST);
        
        //Activado / Desactivado
            //A.setEnabled(false);
        
        //Establecer Nombre
            A.setName("Spinner");
            
        //Establecer Mensaje Emergente
            A.setToolTipText("Este es un Spinner");
               
        //Establecer Fuente
            A.setFont(new Font("Ravie", Font.PLAIN, 12));
         
            
           
            
        //Modificar Tamaño predeterminado
            Dimension D = A.getPreferredSize(); 
                   
            int largo = (int)D.getWidth() + 20;
            int alto = (int)D.getHeight() + 10;
                    
            A.setPreferredSize(new Dimension(largo, alto));
        
   
        //Ajustar alineacion del Texto
            JSpinner.DefaultEditor Editor = (JSpinner.DefaultEditor)A.getEditor();
                    
            JFormattedTextField texto = (JFormattedTextField)Editor.getComponent(0);
            
            //Establecer Alineacion
                texto.setHorizontalAlignment(JTextField.CENTER);
            
            //Establecer Color de la Letra
                texto.setForeground(Color.RED);
            
            //Establecer Color de Fondo    
                texto.setBackground(Color.PINK);
            
            //Establecer Color del Texto Selecionado
                texto.setSelectedTextColor(Color.yellow);
                
            //Establecer Color de Seleccion
                texto.setSelectionColor(Color.RED);
            
            //Establecer Color del Cursor    
                texto.setCaretColor(Color.BLUE);        
        //*/
        
        
        //Establecer si se puede Enfocar
            //A.setFocusable(false);
        
        //EVENTOS ----------------------------------
            Eventos(A);
        
        //Establecer Visibilidad
            //A.setVisible(false);
            
        //OBTENER -----------------------------------
        Obtener(A);
        
       return(A);
    }
    
    private static void Obtener(JSpinner A){
        
        Constantes W = new Constantes();
    
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled());
        
        //Obtener Nombre
        System.out.println("Nombre: " + A.getName());
        
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText());
    
        //Obtener Fuente
            System.out.println("Fuente: " + A.getFont());
            
            
        //Ajustar alineacion del Texto
            JSpinner.DefaultEditor Editor = (JSpinner.DefaultEditor)A.getEditor();
                    
            JFormattedTextField texto = (JFormattedTextField)Editor.getComponent(0);
            
            //Establecer Alineacion
                int Align = texto.getHorizontalAlignment();
                System.out.println("Alineacion: " + W.alignJTextField(Align));
            
            //Obtener Color de la Letra
                System.out.println("Color de la Letra: " + texto.getForeground());
            
            //Obtener Color de Fondo    
                System.out.println("Color de Fondo: " + texto.getBackground());
                
            //Obtener Color del Texto selecionado
                System.out.println("Color Texto seleccionado: " + texto.getSelectedTextColor() );
            
            //Obtener Color de Seleccion
                System.out.println("Color Seleccion: " + texto.getSelectionColor() );

            //Obtener Color del Caret (Cursor - Promt)
                System.out.println("Color cursor: " + texto.getCaretColor());
        //*/
            
            
        //Se puede enfocar ?
            System.out.println("Se puede enfocar: " + A.isFocusable());
    
        //Es visible ?
            System.out.println("Es visible: " + A.isVisible());
            
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
    
    private static void Eventos(JSpinner A){
    
        A.addChangeListener(new ChangeListener(){
            
            @Override
            public void stateChanged(ChangeEvent e) {
                
                //System.out.println("Estas moviendo el Deslizador...");
                
                JSpinner origen = (JSpinner)e.getSource();
                
                System.out.println("Valor: " + origen.getValue());
            }
            
         //Fin de la Clase Anonima
        });
    
    }

 //Fin de Clase  
}
