//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public class Ders {
    String dersadi;
    int not;
    int dersayisi;

    public Ders(String dersadi, int not, int dersayisi) {
        this.dersadi = dersadi;
        this.not = not;
        this.dersayisi = dersayisi;
    }
    public void not(){
        System.out.println(dersadi+"dersi notunuz"+not);
    }
    public void bilgilendirme(){
        System.out.println("haftada "+dersayisi+" saat ders göreceksiniz");
    }
    public void dersyap(){
        dersayisi-=1;
        System.out.println("ders bitmiştir kalan ders saati"+dersayisi);
    }
}
