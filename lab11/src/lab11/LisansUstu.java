//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public abstract class LisansUstu extends Ogrenci{
  int alınandersasyisi;
  int basariliolandersayisi;
  int kalandersayisi;

    public LisansUstu(int alınandersasyisi, int basariliolandersayisi, int kalandersayisi, String dersadi, int not, String dersayisi, int no, int sınıf, String bölüm, String ad) {
        super(dersadi, not, dersayisi, no, sınıf, bölüm, ad);
        this.alınandersasyisi = alınandersasyisi;
        this.basariliolandersayisi = basariliolandersayisi;
        this.kalandersayisi = kalandersayisi;
    }
  public int dersgec(){
  basariliolandersayisi+=1;
  return  basariliolandersayisi;
        }
  public void söylealınandersayisi() 
  {
      System.out.println(""+alınandersasyisi);       }
public int kalanderssaiyis(){
    kalandersayisi=alınandersasyisi-basariliolandersayisi;
return kalandersayisi;
}

}