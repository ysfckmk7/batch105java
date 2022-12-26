package ders07_NestedIfSTATEMENTS;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class c04_NestedIfStatements {
    public static void main(String[] args) {
        // kullanıcıdan cınsıyetını ve yasını alın, kadın 60 yas ve uzerı
        // erkek 65 yas ve uzerı emeklı olabılır
        // cınsıyet ve yasını dıkkate alarak
        // "emeklı olabılırsın" veya "emeklı olmak icin ... Yıl daha calısman gerekır" yazdırın

        // ana degısken yas olsun

        /*Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz");
        double yas= scan.nextDouble();
        System.out.println("lutfen cınsıyetı giriniz E/K");
        char cinsiyet=scan.next().charAt(0);*/

        char cinsiyet= 'e';
        double yas=31;






        if (yas<15){ // 15 den kucukse
            System.out.println("hatali giriş");
        } else if (yas<60) {
            //emekli olamaz, calısması gereken sure cınsıyete baglı
            System.out.println("emekli olamazsın");
            if (cinsiyet=='E' || cinsiyet=='e'){
                System.out.println("emekli olabilmesi için:  " + (65-yas) + " yil daha gereklidir");

            } else if (cinsiyet=='K' || cinsiyet=='k') {
                System.out.println("emekli olabilmesi için:" + (60-yas) + " yil daha gereklidir");
            }else{
                System.out.println("cisıyet yanlıs girdiniz");
            }

        } else if (yas<65) {
            //kadın  emekli, erkek calısması lazım
            if (cinsiyet=='E' || cinsiyet=='e'){
                System.out.println("emekli olabilmesi için:  " + (65-yas) + " yil daha gereklidir");

            } else if (cinsiyet=='K' || cinsiyet=='k') {
                System.out.println("emekli olablirsin");

            }else{
                System.out.println("cisıyet yanlıs girdini");
            }

        }else{// 65 den buyukse
            System.out.println("emekli olabilirsin");
        }


    }
}
