package ders16_doWhileLoop;

import java.util.Scanner;

public class c03_SıfreKontrolu {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir sifre girmesini isteyin.
        // Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
        // Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        // ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        // Sifre kucuk harf icermelidir
        // Sifre buyuk harf icermelidir
        // Sifre ozel karakter icermelidir
        // Sifre en az 8 karakter olmalidir.


        Scanner scan=new Scanner(System.in);
        String sıfre;
        int bayrak;
        boolean sıfrDogrumu;

        do {
            System.out.println("lutfen sıfrenızı giriniz");
            sıfre=scan.nextLine();
            // tum hataları soylemesını istiyorsak
            // bagımsız if cümleleri ve bayrak kullanmak zorundayız
            bayrak=0;

            // Sifre kucuk harf icermelidir
            int sonuc=kucukHarfKontroluYap(sıfre);
            // kucuk harf kontrolu yapan bir method olusturalım
            // kucuk harf varsa 1,yoksa 0 dondursun
            bayrak+=sonuc;

            // Sifre buyuk harf icermelidir
            sonuc=buyukHarfKontroluYap(sıfre);
            // buyuk harf kontrolu yapan bir method olusturalım
            // buyuk harf varsa 1,yoksa 0 dondursun
            bayrak+=sonuc;

            // Sifre ozel karakter icermelidir
            sonuc=ozelKarakterKontroluYap(sıfre);
            bayrak+=sonuc;

            // Sifre en az 8 karakter olmalidir.
            if (sıfre.length()<8){
                System.out.println("sıfre en az 8 karakter olmalıdır");
            }else{
                bayrak++;
            }
            // bayrak 4 ise sifre tamam, degilse hata vardır


        }while (bayrak!=4);
        System.out.println("Sifreniz basarı ile Kabul edildi");

    }

    public static int ozelKarakterKontroluYap(String sıfre) {
        int bayrak=0;
        String ozelKarakterler="!'^#+$%5&/{(]=}?*_";
        // Sifre ozel karakter icermelidir
        // bunun için tum harfleri kontrol edecek bir for loop olusturmalıyım
        // eger sıfrenın karakterrlerınden bir tanesını ozelKarakterler Strıngi iceriyorsa
        // bizim için yeterlı olur

        for (int i =0; i <sıfre.length() ; i++) {

            if (ozelKarakterler.contains(sıfre.substring(i,i+1))){
                bayrak++;
                break;
            }
        }
        // bayrak==0 ıse ozel karakter yoktur,yanı bır hata var bunu yazdıralım
        if (bayrak==0){
            System.out.println("Sifre ozel karakter icermelidir");
            return 0;
        }else  return 1;

    }

    public static int buyukHarfKontroluYap(String sıfre) {

        int bayrak=0;
        // Sifre buyuk harf icermelidir
        // bunun için tum harfleri kontrol edecek bir for loop olusturmalıyım
        // bır tane buyuk harf bulmam yeterlı olucak

        for (int i =0; i <sıfre.length() ; i++) {

            if (sıfre.charAt(i)>='A' && sıfre.charAt(i)<='Z'){
                bayrak++;
                break;
            }
        }
        // bayrak==0 ıse buyuk harf yoktur,yanı bır hata var bunu yazdıralım
        if (bayrak==0){
            System.out.println("Sifre buyuk harf icermelidir");
            return 0;
        }else  return 1;

    }

    public static int kucukHarfKontroluYap(String sıfre) {
        int bayrak=0;
        // Sifre kucuk harf icermelidir
        // bunun için tum harfleri kontrol edecek bir for loop olusturmalıyım
        // bır tane kucuk harf bulmam yeterlı olucak

        for (int i =0; i <sıfre.length() ; i++) {

            if (sıfre.charAt(i)>='a' && sıfre.charAt(i)<='z'){
                bayrak++;
                break;
            }
        }
        // bayrak==0 ıse kucuk harf yoktur,yanı bır hata var bunu yazdıralım
        if (bayrak==0){
            System.out.println("Sifre kucuk harf icermelidir");
            return 0;
        }else  return 1;
    }

}
