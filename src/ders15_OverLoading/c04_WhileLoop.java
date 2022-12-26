package ders15_OverLoading;

import java.util.Scanner;

public class c04_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan toplanmak uzere tamsayılar alın
        kullanıcı 0 a basarsa sayı alma ıslemını bıtırın
        kullanıcının kac sayı gırdıgını
        ve bu sayların toplamının kac oldugunu yazdırın
         */

        Scanner scan=new Scanner(System.in);

        int gırılensayı=7;//verılen ilk deger bu soru ıcın 0 olmamalı
                          //cunku 0 loop u bıtırmek ıcın kullanılacak
        int toplamsayı=0;
        int sayac=0;



             while (gırılensayı !=0){
                 System.out.println("lutfen toplamak ıcın tamsayı gırın"+
                         "\nBıtırmek ıcın 0'a basın");

                 gırılensayı=scan.nextInt();

               if (gırılensayı!=0){
                   sayac++;
                   toplamsayı+=gırılensayı;

               }

             }

        System.out.println("Girilen "+ sayac+" Adet sayının toplamı:"+ toplamsayı);










    }
}
