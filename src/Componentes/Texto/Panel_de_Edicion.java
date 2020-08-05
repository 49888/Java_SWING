package Componentes.Texto;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Panel_de_Edicion {

    public static void main(String[] args) {
        
        Ventana A = new Ventana();
        
     //Fin de Programa
    }
    
    //VENTANA -------------------------------------------------------------------------------------------------------
    private static class Ventana extends JFrame {
    
        public Ventana(){
            
            this.setSize(600, 400); this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Añadimos el Panel
                Panel panel = new Panel();
                
                //this.add(panel, BorderLayout.CENTER);
 
                this.add(areaTexto(), BorderLayout.CENTER);

                this.add(Editor.getBarraOpciones(), BorderLayout.NORTH);
                
            this.setVisible(true);
        }
        
     //Fin de Clase Ventana
    }
    
    //PANEL ---------------------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{

        public Panel(){
            
            /*//Area de Texto simple
            this.add(areaTexto());
            
            //Area de Texto con Scroll
                JScrollPane panelScroll = new JScrollPane(areaTexto());

                this.add(panelScroll);
            //*/    
        }
 
     //Fin de Clase Panel
    }
    
    //AREA DE TEXTO -------------------------------------------------------------------------------------------------
    private static JEditorPane areaTexto(){
        
        JEditorPane A = new JEditorPane();

        //Activar / Desactivar 
            //A.setEnabled(false);
            
        //Definir Editor   
            A.setEditorKit(new StyledEditorKit());
        
        //Establecer nombre
            A.setName("Cuadro de Texto");
        
        //Establecer Texto
            A.setText("Escribe aqui...");
            
        //Mensaje Emergente
            A.setToolTipText("Esta es una Area de Texto");
        
        //Añadir texto al final
            //A.append("Esto va al final");
        
        //Establecer Lineas y Columnas
            //A.setRows(7); A.setColumns(20);
            
            
        //Establecer Color de Fondo
            A.setBackground(Color.LIGHT_GRAY);
        
        //Estblecer Color de la Letra
            //A.setForeground(Color.BLUE);
            
        //Establecer Fuente
            //A.setFont(new Font("Consolas", Font.PLAIN, 16));
            
        //Establecer Color del Texto Seleccionado    
            A.setSelectedTextColor(Color.yellow);
            
        //Establecer Color de Seleccion    
            A.setSelectionColor(Color.RED);
        
        //Establecer Color del Caret(Cursor - Promt)
            A.setCaretColor(Color.BLUE);
            
        //Establecer posicion del Caret (solo si hay texto)
            int pos = 3, fin = A.getText().length();
            A.setCaretPosition(fin);
            
        
        //Establecer si se puede enfocar o no    
            //A.setFocusable(false);
            
        //Establecer Margen
           int superior = 20, inferior = 50, izquierda = 20, derecha = 50;
           
           //A.setMargin(new Insets(superior, izquierda, inferior, derecha));
           
        //Establecer si se puede Editar    
           //A.setEditable(false);    
       
 
        //OBTENER -------------------------------------------------------------
            Obtener(A);
       
        //EVENTOS: con DocumentListener ---------------------------------------
            Eventos(A);
            
        //Establecer Visibilidad
            //A.setVisible(false);
        
        return(A);
    }
    
    //OBTENER -------------------------------------------------------------------------------------------------------
    private static void Obtener(JEditorPane A){
        
        //Esta activado ?
            System.out.println("Activado: " + A.isEnabled() );
   
        //Obtener Editor
            System.out.println(A.getEditorKit());
        
        //Obtener Nombre
            System.out.println("Nombre: " + A.getName() );
            
        //Obtener Texto
            System.out.println("Texto:\n"  + A.getText() + "\n-----------");
            
        //Obtener Mensaje emergente
            System.out.println("Mensaje Emergente: " + A.getToolTipText() );
            
        //Obtener Lineas y Columnas
            //System.out.println("Filas: " + A.getRows()+ " Columnas:: " + A.getColumns());
        
        //Obtener Color de Fondo
            System.out.println("Color fondo: " + A.getBackground() );
            
        //Obtener Color de la Letra
            System.out.println("Color Letra: " + A.getForeground() );
        
        //Obtener la Fuente
            System.out.println("Fuente: " + A.getFont() );
         
            
        //Obtener Color del Texto selecionado
            System.out.println("Color Texto seleccionado: " + A.getSelectedTextColor() );
            
        //Obtener Color de Seleccion
            System.out.println("Color Seleccion: " + A.getSelectionColor() );
            
        //Obtener Color del Caret (Cursor - Promt)
            System.out.println("Color cursor: " + A.getCaretColor());

        //Obtener posicion del Caret
            System.out.println("Posicion Caret: " + A.getCaretPosition());
         
            
        //Obtener Margen
            Insets margen = A.getMargin();
            System.out.println("Margen: " + margen);
            
        //Se puede enfocar ?
            System.out.println("Se puede enfocar: " + A.isFocusable());

        //Se puede Editar
            System.out.println("Se puede editar: " + A.isEditable());
            
        //Es visible ?
           System.out.println("Es visible: " + A.isVisible());
           
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
    
    //EVENTOS
    private static void Eventos(JEditorPane A){
        
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
        
        A.addCaretListener(new CaretListener(){
            
            @Override
            public void caretUpdate(CaretEvent ce) {
                System.out.println("Cambio la seleccion...");
                
                //Obtener Texto Selecionado
                    //System.out.println(" Seleccion: " + A.getSelectedText());
                    
                //Obtener posicion de Caret (Cursor - Promt)
                    System.out.println("Posicion cursor: " + A.getCaretPosition());
            }
            
         //Fin de Clase Anonima
        });//*/
    }

 //Fin de Clase  
}
