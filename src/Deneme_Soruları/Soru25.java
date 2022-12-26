package Deneme_Soruları;

import java.util.Scanner;

public class Soru25 {
    public static void main(String[] args) {

        //Kullanıcıdan bir cumle ve harf alın
        //Cumlenın ıcınde kac tane alınan harften oldugunu bulun

        String cumle="Java harika bir programlama dilidir";
        String harf="a";
        int sayac=0;

        for (int i =0; i <cumle.length() ; i++) {
            if (cumle.substring(i,i+1).equals(harf)){
                sayac++;
            }
        }
        System.out.print(sayac);
    }
}
