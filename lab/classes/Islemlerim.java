
package lab_7;

/**
 * 
 * @author asayar
 */
public class Islemlerim {
    public double deger_1;
    public double deger_2;
    /**
     * Constructor
     * @param deger_1 işlem için birinci değer
     */
    public Islemlerim(double deger_1,double deger_2){
    this.deger_1=deger_1;
    this.deger_2=deger_2;
    }
    /**
     * Toplama işlemi
     * @param deger_2 ikinci değer
     * @return toplama işleminin sonucu
     */
    public double topla(double  deger_2){ 
        double result=0;
        return deger_2+deger_1;
    }
    
     /**
     * Çıkarma işlemi
     * @param deger_2 ikinci değer
     * @return çıkarma işleminin sonucu
     */
    public double cikar(double  deger_2){ 
        double result=0;
        return deger_2-deger_1;
    }
    
    /**
     * Çarpma işlemi
     * @param deger_2 ikinci değer
     * @return çarpma işleminin sonucu
     */
    public double carp(double  deger_2){ 
        double result=0;
        return deger_2*deger_1;
    }
    
    
    /**
     * Bölme işlemi
     * @param deger_2 ikinci değer
     * @return bölme işleminin sonucu
     */
    public double bol(double  deger_2){ 
        double result=0;
        return deger_2/deger_1;
    }
    
    
    /**
     * Buyuktur işlemi
     * @param deger_2 ikinci değer
     * @return buyuktur işleminin sonucu
     */
    public boolean buyukdur(double  deger_2){ 
        boolean result=false;
        if(deger_2>deger_1)
            result=true;
        return result;
    }
    

    /**
     * Kucuktur işlemi
     * @param deger_2 ikinci değer
     * @return kucuktur işleminin sonucu
     */
    public boolean kucuktur(double  deger_2){ 
        boolean result=false;
        if(deger_2<deger_1)
            result=true;
        return result;
    }
    
    /**
     * Esittir işlemi
     * @param deger_2 ikinci değer
     * @return esittir işleminin sonucu
     */
    public boolean esittir(double  deger_2){ 
        boolean result=false;
        if(deger_2==deger_1)
            result=true;
        return result;
    }
}
