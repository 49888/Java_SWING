package FormasGeometricas;

import java.awt.*;

import javax.swing.*;

import java.io.*;
import javax.imageio.ImageIO;

import java.awt.geom.*;


public class Graphics2D_Ej1 {
    
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
            
            Graphics2D G2 = (Graphics2D)G;
            
            //Definir el Origen a partir del cual se comienza a pintar
                //G2.translate(100, 10); //por defecto (0, 0)
                
            //Definir Color con el Pintar
                G2.setPaint(Color.RED);
                
            //Definir Fuente
                G2.setFont(new Font("Consolas", Font.PLAIN, 18));
            
                
            //G2.rotate(90*Math.PI/180); 
            
            G2.rotate(90*Math.PI/180, 150, 150);
            
            
            //Rectangulo(G2);
            
            RectanguloRedondeado(G2);
            
            //LineaRecta(G2);
            
            //Arcos(G2);
            
            //curva(G2);
            
            //Circunferencia(G2);
            
            //Elipse(G2);

            //Texto(G2);
            
            //Imagenes(G2);
            
            
        }
  
     //Fin de Clase Panel
    }
    
    //RECTANGULOS ------------------------------------------------------------------------------------------------
    private static void Rectangulo(Graphics2D G2){
         
        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);

            Dimension D = new Dimension(100, 200);

        
            
        Rectangle2D rectangulo = new Rectangle2D.Double();
        
        //Definimos el Rectangulo
            rectangulo.setRect(A.getX(), A.getY(), D.width, D.height);
        
        
        //Dibujar el Contorno
            G2.draw(rectangulo); 
        
        //Dibujar el Interior
            //G2.fill(rectangulo);
        
        
        //Mostrar Centro --------------------------------------
            Rectangle2D centro = new Rectangle2D.Double(rectangulo.getCenterX(), rectangulo.getCenterY(), 1, 1);
            G2.draw(centro);
    }
    
    private static void RectanguloRedondeado(Graphics2D G2){
        
        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);

            Dimension D = new Dimension(100, 200);

            int arcHorizontal = 100, arcVertical = 30;
        
            
        RoundRectangle2D rectangulo = new RoundRectangle2D.Double();
        
        //Definimos el Rectangulos
            rectangulo.setRoundRect(A.getX(), A.getY(), D.width, D.height, arcHorizontal, arcVertical);
        
        
        //Dibujar el Contorno
            G2.draw(rectangulo); 
        
        //Dibujar el Interior
            //G2.fill(rectangulo);
        
        
        //Mostrar Marco --------------------------------------
            Rectangle2D marco = rectangulo.getBounds2D();
            G2.draw(marco);

        //Mostrar Centro --------------------------------------
            Rectangle2D centro = new Rectangle2D.Double(rectangulo.getCenterX(), rectangulo.getCenterY(), 1, 1);
            G2.draw(centro);
    }
    
    
    //LINEAS RECTAS ------------------------------------------------------------------------------------------------
    private static void LineaRecta(Graphics2D G2){

        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);

            Point2D B = new Point2D.Double(100, 100);
                
   
        Line2D linea = new Line2D.Double();
        
        //Definimos la Linea
            //linea.setLine(A.getX(), A.getY(), B.getX(), B.getY());

            linea.setLine(A, B);
        

        //Dibujar el Contorno
            G2.draw(linea); 
        
        //Dibujar el Interior
            //G2.fill(linea);
        
        
        //Mostrar Marco --------------------------------------
            Rectangle2D marco = linea.getBounds2D();
            G2.draw(marco);
    }

    
    //ARCOS Y CURVAS -----------------------------------------------------------------------------------------------
    private static void Arcos(Graphics2D G2){

        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);
            
            Dimension D = new Dimension(200, 200);

            //Angulos en grados
                int anguloInicio = 90;//Angulo a partir del que se empieza a dibujar 

                int anguloArco = 180;//Angulo del arco, 360 = Circunferencia
                
            int tipo = Arc2D.OPEN; tipo = Arc2D.CHORD; tipo = Arc2D.PIE;
        
            
        Arc2D arco = new Arc2D.Double();    
            
        //Definimos el Arco
            arco.setArc(A, D, anguloInicio, anguloArco, tipo);
        
        
        //Dibujar el Contorno
            G2.draw(arco); 
        
        //Dibujar el Interior
            //G2.fill(arco);
        
        
        //Mostrar Marco --------------------------------------
            Rectangle2D marco = arco.getBounds2D();
            G2.draw(marco);
    }
    
    private static void curva(Graphics2D G2){

        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);
            
            Point2D B = new Point2D.Double(45, 70);
            
            Point2D C = new Point2D.Double(100, 10);

        
        QuadCurve2D curva = new QuadCurve2D.Double();
        
        //Definimos la Curva
            curva.setCurve(A, B, C);
        
        
        //Dibujar el Contorno
            G2.draw(curva); 
        
        //Dibujar el Interior
            //G2.fill(curva);
        
        
        
        //Mostrar Marco --------------------------------------
            Rectangle2D marco = curva.getBounds2D();
            G2.draw(marco);
    }
    

    //OVALOS -------------------------------------------------------------------------------------------------------
    private static void Circunferencia(Graphics2D G2){

        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);

            double Radio = 100;
        
        
        //Definimos la Circunferencia
        Ellipse2D ovalo = new Ellipse2D.Double(A.getX(), A.getY(), Radio*2, Radio*2);
        
        
        //Dibujar el Contorno
            G2.draw(ovalo); 
        
        //Dibujar el Interior
            //G2.fill(ovalo);
        
        
        //Mostrar Marco --------------------------------------
            Rectangle2D marco = ovalo.getBounds2D();
            G2.draw(marco);
        
        //Mostrar Centro --------------------------------------
            Rectangle2D centro = new Rectangle2D.Double(ovalo.getCenterX(), ovalo.getCenterY(), 1, 1);
            G2.draw(centro);
    }

    private static void Elipse(Graphics2D G2){

        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);

            double RadioX = 100; double RadioY = 50;

            
        //Definimos la Elipse
        Ellipse2D ovalo = new Ellipse2D.Double(A.getX(), A.getY(), RadioX*2, RadioY*2);
        
        //Dibujar el Contorno
            G2.draw(ovalo); 
        
        //Dibujar el Interior
            //G2.fill(ovalo);
        
            
        //Mostrar Marco --------------------------------------
            Rectangle2D marco = ovalo.getBounds2D();
            G2.draw(marco);
        
        //Mostrar Centro --------------------------------------
            Rectangle2D centro = new Rectangle2D.Double(ovalo.getCenterX(), ovalo.getCenterY(), 1, 1);
            G2.draw(centro);
    }
    
    
    //TEXTO --------------------------------------------------------------------------------------------------------
    private static void Texto(Graphics2D G2){

        //PARAMETROS
            Point A = new Point(10, 20);

            String cadena = "Milagros Te amo";

        //Dibujamos la Cadena de texto    
            G2.drawString(cadena, A.x, A.y);
    }
    

    //IMAGENES -----------------------------------------------------------------------------------------------------
    private static void Imagenes(Graphics2D G2){
    
        //PARAMETROS
            Point A = new Point(10, 10);

            Image imagen = leerImagen("Iconos/Image/emma stone.jpg");

            Dimension D = new Dimension(100, 100);
        

        //Dibujamos la Imagen
            G2.drawImage(imagen, null, null);
    }
 
    
    //---------------------------------------------- Leer una Imagen -----------------------------------------------
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
