package calısma6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
//////calısma1::

//public class calısma6 {
//
//    public static void main(String[] args) {
//        int[] aray = new int[5];
//        for (int i = 0; i < 5; i++) {
//            aray[i] = (int) (Math.random() * 10);
//        }
//        System.out.println("dizini ilk hali ");
//        for (int i = 0; i < aray.length; i++) {
//            System.out.print(aray[i] + " ");
//
//        }
//        System.out.println("dizinin son hali: ");
//        carp(aray);
//        for (int i = 0; i < aray.length; i++) {
//            System.out.print(aray[i] + " ");
//
//        }
//    }
//
//    public static int[] carp(int[] aray) {
//        for (int i = 0; i < aray.length; i++) {
//            aray[i] *= 2;
//
//        }
//        return aray;
//    }
//}
//// calısma2:
public class calısma6 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner myobj = new Scanner(System.in);
        int sayi;
        while (true) {
            System.out.println("Lütfen bir sayı giriniz. Eğer çıkmak istiyorsanız 0’a basınız. ");
            sayi = myobj.nextInt();
            if (sayi == 0) {
                break;
            }
            list.add(sayi);
        }
        System.out.println("kullanıcının girdiği değerler:");
        goster(list);
        for (int i = 0; i < list.size(); i=i+2) {
            Collections.swap(list, i, i+1);
            
        }
        
        System.out.println("\nmodifiye edilmiş değerler");
        goster(list);
    }

    public static void goster(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
