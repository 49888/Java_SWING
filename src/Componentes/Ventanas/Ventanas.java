
package Componentes.Ventanas;

//Clase Propias
import Eventos.EventosTecladoMouseFoco;
import Eventos.EventosVentanas;
import Principal.Constantes;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Ventanas {
    
    public static void main(String[] args) {
        Ventana A = new Ventana();
        
        //Ventana B = new Ventana();    
    }
    
    private static class Ventana {
    
        public Ventana(){
        
            JFrame A = new JFrame();
        
            //Establecer el Nombre
                A.setName("Ventana 1");

            //Establecer el Titulo    
                A.setTitle("Soy una Ventana");

            //Cambiar Color de Fondo
                A.getContentPane().setBackground(Color.CYAN);


            //ESTABLECER TAMAÑO Y POSICION
                int ancho = 400, alto = 400, X = 200, Y = 200;

                //Establecer Tamaño        
                    A.setSize(ancho, alto);

                //Establecer Posicion
                    //A.setLocation(X, Y);

                //Establecer Tamaño y Posicion
                    //A.setBounds(X, Y, ancho, alto); 

                //Establecer Posicion en forma relativa a otro Componente    
                    A.setLocationRelativeTo(null);

            //Se puede Redimensionar
                //A.setResizable(false);


            //CAMBIAR ICONO
                cambiarIcono(A);


            //Establecer que sucedera cuando se cierre
                // HIDE_IN_CLOSE = Ocultar | DISPOSE_ON_CLOSE = Ocultar y Borrar
                //EXIT_ON_CLOSE = Terminar | DO_NOTHING_ON_CLOSE = No hacer nada
                
                A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         

            

            //Establecer Tipo de Ventana
                //A.setType(Window.Type.UTILITY);     

            //Establecer el Estado inicial de la Ventana
                //NORMAL = Normal | MAXIMIZED_BOTH = Maximizada | INCONIFIED = Minimizada
                
                //A.setExtendedState(JFrame.MAXIMIZED_BOTH);
                 
     
            //Añadir Barra de Menus    
                JMenuBar barra = barraMenus();

                //A.setJMenuBar(barra);
                
            //EVENTOS DE VENTANA
                //AñadirEventosVentana(A);
                
            //AÑADIR EVENTOS DE TECLADO Y MOUSE
                //AñadirEventosTecladoMouse(A);

                
            //Establecer si se puede enfocar o no
                //A.setFocusableWindowState(false);

            //Hacerla Visible    
                A.setVisible(true);

            //OBTENER --------------------------------------------------------------------------------------------    
            Obtener(A);
            
         //Fin Constructor
        }
     //Fin de Clase Ventana
    }
    
    
    
    //OBTENER ATRIBUTOS DE LA VENTANA -------------------------------------------------------------------------------
    private static void Obtener(JFrame A){
        
        Constantes W = new Constantes();
        
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled() );
   
        //Obtener Nombre
            String nombre = A.getName();
            System.out.println("Nombre: " + nombre);
           
        //Obtener Titulo
            String titulo = A.getTitle();
            System.out.println("Titulo: " + titulo);
          
        //Obtener Color de Fondo
            Color colorFondo = A.getContentPane().getBackground();
            System.out.println("Color: " + colorFondo);
        
            
        /*//OBTENER TAMAÑO Y POSICION
            //Obtener Tamaño
                int ancho = A.getWidth(), alto = A.getHeight();
                System.out.println("Dimensiones: " + ancho + "x" + alto);
                
                Dimension tamaño = A.getSize();
                System.out.println("Dimensiones: " + tamaño);
                
            
            //Obtener Posicion
                int X = A.getX(), Y = A.getY();
                System.out.println("Posicion: X = " + X + " Y = " + Y);
                
                Point posVentana = A.getLocation();
                System.out.println("Posicion: " + posVentana);
                
            
            //Obtener Posicion en la Pantalla
                Point posPantalla = A.getLocationOnScreen();
                System.out.println("Posicion en la Pantalla: " + posPantalla);
        //*/        
        
            
        /*//OBTENER ICONO
            Image icon = A.getIconImage();
            
            //Obtener Dimensiones del Icono
            int anchoIcon = icon.getWidth(null), altoIcon = icon.getHeight(null);
            
            System.out.println("Dimens. Icono: " + anchoIcon + "x" + altoIcon);
        //*/
                
        //Se puede Redimensionar ?
            System.out.println("Redimensionar: " + A.isResizable()); 
       
            
        //Obtener la Cantidad de Componentes que contiene
            int cantComponentes = A.getComponentCount();
            System.out.println("Cant. Componentes: " + cantComponentes);

            
        //Obtener Estado inical de la Ventana
            int estado = A.getExtendedState();
            System.out.println("Estado inicial de la Ventana: " + W.estadoVentana(estado));
            
        //Obtener que hace cuando se cierra 
            int cierre = A.getDefaultCloseOperation();
            System.out.println("Cuando se cierra: " + W.cierreVentana(cierre));
            
        //Obtener la Barra de Menus
            JMenuBar barra = A.getJMenuBar();
            
            //System.out.println(barra);
       
        //Es enfocable ?    
            System.out.println("Es enfocable: " + A.getFocusableWindowState());
            
        //Saber si la Ventana o sus Componentes internos pueden ser enfocados
            System.out.println("Se puede enfocar la Ventana" + A.isFocusableWindow());

        //Esta enfocada la Ventana
            System.out.println("Esta enfocada la Ventana: " + A.isFocused());
            
        //Es visible ?
            System.out.println("Es visible: " + A.isVisible());
            
        System.out.println("--------------------------------------------------------------------------------------");
    }
    //---------------------------------------------------------------------------------------------------------------
        
    
    //Cambiar Icono superior
    private static void cambiarIcono(JFrame A){
    
        File ruta = new File("Iconos\\24x24\\java.png");
        Image icono = null;
        
        try {
            icono = ImageIO.read(ruta);
            
            //Establecer Icono
                A.setIconImage(icono);
                
        } catch (IOException ex){

            ex.getMessage();
        }  
    }
    
    //EVENTOS DE VENTANAS -------------------------------------------------------------------------------------------
    private static void AñadirEventosVentana(JFrame A){
        
        EventosVentanas Oyente = new EventosVentanas();
        
        //Añadir Oyentes de Eventos de Ventanas
            A.addWindowStateListener(Oyente.estadoVentanas);

            A.addWindowListener(Oyente.eventosVentanas);

            A.addWindowFocusListener(Oyente.FocoVentanas);
        
        /*//Remover Oyentes de Eventos de Ventanas
        
            A.removeWindowListener(Oyente.eventosVentanas);
            
            A.removeWindowStateListener(Oyente.estadoVentanas);
            
            A.removeWindowFocusListener(Oyente.FocoVentanas);
        //*/
    }
    
    //EVENTOS DE TECLADO Y MOUSE
    private static void AñadirEventosTecladoMouse(JFrame A){
    
        EventosTecladoMouseFoco Oyente = new EventosTecladoMouseFoco();
        
        //Añadir Eventos de Teclado
            A.addKeyListener(Oyente.EventosTeclado);
            
        //Añadir eventos de Mouse    
            A.addMouseListener(Oyente.Mouse);
            
            A.addMouseMotionListener(Oyente.MouseMotion);
            
            A.addMouseWheelListener(Oyente.MouseRuedita);
    
        /*//Remover Eventos de Teclado    
            A.removeKeyListener(Oyente.EventosTeclado);
        
        //Remover Eventos de Mouse
            A.removeMouseListener(Oyente.Mouse);
            A.removeMouseMotionListener(Oyente.MouseMotion);
            A.removeMouseWheelListener(Oyente.MouseRuedita);
        //*/    
    }
    
    
    //Añadir Barra de Menus ------------------------------------
    private static JMenuBar barraMenus(){
    
        JMenuBar A = new JMenuBar();
        
        JMenu archivo = new JMenu("Archivo");
            archivo.add(new JMenuItem("Guardar"));
            archivo.add(new JMenuItem("Guardar como..."));
            
        JMenu editar = new JMenu("Editar");
        
            editar.add(new JMenuItem("Copiar"));
            editar.add(new JMenuItem("Cortar"));
            editar.add(new JMenuItem("Pegar"));
    
        A.add(archivo);
        A.add(editar);
        
        return(A);
    }
    
    
 //Fin de Clase 
}
