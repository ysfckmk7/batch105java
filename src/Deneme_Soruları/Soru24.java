package Deneme_Soruları;

import java.util.Scanner;

public class Soru24 {
    public static void main(String[] args) {

        // //Soru 18-)Klavyeden alınan integer tipli bir sayının
        // asal olup olmadığını test eden Java programını yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayı=scan.nextInt();
        int  sayac=0;


        for (int i =2; i <sayı ; i++) {

            if (sayı%i==0) {
                sayac++;
            }
        }if (sayac==0){
                System.out.println(sayı + " sayısı asal bir sayıdır");

        }else{
                System.out.println(sayı + " sayısı asal bir sayı değildir");
            }

        }

    }
