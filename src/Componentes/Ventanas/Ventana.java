
package Componentes.Ventanas;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Ventana {
    
    public static void main(String[] args) {
        
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
                A.setLocation(X, Y);
                
            //Establecer Tamaño y Posicion
                //A.setBounds(X, Y, ancho, alto); 
            
            //Establecer Posicion en forma relativa a otro Componente    
                A.setLocationRelativeTo(null);
        
        //Se puede Redimensionar
            //A.setResizable(false);
            
        //CAMBIAR ICONO
            cambiarIcono(A);
        
        //Establecer que sucedera cuando se cierre
            A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        
       //EVENTOS
            Eventos(A);
            
        //Establecer Tipo de Ventana
            //A.setType(Window.Type.UTILITY);     
            
        //Establecer el Estado inicial de la Ventana
            //A.setExtendedState(JFrame.MAXIMIZED_BOTH);
            
        //Hacerla Visible    
            A.setVisible(true);
            
        Obtener(A);
    }
    
    private static void Obtener(JFrame A){
        
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled() );
        
        //Obtener Nombre
            System.out.println("Nombre: " + A.getName() );
            
        //Obtener Titulo
            System.out.println("Titulo: " + A.getTitle());
        
        //Obtener Color de Fondo
            System.out.println("Color: " + A.getContentPane().getBackground());
            
        //OBTENER TAMAÑO Y POSICION
            
            //Obtener Tamaño
                System.out.println("Dimensiones: " + A.getWidth() + "x" + A.getHeight() );

                System.out.println("Dimensiones: " + A.getSize() );
            
            //Obtener Posicion
                System.out.println("Posicion: X = " + A.getX()+ " Y = " + A.getY() );

                System.out.println("Posicion: " + A.getLocation() );
            
            //Obtener Posicion en la Pantalla    
                System.out.println("Posicion en la Pantalla: " + A.getLocationOnScreen() );
       
                
        //OBTENER ICONO
            Image icon = A.getIconImage();
            
            //Obtener Dimensiones del Icono
            System.out.println("Dimens. Icono: " + icon.getWidth(null) + "x" + icon.getHeight(null));
            
                
        //Se puede Redimensionar ?
            System.out.println("Redimensionar: " + A.isResizable()); 
       
        //Obtener la Cantidad de Componentes que contiene
            System.out.println("Cant. Componentes: " + A.getComponentCount());
            
        //Es visible ?
            System.out.println("*Es visible: " + A.isVisible());
            
        System.out.println("--------------------------------------------------------------------------------------");
    }
    
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
    
    private static void Eventos(JFrame A){
        

        
        //Eventos de Ventana    
            //Eventos de Foco (Ventana)
                //A.addWindowFocusListener();
    
    }
    
    
 //Fin de Clase 
}
