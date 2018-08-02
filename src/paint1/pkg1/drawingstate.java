/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint1.pkg1;

/**
 *
 * @author Toka
 */
class drawingstate implements State {


    @Override
    public void doActioms(DrawingArea d) {
        d.setCurrent(DrawingArea.modes.Select);
    }
    
}
