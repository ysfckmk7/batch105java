package ders14_methodOlusturma;

public class c04_Tekrar {
    public static void main(String[] args) {


        int a=10;
        int b=20;
        // bu ıkı sayının carpım sonucunu yenı kod yazmadan konsola yazdırın

        System.out.println(c01_Carpım.carpımsonucu(a, b));// 200

        String c="Nasıl";
        String d="Yani";
        // bu ıkı Strıng i aralarında bır bosluk bırakarak yazdırın

        System.out.println(c02_StrıngConcate.birlesım(c, d));// Nasıl Yani

        String e="bu da mı oldu";
        // Strıngını tersten yazdırın

        System.out.println(c03_StrigTerseCevırme.terseDondurme(e));// udlo ım ad ub

        // "Bu cumleyı terse cevırin"

        System.out.println(c03_StrigTerseCevırme.terseDondurme("Bu cumleyı terse cevırin"));// nirıvec esret ıyelmuc uB


    }
}
