/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Nada
 */
public class Do {
    private ArrayList<Shape> shapes;
    private int t;

    public Do(int t) {
        shapes=new ArrayList<>();
        this.t = t;
    }

    public ArrayList<Shape> getS() {
        return shapes;
    }

    public void setS(ArrayList<Shape> s) {
        this.shapes = s;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    public void addShape(Shape s)
    {
        shapes.add(s);
    }
    @Override
    public String toString() {
        String shapeName = "";
        if (shapes.get(0) instanceof Line) {
            shapeName = shapeName + " Line";
        } else if (shapes.get(0) instanceof Rectangle) {
            shapeName = shapeName + " Rectangle ";
        } else if (shapes.get(0) instanceof Circle) {
            shapeName = shapeName + " Circle";
        }
        else if (shapes.get(0) instanceof Square) {
            shapeName = shapeName + " Square ";
        } 
        else if (shapes.get(0) instanceof Ellipse) {
            shapeName = shapeName + " Ellipse";
        }
        else if (shapes.get(0) instanceof Triangle) {
            shapeName = shapeName + " Triangle";
        }
        String s = "";
        if (t == 0) {
            s = "Drew " + shapeName;
        } else if (t == 1) {
            if (shapes.size() > 1) {
                s = "Cleared all  ";
            } else {
                s = "Deleted " + shapeName;;
            }
        }
        return s;
    }
}
