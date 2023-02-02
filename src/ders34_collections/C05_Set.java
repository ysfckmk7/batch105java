package ders34_collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {

        // set index yapısını desteklemez

        Set<String> ogrencıler=new TreeSet<>();

        ogrencıler.add("Esra");
        ogrencıler.add("Ayten");
        ogrencıler.add("Furkan");

        System.out.println(ogrencıler);// [Ayten, Esra, Furkan]

        ogrencıler.add("Ahmet");
        System.out.println(ogrencıler);// [Ahmet, Ayten, Esra, Furkan]

        ogrencıler.add("Furkan");
        System.out.println(ogrencıler);// [Ahmet, Ayten, Esra, Furkan] // eskı furkan yerıne yenısını ekler



    }
}
