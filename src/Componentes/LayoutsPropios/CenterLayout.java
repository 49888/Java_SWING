
package Componentes.LayoutsPropios;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.SwingConstants;


public class CenterLayout implements LayoutManager {
    
    int dist;//Distancia Vertical entre Compontenes
    int centerX;
    int centerY;
    int align;

    //CONSTRUCTORES
    public CenterLayout(int align) {
        
        this.dist = 5;
        this.align = align;
    }
    
    public CenterLayout(int align, int distV) {
        
        this.dist = distV;
        this.align = align;
    }

    public CenterLayout(){
        
        this.dist = 5; this.align = SwingConstants.HORIZONTAL;
    }
    
    
    @Override
    public void addLayoutComponent(String string, Component cmpnt){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeLayoutComponent(Component cmpnt){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension preferredLayoutSize(Container cntnr){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void layoutContainer(Container contenedor){
        
        //Cantidad de Componentes
        int cantComponentes = contenedor.getComponentCount();
        
        //Dimensiones del Contenedor
        Dimension Size = contenedor.getSize(); 
        
        //Punto Central del Contenedor
        centerX = Size.width/2;     centerY = Size.height/2; 
        
        
        switch(align){
        
            case SwingConstants.VERTICAL:
                
                Vertical(contenedor, cantComponentes);
                break;
                
            case SwingConstants.HORIZONTAL:
                
                Horizontal(contenedor, cantComponentes);
                break;
        }
         
    }
    
    private void Vertical(Container Contenedor, int cant){
    
        //Componente actual
            Component A;    Dimension tamaño;
       
        //Componente AUX    
            Component AUX;  Dimension tamaño2;

        int anchoComp = 0;//Ancho que ocupan todos los Componentes
        int altoComp = 0;//Alto que ocupan todos los Componentes

        int X = 0, Y = 0;
          
        for(int i = 0; i < cant; i++){
            
            //Obtenemos el Componente actual
                A = Contenedor.getComponent(i);

            //Obtenemos su Tamaño predeterminado
                tamaño = A.getPreferredSize();

            //Establecemos su tamaño
                A.setSize(tamaño);
            
            
            anchoComp = tamaño.width;
            
            altoComp = altoComp + tamaño.height;
            
            
            //Defimos el la X del Punto inicial 
                X = centerX - (anchoComp/2);

                Y = centerY - (altoComp/2);

            //Reubicamos todos los anteriores
            for(int j = 0; j < i; j++){
                
                AUX = Contenedor.getComponent(j);
                
                AUX.setLocation(X, Y);
                
                tamaño2 = AUX.getPreferredSize();

                Y = Y + tamaño2.height + dist;
            }

            //Ubicamos el Componente Actual
                A.setLocation(X, Y);

            
            altoComp = altoComp + dist;
        } 
    }
    
    private void Horizontal(Container Contenedor, int cant){
        
        //Componente actual
            Component A;    Dimension tamaño;
       
        //Componente AUX    
            Component AUX;  Dimension tamaño2;

        int anchoComp = 0;//Ancho que ocupan todos los Componentes
        int altoComp = 0;//Alto que ocupan todos los Componentes

        int X = 0, Y = 0;
        
        for(int i = 0; i < cant; i++){
            
            //Obtenemos el Componente actual
                A = Contenedor.getComponent(i);

            //Obtenemos su Tamaño predeterminado
                tamaño = A.getPreferredSize();

            //Establecemos su tamaño
                A.setSize(tamaño);
            
            
            anchoComp = anchoComp + tamaño.width;
            
            altoComp = tamaño.height;
            
            
            //Defimos el la X del Punto inicial 
                X = centerX - (anchoComp/2);

                Y = centerY - (altoComp/2);

            //Reubicamos todos los anteriores
            for(int j = 0; j < i; j++){
                
                AUX = Contenedor.getComponent(j);
                
                AUX.setLocation(X, Y);
                
                tamaño2 = AUX.getPreferredSize();

                X = X + tamaño2.width + dist; 
            }

            //Ubicamos el Componente Actual
                A.setLocation(X, Y);

            
            anchoComp = anchoComp + dist;
        }
    }
    
    
    
  

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getAlign() {
        return align;
    }

    public void setAlign(int align) {
        this.align = align;
    }
    
 //Fin de Clase CenterLayout
}
