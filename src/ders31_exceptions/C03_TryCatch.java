package ders31_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {
        // Kullanıcıdan toplamak uzere sayılar alın
        // kullanıcıdan ıslemı bıtırmesı ıcın Q'ya basmasını ısteyın
        // kullanıcı Q'ya bastıgında toplam kac sayı gırdıgını
        // ve bu sayıların toplamının kac oldugunu yazdırın


        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarToplami=0;

        while (sayiAdedi<1000) {
            try {
                System.out.println("toplamak ıcın tamsayı gırın" +
                        "\nbıtırmek ıcın Q'ya basın");
                girilenSayi = scan.nextInt();
                sayilarToplami += girilenSayi;
                sayiAdedi++;

            } catch (InputMismatchException e) {

                String girilenDeger = scan.nextLine();

                if (girilenDeger.equalsIgnoreCase("q")) {
                    System.out.println("Girilen " + sayiAdedi + " sayinin toplamı : " + sayilarToplami);
                    break;
                } else {
                    System.out.println("gecersiz input");
                }

            }
        }

    }
}
