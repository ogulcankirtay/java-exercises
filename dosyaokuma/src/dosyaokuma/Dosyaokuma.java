package dosyaokuma;

import com.sun.jdi.IntegerValue;
import static com.sun.tools.attach.VirtualMachine.list;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Files.list;
import java.nio.file.Paths;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dosyaokuma {

    public void dosyadanoku(String karakter) {
        String fileName = "C:\\Users\\ASUS\\Desktop\\java lab\\dosyaokuma\\src\\lines.txt";
        List<String> list = new ArrayList<>();
        int[][] matris = new int[11][13];
        int dusmansayisi = 0;
        //Dosyayı okuma ıslemını burada yapıyoruz
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream
                    .filter(line -> line.startsWith(karakter))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //list.forEach(System.out::println); -> okunan tüm değerleri göstermek istersen
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("Karakter")) {
                if (list.get(i).toUpperCase().contains("GARGAMEL")) {
                    if (list.get(i).toUpperCase().endsWith("A")) {
                        System.out.println("GARGAMEL kapı A");
                    } else if (list.get(i).toUpperCase().endsWith("D")) {
                        System.out.println(" Gargamel kapı D");
                    } else if (list.get(i).toUpperCase().endsWith("B")) {
                        System.out.println("GARGAMEL kapı B");
                    } else if (list.get(i).toUpperCase().endsWith("C")) {
                        System.out.println(" GARGAMEL kapı C");
                    }
                }
                if (list.get(i).toUpperCase().contains("AZMAN")) {
                    if (list.get(i).toUpperCase().endsWith("A")) {
                        System.out.println("AZMAN kapı A");
                    } else if (list.get(i).toUpperCase().endsWith("B")) {
                        System.out.println("AZMAN kapı B");
                    } else if (list.get(i).toUpperCase().endsWith("C")) {
                        System.out.println(" AZMAN kapı C");
                    } else if (list.get(i).toUpperCase().endsWith("D")) {
                        System.out.println(" AZMAN kapı D");
                    }
                }
                dusmansayisi += 1;
            }

            for (int j = 0; j < list.get(i).length(); j++) {

                System.out.print((list.get(i).charAt(j)));
            }
            System.out.println("");

        }

        System.out.println("");
        int x = 0;
        for (int i = dusmansayisi; i < list.size(); i++, x++) {
            int y = 0;
            for (int j = 0; j < list.get(i).length(); j++) {
                if (j % 2 != 1) {
                    String a = "" + list.get(i).charAt(j);
                    int b = Integer.valueOf(a);

                    matris[x][y] = b;

                    System.out.print("" + matris[x][y]);

                    y++;
                }

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Dosyaokuma a = new Dosyaokuma();

        a.dosyadanoku("");

    }
}
