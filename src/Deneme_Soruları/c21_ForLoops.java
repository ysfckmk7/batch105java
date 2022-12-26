package Deneme_Soruları;

public class c21_ForLoops {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        int sayi=5;

        int faktorıyel=1;

        for (int i =1; i <=sayi ; i++) {

            faktorıyel=faktorıyel*i;
            System.out.println(faktorıyel);

        }
        System.out.println("5! = 5 * 4 * 3 * 2 * 1 = " + faktorıyel);
        System.out.println("");

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        int sayı=1453;
        String sayıstr=""+ sayı;

        int birlerbasamagı=0;
        int rakamlartoplamı=0;

        for (int i =1; i <=sayıstr.length() ; i++) {

            birlerbasamagı=sayı%10;
            rakamlartoplamı=rakamlartoplamı+birlerbasamagı;
            sayı=sayı/10;



        }
        System.out.println(rakamlartoplamı);




    }
}
