/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //// çaışma1:::
//         ArrayList<Integer> list = new ArrayList<>();
//        Scanner myobj=new Scanner(System.in);
//        int sayi,i=0;
//        while(true){
//            System.out.println("Lütfen bir sayı giriniz. Eğer çıkmak istiyorsanız 0’a basınız. ");
//       sayi=myobj.nextInt();
//        if(sayi==0)
//            break;
//        list.add(sayi);
//        }
//       Collections.sort(list);
//       int medyan=list.size()/2;
//        System.out.println("medyan: "+list.get(medyan));
    
    
    
//    /////////// çalışma2::.
//    int [] sayi={1,2,8,7,6};
//    int [] fark=new int [sayi.length-1];
//    int eb=fark[0];
//    int sayac=0;
//    for(int i=0;i<sayi.length-1;i++){
//    fark[i]=sayi[i+1]-sayi[i];
//        if(eb<fark[i]){
//        eb=fark[i];
//        sayac=i;
//        }
//    }
//    
//    
//    
//        System.out.println("ardışık sayılar arasındaki en büyük fark "+eb+" dır"+"bu fark "+sayi[sayac]+" ve "+sayi[sayac+1]+" sayıları arasındadır");

/////////// calışma3;;;

        String a="Java Programlama Dersi Fall 2012";
int b=a.indexOf("ma");
        System.out.println(a.substring(b+2));


    }
  
    
    }
    

