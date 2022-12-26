package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {
        // soru: kullanıcıdan bır double, bır de int alıp
        //       bunların toplamını ve carpımını yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("ondalıklı bır sayı gırınız");
        double ondalikliSayi=scan.nextDouble();
        System.out.println("lutfen tamsayı gırınız");
        int tamSayi=scan.nextInt();
        System.out.println("girilen sayıların tplamı:"+ (ondalikliSayi+tamSayi));

        System.out.println("girilen sayıların carpımı:"+(ondalikliSayi*tamSayi));


    }
}
