
package kahvila;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class KuvanLataaja {
    
    private BufferedImage kuva;
    
    public BufferedImage lataakuva(String path) throws IOException{
    
        kuva = ImageIO.read(getClass().getResource(path));
        return kuva;
    }
    
}

