package ders16_doWhileLoop;

public class c01__WhileLoop {
    public static void main(String[] args) {

        //10-11-12 sayılarını toplayan bır while loop olusturalım



        int sayı=10;
        int toplam=0;

        while (sayı<=12){
            toplam+=sayı;
            sayı++;

        }
        System.out.println(toplam);

        // WHİLE LOOP DA ONCE KONTROL SONRA ISLEM YAPILIR

        /*
        WHİLE LOOP DA 2 PROBLEM  OLUSULABİLIR
        1-ONCE DEGERİ KONTROL EDİP,SONRA İŞLEM YAPTIĞIMIZDAN
        BODY DE BIR KERE DAHA KONTROL ETMEMİZ GEREKEBİLİR
        2-YAPILAN İŞLEM SAYISINDAN 1 FAZLA WHİLE BİTİŞ SARTI KONTROL EDİLİR
        3-WHİLE LOOP ONCESINDE DEGERLERI KONTROL EDECEGIMIZ BIR VARIABLE OLUSTURUYORSAK
         ONA YAPACAGIMIZ ATAMAYI DIKKATLI YAPMAMIZ GEREKİR
         YANLIS DEGER ATAMASI YAPMAK,WHİLE LOOP UN CALISMAMASINA NEDEN OLABİLİR

         */

    }
}
