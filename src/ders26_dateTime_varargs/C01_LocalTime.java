package ders26_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);// 13:07:03.877355200

        System.out.println(zaman.getMinute());// 7

        System.out.println(zaman.withSecond(0).withNano(0));// 13:08
        System.out.println(zaman.withSecond(1).withNano(1));// 13:09:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(250));// 21:20:10.343005900

        // bir for loop ile 1'den 10000' kadar olan sayilari yanyana yazdırın
        // bu işlem icin gecen zamani bulun

        LocalTime basZamanı= LocalTime.now();
        System.out.println("baslangıc : " + basZamanı);
        for (int i =1; i <=10000 ; i++) {
            System.out.print(i+" ");
        }
        LocalTime bitZamanı=LocalTime.now();
        System.out.println("");
        System.out.println("Bitiş : " + bitZamanı);

        System.out.println("Gecen Zaman : " + (bitZamanı.getNano()-basZamanı.getNano())+" Nano saniye");// Gecen Zaman : 107071100 Nano saniye


        /*
           OLuşturdugumuz time veya date guncel zamanı veya tarihi tutmaya devam eden bir sayac degıl
           olusturdugumuz satırdakı zamanı veya tarıhı'i sistemden alıp kaydeden bir variable'dir

           ilerleyen satırlarda guncel zaman veya tarihe ihtiyacımız oldugunda
           yeni bir time veya date objesi olusturup o andakı degeri alabiliriz

         */

    }
}
