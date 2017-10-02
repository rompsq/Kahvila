
package kahvila;

public class Testi {

    public static void main(String[] args) {
       int ostosluku,lisaostos,herkku;
       double hinta=0,hinta2=0;
       String teksti = "";
       String teksti2 = "";
       
       ostosluku = (int)(Math.random()*4);
       switch(ostosluku){
           case 0:
                teksti = "musta kahvi";
                hinta = 3.20;
                break;
           case 1:
                teksti = "maito kahvi";
                hinta = 4.50;
                break;
           case 2:
                teksti = "espresso";
                hinta = 7;
                break;
           case 3:
               teksti = "tee";
               hinta  = 9;
               break;
       }
        System.out.println(""+teksti+" "+hinta+"€");
        System.out.println("Myyjä: Haluatko jotain muuta?");
        //Ostaako asiakas jotain muuta
        lisaostos = (int)(Math.random()*2);
        if(lisaostos == 0){
            System.out.println("En halua muuta");
        }
        if(lisaostos == 1){
            
            herkku = (int)(Math.random()*3);
            switch(herkku){
           case 0:
                teksti2 = "korvapuustin";
                hinta2 = 3.50;
                break;
           case 1:
                teksti2 = "sämpylän";
                hinta2 = 2.50;
                break;
           case 2:
                teksti2 = "muffinssin";
                hinta2 = 3.00;
                break;
           
       }
            System.out.println("Voisin ottaa "+teksti2 +" "+hinta2+"€");
        }
    }
    }
    

