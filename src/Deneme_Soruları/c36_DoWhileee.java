package Deneme_Soruları;

import java.util.Scanner;

import static ders16_doWhileLoop.c03_SıfreKontrolu.kucukHarfKontroluYap;

public class c36_DoWhileee {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir sifre girmesini isteyin.
        //Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        //ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //Sifre kucuk harf icermelidir
        //Sifre buyuk harf icermelidir
        //Sifre ozel karakter icermelidir
        //Sifre en az 8 karakter olmalidir.

        Scanner scan=new Scanner(System.in);
        String sıfre;
        int bayrak;
        boolean SıfreDogruMu;


        do {
            System.out.println("luttfen sıfre gırınız");
            sıfre=scan.nextLine();
            bayrak=0;

            //Sifre kucuk harf icermelidir


            int sonuc=KucukHarfKontroluYap(sıfre);
            bayrak+=sonuc;


            sonuc=BuyukHarfKontroluYap(sıfre);
            bayrak+=sonuc;


            sonuc=OzelKarakterKontrol(sıfre);
            bayrak+=sonuc;

            if (sıfre.length()<8){
                System.out.println("sıfre 8 harften uzun olmalıdır");
            }else{
                bayrak++;

            }

        }while (bayrak!=4);
        System.out.println("Sifreniz basarılı ile Kabul edilmistir");

            }

    private static int OzelKarakterKontrol(String sıfre) {
        int bayrak = 0;
        String ozelkarakterler = "!>'£^3+$#%½&{[(]=*?945";

        for (int i =0; i < sıfre.length(); i++) {

            if (ozelkarakterler.contains(sıfre.substring(i,i+1))) ;
            bayrak++;
            break;
        }
        if (bayrak == 0) {
            System.out.println("sıfre ozel karakter ıcermelıdır");
            return 0;
        }else return 1;


    }

    private static int BuyukHarfKontroluYap(String sıfre) {
        int bayrak = 0;
        for (int i = 0; i < sıfre.length(); i++) {

            if (sıfre.charAt(i) >= 'A' && sıfre.charAt(i) <= 'Z') {
                bayrak++;
                break;
            }
        }

            if (bayrak == 0) {
                System.out.println("lutfen sıfeyı buyuk harf ıle gırınız");
                return 0;
            } else return 1;

        }


    private static int KucukHarfKontroluYap(String sıfre) {
        int bayrak = 0;

        for (int i = 0; i < sıfre.length(); i++) {

            if (sıfre.charAt(i) >= 'a' && sıfre.charAt(i) <= 'z'){
            bayrak++;
            break;
            }
        }

        if (bayrak == 0) {
            System.out.println("sıfre kucuk harf ıcermelıdır");
            return 0;
        } else return 1;

    }
}










