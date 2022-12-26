package ders09_SringManipulations;

public class c04_charAt {
    public static void main(String[] args) {
        String str="java Candir";

        System.out.println(str.charAt(0));// ilk harfi verir
        System.out.println(str.charAt(5));// 5. index deki char i verir C harfini
        System.out.println(str.charAt(10));// bana sonuncu karakteri yazdırır

        /*
        bir metindeki karakter sayisi ile son index arasında 1 fark vardır
        bu metin icin karakter sayısı:11
        bu metın ıcın ındex    sayısı:10 dur
         */

        //System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException.Sınırların dısına cıkılmıstır.



    }
}
