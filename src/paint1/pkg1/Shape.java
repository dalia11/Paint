/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author Nada
 */
public abstract class Shape implements Strategy,Cloneable{
    protected Color  c;
    protected boolean fill;
    protected boolean rotate;
    protected boolean selected ;
    protected Color filling;
    protected float degree;

    public Color getFilling() {
        return filling;
    }

    public void setFilling(Color filling) {
        this.filling = filling;
    }
    
   // public abstract void resize(Point A, Point B);
    
        
    
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public boolean isRotate() {
        return rotate;
    }

    public void setRotate(boolean rotate) {
        this.rotate = rotate;
    }

    /**
     *
     */
    protected Point st;

    public Shape(Color c, boolean fill, Point st) {
        this.c = c;
        this.fill = fill;
        this.st = st;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public Point getSt() {
        return st;
    }

    public void setSt(Point st) {
        this.st = st;
    }
    
    public abstract boolean inShape(int x,int y);
    
        
    
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }   
    
}
