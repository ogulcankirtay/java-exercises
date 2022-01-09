// 190202005 Oğulcan Kırtay 
package lab10;

import java.util.Vector;


public class Autopark {

     Vector<Automobile> sayarpark=new Vector<Automobile>();
    static long otoparkKasasi = 0;
    int aracs;
    int boyut=0;
    long ikz;
    
    // vector tipinde otopark oluşturun boyutu size kadar olsun.
    // otopark kasasını 0 yapın.

    Autopark(int size) {
        
     aracs=size;
    
      
    }

    // Automobile otoparka giriyor. otoparktaki araçların otopark kapasitesini
    // geçmediğini kontrol edin. Otoparka girdiğinde otonun giriş zamanını kaydedin.
    // bunun için System.currentTimeMillis(); kullanın
    // eğer araç park edemezse, yani otopark doluysa, [license no] "park edemedi" yazılsın.
    public void girisYap(Automobile oto) {
     
        if (boyut<aracs) {
           sayarpark.add(oto);
          
            boyut+=1;
            oto.girisZamani=System.currentTimeMillis();
            System.out.println(oto.license +" otoparka girdi Otopark kapasitesi: "+aracs+" boyutu: "+boyut);
        }
        else
            System.out.println(oto.license+" park edemedi");
    }
    // içeride kalınan zamanı bulun. (çıkarken bulunan zaman - girişzamanı)
    //(içerde kalınan zaman/100f) * 10 ile kasaya eklenecek miltarı bulun.
    // bu miktarı kasaya ekleyin. Aracı otoparktan remove edin.
    // ekrana hangi araç çıktığını plaka ile, nekadar süre kaldığını ve kaç tl ödediğini de yazdırın.
    // eğer çıkacak olan araç otoparkta var ise çıkar. Parkta yoksa araç bulunamadı diye ekrana yazar.

    public void cikisYap(Automobile oto) {
        for (int i = 0; i <aracs; i++) {
            if(sayarpark.contains(oto))
            {ikz=System.currentTimeMillis()-oto.getGirisZamani();
        otoparkKasasi+=((ikz/100)*10);
        System.out.println(oto.license+""+ikz+" ms sonra çıktı . Kasaya eklenicek tutar ("+ikz/100+"saniye *saniye  basina  10 tl)="+otoparkKasasi);
            sayarpark.remove(oto);
            }
            else
                System.out.println("Araç bulunamadı ");
        }
        
    }

    // otopark kasasında kaç TL olduğunu ekranda gösterecek.
    public static void kasaBilgi() {
        System.out.println("kasadaki toplam para "+otoparkKasasi);
    }

    // Çalışma-1 ile ilgili Tn = 3*Tn/2 + n 
    public int recursiveTopl(int n) {
        if (n==1) {
            return 1;
        } else {
            return 3*recursiveTopl(n/2) + n;
        }
    }
}
