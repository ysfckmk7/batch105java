package ders02_dataTurleri_scanner;


import java.util.Scanner;

public class c08_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ıkı sayı alıp ıkısının degerlerını degıstırın

        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2= scan.nextInt();

        int bos;
        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;
        System.out.println("ilk sayının degeri:"+ sayi1);
        System.out.println("ikinci sayının degeri:"+ sayi2);











    }
}
