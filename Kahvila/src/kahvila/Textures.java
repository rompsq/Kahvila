
package kahvila;

import java.awt.image.BufferedImage;


public class Textures {
    
    public BufferedImage pelaaja, asiakas, panos, myyja,poyta;
    
    private Spritesheet ss;
    
    public Textures(Kahvila kahvila){
        ss = new Spritesheet(kahvila.getSpritesheet());
        
        getTextures();
        
    }
    private void getTextures(){
        pelaaja = ss.grabImage(1, 1, 32, 32);
        panos = ss.grabImage(2,1,32,32);
        asiakas = ss.grabImage(3,1,32,32);
        myyja = ss.grabImage(1, 1, 32, 32);
        poyta = ss.grabImage(1, 3, 128, 64);
        
    }
    
}

