package Deneme_Soruları;

import java.util.Scanner;

public class c32_WhileLoop {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin


        Scanner scan=new Scanner(System.in);
        int sayı=7;
        int toplam=0;
        int adet=0;


                while (sayı!=0){
                    System.out.println("lutfen sayı giriniz");
                    sayı=scan.nextInt();
                    toplam+=sayı;
                    adet++;

                    if (sayı<0){
                        System.out.println("negatif sayi kullanamazsiniz");
                    }

                }
        System.out.println("girilen  " + adet + " adet sayının toplamı:" + toplam);




    }
}
