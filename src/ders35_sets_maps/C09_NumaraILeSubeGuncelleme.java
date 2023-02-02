package ders35_sets_maps;

import java.util.Map;

public class C09_NumaraILeSubeGuncelleme {
    public static void main(String[] args) {

        // Numarasi verilen ogrencının sube ismini
        // verilen sube yapan bır method olusturun


        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.numaraILeSubeDegistirme(ogrenciMap,104,"M");
        MapMethodDepo.numaraILeSubeDegistirme(ogrenciMap,101,"L");

        System.out.println(ogrenciMap);

    }
}
