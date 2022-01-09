//Oğulcan Kırtay 190202005
package lab9;
public class Dortgen extends Sekil{
    int en,boy;
    public Dortgen(int x, int y) {
        super(x, y);
        en=1;
        boy=1;
        tur="Dörtgen";
        System.out.println("Dortgen oluştuludu");
    }
      public Dortgen(int x, int y,int en,int boy) {
        super(x, y);
        this.en=en;
        this.boy=boy;
        tur="Dörtgen";
        System.out.println("Dortgen oluştuludu");
      }

   
    @Override
    public double alan() {
        return en * boy;
    }

    @Override
    public double cevre() {
        return 2*(en+boy);
    }
    
}
