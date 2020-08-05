
package Componentes;

import Principal.Constantes;//Clase Propia

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Desplegable {
    
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
            
            this.add(desplegable());
        }
 
     //Fin de Clase Panel
    }
    
    private static JComboBox desplegable(){
    
        JComboBox A = new JComboBox();
        
        //Activado / Desactivado
            A.setEnabled(false);
        
        //Establecer Nombre
            A.setName("Menu Desplegable");
        
        //ESstablecer Mensaje Emergente
            A.setToolTipText("Este es un Menu desplegable");
        
        A.addItem("Item 1");
        A.addItem("Item 2");
        A.addItem("Item 3");
        A.addItem(1812);
        A.addItem("Item 1");
        A.addItem("Item 2");
        A.addItem("Item 3");
        A.addItem(1812);
        A.addItem(1812);
        
        //Establecer Color de Fondo
            A.setBackground(Color.PINK);
        
        //Establecer Color de la Letra
            A.setForeground(Color.BLUE);
        
        //Establecer Fuente
            A.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
        
        
        //Establecer la Cantidad Items Maxima que puede visualizar sin incluir un Scroll
            A.setMaximumRowCount(5);
            
        //Establecer Item seleccionado iniciamente   
        
            A.setSelectedIndex(2);//Indicanto su posicion
            
            A.setSelectedItem(A.getItemAt(3));//Indicadolo directamente

        //Establecer si se puede enfocar o no
            //A.setFocusable(false);
               
        
        //EVENTOS -------------------------------------
        Eventos(A);
            
        //Establecer Visibilidad
            A.setVisible(false);
        
        
        //OBTENER -------------------------------------
        Obtener(A);

        return(A);
    }
    
    //OBTENER -----------------------------------------------------------------------------------------------------
    private static void Obtener(JComboBox A){
    
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled());
        
        //Obtener Nombre
        System.out.println("Nombre: " + A.getName());
        
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText());
        
        //Obtener Color de Fondo
        System.out.println("Color de Fondo: " + A.getBackground());
        
        //Obtener Color de la Letra
        System.out.println("Color de Letra: " + A.getForeground());
        
        //Obtener Fuente
            System.out.println("Fuente: " + A.getFont());
        
        
        
        //Obtener la Cantidad Items Maxima que puede visualizar sin incluir un Scroll
            System.out.println("Cant. Max. Items sin Scroll: " + A.getMaximumRowCount());
        
        //OBTENER ITEMS
        
            //Cantidad de Items
                System.out.println("Cantidad de Items: " + A.getItemCount());
            
            //Indicando su posicion
                System.out.println("4º Item: " + A.getItemAt(3));
                
                
        
        //Se puede enfocar ?
            System.out.println("Se puede enfocar: " + A.isFocusable());
    
        //Es visible ?
            System.out.println("Es visible: " + A.isVisible());
    }
    
    
    //EVENTOS -----------------------------------------------------------------------------------------------------
    private static void Eventos(JComboBox A){

        Constantes W = new Constantes();
        
        A.addItemListener(new ItemListener(){
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                System.out.println("-->Has cambiado de Item...: ");
                
                //Obtener Item afectado:
                    Object afect = e.getItem();
                    
                //Obtener Item que desencadeno el evento:
                    ItemSelectable desc = e.getItemSelectable();
                
                //Obtener Estado del Item 
                    int estado = e.getStateChange();
                    
                    System.out.println("Item: " + afect + " --> " + W.estadoItem(estado));

                //Obtener Item Selecionado 
                    JComboBox origen = (JComboBox)e.getSource();
                
                    Object select = origen.getSelectedItem();//Obtener el Item 
                    
                    int index = origen.getSelectedIndex();//Obtener el indice del Item
                    
                    System.out.println("Item Selecionado: " + select + " - indice: " + index);
                //*/
            }
        });
    
        
        A.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //Obtener Item Selecionado 
                    JComboBox origen = (JComboBox)e.getSource();
                
                    Object select = origen.getSelectedItem();//Obtener el Item 
                    
                    int index = origen.getSelectedIndex();//Obtener el indice del Item
                    
                    System.out.println("Item Selecionado: " + select + " - indice: " + index);
                //*/    
            }
        });
    }

 //Fin de Clase
}

