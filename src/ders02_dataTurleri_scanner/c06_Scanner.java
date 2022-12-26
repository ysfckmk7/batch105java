package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class c06_Scanner {
    public static void main(String[] args) {
        // kullanıcısan bır dıkdortgenın 2 kenar uzunlugunu alıp,
        // dıkdortgenın alanını yazdırın.

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen dıkdortgenın ıkı kenar uzunlugunu gırın" +
                "\nıkı kenar uzunlugu arasında enter a basın");
        double kisaKenar= scan.nextDouble();
        double uzunKenar= scan.nextDouble();
        System.out.println("dikdörtgenin Alanı:"+ (kisaKenar*uzunKenar));





    }
}
