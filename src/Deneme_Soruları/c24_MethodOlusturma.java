package Deneme_Soruları;

public class c24_MethodOlusturma {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan input olarak verilen bir String,
        // baslangic ve bitis indexlerine gore baslangic index'i dahil,
        // bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        // kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin-
        // kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.



        String input="JAva harika bir programlama dilidir";
        int basindex=5;
        int bitindex=8;


            IndexYazımı(input,basindex,bitindex);

    }
    public static String IndexYazımı(String input,int basindex,int bitindex){



            if (basindex>bitindex){
                System.out.println("baslangıc index degeri, bitiş index degerinden kucuk olmalı");
            } else if (bitindex>input.length()) {
                System.out.println("bitis index dgeri,Strıng uzunlugu degrının dısında");
            }else{


        for (int i =basindex; i <bitindex; i++) {

            System.out.print(input.charAt(i));
        }

            }
            return input;

    }

}
