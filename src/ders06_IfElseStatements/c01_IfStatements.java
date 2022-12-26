package ders06_IfElseStatements;

import java.util.Scanner;

public class c01_IfStatements {
    public static void main(String[] args) {
        // kullanıcıdan bır harf alın, harf ıle baslayan bır ay varsa yazdırın
        //kullanıcı o veya 0 yazdıgında output olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay ısmının ılk harfını gırın");
        char ilkharf = scan.next().charAt(0);

        if (ilkharf == 'o' || ilkharf == 'O') {
            System.out.println("ocak");

        }
        if (ilkharf == 's' || ilkharf == 'S') {
            System.out.println("subat");

        }
        if (ilkharf == 'm' || ilkharf == 'M') {
            System.out.println("mart-mayıs");

        }
        if (ilkharf == 'n' || ilkharf == 'N') {
            System.out.println("nisan");

        }
        if (ilkharf == 'h' || ilkharf == 'H') {
            System.out.println("hAZİRAN");

        }
        if (ilkharf == 't' || ilkharf == 'T') {
            System.out.println("TEMMUZ");

        }
        if (ilkharf == 'a' || ilkharf == 'A') {
            System.out.println("AGUSTOS-aralık");

        }
        if (ilkharf == 'e' || ilkharf == 'E') {
            System.out.println("EYlul-Ekım");

        }
        if (ilkharf == 'k' || ilkharf == 'K') {
            System.out.println("Kasım");

        }


    }
}
