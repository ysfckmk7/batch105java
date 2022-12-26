package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ElementEkleme {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        System.out.println(sayilar);// []


        System.out.println(sayilar.add(10));// true // hem 10 eklemis olduk.hemde eklendgıne sahıt olduk

        System.out.println(sayilar);// [10]

        sayilar.add(20);
        System.out.println(sayilar);// [10, 20] tersi soylenmedıkce elementi sona ekler

        sayilar.add(1,15);
        System.out.println(sayilar);// [10, 15, 20]

        // listenın basına 44 ekleyın

        sayilar.add(0,44);
        System.out.println(sayilar);// [44, 10, 15, 20]

        List<Integer> eklenecekListe=new ArrayList<>();

        eklenecekListe.add(3);
        eklenecekListe.add(5);

        // sayılar listenın sonuna eklenecek listeyı ekleyın

        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);// [44, 10, 15, 20, 3, 5]

        // sayılar listesinin basındakı 44'den sonraya eklenecek listeye ekleyın

        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);// [44, 3, 5, 10, 15, 20, 3, 5]



    }
}
