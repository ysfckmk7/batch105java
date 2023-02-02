package ders35_sets_maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    public static void main(String[] args) {

        // verılen sınıf ve sube ısmı ıle sınıf lıstesını yazdıran method olusturun


        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.subeListesiYazdırma(ogrenciMap,"11","H");


    }
}
