/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Toka
 */
public class Ellipse extends Shape {
    
   
    private  int hieght,  width;

    public Ellipse(int hieght, int width, Color c, boolean fill, Point st) {
        super(c, fill, st);
    }

   public Ellipse() {
       
        super(null, false, null);
        

    }

    public int getHieght() {
        return hieght;
    }

    public void setHieght(int hieght) {
        this.hieght = hieght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean inShape(int x, int y) {
        
       Ellipse2D ellp=new Ellipse2D.Float(st.getX(), st.getY(), width, hieght);
       if(ellp.contains(x,y))
           return true;
       else
           return false;
               
               
               
    }
//    public boolean inShape(int x, int y) {
//       Rectangle2D rect=new Rectangle2D.Float(st.getX(), st.getY(), width, hieght);
//       if(rect.contains(x,y))
//           return true;
//       else
//           return false;
//               
//               
//               
//    }
    
    public boolean containuleft(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX() - 4, st.getY() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean containuright(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX()+getWidth() - 4, st.getY() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean containlleft(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX() - 4, st.getY()+getHieght() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean containlright(int x, int y) {
        Rectangle2D r = new Rectangle2D.Float(st.getX()+getWidth() - 4, st.getY()+getHieght() - 4, 8, 8);
        if (r.contains(x, y)) {
            return true;
        } else {
            return false;
        }

    }

    @Override

    
 

public void resize(Point A, Point B) {
       
       if (containuleft(A.getX(),A.getY()))
       {   st=B;
           width=width+A.getX()-B.getX();
           hieght=hieght+A.getY()-B.getY();
       }
       else if (containlleft(A.getX(),A.getY()))
       {   
            st.setX(st.getX()+B.getX()-A.getX());
           width=width+A.getX()-B.getX();
           hieght=hieght+B.getY()-A.getY();
       }
        else if (containlright(A.getX(),A.getY()))
       {  width=width+B.getX()-A.getX();
          hieght=hieght+B.getY()-A.getY();
       }
        else if (containuright(A.getX(),A.getY()))
       { 
           
           st.setY(st.getY()+B.getY()-A.getY());
          width=width+B.getX()-A.getX();
          hieght=hieght+A.getY()-B.getY();
          
       }
    }


    
    }

    

    
    

    
    
    
   
    

