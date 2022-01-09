//Oğulcan Kırtay 190202005
package lab9;

import java.util.ArrayList;


public abstract class Sekil {
    int x,y;
    String tur;
    static int id;
    static int varlikID = -1;
    static ArrayList<Integer> varlikno = new ArrayList<Integer>();
    static ArrayList<Sekil> values = new ArrayList<Sekil>();
    
    public Sekil(int x, int y) {
        
        varlikID++;
        varlikno.add(varlikID);
        this.x = x;
        this.y = y;
        
        values.add(this);
    }
    public void listele(){
        for (int i = 0; i <this.values.size(); i++) {
            System.out.println(this.varlikno.get(i)+". sırada yaratıldı");
            System.out.println("Şekil Sınıfı: "+this.values.get(i).tur);
            System.out.println("X: "+this.values.get(i).x );
            System.out.println("Y: "+this.values.get(i).y );
  
        }
    }
    public void enUst(){
        System.out.println("Şekil Sınıfı: "+this.values.get(this.values.size()-1).tur);
        System.out.println("X: "+this.values.get(this.values.size()-1).x );
        System.out.println("Y: "+this.values.get(this.values.size()-1).y );
        System.out.println("Alan: "+this.values.get(this.values.size()-1).alan() );
        System.out.println("Çevre: "+this.values.get(this.values.size()-1).cevre() ); 
    }
    public void sil(int id){
        System.out.println(id+" silindi");
       this.values.remove(id);
    }

public abstract double alan();
public abstract double cevre();
}