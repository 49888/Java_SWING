package Componentes.Cuadros_Dialogo;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class Ventana extends JFrame {
    
    public Ventana(){

        this.setBounds(200, 150, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 70));

        this.add(new JButton("Boton 1"));
        this.add(new JButton("Boton 2"));
        this.add(new JButton("Boton 3"));

        this.setVisible(true);
    }

 //Fin de Clase Ventana
}