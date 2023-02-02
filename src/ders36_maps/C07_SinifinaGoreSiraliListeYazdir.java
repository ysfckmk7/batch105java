package ders36_maps;

import ders35_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifinaGoreSiraliListeYazdir {
    public static void main(String[] args) {

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal olarak
        // Yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeYazdir(ogrenciMap);



    }
}
