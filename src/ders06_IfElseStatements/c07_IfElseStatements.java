package ders06_IfElseStatements;

import java.util.Scanner;

public class c07_IfElseStatements {
    public static void main(String[] args) {
        // kullanıcadan bır harf ısteyın
        // girilen karakter kucuk harf ise onu buyuk olarak yazdırın
        // yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='a' &&  krk<='z') {
            // kucuk harf gırıldı demektır
            System.out.println((char)(krk-32));

        }else{
            // kucuk harf degil demektır
            System.out.println(krk);

        }

    }
}
