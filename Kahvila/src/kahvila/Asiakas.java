
package kahvila;

import java.util.Random;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import kahvila.classes.Entity_2;

public class Asiakas extends GameObject implements Entity_2 {
    int ostosluku;
       String teksti = "";
    boolean tosi = false;
    Random r = new Random();
    
    private Textures tex;
    
    private int speed = 1;//(r.nextInt(3) + 1);
    
    public Asiakas(double x, double y, Textures tex){
        super(x,y);
        this.x = x;
        this.y = y;
        this.tex = tex;
    }
    
    public void tick(){
/*
    if(y<= 200){
    
    }else{
        y -= speed;
    }
    
          if(y > (Kahvila.WIDTH*Kahvila.SCALE)){
        y=-10;
        x=r.nextInt(Kahvila.WIDTH*Kahvila.SCALE);
       
} */
    
    if(y <= 80){
       if(tosi == false){
       ostosluku = (int)(Math.random()*4);
       switch(ostosluku){
           case 0:
                teksti = "mustan kahvin";
                break;
           case 1:
                teksti = "maito kahvin";
                break;
           case 2:
                teksti = "espresson";
                break;
           case 3:
               teksti = "teen";
       }
        System.out.println("Hei, haluaisin "+teksti+".");
       /* try{
        Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }*/
        y+=speed;
        tosi = true;
    }
       
    }
    else
        if(tosi == false){
        y-= speed;
        }
    else
            y+=speed;
    }

 public void renderoi(Graphics g){
        g.drawImage(tex.asiakas, (int)x, (int)y, null);
    
    }
     public Rectangle getBounds(){
        return new Rectangle((int)x,(int)y,32,32);
    }
    
    public double getX(){
    return x; }
    public double getY(){
        return y;
    }
    
    public void setY(double y){
    this.y = y;
    }
    
}
