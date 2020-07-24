
package Componentes.Texto;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Area_de_Texto {

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
            
            //Area de Texto simple
            this.add(areaTexto());
            
            //Area de Texto con Scroll
                JScrollPane panelScroll = new JScrollPane(areaTexto());

                this.add(panelScroll);
        }
 
     //Fin de Clase Panel
    }
    
    //AREA DE TEXTO -------------------------------------------------------------------------------------------------
    private static JTextArea areaTexto(){
        
        JTextArea A = new JTextArea();
        
        //Activar / Desactivar 
            //A.setEnabled(false); 
        
        //Establecer nombre
            A.setName("Cuadro de Texto");
        
        //Establecer Texto
            A.setText("Escribe aqui...");
            
        //Mensaje Emergente
            A.setToolTipText("Esta es una Area de Texto");
        
        //Añadir texto al final
            //A.append("Esto va al final");
        
        //Establecer Lineas y Columnas
            A.setRows(7); A.setColumns(20);
            
        //Saltos de linea automaticos (No crece a lo largo)
            A.setLineWrap(true);
            
        //Establecer Color
            A.setBackground(Color.LIGHT_GRAY);
        
        //Estblecer Color de la Letra
            A.setForeground(Color.BLUE);
            
        //Establecer Color del Texto Seleccionado    
            A.setSelectedTextColor(Color.yellow);
            
        //Establecer Fuente
            A.setFont(new Font("Consolas", Font.PLAIN, 16));
        
        //Establecer si se puede enfocar o no    
            //A.setFocusable(false);
            
        //Establecer Margen
           int superior = 20, inferior = 50, izquierda = 20, derecha = 50;
           
           A.setMargin(new Insets(superior, izquierda, inferior, derecha));
           
        //Establecer si se puede Editar
           
           //A.setEditable(false);//No se puede Editar, pero si enfocar y escuchar eventos
        
    
        //OBTENER -------------------------------------------------------------
            Obtener(A);
       
        //EVENTOS: con DocumentListener ---------------------------------------
            Eventos(A);
        
        
        return(A);
    }
    
    //OBTENER -------------------------------------------------------------------------------------------------------
    private static void Obtener(JTextArea A){
        
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled() );
        
        //Obtener Nombre
            System.out.println("Nombre: " + A.getName() );
            
        //Obtener Texto
            System.out.println("Texto:\n"  + A.getText() + "\n-----------");
            
        //Obtener Lineas y Columnas
            System.out.println("Filas: " + A.getRows()+ " Columnas:: " + A.getColumns());
        
        //Obtener Color de la Letra
            System.out.println("Color Letra: " + A.getForeground() );
            
        //Obtener Color del Texto selecionado
            System.out.println("Color Texto seleccionado: " + A.getSelectedTextColor() );
            
        //Obtener Color del Texto selecionado
            System.out.println("Color Seleccion: " + A.getSelectionColor() );
            
        //Establecer Color de Seleccion    
            A.setSelectionColor(Color.RED);
            
        //Obtener Color de Fondo
            System.out.println("Color fondo: " + A.getBackground() );
            
        //Tiene saltos de lineas automaticos ?
            System.out.println("Saltos de linea automaticos: " + A.getLineWrap() );
            
        //Obtener la Fuente
            System.out.println("Fuente: " + A.getFont() );
            
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText() );
            
        //Se puede enfocar ?
        System.out.println("Se puede enfocar: " + A.isFocusable());
        
        //Obtener Margen
            Insets margen = A.getMargin();
            System.out.println("Margen: " + margen);
        
        //Se puede Editar
            System.out.println("Se puede editar: " + A.isEditable());
        
        
            
            
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
    
    //EVENTOS
    private static void Eventos(JTextArea A){
        
        Document doc = A.getDocument();
    
        doc.addDocumentListener(new DocumentListener(){
            
            @Override
            public void insertUpdate(DocumentEvent de){
            
                System.out.println("Estas Ingresando Texto...");
            }

            @Override
            public void removeUpdate(DocumentEvent de){
               
                System.out.println("Estas Borrando Texto...");
            }

            @Override
            public void changedUpdate(DocumentEvent de){
                
                System.out.println("Se ha modificado el Texto");    
            }
            
         //Fin de Clase Anomina   
        });
    }

 //Fin de Clase  
}
