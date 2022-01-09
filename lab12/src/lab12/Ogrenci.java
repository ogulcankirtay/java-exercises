// 190202005 Oğulcan Kırtay
package lab12;

public class Ogrenci {
  private String ad,soyAd,ogrenciNo;
    Ders ders[]=new Ders[]{
     new Ders(),
     new Ders(),
     new Ders(),
     new Ders(),
     new Ders(),
     new Ders()
 };

    public Ogrenci(String ad, String soyAd, String ogrenciNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.ogrenciNo = ogrenciNo;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public Ders[] getDers() {
        return ders;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setDers(Ders[] ders) {
        this.ders = ders;
    }
public void ortalamahesapla(){
 int ort=0;
        for (int i = 0; i < ders.length; i++) {
            ort+=ders[i].getNot();
            
        }
        ort=ort/ders.length;
        System.out.println("ortalama: "+ort);
}
   public void derlistele(){
   for(int i=0;i<ders.length;i++)
       System.out.println(ders[i].getAd()+"   "+ders[i].getDonem()+" "+ders[i].getNot());
   }
}
