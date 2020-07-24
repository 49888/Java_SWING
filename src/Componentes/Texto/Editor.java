
package Componentes.Texto;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.text.*;

public class Editor {
    
    public static JToolBar getBarraOpciones(){

        JToolBar barra = new JToolBar();

            barra.setName("Editor de Texto: StyledEditorkit");
   
        JMenuBar Menu = new JMenuBar();
       
        
        //ALINEACION DEL TEXTO --------------------------------------------------------------------------------------
        JMenu alineacion = new JMenu("Alineacion"); alineacion.setIcon(new ImageIcon("Iconos\\24x24\\alineacion.png"));
            
            añadirAlineacion(alineacion);
        
            
        //ESTILO ----------------------------------------------------------------------------------------------------    
        JMenu estilo = new JMenu("Estilo"); estilo.setIcon(new ImageIcon("Iconos\\24x24\\estilo.png"));
        
            añadirEstilo(estilo);

            
        //OPCIONES --------------------------------------------------------------------------------------------------    
        JMenu opciones = new JMenu("Opciones"); opciones.setIcon(new ImageIcon("Iconos\\24x24\\opciones.png"));
        
            añadirOpciones(opciones);

            
        //CAMBIAR FUENTE --------------------------------------------------------------------------------------------    
        JMenu fuentes = new JMenu("Fuentes"); fuentes.setIcon(new ImageIcon("Iconos\\24x24\\fuente.png"));
            
            añadirFuente(fuentes, "Consolas"); añadirFuente(fuentes, "Chiller");
            añadirFuente(fuentes, "Helvetica"); añadirFuente(fuentes, "Ravie");
            añadirFuente(fuentes, "Monotype Corsiva"); añadirFuente(fuentes, "Arial"); 
            añadirFuente(fuentes, "Monospaced"); añadirFuente(fuentes, "Century");  
            añadirFuente(fuentes, "Algerian");
        
            
        //CAMBIAR TAMAÑO -------------------------------------------------------------------------------------------    
        JMenu tamaño = new JMenu("Tamaño"); tamaño.setIcon(new ImageIcon("Iconos\\24x24\\sizeFont.png"));
            
            añadirTamaño(tamaño, 12); añadirTamaño(tamaño, 16);
            añadirTamaño(tamaño, 18); añadirTamaño(tamaño, 22);
            añadirTamaño(tamaño, 28); añadirTamaño(tamaño, 32);
        
        //CAMBIAR COLOR --------------------------------------------------------------------------------------------    
        JMenu color = new JMenu("Color"); color.setIcon(new ImageIcon("Iconos\\24x24\\colores.png"));
            
            String ruta = "Iconos\\16x16\\";
            
            añadirColor(color, Color.RED, "Rojo", new ImageIcon(ruta + "rojo.png"));
            añadirColor(color, Color.BLUE, "Azul", new ImageIcon(ruta + "azul.png"));
            añadirColor(color, Color.CYAN, "Celeste", new ImageIcon(ruta + "celeste.png"));
            añadirColor(color, Color.BLACK, "Negro", new ImageIcon(ruta + "negro.png"));
            añadirColor(color, Color.GREEN, "Verde", new ImageIcon(ruta + "verde.png"));
            añadirColor(color, Color.PINK, "Rosa", new ImageIcon(ruta + "rosa.png"));
            
            
        Menu.add(opciones); Menu.add(estilo); Menu.add(fuentes); Menu.add(tamaño); 
        Menu.add(alineacion); Menu.add(color);

        barra.add(Menu);

        return(barra);
    }
    
    //FUENTES ------------------------------------------------------------------------------------------------------
    private static void añadirFuente(JMenu menu, String nombre){
    
        JMenuItem A = new JMenuItem(nombre);
        
            A.setFont(new Font(nombre, Font.PLAIN, 18));
            
            Action font = new StyledEditorKit.FontFamilyAction("", nombre);
            
            A.addActionListener(font);
            
        menu.add(A);
    }
    
    //ALINEACION --------------------------------------------------------------------------------------------------
    private static void añadirAlineacion(JMenu menu){
        
        JMenuItem A = new JMenuItem("Centrado", new ImageIcon("Iconos\\24x24\\centrado.png"));
        JMenuItem B = new JMenuItem("Izqierda", new ImageIcon("Iconos\\24x24\\izquierda.png"));
        JMenuItem C = new JMenuItem("Derecha", new ImageIcon("Iconos\\24x24\\derecha.png"));
        JMenuItem D = new JMenuItem("Justificado", new ImageIcon("Iconos\\24x24\\justificacion.png"));
        
            Action center = new StyledEditorKit.AlignmentAction("", StyleConstants.ALIGN_CENTER);

            Action left = new StyledEditorKit.AlignmentAction("", StyleConstants.ALIGN_LEFT);

            Action right = new StyledEditorKit.AlignmentAction("", StyleConstants.ALIGN_RIGHT);

            Action justified = new StyledEditorKit.AlignmentAction("", StyleConstants.ALIGN_JUSTIFIED);


            A.addActionListener(center);
            B.addActionListener(left);
            C.addActionListener(right);
            D.addActionListener(justified);
        
        menu.add(A); menu.add(B); menu.add(C); menu.add(D);
    }
    
    //COLOR -------------------------------------------------------------------------------------------------------
    private static void añadirColor(JMenu menu, Color color, String nombre, Icon icono){

        JMenuItem A = new JMenuItem(nombre, icono);

            Action colorLetra = new StyledEditorKit.ForegroundAction("", color);
            
            A.addActionListener(colorLetra);
            
        menu.add(A);
    }
    
    private static void añadirTamaño(JMenu menu, int size){
    
        String nombre = Integer.toString(size);
        
        JMenuItem A = new JMenuItem(nombre);

            Action fontSize = new StyledEditorKit.FontSizeAction("", size);
            
            A.addActionListener(fontSize);
            
        menu.add(A);
    }
    
    //OPCIONES ----------------------------------------------------------------------------------------------------
    private static void añadirOpciones(JMenu menu){

        JMenuItem A = new JMenuItem("Copiar", new ImageIcon("Iconos\\24x24\\copiar.png"));
        JMenuItem B = new JMenuItem("Cortar", new ImageIcon("Iconos\\24x24\\cortar.png"));
        JMenuItem C = new JMenuItem("Pegar", new ImageIcon("Iconos\\24x24\\pegar.png"));
        JMenuItem D = new JMenuItem("Pitido");
        JMenuItem E = new JMenuItem("Salto");
        JMenuItem F = new JMenuItem("Tab");

            //Heredados de DefaultEditorKit
            Action copiar = new StyledEditorKit.CopyAction();
            
            Action cortar = new StyledEditorKit.CutAction();
            
            Action pegar = new StyledEditorKit.PasteAction();
            
            Action sonido = new StyledEditorKit.BeepAction();
            
            Action salto = new StyledEditorKit.InsertBreakAction();
            
            Action tab = new StyledEditorKit.InsertTabAction();
            
            A.addActionListener(copiar);
            B.addActionListener(cortar);
            C.addActionListener(pegar);
            D.addActionListener(sonido);
            E.addActionListener(salto);
            F.addActionListener(tab);
            
        menu.add(A); menu.add(B); menu.add(C); menu.add(D); menu.add(E); menu.add(F);
    }
    
    //ESTILO ------------------------------------------------------------------------------------------------------
    private static void añadirEstilo(JMenu menu){

        JMenuItem A = new JMenuItem("Negrita", new ImageIcon("Iconos\\16x16\\negrita.png"));
        JMenuItem B = new JMenuItem("Cursiva", new ImageIcon("Iconos\\16x16\\cursiva.png"));
        JMenuItem C = new JMenuItem("Subrayado", new ImageIcon("Iconos\\16x16\\subrayar.png"));

            Action negrita = new StyledEditorKit.BoldAction();
            
            Action cursiva = new StyledEditorKit.ItalicAction();
            
            Action underLine = new StyledEditorKit.UnderlineAction();
        

            A.addActionListener(negrita);
            B.addActionListener(cursiva);
            C.addActionListener(underLine);
  
        menu.add(A); menu.add(B); menu.add(C);
    }
    
 //Fin de Clase Barra   
}