package Deneme_Soruları;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        //Soru1: String tipinde sabit bir şifre değişkeni oluşturun.
        // Örneğin: String password = “12345”; gibi.
        // Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin.
        // Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
        // Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”,
        // değilse “Giriş Başarısız” yazdırın.

        Scanner scan=new Scanner(System.in);

        String password="1923";
        String sifre="";

        System.out.println("lutfen sifre giriniz");
        sifre=scan.nextLine();


        if (password.equals(sifre)){
            System.out.println("Giriş Başarılı!");
        }else{
            System.out.println("Giriş Başarısız");
        }


















    }
}
