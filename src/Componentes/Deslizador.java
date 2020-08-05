
package Java_Swing.Componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
        
        //Activar / Desactivar
            //A.setEnabled(false);
        
        //Establecer Nombre
            A.setName("Boton");
            
        //Establecer Mensaje emergente
            A.setToolTipText("Este es un Deslizador");
        
        //Establecer valores minimo y maximo
            A.setMinimum(0);
            A.setMaximum(150);
            
        //Establecer Valor inicial
            A.setValue(20);
            
        //Establecer Orientacion
            //deslizador.setOrientation(SwingConstants.VERTICAL);
            
        //Establecer Color
            A.setBackground(Color.PINK);
        
        //Estblecer Color de la Letra y Marcas
            A.setForeground(Color.BLUE);
            
        //Establecer Fuente
            Font fuente = new Font("Monotype Corsiva", Font.PLAIN, 16);
            A.setFont(fuente);
            
        
        //Establecer intervalo para las Marcas mayores
            A.setMajorTickSpacing(25);
        
        //Establecer intervalo para las Marcas menores
            A.setMinorTickSpacing(5);
        
            
        //Mostrar la Barra de desplazamiento    
            //A.setPaintTrack(false);    
            
        //Mostrar marcas    
            A.setPaintTicks(true);
        
        //Mostrar numeros (Marcas mayores)
            A.setPaintLabels(true);
            
        //Habilitar Iman de marcas
            A.setSnapToTicks(true);
        
        
        //Estabñecer si se puede Enfocar
           A.setFocusable(false);
           
        
        //EVENTOS
            Eventos(A);
            
        //Establecer Visibilidad
            //A.setVisible(false);
            
        //OBTENER
            Obtener(A);
            
        return(A);
    }
    
    private static void Obtener(JSlider A){
    
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled());
        
        //Obtener Nombre
        System.out.println("Nombre: " + A.getName());
        
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText());
            
        //Obtener Valor minimo y Maximo
            int minimo = A.getMaximum(), maximo = A.getMaximum();
            System.out.println("Valor Minimo: " + minimo + " Valor Maximo:" + maximo);
            
        //Obtener Valor inicial
            System.out.println("Valor inicial: " + A.getValue());
            
        //Obtener Color de Fondo
        System.out.println("Color fondo: " + A.getBackground() );
            
        //Obtener Color de la Letra
            System.out.println("Color Letra: " + A.getForeground() );
            
        //Obtener Fuente
            System.out.println("Fuente: " + A.getFont());
            
     //----------------------------------------------------------------------------------   
        
        //Obtener intervalo Marcas mayores
            System.out.println("Intervalo Marcas mayores: " + A.getMajorTickSpacing());
            
        //Obtener intervalo Marcas menores
            System.out.println("Intervalo Marcas menores: " + A.getMinorTickSpacing());
        
            
        //Mostrar Barra de desplazamiento
            System.out.println("Mostrar Barra de desplazamiento: " + A.getPaintTrack());
        
        //Mostrar marcas ?
            System.out.println("Mostrar Marcas: " + A.getPaintTicks());
            
        //Mostrar numeros en las Marcas mayores ?
            System.out.println("Mostrar Numeros: " + A.getPaintLabels());
            
        //Iman de las Marcas
            System.out.println("Iman de las Marcas: " + A.getSnapToTicks());
            
     //----------------------------------------------------------------------------------
            
        //Se puede enfocar ?
            System.out.println("Se puede enfocar: " + A.isFocusable());
            
        //Es visible ?
           System.out.println("Es visible: " + A.isVisible());
           
       System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");    
    }
    
    
    private static void Eventos(JSlider A){
    
        ChangeListener B = new ChangeListener(){
            
            @Override
            public void stateChanged(ChangeEvent e) {
                
                //System.out.println("Estas moviendo el Deslizador...");
                
                JSlider origen = (JSlider)e.getSource();
                
                System.out.println("Valor: " + origen.getValue());
            }
            
         //Fin de la Clase Anonima
        };
        
        A.addChangeListener(B);
    }

 //Fin de Clase  
}
