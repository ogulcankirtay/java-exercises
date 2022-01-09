// 190202005 Oğulcan Kırtay
package lab12;

public class Ders {
 private String ad,donem;
private int not;
public Ders() {
        this.ad = "";
        this.donem = "";
        this.not = 0;
    }
    public Ders(String ad, String donem, int not) {
        this.ad = ad;
        this.donem = donem;
        this.not = not;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public String getAd() {
        return ad;
    }

    public String getDonem() {
        return donem;
    }

    public int getNot() {
        return not;
    }


    
}
