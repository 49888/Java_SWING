
package Componentes.MenuEmergentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;



public class Menu_Emergente {
    
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
        
            this.setComponentPopupMenu(MenuEmergente());
        }
        
        
        
        
     //Fin de Clase Panel
    }
    
    private static JPopupMenu MenuEmergente(){
    
        JPopupMenu A = new JPopupMenu();
        
        //Activar / Desactivar
            //A.setEnabled(false);
        
        //Establecer Nombre
            A.setName("Menu Desplegable");
            
        //Establecer Mensaje emergente    
            A.setToolTipText("Este es un Menu Desplegable");
             
        //Establecer Color de Fondo
            A.setBackground(Color.PINK);
 
        //Establecer el Layout
            //A.setLayout(new FlowLayout());
  
        //Establecer Tamaño
            A.setPopupSize(120, 180);
            
        //Agregar etiqueta
            //agregarEtiqueta(A);
            
        //AÑADIR COMPONENTES
            A.add(añadirJMenu());
            A.add(añadirJMenu());
            
            //Añadir Separador
                A.addSeparator();
            
            A.add(añadirJMenu());
            
      
            
           
        //EVENTOS
            Eventos(A);
            
        //Establecer Visibilidad
            //A.setVisible(false);
            
        //OBTENER
            Obtener(A);    
    
        return(A);
    }
    
    private static void Obtener(JPopupMenu A){
        
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled());
        
        //Obtener Nombre
            System.out.println("Nombre: " + A.getName());
            
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText());
            
        //Obtener el Layout
            System.out.println("Layout: " + A.getLayout());
            
        //OBTENER ITEMS
        
            //Cantidad de Items
                System.out.println("Cantidad de Items: " + A.getComponentCount());
            
            /*//Indicando su posicion (indice)        //Obtener indice
                Component comp = A.getComponent(3); int index = A.getComponentIndex(comp);
            
                System.out.println("4º Item: " + comp);
                System.out.println(" indice: " + index);
        //*/        
                
            
        //Obtener Color de Fondo
            System.out.println("Color fondo: " + A.getBackground() );    
    
        //Es visible ?
            System.out.println("Es visible: " + A.isVisible());

        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-"); 
    }
    
    private static void Eventos(JPopupMenu A){
    
        PopupMenuListener B = new PopupMenuListener(){
            
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent pme) {
                
                System.out.println("-> EL MENU ESTA DESPLEGADO");
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent pme) {
                
                System.out.println("-> EL MENU HA SIDO OCULTADO");
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent pme) {
                
                System.out.println("->Has salido sin elegir ninguna opicion");
            }
        };
        
        //A.addPopupMenuListener(B);
        
        
        MenuKeyListener C = new MenuKeyListener(){
            
            @Override
            public void menuKeyTyped(MenuKeyEvent e){
                
                //System.out.println(" Caracter: " + e.getKeyChar() + " - Codigo: " + e.getKeyCode());     
            }

            @Override
            public void menuKeyPressed(MenuKeyEvent e){
                System.out.println("Presionaste");
                
                System.out.println("Alt: " + e.isAltDown() + " - Alt Gr: " + e.isAltGraphDown()); 
                System.out.println("Crtl: " + e.isControlDown() + " - Shift: " + e.isShiftDown());
            }

            @Override
            public void menuKeyReleased(MenuKeyEvent e){
                System.out.println("Soltaste");
            }
        };
    
        A.addMenuKeyListener(C);
    }
    
    private static void agregarEtiqueta(JPopupMenu A){
        
        A.setLayout(new BoxLayout(A, BoxLayout.PAGE_AXIS));
    
        JLabel etiqueta = new JLabel("Opciones");
        
            etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
            
        A.add(etiqueta);
    }
    
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
    
    
    private static int cont = 1, cont2 = 1;
    
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
            //item.addActionListener(accion());
            
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
    
 //Fin de Clase Menu_Emergente   
}
