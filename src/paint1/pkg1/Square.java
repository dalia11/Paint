/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Toka
 */
public class Square extends Rectangle {

    public Square(int hieght, int width, Color c, boolean fill, Point st) {
        super(hieght, width, c, fill, st);
    }

    Square() {
        
    }
    
 public boolean inShape(int x, int y) {
       Rectangle2D rect=new Rectangle2D.Float(st.getX(), st.getY(), width, hieght);
       if(rect.contains(x,y))
           return true;
       else
           return false;
               
               
               
    }
    
    public boolean UpperLeft(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX() - 4, st.getY() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean UpperRight(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX()+getWidth() - 4, st.getY() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean LowerLeft(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX() - 4, st.getY()+getHieght() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean LowerRight(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX()+getWidth() - 4, st.getY()+getHieght() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void resize(Point A, Point B) {
       
       if (UpperLeft(A.getX(),A.getY()))
       {   st=B;
           width=width+A.getX()-B.getX();
           hieght=hieght+A.getY()-B.getY();
       }
       else if (LowerLeft(A.getX(),A.getY()))
       {   B.setY(B.getY()+hieght);
           st=B;
           width=width+A.getX()-B.getX();
           hieght=A.getY()+B.getY();
       }
        else if (LowerRight(A.getX(),A.getY()))
       {  width=width+B.getX()-A.getX();
          hieght=hieght+B.getY()-A.getY();
       }
        else if (UpperRight(A.getX(),A.getY()))
       { 
           //B.setX(A.getX()-st.getX()-B.getX());
           //st.setX(B.getX()-st.getX());
           
          width=width+B.getX()-A.getX();
          hieght=hieght+B.getY()-A.getY();
          
       }
    }
}

