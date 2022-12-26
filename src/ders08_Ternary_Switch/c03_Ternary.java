package ders08_Ternary_Switch;

public class c03_Ternary {
    public static void main(String[] args) {
        int a=6;
        /*
        Ternary operatoru tek basına kullanılamaz
        Ternary bıze bır sonuc uretır
        bu sonucu ya dırek yazdırmalı veya bir variable a atamalıyız
         */

         String sonuc=a%2==0 ? "cift sayı" : "teksayi";
         /*
         ternary nın sonucunu bır variable a atayacaksak
         true ve false durumlarında uretilecek sonucun
         ayni data turune uygun olması gerekir.
         aksi halde CTE(ERROR) olusur

         ama ternary ı sout ıcınde kullanırsak
         sonucların data turunun aynı olması sart almaz
          */


        String sonuc2=a>10 ? "buyuk sayı" : "" + 2*a ; // CTE vermemesi icin  int i String e cevirdik

        System.out.println(a>10 ? "buyuk sayı" : 2*a); //12   sout ıcınde yazıldıgı ıcın cevırme yapmadık

        System.out.println(sonuc);// cıft sayı

        System.out.println(sonuc2);//12


    }
}
