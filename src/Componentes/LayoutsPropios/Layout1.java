
package Componentes.LayoutsPropios;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Point;


public class Layout1 implements LayoutManager {
    
    Point p;//Punto a partir del cual empezar a colocar los componentes
    
    int distH;//Distancia Horizontal entre Compontenes
    
    int distV;//Distancia Vertical entre Compontenes
    
    int cantLine;//Cantidad de Componentes por linea

    public Layout1(int x, int y, int distH, int distV){
        
        this.p = new Point(x, y);
        this.distH = distH;
        this.distV = distV;
    }
    
    public Layout1(Point p, int distH, int distV){
        
        this.p = p;
        this.distH = distH;
        this.distV = distV;
    }
    
    public Layout1(){
        
        this.p = new Point(0, 0);
        this.distH = 5;
        this.distV = 5;
        this.cantLine = 3;
    }
    
    
    
    
    @Override
    public void addLayoutComponent(String string, Component cmpnt){}

    @Override
    public void removeLayoutComponent(Component cmpnt){}

    @Override
    public Dimension preferredLayoutSize(Container cntnr){
        throw new UnsupportedOperationException("No establecido aun...");
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr){
        throw new UnsupportedOperationException("No establecido aun..."); 
    }

    
    @Override
    public void layoutContainer(Container contenedor){

        int cantComponentes = contenedor.getComponentCount();
        
        

        Component A;
        Dimension tamaño; 

        int X = p.x; int Y = p.y;

        int cont = 0;
        

        /*for(int i = 0; i < cantComponentes; i++){

            A = contenedor.getComponent(i);

            tamaño = A.getPreferredSize();

            A.setSize(tamaño);

            A.setLocation(X, Y);

            cont++;

            X = X + tamaño.width + distH;

            if( cont == cantLine){

                Y = Y + tamaño.height + distV;
                X = p.x;
                cont = 0;
            }
        }//*/
        
        int ancho = contenedor.getWidth(); //System.out.println(ancho);
        
        int centerX = ancho/2; //System.out.println(centerX);
        
        int centerComp = 0;
        
        Component B;
        
        Dimension tamaño2;
        
        for(int i = 0; i < cantComponentes; i++){
            
            //Obtenemos el Componente
            A = contenedor.getComponent(i);

            //Obtenemos su Tmaño predeterminado
            tamaño = A.getPreferredSize();

            //Establecemos su tamaño
            A.setSize(tamaño);
            
            centerComp = centerComp + tamaño.width; 
            
            X = centerX - (centerComp/2);

            for(int j = 0; j < cont; j++){
                
                //Obtenemos el Componente
                B = contenedor.getComponent(j);
                
                //Establecemos su posicion
                B.setLocation(X, Y);
                
                //Obtenemos su Tmaño predeterminado
                tamaño2 = B.getPreferredSize();

                //Establecemos su tamaño
                B.setSize(tamaño2);
            
                X = X + tamaño2.width + distH; 
            }


            //Establecemos su posicion
            A.setLocation(X, Y);

            //X = X + tamaño.width + distH;
            
            centerComp = centerComp + distH;
            
            cont++;
        }//*/
        
    }
    
 //Fin de Clase
}
