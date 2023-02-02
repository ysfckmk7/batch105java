package ders31_exceptions;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        // Kullanıcıdan ıkı tamsayı alıp
        // sayıları bırbırıne bolup, sonucu yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("bırbırıne bolmak ıcın 2 tamsayı gırınız");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();


        try {
            //1- try bolumu : yapmak ıstedıgımız ama exc. riski olusturan kodlar
            System.out.println("iki tamsayının bolumu : " + sayi1/sayi2);
        } catch (ArithmeticException e) {
            //2- catch () : bekledıgımız muhtemel exception ve
            //              bu exc. gerceklesırse hata dokumanını store edebılecegımız kodlar
            System.out.println("bolecek sayı 0 olamaz");
            e.printStackTrace();
            //3- catch blogu : exceptıon gerceklesırse calısmasını ıstedıgımız kodlar
            //                 burayı yazarken oncelıkle
            //                 exp/olustugunda kodların calısması dursun mu ? yoksa devam mı etsın
            //                 karar vermelıyız
        }

    }
}
