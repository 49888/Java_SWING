/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimentos;

import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author 1812
 */
public class NewClass1 {
    
    private static void curva(Graphics2D G2){

        //PARAMETROS
            Point2D A = new Point2D.Double(10, 10);
            
            Point2D B = new Point2D.Double(45, 70);
            
            Point2D C = new Point2D.Double(100, 10);

            
                
            int tipo = Arc2D.OPEN; 
            tipo = Arc2D.CHORD;
            tipo = Arc2D.PIE;
            
        
        QuadCurve2D curva = new QuadCurve2D.Double();
        
        //curva.setCurve(A, B, C);
        
        Point2D[] parabola = parabola();
        System.out.println(parabola.length);
        
        
        G2.translate(200, 10);
        for(int i = 0; i < parabola.length; i++){
        
            curva.setCurve(parabola, i);
            G2.draw(curva);
        }
        
           
        
    }
    
    private static Point2D[] parabola(){
    
        Point2D[] parabola = new Point2D[8];
        
        int x = -5;
        
        for(int i = 0; i < parabola.length; i++){
        
            parabola[i] = new Point2D.Double(x*10, Math.pow(x, 2)*10);
            x++;
        }
        
        return(parabola);
    }
    
}
