package ders35_sets_maps;

import java.util.*;

public class MapMethodDepo {
    // bıze ogrencıMap donduren bır map olusturun

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;

    }

    public static boolean isimleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1- tum value'lerı bır collectıon olarak kaydedelım
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection = ogrenciMap.values();

        // 2- for-each kullanarak her bır value'yu ele alalım. Ali-Can-11-H-MF
        // 3- -'yı kullanarak split yapalım [Ali, Can, 11, H, MF]
        // 4- split yaptığınız array'den isim bilgisini alalım 0.index
        // 5- eger value'den aldıgımız isim, aranan isim ile aynı ıse
        //    true dondurup, for-each'i bıtırelım
        // 6- for-each bıttıgınde true olmadıysa false dondurelım

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIsim = valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }


        return false;
    }

    public static void soyisimIleOgrenciListesiYazdırma(Map<Integer, String> ogrencıMap, String soyisim) {

        // 1-map'dekı value'leri bır collectıon olarak kaydedelım
        //   [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        Collection<String> ogrenciValueColection = ogrencıMap.values();
        // Listenın ilk satırı olarak baslıkları yazdıralım
        System.out.println("Isim Soyisim Sinif Sube");


        // 2-for-each ile her bir value bılgısını ele alalım Ali-Can-11-H-MF
        // 3-value'yu - ile split yapıp bır array elde edelım [Ali, Can, 11, H, MF]
        // 4-array'in 1.index'indeki soyısıme bakıp, aranan soyısım ıle aynı ıse
        //   isim, soyısım, sınıf ve sube bılgılerını yazdıralım

        for (String eachValue : ogrenciValueColection
        ) {

            String[] valueArr = eachValue.split("-");
            String valuesoyisim = valueArr[1];
            if (valuesoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[2] + " " +
                        valueArr[3]);

            }

        }
    }

    public static void subeListesiYazdırma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Isim    Soyisim");

        for (String eachValue : valueCollection
        ) {
            String[] valueArr = eachValue.split("-");//[Ayse,Can,10,H,MF]

            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {

                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }

    }

    public static Map<Integer, String> numaraILeSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {

        // 1- okul numarasını bılıyoruz, dırek ogrencı value'ye ulasabılırız

        String ogrenciValue = ogrenciMap.get(okulNo);// Ayse-Can-10-H-MF

        String[] valueArr = ogrenciValue.split("-");// [Ayse,Can,10,H,MF]

        //2- sube ismini guncelleyelim


        valueArr[3] = yeniSubeIsmi;// [Ayse,Can,10,M,MF]

        // 3- array'deki guncel bılgılerı yenıden value formatında bır Strıng yapalım

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" +
                valueArr[3] + "-" + valueArr[4];

        // 4- ogrenci no yani key ile yeni value'yu map'e ekleyelim

        ogrenciMap.put(okulNo, yeniValue);

        return ogrenciMap;
    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        // Verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        System.out.println("No isim soyisim bolum");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) {// 101=Ali-Can-11-H-MF

            // 1- entry'den value'yu alalim
            String entryValue = eachEntry.getValue();// Ali-Can-11-H-MF

            // 2- bu value'yu parcalayalim ve bir array'e store edelim
            String[] valueArr = entryValue.split("-");// Ali, Can, 11, H, MF

            // sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if (valueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntry.getKey() + "=" +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4]);
            }
        }


    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {
        // verilen bolumdeki ogrencilerin
        // No, isim, soyisim ve siniflarini yazdiran
        // bir method olusturun

        System.out.println("No isim soyisim sinif");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) {

            String entryValue = eachEntry.getValue();

            String[] ValueArr = entryValue.split("-");// [Ali, Can, 11, H, MF]

            if (ValueArr[4].equalsIgnoreCase(bolum)) {

                System.out.println(eachEntry.getKey() + " " +
                        ValueArr[0] + " " +
                        ValueArr[1] + " " +
                        ValueArr[2]);
            }
        }

    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        // Map'deki soyisimleri buyuk harfe ceviren bir method olusturun
        // soyisimleri buyuk harf yapalim
        // 1- entrySet olusturalım

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        // 2- for-each loop ile her bir entry'yi elden gecirip, soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            // 3- entry'den value'yu alalim
            String entryValue = eachEntry.getValue();// Ali-Can-11-H-MF
            // 4- soyisim bilgisine ulasıp degistirebilmek icin parcala
            String[] entryValueArr = entryValue.split("-");// [Ali, Can, 11, H, MF]
            // soyisimi buyuk harf yapalim

            entryValueArr[1] = entryValueArr[1].toUpperCase();// [Ali, CAN, 11, H, MF]

            // 6- degisikligi yaptıktan sonra yeniden birlestirmeleri yapip
            //    map'i update etmeliyiz

            // 7- setValue() kullanarak value'yu yeni haline update edelim

            eachEntry.setValue(entryValueArr[0] + "-" +
                    entryValueArr[1] + "-" +
                    entryValueArr[2] + "-" +
                    entryValueArr[3] + "-" +
                    entryValueArr[4]);


        }

        return ogrenciMap;
    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {


        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) { // 101=Ali-Can-11-H-MF

            String entryValue = eachEntry.getValue();// Ali-Can-11-H-MF

            String[] entryValueArr = entryValue.split("-");// [Ali, CAN, 11, H, MF]

            int sinifInt = Integer.parseInt(entryValueArr[2]);

            if (sinifInt == 12) {

                entryValueArr[2] = "Mezun";

            } else {

                entryValueArr[2] = sinifInt + 1 + "";// uyum saglansın dıye hıclık eklıyoruz
            }

            // sinif bilgisini guncelledik
            // bu guncellemeyi map'e ıslememiz lazim

            eachEntry.setValue(entryValueArr[0] + "-" +
                    entryValueArr[1] + "-" +
                    entryValueArr[2] + "-" +
                    entryValueArr[3] + "-" +
                    entryValueArr[4]);


        }
        return ogrenciMap;
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal olarak
        // Yazdiran bir method olusturun


        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();


        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue = eachEntry.getValue();// 101=Ali-Can-11-H-MF

            String[] entryValueArr = entryValue.split("-");// [Ali, Can, 11, H, MF]

            // Entry'den istenen bilgileri alip yeni bir String olusturacagız
            // ve bu String'leri sirali olarak yazdıracagız

            String istenenFormattakiBilgi = entryValueArr[2] + " " + entryValueArr[3] + " " +
                    entryValueArr[0] + " " + entryValueArr[1] + " " +
                    eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);

        }

        System.out.println("sinif sube isim soyisim no ");
        System.out.println("===========================");
        for (String each : siraliOgrenciSeti) {
            System.out.println(each);



        }


    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // tum ogrenci listesini isim soyisim no sinif sube bolum

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet = new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-");// [Ali, Can, 11, H, MF]

            String istenenFormattakiBilgi = entryValueArr[0] + " " + entryValueArr[1] + " " +
                    eachEntry.getKey() + " " + entryValueArr[2] + " " +
                    entryValueArr[3] + " " + entryValueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);

        }
        // sirali set'i yazdiralim

        System.out.println("isim soyisim no sinif sube bolum ");
        System.out.println("===========================");
        for (String each : isimSoyisimSiraliSet
        ) {
            System.out.println(each);
        }

    }

    public static void sinifListesiYazdiralim(Map<Integer, String> ogrenciMap, String sinif) {

        Set<Map.Entry<Integer, String>> entryseti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entryseti) {

            String eachValue = eachEntry.getValue();

            String[] eachValueArr = eachValue.split("-");// [Ali, Can, 11, H, MF]

            if (eachValueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntry.getKey() + "=" +
                        eachValueArr[0] + " " +
                        eachValueArr[1] + " " +
                        eachValueArr[2] + " " +
                        eachValueArr[3] + " " +
                        eachValueArr[4]);
            }
        }


    }
}

