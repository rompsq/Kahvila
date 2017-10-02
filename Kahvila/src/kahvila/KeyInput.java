/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kahvila;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    
    Kahvila kahvila;
    
    public KeyInput(Kahvila kahvila){
        this.kahvila = kahvila;
    }
    
    @Override
    public void keyPressed(KeyEvent e){
        kahvila.keyPressed(e);
    }
    @Override
    public void keyReleased(KeyEvent e){
    kahvila.keyReleased(e);
    }
}
