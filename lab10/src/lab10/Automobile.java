// 190202005 Oğulcan Kırtay 
package lab10;

/**
 *
 * @author ASUS
 */
interface Arac {

    public void hızlan(double hızlanmaOranı);

    public void yavasla(double yavaslamaOranı);

    public void stop();
}

public class Automobile {

    double fuel;
    double speed;
    String license;
    long girisZamani;
    static int aracSayisi = 0;
    // otoparktaki araç sayısını 1 artıracak, fueli ve speed i 0 yapacak license’i ise null

    public Automobile() {
        aracSayisi++;
        fuel = 0;
        speed = 0;
        license = null;
    }

    public Automobile(double f, double s, String l) {
        aracSayisi++;
        fuel = f;
        speed = s;
        l = license;
    }

    public Automobile(String l) {
        aracSayisi++;
        this.setLicense(l);
    }

    // Hızlan metodunda hız saatte 300'u geçmeyecek, kontrolleri yazın.
    // hızlanma oranın (0-1] aralığında olduğundan emin olun.
    // bu şartları sağlamıyorsa hız değişmeyecek ve ekrana hız değişmedi yazılacak.
    public void hızlan(double hızlanmaOranı) {
        if (speed <= 300) {
            if (hızlanmaOranı <= 1 & hızlanmaOranı >= 0) {
                speed += speed * hızlanmaOranı;
            } else {
                System.out.println("hız değişmedi");
            }
        } else {
            System.out.println("hız değişmedi");
        }
    }
    // yavasla metodunda yavaşlarken hızın 0 ın altına düşmediğinden emin olun. Düşerse 0 yapın.
    // yavaşlama oranın (0-1] aralığında olduğundan emin olun.
    // bu şartları sağlamıyorsa hız değişmeyecek ve ekrana hız değişmedi yazılacak.

    public void yavasla(double yavaslamaOranı) {
        if (speed >= 0) {
            if (yavaslamaOranı <= 1 & yavaslamaOranı >= 0) {
                speed -= speed * yavaslamaOranı;
            } else {
                System.out.println("hız değişmedi");
            }
        } else {
            System.out.println("hız değişmedi");
        }
    }
    // aracın hızını 0 yapar.
    // ekrana da hız sıfırlandı araç durdu yazar.

    public void stop() {
        speed = 0;
        System.out.println("araç durdu");
    }
    // TÜM DEĞİŞKENLER İÇİN SET VE GET METOTLARINI YAZINIZ.
    // doldur

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }

    public double getFuel() {
        return fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public String getLicense() {
        return license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

}
