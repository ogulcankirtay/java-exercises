//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public class Lisans extends Ogrenci{
    int kalandönem;
    int uzayanyil;
    boolean mezunoldumu;

    public Lisans(int kalandönem, int uzayanyil, boolean mezunoldumu, String dersadi, int not, String dersayisi, int no, int sınıf, String bölüm, String ad) {
        super(dersadi, not, dersayisi, no, sınıf, bölüm, ad);
        this.kalandönem = kalandönem;
        this.uzayanyil = uzayanyil;
        this.mezunoldumu = mezunoldumu;
    }

    public void dönembitir(){
    kalandönem-=1;
        System.out.println(kalandönem+" dönem kaldi");
    }
   public int uzat(){
       return uzayanyil+=1;
   }
    public boolean mezunet(){
    mezunoldumu=true;
    return mezunoldumu;
    }
}
