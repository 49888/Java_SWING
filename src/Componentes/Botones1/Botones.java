
package Java_Swing.Componentes.Botones1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Botones {

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

            this.add(Botones());
        }
        
     //Fin de Clase Panel
    }
    
    //BOTONES -------------------------------------------------------------------------------------------------------
    private static JButton Botones(){
            
        JButton A = new JButton();
        
        //Activar / Desactivar 
            //boton.setEnabled(false);
        
        //Establecer Nombre
            A.setName("Boton");
        
        //Establecer Texto
            A.setText("Entra a Face");
            
        //Establecer Mensaje emergente
            A.setToolTipText("Entra a tu cuenta de Facebook");
        
        //Establecer Color de Fondo
            A.setBackground(Color.PINK);
        
        //Estblecer Color de la Letra
            A.setForeground(Color.BLUE);
        
        //Establecer Icono
            ImageIcon icono = new ImageIcon("Iconos\\24x24\\facebook.png");

            A.setIcon(icono);
        //*/
        
        //Cambia la Posicion Horizontal del Texto respecto al Icono
            A.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //Cambia la Posicion Vertical del Texto respecto al Icono    
            A.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        //Establecer distancia entre el Icono y el Texto    
            A.setIconTextGap(10);
                
        //Establecer Fuente
            A.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
        
            
        //ESTABLECER LA ACCION DEL BOTON
        
            //Por medio de un Objeto que implemente: Action
                Acciones(A);

            //Por medio de un Oyente de Eventos que implemente: ActionListener    
                //Eventos(A);
            
            //Establecer descripcion de la Accion    
                A.setActionCommand("El Boton no hace nada");
            
              
        //OBTENER ----------------------------------------------------------
            Obtener(A);

        return(A);
    }
    
    
    
    //OBTENER
    private static void Obtener(JButton A){
        
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled() );
        
            
        //Obtener Nombre
            System.out.println("Nombre: " + A.getName() );
            
        //Obtener Texto
            System.out.println("Texto:\n"  + A.getText() + "\n-----------");
            
        //Obtener la Fuente del Texto
            System.out.println("Fuente: " + A.getFont() );
            
        //Obtener Color de la Letra del Texto
            System.out.println("Color Letra: " + A.getForeground() );
            
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText() );
         
        //Obtener Color de Fondo
            System.out.println("Color fondo: " + A.getBackground() );
              
 
            
        //Obtener posicion Horizontal del Texto respecto al Icono
            System.out.println("Posicion H. Text - Icon: " + A.getHorizontalTextPosition() );
            
        //Obtener posicion Vertical del Texto respecto al Icono
            System.out.println("Posicion V. Text - Icon: " + A.getVerticalTextPosition() );
            
        //Obtener distancia entre el Icono y el Texto
            System.out.println("Distancia Icono - Text: " + A.getIconTextGap() );
            
       
        
        //Obtener Descripcion de la Accion
            System.out.println("Que hace el Boton: " + A.getActionCommand() );
            
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
    
    //EVENTOS -----------------------------------------------------------------------------------------------------------
    
    //A TRAVEZ DE UN OBJETO (Action) - Se modifican El Texto y Mensaje emergente del Boton
    private static void Acciones(JButton A){
        
        Action accion = new AbstractAction(){
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                System.out.println("->Boton Pulsado");
                System.out.println("-Nombre del Boton: " + A.getText() );
                System.out.println("-Mensaje Emergente: " + A.getToolTipText() );
            }
            
         //Fin de Clase Anonima
        };
        
        //Establece el Nombre de la Accion y el Texto del Boton
        accion.putValue(Action.NAME, "Boton de Accion");
        
        //Establece el Mensaje Emergente del Boton
        accion.putValue(Action.SHORT_DESCRIPTION, "Este es un Boton de accion");
        
        A.setAction(accion);;
    }
    
    //A TRAVEZ DE UN OYENTE DE EVENTOS (ActionListener) - No se modificaron los atributos del Boton
    private static void Eventos(JButton A){
    
        A.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Haz pulsado el Boton");
            }
            
         //Fin de la Clase anonima
        });
    }

 //Fin de Clase  
}
