//Oğulcan Kırtay 190202005
package lab11;

/**
 *
 * @author ASUS
 */
public class Maas {
    int yıl;
    int maas;
    int zam;
    
    public Maas(int yıl, int maas, int zam) {
        this.yıl = yıl;
        this.maas = maas;
        this.zam = zam;
    }
    public void zamyap(){
    if(yıl%2==0){
    maas+=zam;
    }
    
    }
    public void yatir(){
        System.out.println("maas yatirildi");}
    
    
    public  int maasbilgisi(){
    return  maas;
    }
    
    
    
    
    }
   

