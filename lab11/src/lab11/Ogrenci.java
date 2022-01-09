//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public abstract class Ogrenci extends Ders implements Kisi{
    int no;
    int sınıf;
    String bölüm;
    String ad;

    public Ogrenci(String dersadi, int not, String dersayisi,int no, int sınıf, String bölüm,String ad) {
        super("mat",100,5);
        this.no = no;
        this.sınıf = sınıf;
        this.bölüm = bölüm;
        this.ad=ad;
    }
public String isim(){
   return ad;
    
}
public void tanıt()
{
   
    System.out.println(isim() +" "+bölüm+" "+no);        
}
public  void sayno(){

    System.out.println(""+no);}

}