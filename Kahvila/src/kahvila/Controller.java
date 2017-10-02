
package kahvila;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;
import kahvila.classes.Entity_1;
import kahvila.classes.Entity_2;
public class Controller {
    
    private LinkedList<Entity_1> e1 = new LinkedList<Entity_1>();
    private LinkedList<Entity_2> e2 = new LinkedList<Entity_2>();
  Entity_1 ent1;
  Entity_2 ent2;
  private Textures tex;
  Random r = new Random();
  
    public Controller(Textures tex){
        this.tex = tex;
      
    }

public void createAsiakas(int enemy_count){
    for(int i=0; i < enemy_count; i++){
    addEntity(new Asiakas((265), 510, tex));
    }
}
    public void createMyyja(){
   
    addEntity(new Myyja((265), 20, tex));
    }
    public void createPoyta(int x, int y){
    addEntity (new Poyta((x),y,tex));
    }
    public void tick(){
        //1class
        for(int i=0; i < e1.size(); i++){
        ent1 = e1.get(i);
        
        ent1.tick();
        }
        for(int i=0; i < e2.size(); i++){
        ent2 = e2.get(i);
        
        ent2.tick();
        }
        
        }

    
    public void renderoi(Graphics g){
         for(int i=0; i < e1.size(); i++){
        ent1 = e1.get(i);
        
        ent1.renderoi(g);
        }
           for(int i=0; i < e2.size(); i++){
        ent2 = e2.get(i);
        
        ent2.renderoi(g);
    }}
    
    public void addEntity(Entity_1 block){
        e1.add(block);
    }
     public void removeEntity(Entity_1 block){
        e1.remove(block);
    }
         public void addEntity(Entity_2 block){
        e2.add(block);
    }
     public void removeEntity(Entity_2 block){
        e2.remove(block);
    }
     public LinkedList<Entity_1> getEntity_1(){
     return e1;
     }
       public LinkedList<Entity_2> getEntity_2(){
     return e2;
     }
}
