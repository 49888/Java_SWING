
package Componentes.Cuadros_Dialogo;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class JOptionPane_1 {
    
    public static void main(String[] args) {
        
        JOptionPane A = new JOptionPane();
        
        A.setMessage("Milagros Molinas");
        A.setMessageType(JOptionPane.ERROR_MESSAGE);
        A.setSize(200, 200);
        
        
        A.setVisible(true);
        //A.createDialog("Majo"); 
        
        JDialog dialogo = new JDialog(); 
    }
    
}
