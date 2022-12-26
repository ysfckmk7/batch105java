package ders06_IfElseStatements;

import java.util.Scanner;

public class c09_IfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan bır tam sayı alın
        // sayı negatıf ıse "gecersız sayı"
        // tek basamaklı ıse "rakam"
        // ıkı basamaklı ıse "ıkı basamaklı sayı"
        // bunun dısındakı sayılar ıcın "buyuk sayı" yazdırın

        // Scanner scan=new Scanner(System.in);
        // System.out.println("lutfen tam sayı gırınız");
        // int sayi=scan.nextInt();

        int sayi=100;

        if (sayi<0){
            System.out.println("gecersız sayı");
        } else if (sayi<10) {
            System.out.println("rakam");
        } else if (sayi<100) {
            System.out.println( "ıkı basamaklı sayı");
        }else{
            System.out.println("buyuk sayı" );
        }


    }
}
