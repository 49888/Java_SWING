package Componentes.Barras_de_Menus;

import Principal.Constantes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;

public class Barras_de_Menus {
    
    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(400, 400); this.setLocationRelativeTo(null);
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JMenuBar barra = BarraMenus();
            this.add(barra, BorderLayout.NORTH);
            

            
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    //BARRA DE MENUS -----------------------------------------------------------------------------------------------
    private static JMenuBar BarraMenus(){
    
        JMenuBar A = new JMenuBar();
        
        //Establecer Nombre
            A.setName("Barra de Menus");
        
        //Establecer Mensaje emergente    
            A.setToolTipText("Esta es la barra de Herramientas");

        //Añadir Menus
            A.add(añadirJMenu());
            A.add(añadirJMenu());
            A.add(añadirJMenu());
 

        //Cambiar Color del Fondo    
            //A.setBackground(Color.BLUE);
        
            
            
        //Establecer el Layout    
            //A.setLayout(new FlowLayout()); 
            //A.setLayout(new GridLayout(2, 2)); 
            
        
            
        //OBTENER -------------------------------------------------------------------
        Obtener(A);
        
        return(A);
    }
    
    private static int cont = 1, cont2 = 1;
    
    
    //MENUS --------------------------------------------------------------------------------------------------------
    private static JMenu añadirJMenu(){
    
        
        
       JMenu menu = new JMenu();
       
        //Establecer Nombre
            menu.setName("Menu " + cont);
            
        //Establecer Texto
            menu.setText("Opciones " + cont);
        
        //Establecer Mensaje emergente        
            menu.setToolTipText("Este es el " + menu.getName());

        //Establecer Color de la Letra    
            menu.setForeground(Color.RED);
        
        //Establecer Fuente    
            menu.setFont(new Font("Consolas", Font.PLAIN, 14));
        
        //Añadir Items    
            menu.add(añadirJMenuItem());
            menu.add(añadirJMenuItem());
            
            //Añadir Separador
                menu.addSeparator();
            
            menu.add(añadirJMenuItem());

       
        
        //Establecer Icono
            menu.setIcon(new ImageIcon("Iconos\\16x16\\java" + cont + ".png"));
            
        
       cont++;   
       return(menu);
    }
    
    //ITEMS DE MENU ------------------------------------------------------------------------------------------------
    private static JMenuItem añadirJMenuItem(){

        JMenuItem item = new JMenuItem();
       
        //Establecer Nombre
            String nombre = "Item " + cont2;
            item.setName(nombre);
            
        //Establecer Texto
            String texto = "Opcion: " + cont2;
            item.setText(texto);
        
        //Establecer Mensaje emergente    
            item.setToolTipText("Este es el " + item.getName());
            
        //Establecer Color de la letra
            item.setForeground(Color.BLUE);
            
        //Establecer Fuente
        item.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
        
        //Establecer Color de fondo    
            item.setBackground(Color.DARK_GRAY.brighter());
            
        //Establecer Icono
            String ruta = "Iconos\\Number\\" + cont2 + ".png";
            item.setIcon(new ImageIcon(ruta));
       
        
            
        //Añadir Oyente de Eventos
            item.addActionListener(accion());
            
        //Establecer atajos de teclado
            item.setAccelerator(atajoTeclado());
            
       cont2++;
       return(item);
    }

    private static KeyStroke atajoTeclado(){
        
        String caracter = "ABCDEFGHIJKMNOPQRSTUVWXYZ";
        
        KeyStroke atajo = KeyStroke.getKeyStroke("ctrl " + caracter.charAt(cont2-1));

        return(atajo);
    }
    
    private static ActionListener accion(){
    
        ActionListener evento = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                JMenuItem origen = (JMenuItem)e.getSource();
                
                System.out.println(origen.getText());
            }
        };
        
        return(evento);
    }
    
    private static void Obtener(JMenuBar A){
        
        Constantes W = new Constantes();
        
        //Obtener el Nombre
            System.out.println("Nombre: " + A.getName());
  
        /*//OBTENER COMPONENTES
        
            //Obtener la Cantidad de Componentes
                System.out.println("Cant. Componentes: " + A.getComponentCount());
        
            //Obtener Componente segun su indice
                Component comp = A.getComponent(0);
                System.out.println("Componente: " + comp);

            //Obtener Indice del Componente
                int indice = A.getComponentIndex(comp);
                System.out.println(" Indice: " + indice);
        //*/
                
        //Obtener el Layout    
            System.out.println("Layout: " + A.getLayout());
    }
 //Fin de Clase  
}