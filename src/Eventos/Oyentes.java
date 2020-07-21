
package Eventos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Oyentes {
    
    
    
    
    
    FocusAdapter Foco = new FocusAdapter(){};
    
    //EVENTOS DE FOCO
        
        FocusListener FL = new FocusListener(){
            
            @Override
            public void focusGained(FocusEvent fe) {}

            @Override
            public void focusLost(FocusEvent fe) {}
        };
    
    //EVENTOS DE TECLADO
    
        KeyListener KL = new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent ke){}

            @Override
            public void keyPressed(KeyEvent ke) {}

            @Override
            public void keyReleased(KeyEvent ke) {}
        };
        
        //CLASE ADAPTADORA
            KeyAdapter Teclado = new KeyAdapter(){};
        
    //EVENTOS DE MOUSE
        
        MouseListener ML = new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent me){}

            @Override
            public void mousePressed(MouseEvent me){}

            @Override
            public void mouseReleased(MouseEvent me){}

            @Override
            public void mouseEntered(MouseEvent me){}

            @Override
            public void mouseExited(MouseEvent me){}
        };
        
        MouseMotionListener MML = new MouseMotionListener(){
            
            @Override
            public void mouseDragged(MouseEvent me){}

            @Override
            public void mouseMoved(MouseEvent me){}
        };
    
        MouseWheelListener MWL = new MouseWheelListener(){
            
            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe){}
        };
    
        //CLASE ADAPTADORA
            MouseAdapter Mouse = new MouseAdapter(){};
    
   
    //AbstractButton ------------------------------------------------------------------------------------------------
        ActionListener AL = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){}
        };

        ChangeListener CL = new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent ce){}
        };

        ItemListener IL = new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent ie){}
        };
    
    //JPopupMenu ----------------------------------------------------------------------------------------------------
        MenuKeyListener MKL = new MenuKeyListener(){
            @Override
            public void menuKeyTyped(MenuKeyEvent mke){}

            @Override
            public void menuKeyPressed(MenuKeyEvent mke){}

            @Override
            public void menuKeyReleased(MenuKeyEvent mke){}
        };

        PopupMenuListener PML = new PopupMenuListener(){

            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent pme){}

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent pme){}

            @Override
            public void popupMenuCanceled(PopupMenuEvent pme){}
        };
    
    // ------------------------------------------------------------------------------------------------
        DocumentListener DL = new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent de){}

            @Override
            public void removeUpdate(DocumentEvent de){}

            @Override
            public void changedUpdate(DocumentEvent de){}
        };
    
    
    //EVENTOS DE VENTANAS ------------------------------------------------------------------------------------------
    
        WindowListener WL = new WindowListener(){
            
            @Override
            public void windowOpened(WindowEvent we){}

            @Override
            public void windowClosing(WindowEvent we){}

            @Override
            public void windowClosed(WindowEvent we){}

            @Override
            public void windowIconified(WindowEvent we){}

            @Override
            public void windowDeiconified(WindowEvent we){}

            @Override
            public void windowActivated(WindowEvent we){}

            @Override
            public void windowDeactivated(WindowEvent we){}
        };
        
        WindowStateListener WSL = new WindowStateListener(){
            
            @Override
            public void windowStateChanged(WindowEvent we){}
        };
        
        WindowFocusListener WFL = new WindowFocusListener(){
            
            @Override
            public void windowGainedFocus(WindowEvent we){}

            @Override
            public void windowLostFocus(WindowEvent we) {}
        };
    
    
 //Fin de Clase   
}
