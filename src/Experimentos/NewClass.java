/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimentos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class NewClass {
    
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
            
            //Añadimos el Panel
                this.add(panelBorde());

            
            this.setVisible(true);
        }
        
        
     //Fin de Clase Ventana
    }

    private static JPanel panelBorde(){
    
        JPanel A = new JPanel();
    
        A.setPreferredSize(new Dimension(300, 300));
            
        A.setBackground(Color.RED);
        
        A.setName("Milagros");


        A.setBorder(bordeTitulo(bordeSimple()));
        
        
        return(A);
    }
    
    private static Border bordeSimple(){
    
        Border borde = null;
        
        //PARAMETROS
            Color color = Color.BLUE; 

            int grosor = 10; 

            boolean RedondearEsquinas = true;
        
        //    
        borde = BorderFactory.createLineBorder(color);

        //
        //borde = BorderFactory.createLineBorder(color, grosor);

        //
        //borde = BorderFactory.createLineBorder(color, grosor, RedondearEsquinas);
        
        return(borde);
    }
    
    
    //
    private static Border bordeMatte(){
    
        Border borde = null;
        
        //PARAMETROS
            int arriba = 16, abajo = 32, izquierda = 32, derecha = 32; //Indicamos el Grosor de las Aristas
            
            Color color = Color.BLUE;
            
            Icon icono = new ImageIcon("Iconos\\16x16\\fuentes.png");
        
        //    
        borde = BorderFactory.createMatteBorder(arriba, izquierda, abajo, derecha, color);

        //
        borde = BorderFactory.createMatteBorder(arriba, izquierda, abajo, derecha, icono);

        return(borde);
    }
    
    private static Border bordesMarcados(){
        
        Border borde = null;
    
        //PARAMETROS
            int tipo = EtchedBorder.LOWERED; //tipo = EtchedBorder.RAISED;
        
            Color sombra = Color.CYAN;
            
            Color iluminacion = Color.RED;
          
        //    
        borde = BorderFactory.createEtchedBorder();

        //
        borde = BorderFactory.createEtchedBorder(tipo);

        //
        borde = BorderFactory.createEtchedBorder(iluminacion, sombra);

        //
        borde = BorderFactory.createEtchedBorder(tipo, iluminacion, sombra);

        return(borde);
    }
    
    private static Border bordesBiselados(){
    
        Border borde = null;
        
        //PARAMETROS
            int tipo = BevelBorder.LOWERED; //tipo = BevelBorder.RAISED;
            
            Color sombra = Color.CYAN; 
            
            Color iluminacion = Color.RED;
            
            borde = BorderFactory.createBevelBorder(tipo);
         
            
        //    
        //borde = BorderFactory.createBevelBorder(tipo, iluminacion, sombra);
            
            
        //
            Color luzExterna = Color.BLUE, luzInterna = Color.DARK_GRAY;
            Color sombraExterna = Color.BLACK, sombraInterna = Color.DARK_GRAY;
            
        //borde = BorderFactory.createBevelBorder(tipo, luzExterna, luzInterna, sombraExterna, sombraInterna);

        
        //    
        //borde = BorderFactory.createLoweredBevelBorder();
        
        //   
        borde = BorderFactory.createLoweredSoftBevelBorder();
        
        
        return(borde);
    }
    
    private static Border bordeTitulo(Border borde){
    
        Border bordeTitulo = null;
        
        //PARAMETROS
            String titulo = " Milagros Molina ";

            int alineacion = TitledBorder.CENTER; 
                //CENTER = Centrado  -  LEFT = Izquierda  -  RIGHT = Derecha
                //DEFAULT_JUSTIFICATION = LEFT

            int posicion = TitledBorder.BOTTOM;
                //ABOVE_TOP = Por encima, Arriba  -  ABOVE_BOTTOM = Por encima, Abajo  -  TOP = Arriba
                //BELOW_TOP = Por debajo, Arriba  -  BELOW_BOTTOM = Por debajo, Abajo  -  BOTTOM = Abajo
                //DEFAULT_POSITION = TOP

            Font fuente = new Font("Consolas", Font.PLAIN, 18); 

            Color color = Color.RED;
            
        //
        //bordeTitulo = BorderFactory.createTitledBorder(borde);
        
        //
        //bordeTitulo = BorderFactory.createTitledBorder(titulo);
        
        //
        bordeTitulo = BorderFactory.createTitledBorder(borde, titulo);
        
        //
        //bordeTitulo = BorderFactory.createTitledBorder(borde, titulo, alineacion, posicion);
        
        //
        //bordeTitulo = BorderFactory.createTitledBorder(borde, titulo, alineacion, posicion, fuente);
        
        //
        //bordeTitulo = BorderFactory.createTitledBorder(borde, titulo, alineacion, posicion, fuente, color);
    
        return(bordeTitulo);
    }
    
    
    
    
    
    
    
    
 //Fin de Clase Principal
}
