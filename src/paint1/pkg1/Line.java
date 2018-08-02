/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Nada
 */
public class Line extends Shape {

    private Point two;

    public Line() {
        super(null, false, null);
    }

    public Line(Point two, Color c, boolean fill, Point st) {
        super(c, fill, st);
        this.two = two;
    }

    public Point getTwo() {
        return two;
    }

    public void setTwo(Point two) {
        this.two = two;
    }

    @Override
    public boolean inShape(int x, int y) {
        Line2D l = new Line2D.Float(st.getX(), st.getY(), two.getX(), two.getY());
        double dist = l.ptLineDist(x, y);
        if (dist <= 2) {
            return true;
        } else {
            return false;
        }

    }

    public boolean containLeft(int x, int y) {
        Rectangle2D l = new Rectangle2D.Float(st.getX() - 4, st.getY() - 4, 8, 8);

        if (l.contains(x, y)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean containright(int x, int y) {
        Rectangle2D l = new Rectangle2D.Float(two.getX() - 4, two.getY() - 4, 8, 8);

        if (l.contains(x, y)) {
            return true;
        } else {
            return false;
        }
    }
    // @Override
    // public void resize(Point A, Point B) {
    //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }

    @Override
    public void resize(Point A, Point B) {

        if (containLeft(A.getX(), A.getY())) {
            st.setX(st.getX() + B.getX() - A.getX());
            st.setY(st.getY() + B.getY() - A.getY());

        } else if (containright(A.getX(), A.getY())) {
            two.setX(two.getX() + B.getX() - A.getX());
            two.setY(two.getY() + B.getY() - A.getY());

        }

    }
}
