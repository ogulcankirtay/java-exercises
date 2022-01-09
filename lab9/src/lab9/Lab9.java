//Oğulcan Kırtay 190202005
package lab9;

public class Lab9 {

    public static void main(String[] args) {
        Daire d1 = new Daire(1, 1);
        Daire d2 = new Daire(2, 3, 2);
        Dortgen dg1 = new Dortgen(2, 2);
        System.out.println(d1.alan());
        System.out.println(d2.alan());
        System.out.println(dg1.alan());
        d1.enUst();
        d2.enUst();
        dg1.enUst();
        d1.listele();
        d2.sil(1);
        d1.listele();
    }

}
