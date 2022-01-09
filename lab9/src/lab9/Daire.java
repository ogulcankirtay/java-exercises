//Oğulcan Kırtay 190202005
package lab9;


public class Daire extends Sekil{
    int yaricap;
   
    public Daire(int x, int y) {
        super(x, y);
        this.yaricap=1;
        System.out.println("Daire oluştuludu");
        tur="Daire";
        
    }
    public Daire(int x, int y,int yaricap) {
        super(x, y);
        this.yaricap=yaricap;
        System.out.println("Daire oluştuludu");
        tur="Daire";
    }

    

    
    @Override
    public double alan() {
       return 3.14*yaricap*yaricap;
    }

    @Override
    public double cevre() {
       return 2*3.14*yaricap;
    }
   public int buyut(int k) {
    yaricap=yaricap+k;
   return yaricap;
   }

    
   
    
}
