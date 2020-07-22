
package Eventos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Oyentes {

    FocusAdapter Foco = new FocusAdapter(){};
    
    //EVENTOS DE FOCO COMPONENTES ----------------------------------------------------------------------------------- 
    //Objetos que implementan la Interfaz: FocusListener
    
    protected FocusListener FL = new FocusListener(){

        @Override
        public void focusGained(FocusEvent e){}
        //Se ejecuta Cuando el Componente gana el Foco

        @Override
        public void focusLost(FocusEvent e){}
        //Se ejecuta Cuando el Componente pierde el Foco
    };
    
    //EVENTOS DE TECLADO --------------------------------------------------------------------------------------------
    //Objetos que implementan la Interfaz: KeyListener
    
    protected KeyListener KL = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e){}

        @Override
        public void keyPressed(KeyEvent e){}
        //Se ejecuta mientras presinas una Tecla

        @Override
        public void keyReleased(KeyEvent e){}
        //Se ejecuta cuando dejas de presionar una Tecla
    };

    //CLASE ADAPTADORA
        private KeyAdapter Teclado = new KeyAdapter(){};
    
            
    //EVENTOS DE MOUSE ---------------------------------------------------------------------------------------------- 
    //Objetos que implementan la Interfaz: MouseListener - MouseMotionListener - MouseWheelListener
        
    protected MouseListener ML = new MouseListener(){

        @Override
        public void mouseClicked(MouseEvent e){}

        @Override
        public void mousePressed(MouseEvent e){}
        //Mientras presionemos un Boton

        @Override
        public void mouseReleased(MouseEvent e){}
        //Cuando dejamos de presionar un Boton

        @Override
        public void mouseEntered(MouseEvent e){}
        //Cuando el Cursor esta sobre el Componente

        @Override
        public void mouseExited(MouseEvent e){}
        //Cuando el Cursor sale del Componente
    };
        
        protected MouseMotionListener MML = new MouseMotionListener(){
            
            @Override
            public void mouseDragged(MouseEvent e){}
            //Cuando mantenemos presinado un Boton y nos movemos sobre el Componente

            @Override
            public void mouseMoved(MouseEvent e){}
            //Cuando movemos el Cursor sobre el Componente
        };
    
        protected MouseWheelListener MWL = new MouseWheelListener(){
            
            @Override
            public void mouseWheelMoved(MouseWheelEvent e){}
            //Cuando hacemos girar la Ruedita del Mouse
        };
    
        //CLASE ADAPTADORA
            private MouseAdapter Mouse = new MouseAdapter(){};
    
   
    //AbstractButton ------------------------------------------------------------------------------------------------
        protected ActionListener AL = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){}
        };

        protected ChangeListener CL = new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e){}
        };

        protected ItemListener IL = new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e){}
        };
    
    //JPopupMenu ----------------------------------------------------------------------------------------------------
        protected MenuKeyListener MKL = new MenuKeyListener(){
            @Override
            public void menuKeyTyped(MenuKeyEvent mke){}

            @Override
            public void menuKeyPressed(MenuKeyEvent mke){}

            @Override
            public void menuKeyReleased(MenuKeyEvent mke){}
        };

        protected PopupMenuListener PML = new PopupMenuListener(){

            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent pme){}

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent pme){}

            @Override
            public void popupMenuCanceled(PopupMenuEvent pme){}
        };
    
    // ------------------------------------------------------------------------------------------------
        protected DocumentListener DL = new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent de){}

            @Override
            public void removeUpdate(DocumentEvent de){}

            @Override
            public void changedUpdate(DocumentEvent de){}
        };
    
    
    //EVENTOS DE VENTANAS ------------------------------------------------------------------------------------------
    
        protected WindowListener WL = new WindowListener(){
            
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
        
        protected WindowStateListener WSL = new WindowStateListener(){
            
            @Override
            public void windowStateChanged(WindowEvent we){}
        };
        
        protected WindowFocusListener WFL = new WindowFocusListener(){
            
            @Override
            public void windowGainedFocus(WindowEvent we){}

            @Override
            public void windowLostFocus(WindowEvent we) {}
        };
    
    
 //Fin de Clase   
}
