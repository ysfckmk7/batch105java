package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan ismini alıp, buyuk harflerle yazdırın
        // 1.adım: scan objesi olusturma
        Scanner scan = new Scanner(System.in);
        //2.adım: kullanıcıya ne istediğinizi yazdırma
        System.out.println("Lütfen adınızı giriniz");
        //3.adım: kullanıcıdan istediğimiz bilginin turune uygun bir variable olusturup
        //        scanner method larından uygun olanı kullanarak alınan degeri
        //        variable a atayalım
        String kullaniciAdi=scan.next();
        System.out.println(kullaniciAdi.toUpperCase());


    }
}
