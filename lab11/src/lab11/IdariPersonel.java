//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public class IdariPersonel extends Personel{
 String departman;
 int mesaisüresi;
 int sorumluoldugupersınelsayisi;

    public IdariPersonel(String departman, int mesaisüresi, int sorumluoldugupersınelsayisi, String ad, int calısmasaatleri, int bolumegirissayisi, int yıl, int maas, int zam) {
        super(ad, calısmasaatleri, bolumegirissayisi, yıl, maas, zam);
        this.departman = departman;
        this.mesaisüresi = mesaisüresi;
        this.sorumluoldugupersınelsayisi = sorumluoldugupersınelsayisi;
    }
    public void saydepartman(){
        System.out.println(""+departman);}
    public int mesai(){
    mesaisüresi+=1;
    return mesaisüresi;
    }
    public  int elemansayisi(){
    return sorumluoldugupersınelsayisi;
    }
}
