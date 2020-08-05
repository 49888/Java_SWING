
package FormasGeometricas;

import java.awt.*;
import javax.swing.*;

import java.io.*;
import javax.imageio.ImageIO;


public class Graphics_Ej1 {
    
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
    }
    
    //PANEL ---------------------------------------------------------------------------------------------------------
    private static class Panel extends JPanel{

     
        @Override
        protected void paintComponent(Graphics G) {
            
            super.paintComponent(G);  
            
            //Definir el Origen a partir del cual se comienza a pintar
            
                //G.translate(100, 10); //por defecto (0, 0)
                
            //Definir Color
                G.setColor(Color.RED);
                
            //Definir Fuente
                G.setFont(new Font("Consolas", Font.PLAIN, 18));
                
                
                
            //Dibuja un Rectangulo    
                //Rectangulo(G); 

                //RectanguloRedondeado(G);
            

            //Dibujar Lineas
                //LineaRecta(G);

                //Linea(G);
                
            //Arcos
                Arcos(G);
            
            //Dibujar Poligonos
            
                //Triangulo(G);
                
                //Pentagono(G);

            //Dibujar Ovalos
            
                //Circunferencia(G);
    
                //Elipse(G);

            //Texto
            
                //Texto(G);
            
            //Imagenes  
            
                Imagenes(G);
                
                ImagenesSinFondo(G);
        }
  
     //Fin de Clase Panel
    }
    
    //RECTANGULOS ------------------------------------------------------------------------------------------------
    
    private static void Rectangulo(Graphics G){
         
        //PARAMETROS
            Point A = new Point(10, 10);

            Dimension D = new Dimension(100, 200);

            
        G.drawRect(A.x, A.y, D.width, D.height); 
        
        G.fillRect(A.x, A.y, D.width, D.height);
    }
    
    private static void RectanguloRedondeado(Graphics G){
        
        //PARAMETROS
            Point A = new Point(10, 10);

            Dimension D = new Dimension(100, 200);

            int arcHorizontal = 100, arcVertical = 30;
        
        
        //G.drawRoundRect(A.x, A.y, D.width, D.height, arcHorizontal, arcVertical);
        
        G.fillRoundRect(A.x, A.y, D.width, D.height, arcHorizontal, arcVertical);
    }
    
    
    //LINEAS RECTAS ------------------------------------------------------------------------------------------------
    
    private static void LineaRecta(Graphics G){

        //PARAMETROS
            Point A = new Point(10, 10);

            Point B = new Point(100, 100);

            
        G.drawLine(A.x, A.y, B.x, B.y); 
    }
    
    private static void Linea(Graphics G){

        //PARAMETROS
            Point A = new Point(200, 50);

            Point B = new Point(100, 150);

            Point C = new Point(150, 250);

            Point D = new Point(250, 250);

            Point E = new Point(300, 150);


            int[] X = {A.x, B.x, C.x, D.x, E.x};
            int[] Y = {A.y, B.y, C.y, D.y, E.y};

            
        G.drawPolyline(X, Y, 5);
    }
    
    
    //ARCOS -------------------------------------------------------------------------------------------------------

    private static void Arcos(Graphics G){

        //PARAMETROS
            Point A = new Point(10, 10);
            
            Dimension D = new Dimension(200, 200);

            //Angulos en grados
            
                int anguloInicio = 90;//Angulo a partir del que se empieza a dibujar 

                int anguloArco = 180;//Angulo del arco, 360 = Circunferencia
            
        
        //G.drawArc(A.x, A.y, D.width, D.height, anguloInicio, anguloArco);
        
        G.fillArc(A.x, A.y, D.width, D.height, anguloInicio, anguloArco);
    }
    
    //POLIGONOS --------------------------------------------------------------------------------------------------- 
    
    private static void Triangulo(Graphics G){

        //PARAMETROS
            Point A = new Point(200, 50);

            Point B = new Point(100, 150);

            Point C = new Point(300, 150);

            int[] X = {A.x, B.x, C.x};
            int[] Y = {A.y, B.y, C.y};

            
        G.drawPolygon(X, Y, 3);
        
        G.fillPolygon(X, Y, 3);
    }
    
    private static void Pentagono(Graphics G){

        //PARAMETROS
            Point A = new Point(200, 50);

            Point B = new Point(100, 150);

            Point C = new Point(150, 250);

            Point D = new Point(250, 250);

            Point E = new Point(300, 150);


            int[] X = {A.x, B.x, C.x, D.x, E.x};
            int[] Y = {A.y, B.y, C.y, D.y, E.y};

        G.drawPolygon(X, Y, 5);
        
        G.fillPolygon(X, Y, 5);
    }
    
    
    //OVALOS -------------------------------------------------------------------------------------------------------
    
    private static void Circunferencia(Graphics G){

        Point A = new Point(10, 10);

        int Radio = 100;

        G.drawOval(A.x, A.y, Radio*2, Radio*2);
        
        G.fillOval(A.x, A.y, Radio*2, Radio*2);
    }

    private static void Elipse(Graphics G){

        Point A = new Point(10, 10);

        int RadioX = 100;

        int RadioY = 50;


        G.drawOval(A.x, A.y, RadioX*2, RadioY*2);
        
        G.fillOval(A.x, A.y, RadioX*2, RadioY*2);
    }
    
    
    //TEXTO --------------------------------------------------------------------------------------------------------
    
    private static void Texto(Graphics G){

        Point A = new Point(10, 20);

        String cadena = "Milagros Te amo";


        G.drawString(cadena, A.x, A.y);
    }
    

    //IMAGENES -----------------------------------------------------------------------------------------------------
    
    private static void Imagenes(Graphics G){
    
        //PARAMETROS
            Point A = new Point(10, 10);

            Image imagen = leerImagen("Iconos/Image/emma stone.jpg");

            Dimension D = new Dimension(100, 100);
        
        
        //G.drawImage(imagen, A.x, A.y, null);
        
        G.drawImage(imagen, A.x, A.y, D.width, D.height, null);
    }
    
    private static void ImagenesSinFondo(Graphics G){
    
        //PARAMETROS
            Point A = new Point(10, 10);

            Image imagen = leerImagen("Iconos/512x512/java.png");

            Dimension D = new Dimension(256, 256);

            Color colorFondo = Color.BLUE;
        
        
        //G.drawImage(imagen, A.x, A.y, Color.BLUE, null);
        
        G.drawImage(imagen, A.x, A.y, D.width, D.height, colorFondo, null);  
    }
    
    private static void Imagenes2(Graphics G){
    
        Point A = new Point(10, 10);
        Point B = new Point(100, 10);
        Point C = new Point(10, 300);
        Point D = new Point(100, 300);
        
        Image imagen = leerImagen("Iconos/Image/emma stone.jpg");
        
        G.drawImage(imagen, A.x, A.y, B.x, B.y, C.x, C.y, D.x, D.y, null);
    }
    
    private static Image leerImagen(String dir){
        
        File ruta = new File(dir);
        
        Image imagen = null;
        
        try {
            
            imagen = ImageIO.read(ruta);
         //    
        } catch (IOException ex) {
            
            System.out.println( ex.getMessage() );
        }
    
        return(imagen);
    }
    
 //Fin de Clase 
}
