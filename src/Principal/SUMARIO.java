
package Principal;



import Eventos.Oyentes;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;



public class SUMARIO extends Oyentes{
    
    // --------------------------------------------------------------------------------------------------------------
    
    //JComponent
    
        //AbstractButton

            //JButton A = new JButton();//Boton Simple

            //JToggleButton A = new JToggleButton();

                //JCheckBox A = new JCheckBox();//Casilla de Verificacion

                //JRadioButton A = new JRadioButton();//Boton de Radio  

            //JMenuItem A = new JMenuItem();

                //JMenu A = new JMenu();

                //JCheckBoxMenuItem A = new JCheckBoxMenuItem();//Casilla de Verificacion

                //JRadioButtonMenuItem A = new JRadioButtonMenuItem();//Boton de Radio 

        //JPanel A = new JPanel();//Panel

        //JScrollPane A = new JScrollPane();//Panel con Scroll

        //JMenuBar A = new JMenuBar();//Barra de Menus

        //JToolBar A = new JToolBar();//Barra de Herramientas

        //JOptionPane A = new JOptionPane();//Cuadros de dialogo

        //JPopupMenu A = new JPopupMenu();//Menu Emergente

        //JLabel A = new JLabel();//Etiqueta 

        JSpinner A = new JSpinner();

        //JSlider A = new JSlider();//Deslizador

        //JComboBox A = new JComboBox();

        //JTextComponent

            //JTextArea A = new JTextArea();//Area de Texto

            //JTextField A = new JTextField();//Cuadro de Texto

                //JPasswordField A = new JPasswordField();//Cuadro de Texto para Contraseñas

            //JEditorPane A = new JEditorPane();

                //JTextPane A = new JTextPane();//Panel de Texto
            
    //Window <-- Frame
        //JFrame A = new JFrame();
    
    
    private void Botones(){
   
        //METODOS UNIVERSALES -------------------------------------------------------------------------------------
        ///*
        
        //Heredados de: Component
        
            //Añadir y remover Eventos de Foco
            A.addFocusListener(FL); A.removeFocusListener(FL);
            
            //Añadir y remover Eventos de Teclado
            A.addKeyListener(KL); A.removeKeyListener(KL);
            
            //Añadir y remover Eventos de Mouse
            A.addMouseListener(ML); A.removeMouseListener(ML);
            
            A.addMouseMotionListener(MML); A.removeMouseMotionListener(MML);
            
            A.addMouseWheelListener(MWL); A.removeMouseWheelListener(MWL);
        
            
            //Establecer y obtener Nombre del Componente
            A.setName(""); A.getName();
            
            //Establecer posicion del Componente
            A.setLocation(0, 0); A.setLocation(null);
            
            //Obtener posicion del Componente
            A.getLocation(); A.getX(); A.getY();
            A.getLocationOnScreen(); 
            
             
            //Establecer Tamaño del Componente
            A.setSize(0, 0); A.setSize(null);
            
            //Obtener Tamaño del Componente
            A.getSize(); A.getWidth(); A.getHeight();
            
            //Establecer Tamaño y Posicion
            A.setBounds(0, 0, 0, 0); A.setBounds(null);
            
            //Obtener Tamaño y Posicion
            A.getBounds();
            
            //Obtener Tamaño predeterminado
            A.getPreferredSize(); 
            
            //Establecer Tamaño predeterminado
            A.setPreferredSize(null);
            
            
            A.setVisible(true); A.isVisible();
            
            A.setEnabled(true); A.isEnabled();
             
            
        //METOSOS ESPECIFICOS --------------------------------------------------------------------------------------   
        /*
        
          
        //Heredados de: AbstractButton
            A.addActionListener(AL);

            A.addChangeListener(CL);
            
            A.addItemListener(IL);
        
            
        //De: JPopupMenu
            A.addMenuKeyListener(MKL);
            A.addPopupMenuListener(PML);
        
  
        //
            A.getDocument().addDocumentListener(DL);
        
            
        //Heredados de Window
            A.addWindowListener(WL);
            A.addWindowStateListener(WSL);
            A.addWindowFocusListener(WFL);
            
     //*///Fin de Metodos        
    }
    
 //Fin de Clase  
}