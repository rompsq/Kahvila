/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kahvila;

import java.awt.image.BufferedImage;


public class Spritesheet {
    
    private BufferedImage kuva;
    
    public Spritesheet(BufferedImage kuva){
    
        this.kuva = kuva;
        
    }

    Spritesheet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public BufferedImage grabImage(int col, int row, int width, int height){
    
        BufferedImage img = kuva.getSubimage((col*32)-32,(row*32)-32, width, height);
        return img;
    }
    
}

