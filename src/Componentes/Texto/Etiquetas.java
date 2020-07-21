
package Java_Swing.Componentes.Texto;

import java.awt.*;
import java.awt.peer.MouseInfoPeer;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Etiquetas {

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
            
            this.add(Etiquetas());
        }
 
     //Fin de Clase Panel
    }
    
    //ETIQUETAS -----------------------------------------------------------------------------------------------------
    private static JLabel Etiquetas(){
        
        JLabel A = new JLabel();
        
        //Establecer Nombre
            A.setName("Etiqueta");
        
        //Establecer Texto
            A.setText("Los Mejores Videos");
                
        //Estblecer Color de la Letra
            A.setForeground(Color.RED);
        
        //Establecer Mensaje emergente
            A.setToolTipText("Esta es una Etiqueta");
            
        //Establecer Icono
            ImageIcon icono = new ImageIcon("Iconos\\24x24\\youtube.png");

            A.setIcon(icono);
        //*/

        //Establecer Posicion Horizontal del Texto respecto al Icono
            A.setHorizontalTextPosition(SwingConstants.CENTER);//LEFT - CENTER - RIGHT
        
        //Establecer Posicion Vertical del Texto respecto al Icono    
            A.setVerticalTextPosition(SwingConstants.BOTTOM);//TOP - CENTER - BOTTOM
            
        //Establecer Distancia entre el Icono y el Texto
            A.setIconTextGap(10);
            
        //Establecer Fuente
            A.setFont(new Font("Ravie", Font.PLAIN, 12));
            
        //OBTENER -----------------------------------------------------------------------
            Obtener(A);

        return(A);
    }
    
    //OBTENER
    private static void Obtener(JLabel A){
        
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled() );
        
        //Obtener Nombre
            System.out.println("Nombre: " + A.getName() );
            
        //Obtener Texto
            System.out.println("Texto:\n"  + A.getText() + "\n-----------");
        
        //Obtener Color de la Letra
            System.out.println("Color Letra: " + A.getForeground() );
   
        //Obtener la Fuente
            System.out.println("Fuente: " + A.getFont() );
            
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText() );
            
        //Obtener posicion Horizontal del Texto respecto al Icono
            System.out.println("Posicion H. Text - Icon: " + A.getHorizontalTextPosition() );
            
        //Obtener posicion Vertical del Texto respecto al Icono
            System.out.println("Posicion V. Text - Icon: " + A.getVerticalTextPosition() );
            
        //Obtener distancia entre el Icono y el Texto
            System.out.println("Distancia Icono - Text: " + A.getIconTextGap() );
            
            
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }

 //Fin de Clase  
}
