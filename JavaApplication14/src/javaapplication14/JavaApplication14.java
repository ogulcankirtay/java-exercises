/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author OğulcanKırtay
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//            ////::::calışma1::::
//       int sayac=0;
//        int ucunkatı=0;
//       Scanner myobj=new Scanner(System.in);
//       int a[][]=new int [3][3];
//        System.out.println("lütfen verilen indexteki değeleri giriniz: ");
//       for(int i=0;i<a.length;i++){
//       for(int j=0;j<a[i].length;j++){
//           System.out.println("a["+i+"]["+j+"]:");
//       a[i][j]=myobj.nextInt();
//       }
//       }
//       for(int i=0;i<a.length;i++){
//       for(int j=0;j<a[i].length;j++){
//       if(a[i][j]%2==0)
//       {   sayac+=1;}
//       if(a[i][j]%3==0){
//           ucunkatı+=1;}
//       }
//       }
//        System.out.println(sayac+" tane çift sayı vardır\n"+"3 ün katı olan "+ucunkatı+" tane sayı vardır");  
//
                    ////:::calısma2::::
      int a[] = {1, 2, 8, 7, 6, 3, 5, 6, 3, 0, 2, 0, 0, 4, 5, 7, 8, 2, 8};
        
        System.out.print("girilen değerler: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int b[] = new int[a.length];
        int bl = 0;
        int say = 0;
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i + 1] > a[i]) {
                {
                    say += 1;
                    if (i + 1 == a.length - 1) {
                        bl = say;
                    }
                }

            } else {
                
                    b[i] = say;
                    say = 0;
                
            }
        }
        int eb = b[0];
       
        for (int i = 1; i < b.length; i++) {
            if (eb <= b[i]) {
                eb = b[i];
            }
        }

        if (bl >= eb) {
            System.out.println("\nEn uzun artan dizinin uzunluğu: " + bl);
        } else {
            System.out.println("\nEn uzun artan dizinin uzunluğu: " + eb);
        }
       
    }

}
