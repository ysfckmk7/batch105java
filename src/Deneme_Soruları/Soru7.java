package Deneme_Soruları;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        //Soru 1-)Bir malın fiyatı 1500ytl dir.
        // Bu mal,%18 i kadar KDVsi alınarak satılacaktır.
        // Bu malın KDV sini ve satılacağı fiyatı hesaplayıp ekrana yazdırınız


        Scanner scan=new Scanner(System.in);
        int sayı=1500;

        int kdv=sayı*18/100;
        System.out.println(kdv);

        int kdvliSatısFıyatı=sayı+kdv;

        System.out.println("yeni fiyat:" + kdvliSatısFıyatı);



    }
}
