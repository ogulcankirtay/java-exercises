//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public abstract class Personel extends Maas implements Kisi   {
   String ad;
   int calısmasaatleri;
   int bolumegirissayisi;

    public Personel(String ad, int calısmasaatleri, int bolumegirissayisi, int yıl, int maas, int zam) {
        super(yıl, maas, zam);
        this.ad = ad;
        this.calısmasaatleri = calısmasaatleri;
        this.bolumegirissayisi = bolumegirissayisi;
    }
    public void merhaba(){
        System.out.println("merhaba ben"+isim());
    }
public String isim(){
return ad;
}
    public int saygirisi(){
    return bolumegirissayisi+=1;
    }
   
}
