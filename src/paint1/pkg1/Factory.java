/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

/**
 *
 * @author Nada
 */


// Factory and singleton pattern 

public class Factory {
    private static Factory sf;
    private Factory ()
    {
        
    }
    public static Factory getInstance()
    {
    if (sf==null)
        sf=new Factory();
    return sf;
    }
    public Shape getShape (String sType)
    {
        if (sType==null)
        {
            return null;
        }
        if (sType.equalsIgnoreCase("Line"))
            return new Line();
        if (sType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
         if (sType.equalsIgnoreCase("Ellipse"))
            return new Ellipse();
          if (sType.equalsIgnoreCase("Circle"))
            return new Circle();
           if (sType.equalsIgnoreCase("Square"))
            return new Square();
            if (sType.equalsIgnoreCase("Triangle"))
            return new Triangle();
      return null;      
    }
    
    
}
