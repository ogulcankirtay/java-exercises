/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//190202005 Oğulcan Kırtay
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author OğulcanKırtay
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//                !!!çalışma1!!!!
        // TODO code application logic here
//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Lütfen üssü alınacak değeri giriniz ");
//        int numbr = myobj.nextInt();
//        int numbr1 = numbr;
//        Scanner myobj1 = new Scanner(System.in);
//        System.out.println("Lütfen üs değerini giriniz ");
//        int us = myobj1.nextInt();
//        System.out.println(us);
//        int sayı = numbr;
//        for (int i = 1; i < us; i++) {
//            sayı = sayı * numbr;
//       
//        }
//        System.out.println("cevap olarak " + numbr1 + " üssü " + us + "=" + sayı + " hesaplanmıştır");
        //----------------------------------------------------------------------------//
//        int numbr = Integer.parseInt(args[0]);
//        int us = Integer.parseInt(args[1]);
//        int sayı = numbr;
//        for (int i = 1; i < us; i++) {
//            sayı = sayı * numbr;
//        }
//        System.out.println("cevap olarak " + numbr + " üssü " + us + "=" + sayı + " hesaplanmıştır");

        // !!!çalışma2!!!
        Scanner b = new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz:");
        int mny = b.nextInt();
        if (mny % 5 != 0) {
            int ek = mny % 5;
            System.out.println(ek);
            if (ek >= 2.5) {
                mny = mny + ek;
                int elk = mny / 50;
                mny %= 50;
                int yrmBslk = mny / 25;
                mny %= 25;
                int onlk = mny / 10;
                mny %= 10;
                int beslk = mny / 5;
                mny %= 5;
                ek = 5 - ek;
                int toplam = yrmBslk + onlk + beslk + elk;
                System.out.println(toplam + " kağıt para- " + ek + " TL mi yediniz :(");
            } else if(ek<2.5) {
                mny = mny - ek;
                int elk = mny / 50;
                mny %= 50;
                int yrmBslk = mny / 25;
                mny %= 25;
                int onlk = mny / 10;
                mny %= 10;
                int beslk = mny / 5;
                mny %= 5;

                int toplam = yrmBslk + onlk + beslk + elk;
                System.out.println(toplam + " kağıt para- " + ek + " TL nizi yedim :)");
            }
        } else {
            int elk = mny / 50;
            mny %= 50;
            int yrmBslk = mny / 25;
            mny %= 25;
            int onlk = mny / 10;
            mny %= 10;
            int beslk = mny / 5;
            mny %= 5;

            int toplam = yrmBslk + onlk + beslk + elk;
            System.out.println(toplam + " kağıt para");

        }

    }

}
