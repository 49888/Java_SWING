package Componentes.Barras_de_Herramientas;

import Principal.Constantes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Barras_de_Herramientas {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
                        
            this.add(BarraHerramientas(), BorderLayout.WEST);
            
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    
    private static JToolBar BarraHerramientas(){
    
        JToolBar A = new JToolBar();
        
        //Establecer Nombre
            A.setName("Barra de Herramientas");
        
        //Establecer Orientacion    
            A.setOrientation(JToolBar.VERTICAL);
        

        
       
    
        //Añadir Componentes
        anadirComponentes(A);
        
        //A.add(cuadro);
        
        
        //Establecer si es Fija o Flotante
            //A.setFloatable(false);
            
            //A.setRollover(true);
            
       
        //Cambiar Color del Fondo    
            A.setBackground(Color.BLUE);
        
            
        //Establecer el Layout    
            A.setLayout(new FlowLayout()); A.setLayout(new GridLayout()); A.setLayout(new BorderLayout());
        
            
        //OBTENER -------------------------------------------------------------------
        Obtener(A);
        
        return(A);
    }
    
    private static void Obtener(JToolBar A){
        
        Constantes W = new Constantes();
        
        //Obtener el Nombre
            System.out.println("Nombre: " + A.getName());
        
        //Obtener la Orientacion
            int orientacion = A.getOrientation();
            System.out.println("Orientacion: " + W.barOrientacion(orientacion));
        
           
        //OBTENER COMPONENTES
        
            //Obtener la Cantidad de Componentes
                System.out.println("Cant. Componentes: " + A.getComponentCount());
        
            //Obtener Componente segun su indice
                Component comp = A.getComponentAtIndex(0);
                System.out.println("Componente: " + comp);

            //Obtener Indice del Componente
                int indice = A.getComponentIndex(comp);
                System.out.println(" Indice: " + indice);
        
                
        //Obtener el Layout    
            System.out.println("Layout: " + A.getLayout());
    
        //Obtener si es Fija o Flotante
            System.out.println("Barra Flotante: " + A.isFloatable());
    }
   
    
    private static void anadirComponentes(JToolBar A){
    
        Action accion = new AbstractAction("", new ImageIcon("Iconos\\32x32\\cruz.png")){
            
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        };
        
        JTextField cuadro = new JTextField("Escribe aqui...");
        
        String[] fuentes = {"Arial", "Helvetica", "Consolas"};
        JComboBox comboBox = new JComboBox(fuentes);
        
        JButton boton = new JButton("Boton 1");

        
        //Añadir una Accion
            A.add(accion);
        
        //AÑADIR SEPARADOR    
            A.addSeparator();
            
        //Añadir un Cuadro de Texto
            A.add(cuadro);
        
            
        //AÑADIR SEPARADOR (Indicando la distancia)
            int X = 0;//Tendra efecto si la orientacion es Horizontal
            int Y = 30;//Tendra efecto si la orientacion es Vertical
            
            A.addSeparator(new Dimension(X, Y));
       

        //Añadir un ComboBox
            A.add(comboBox);
            
        //Añadir un Boton
            A.add(boton);
    }

 //Fin de Clase  
}