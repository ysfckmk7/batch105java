package ders04_matematikselişlemler_incrementDecrement;

import java.util.Scanner;

public class c02_DataCasting {
    public static void main(String[] args) {
        //kullanıcıdan ıkı double sayı alın
        //ilk sayıyı ıkıncı sayıya bolun ve bolum islemının sonucunun tamsayı kısmını yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ıkı sayı gırınız");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        int bolmesonucuTamsayi=(int)(sayi1/sayi2);


        System.out.println(bolmesonucuTamsayi);






    }
}
