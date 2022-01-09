// 190202005 Oğulcan Kırtay 
package lab10;

public class Lab10 {
      
    public static void main(String[] args) throws InterruptedException {
//        Automobile a=new Automobile(100,100,"a");
//        System.out.println(""+a.getSpeed());
//        a.hızlan(0.5);
//        System.out.println(""+a.getSpeed());
//        a.yavasla(0.75);
//        System.out.println(""+a.getSpeed());
//        a.hızlan(2);
//        System.out.println(""+a.getSpeed()); 
//        a.stop();
//        System.out.println(""+a.getSpeed());
        Autopark park = new Autopark(1);
        Automobile a = new Automobile("41 BR 123");
        Automobile b = new Automobile("34 TR 456 ");
        park.girisYap(a); // a otoparka giris yapiyor
        Thread.sleep(200); // 200 milisaniye zaman geçiyor.

        park.girisYap(b); // b otoparka giris yapiyor
        Thread.sleep(999); // 999 milisaniye zaman geçiyor
        park.cikisYap(b);
                // b otoparktan cikiyor
                park.cikisYap(a); // a otoparktan çıkıyor –aslında yukarda kapasitededen dolayı giremediği için
        //(park edemedi) araç bulunamadı yaziyo
        park.kasaBilgi(); // otoparktaki toplam parayı yazdırıyor. 
        System.out.println(""+park.recursiveTopl(1));
    }
   

}
