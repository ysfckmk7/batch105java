package ders25_İmmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        // verılen bir list'de degısıklık yapan 2 method olusturun
        // 1.method list'in elementlerine yeni deger atayıp yazdırsın
        // 2.method list'e yenı bir list degeri atayıp yenı list'e elementler ekleyıp yazdırsın
        // her iki method'u cagırdıktan sonra main method'dakı list'i yazdıralım

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(34);
        sayılar.add(45);
        System.out.println(sayılar);// [10, 34, 45]

        elemanlariDegiştir(sayılar);

        System.out.println("1. method call'dan sonra sayılar : " + sayılar);// [25, 54, 67]

        yenıListAta(sayılar);

        System.out.println("2. method call'dan sonra sayılar : " + sayılar);// [25, 54, 67]

        /*
        Java PassByValue kullanır

        PassByValu, method'a gonderılen varıable'ın kendısını degıl degerını gondermek demektır
        primitive data turlerı veya Strıng gonderdıgımızde, method'da yapılan degısıklık method'da kalır
        main method'da atama yapılmadıkca maın method'daki varıable'in degeri DEGISMEZ


        PassByValue coklu element ıceren array ve list gıbı yapılar ıcın de GECERLİDİR
        Ancak coklu elementi value olarak method'a gondermedıgınden
        array veya list'in adresini gonderır
        Eger method'da elementlere atama yapılırsa, maın method'dakı elementler de degismıs olur
        Eger list veya array'e yenı bır list veya array degeri atanırsa method'da kalır
        main method'dakı list veya array degısmez

        Araba aynı kaldıgı muddetce ıcındekılerın degısmesı passByValue'e aykırı degıldır

         */



    }
    public static void elemanlariDegiştir(List<Integer> sayılar){

        sayılar.set(0,25);
        sayılar.set(1,54);
        sayılar.set(2,67);
        System.out.println("elemanları degıstır methodunda list : " + sayılar);// [25, 54, 67]




    }

    public static void yenıListAta(List<Integer> sayılar){

        sayılar=new ArrayList<>();
        sayılar.add(34);
        sayılar.add(98);
        sayılar.add(11);
        System.out.println("Yeni list methodunda sayılar list'in son hali : " + sayılar);// [34, 98, 11]


    }
}
