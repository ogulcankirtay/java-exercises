//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public class AkademikPeronel extends Personel{
  String unvan;
  int gridigiderssayisi;
  int ünidekisuresi;

    public AkademikPeronel(String unvan, int gridigiderssayisi, int ünidekisuresi, String ad, int calısmasaatleri, int bolumegirissayisi, int yıl, int maas, int zam) {
        super(ad, calısmasaatleri, bolumegirissayisi, yıl, maas, zam);
        this.unvan = unvan;
        this.gridigiderssayisi = gridigiderssayisi;
        this.ünidekisuresi = ünidekisuresi;
    }
  public void tanıt(){
      System.out.println(ad+" "+unvan);
  }
  public int dersekle(){
      gridigiderssayisi+=1;
  return gridigiderssayisi;
  }
  public int  dersegir(){
      gridigiderssayisi-=1;
  return gridigiderssayisi;
  }
  
}
