package ders31_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*
            Try-catch bloklarının amacı
            rıskı 0 yapmak degıl
            kodu ıyı analız yapıp
            Java'nın cozemeyecegı durumlarda ne yapmasını ıstedıgımızı kendısıne soylemektedır

            Java try blogunda basedemeyecegı bır sorunla karsılasırsa
            sız o sorunu deklare edınceye kadar
            yanı catch() satırına kadar
            calısmayı durdurur

            Bu durumda sorun olan satır ıle catch satırı arasındakı kodlar CALISMAZ
         */


        // Kullanıcıdan ıkı tamsayı alıp
        // sayıları bırbırıne bolup, sonucu yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("bırbırıne bolmak ıcın 2 tamsayı gırınız");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();


        try {
            System.out.println("iki tamsayının bolumu : " + sayi1/sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayı 0 olamaz");
            e.printStackTrace();
        }


    }
}
