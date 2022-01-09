//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public class Doktora extends LisansUstu{
  boolean tezyaz;
  String arastirmayapılanalan;
  String uzmanlıknolumu;

    public Doktora(boolean tezyaz, String arastirmayapılanalan, String uzmanlıknolumu, int alınandersasyisi, int basariliolandersayisi, int kalandersayisi, String dersadi, int not, String dersayisi, int no, int sınıf, String bölüm, String ad) {
        super(alınandersasyisi, basariliolandersayisi, kalandersayisi, dersadi, not, dersayisi, no, sınıf, bölüm, ad);
        this.tezyaz = tezyaz;
        this.arastirmayapılanalan = arastirmayapılanalan;
        this.uzmanlıknolumu = uzmanlıknolumu;
    }

   
  public  boolean tezyaz(){
      tezyaz=true;
  return tezyaz;
  }
  public  void bolumsöyle(){
      System.out.println("ismim "+ad+"bolumum "+uzmanlıknolumu);
  }
  public void mezunoldugulisansbolumu(){
      System.out.println(""+bölüm);
  }
}
