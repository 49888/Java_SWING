
package Componentes.Botones1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Botones_de_Radio {

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
            
            //BOTON SIMPLE
                this.add(radioBotones());
            
            //GRUPO DE BOTONES
            
                JToolBar barra = new JToolBar(JToolBar.VERTICAL);

                    barra.add(botonGrupo()); 
                    barra.add(botonGrupo()); 
                    barra.add(botonGrupo());

                this.add(barra);
        }

     //Fin de Clase Panel
    }
    
    //BOTONES DE RADIO ---------------------------------------------------------------------------------------------
    private static JRadioButton radioBotones(){
        
        JRadioButton A = new JRadioButton();
        
        //Activar / Desactivar 
            //A.setEnabled(false);
        
        //Establecer Nombre
            A.setName("Boton");
        
        //Establecer Texto
            A.setText("Milagros Molina");
            
        //Establecer Mensaje emergente
            A.setToolTipText("Esto es un Boton de Radio");
        
        //Establecer Color
            A.setBackground(Color.LIGHT_GRAY);
        
        //Establecer Color de la Letra
            A.setForeground(Color.BLUE);
        
        /*//Establecer Icono (Quita el Circulo para marcar)
            ImageIcon icono = new ImageIcon("Iconos\\24x24\\zona.png");

            A.setIcon(icono);
        //*/
        
        //Cambia la Posicion Horizontal del Texto respecto al Icono
            A.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //Cambia la Posicion Vertical del Texto respecto al Icono    
            A.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        //Establecer distancia entre el Icono y el Texto    
            A.setIconTextGap(10);
            
        //Establecer Fuente
            A.setFont(new Font("Consolas", Font.PLAIN, 12));
       
        
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
    private static void Obtener(JRadioButton A){
        
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
                 
        //Obtener Color de Fondo
            System.out.println("Color fondo: " + A.getBackground() );
                 
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText() );
         
            
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
    private static void Acciones(JRadioButton A){
        
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
        
        A.setAction(accion);
    }
    
    //A TRAVEZ DE UN OYENTE DE EVENTOS (ActionListener) - No se modificaron los atributos del Boton
    private static void Eventos(JRadioButton A){
    
        A.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Haz pulsado el Boton: " + A.isSelected());
                
                /*//Cambiar Iconos 
                    if(A.isSelected()){

                        A.setIcon(new ImageIcon("Iconos\\24x24\\comprobar.png"));
                    }
                    else{

                        A.setIcon(new ImageIcon("Iconos\\24x24\\cruz.png"));
                    }
                //*/
            }
            
         //Fin de la Clase anonima
        });
    }
    
    //GRUPOS DE CASILLAS ----------------------------------------------------------------------------------------------------------------
    static ButtonGroup grupo = new ButtonGroup(); static int cont = 0;

    private static JRadioButton botonGrupo(){
        
        cont++;
        
        JRadioButton A = new JRadioButton();
        
        //Establecer Texto
            A.setText("Boton " + cont); 

        //Establecer descripcion de la Accion    
            A.setActionCommand("Boton " + cont);
        
        //Estblecer Color de la Letra
            A.setForeground(Color.BLUE);
            
        //Establecer Fuente
            A.setFont(new Font("Consolas", Font.PLAIN, 12));
    
        //Establecer Accion del Boton    
            A.addActionListener(new ActionListener(){
                
            @Override
            public void actionPerformed(ActionEvent e){
                
                ObtenerGrupo(A);
                System.out.println("->Boton Pulsado");
            }
            
         //Fin de Clase Anonima
        });
    
        //Añadimos el Boton al Grupo
        grupo.add(A);
            
        return(A);
    }
    
    private static void ObtenerGrupo(JRadioButton A){
    
        System.out.println("-------------------------------------------------------------------");
 
        //Obtener la Cantidad de Botones
            System.out.println("Cantidad Botones: " + grupo.getButtonCount() );
                
        //Obtener el Boton Seleccionado
            System.out.println("Boton Selecionado: " + grupo.getSelection().getActionCommand() );
                
        //Comprobar si un Boton Pertenece al Grupo
            System.out.println("Pertenece al grupo: " + grupo.isSelected(A.getModel()) ); 
                
        //Deselecionar todos los Botones        
            //grupo.clearSelection();
    }

 //Fin de Clase  
}
