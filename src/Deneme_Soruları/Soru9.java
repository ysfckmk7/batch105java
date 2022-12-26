package Deneme_Soruları;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {

        //Soru 3-)Klavyeden okunacak bir e-mail adresindeki
        // kullanıcı adını ve sunucu adını ekrana yazdıran bilgisayar programını Java dilinde yazınız.

        Scanner scan=new Scanner(System.in);
        String mail="cerenimo7@gmail.com";
        String KullanıcıAdı;
        String SunucuAdı;


        KullanıcıAdı=mail.substring(0,9);
        SunucuAdı=mail.substring(10);

        System.out.println("KullanıcıAdı:" + KullanıcıAdı);
        System.out.println("SunucuAdı:" + SunucuAdı);




    }
}
