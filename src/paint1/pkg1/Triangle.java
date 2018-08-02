/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Toka
 */
public class Triangle extends Shape {
    
   
    Point p3,p2 ;
    
    public Triangle( Color c, boolean fill, Point st) {
        super(c, fill, st);
        
    }

     public Triangle() {
        super(null, false, null);
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public boolean inShape(int x, int y) {
        Polygon tri=new Polygon();
       //Rectangle2D rect=new Rectangle2D.Float(st.getX(), st.getY(), width, hieght);
       tri.addPoint(st.getX(), st.getY());
        tri.addPoint(p2.getX(), p2.getY());
         tri.addPoint(p3.getX(), p3.getY());
       if(tri.contains(x,y))
           return true;
       else
           return false;
               
               
               
    }

    
    
     
    public boolean containuleft(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX() - 4, st.getY() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean containuright(int x, int y) {
        
            return false;

    }

    public boolean containlleft(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(p3.getX() - 4, p3.getY() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean containlright(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(p2.getX() - 4, p2.getY() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }
    @Override
    public void resize(Point A, Point B) {
        if (containuleft(A.getX(),A.getY()))
       {  
           st.setX(st.getX()+B.getX() - A.getX());
           st.setY(st.getY()+B.getY() - A.getY());
       
           
       }
       else if (containlleft(A.getX(),A.getY()))
       {   
            p3.setX(p3.getX()+B.getX() - A.getX());
           p3.setY(p3.getY()+B.getY() - A.getY());
       
           
       }
        else if (containlright(A.getX(),A.getY()))
       {  
            p2.setX(p2.getX()+B.getX() - A.getX());
           p2.setY(p2.getY()+B.getY() - A.getY());
           
       }
       
        
    }
    }
    
    

