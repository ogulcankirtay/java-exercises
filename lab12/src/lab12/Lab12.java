// 190202005 Oğulcan Kırtay
package lab12;
import java.io.*;
import java.util.Scanner;
public class Lab12 {

  
    public static void main(String[] args) throws FileNotFoundException  {
        Ogrenci ali=new Ogrenci("Ali", "bilge", "190202064 ");
      
     
        File dosya = new File("C:\\Users\\ASUS\\Desktop\\java lab\\lab12\\ali_bilge.txt"); 
        
        Scanner sc = new Scanner(dosya); 
         int i=0;
        int satir=1;
       
        while (sc.hasNextLine()) {
             if(satir == 1){
            ali.setAd(sc.next()); 
            ali.setSoyAd(sc.next());
            ali.setOgrenciNo(sc.next());
            satir++;
        } else {   
            ali.ders[i].setAd(sc.next());
            ali.ders[i].setDonem(sc.next());
            ali.ders[i].setNot(sc.nextInt());
            i++;
        }
        }
         
        ali.derlistele();
       ali.ortalamahesapla();
 
    }

   
    
}

    

