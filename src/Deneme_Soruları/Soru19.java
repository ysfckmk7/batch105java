package Deneme_Soruları;

import java.util.Scanner;

public class Soru19 {
    public static void main(String[] args) {

        //Soru 13-)Kullanıcıdan (negatif bir sayı girinceye kadar) pozitif sayılar alarak
        // bu sayıların ortalamasını ekrana yazdıran bir program yazınız.

        Scanner scan = new Scanner(System.in);
        double SayıToplam = 0;
        int sayac = 0;

        int sayı = 0;
        do {
            System.out.println("lutfen sayı giriniz");
            sayı = scan.nextInt();
            SayıToplam += sayı;
            sayac++;
            if (sayı<0){
                sayac-=1;
                SayıToplam-=sayı;
            }
        } while (sayı >= 0);
        System.out.println("Sayıların ortalaması:" + (SayıToplam/ sayac));
    }






    }
