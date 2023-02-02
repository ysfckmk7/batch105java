package ders35_sets_maps;

import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {

        // mapolustur method'u bıze bır map donduruyor
        // bız o class'dakı map'ı kullanmak ıstıyoruz ama
        // her seferınde o class'a gıdıp o map'ı yenıden olusturmanız ısımıze yaramaz

        // Bu class'da bır map olusturmak ıstedıgımızde
        // new HashMap<>() yazıyoruz
        // ancak bu bıze bos bır map getırıyor
        // bu kodun yerıne mapMethodDepo'dan ogrencıMapOlustur method'unu calıstırırsak
        // bıze dolu bır map getırır
        // bız de onu ıcınde oldugumuz class'da olusturdugumuz ogrencıMap'e atama yaparız

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());// [101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        // Verilen ısmın ogrencıMap'de olup olmadıgını kontrol edıp
        // true veya false donen bır method olusturun

        boolean sonuc=MapMethodDepo.isimleOgrenciArama(ogrenciMap,"Ali");

        System.out.println(sonuc);// true

        System.out.println(MapMethodDepo.isimleOgrenciArama(ogrenciMap, "Kemal"));// false
        System.out.println(MapMethodDepo.isimleOgrenciArama(ogrenciMap, "Cem"));// false

    }
}
