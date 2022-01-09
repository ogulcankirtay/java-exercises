//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public class Master extends LisansUstu{
  boolean tezyazildimi;
   int egitimsuresi;
   int alınandersayisi;

    public Master(boolean tezyazildimi, int egitimsuresi, int alınandersayisi, int alınandersasyisi, int basariliolandersayisi, int kalandersayisi, String dersadi, int not, String dersayisi, int no, int sınıf, String bölüm, String ad) {
        super(alınandersasyisi, basariliolandersayisi, kalandersayisi, dersadi, not, dersayisi, no, sınıf, bölüm, ad);
        this.tezyazildimi = tezyazildimi;
        this.egitimsuresi = egitimsuresi;
        this.alınandersayisi = alınandersayisi;
    }
   public boolean tezyaz(){
   tezyazildimi=true;
   return tezyazildimi;
   }
   public int egitimsuresi(){
   return egitimsuresi;}
   public void alınanderssayisi(){
       System.out.println(alınandersasyisi+" adet ders alinmaktadir");}   
   
}
