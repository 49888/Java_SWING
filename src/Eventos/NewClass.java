
package Eventos;



import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;



public class NewClass extends Oyentes{
    
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

        //JSpinner A = new JSpinner();

        //JSlider A = new JSlider();//Deslizador

        //JComboBox A = new JComboBox();

        //JTextComponent

            //JTextArea A = new JTextArea();//Area de Texto

            //JTextField A = new JTextField();//Cuadro de Texto

                //JPasswordField A = new JPasswordField();//Cuadro de Texto para Contraseñas

           //JEditorPane A = new JEditorPane();

                //JTextPane A = new JTextPane();//Panel de Texto
            
    //Window <-- Frame
        JFrame A = new JFrame();
    
    
    private void Botones(){
   
        //Heredados de: AbstractButton
            A.addActionListener(AL);

            A.addChangeListener(CL);
            
            A.addItemListener(IL);
        
        //De: JPopupMenu
            A.addMenuKeyListener(MKL);
            A.addPopupMenuListener(PML);
        //*/
            
        //Heredados de: Component    
            A.addFocusListener(FL);
            
            A.addKeyListener(KL);
            
            A.addMouseListener(ML);
            A.addMouseMotionListener(MML);
            A.addMouseWheelListener(MWL);
        
        //
            A.getDocument().addDocumentListener(DL);
            
        //
            A.addWindowListener(WL);
            A.addWindowStateListener(WSL);
            A.addWindowFocusListener(WFL);
    }
    
}