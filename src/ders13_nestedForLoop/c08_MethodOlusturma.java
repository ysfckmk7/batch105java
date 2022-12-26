package ders13_nestedForLoop;

import java.util.Scanner;

public class c08_MethodOlusturma {
    public static void main(String[] args) {
        /*
        kullanıcadan 2 sayı alıp , bunların toplamını yazdıran bır method olusturun
         */

            isteToplaYazdır();


    }

    public static void isteToplaYazdır(){

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ıkı sayı gırınız");

        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();

        System.out.println("girilen sayıların toplamı: " + (sayı1+sayı2));




    }









}
