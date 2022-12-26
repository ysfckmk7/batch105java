package ders04_matematikselişlemler_incrementDecrement;

import java.util.Scanner;

public class c03_DataCasting {
    public static void main(String[] args) {
        //kullanıcıdan ıkı ınt deger alıp
        //bunları bırbırıne bolun ve sonucu double olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ıkı deger girin");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        double sunucDouble=(double)(sayi1/sayi2);
        System.out.println(sayi1/sayi2); //3
        System.out.println(sunucDouble);//3.0
        double DogruSonuc=(double)sayi1/sayi2; //double/int genıs olana gore sonuc verır.
        System.out.println(DogruSonuc); // 3.33333333333




    }
}
