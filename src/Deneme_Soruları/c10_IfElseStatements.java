package Deneme_Soruları;

import javax.print.DocFlavor;

public class c10_IfElseStatements {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet='k';
        int yas=33;

        if (cinsiyet=='E' || cinsiyet=='e') {
            if (yas >= 65) {
                System.out.println("emekli olabilirsin");

            } else if (yas < 60 && yas > 20) {
                System.out.println("emekli olabilmesi için: " + (65 - yas) + " yıl daha calışması gerekir");
            }else{
                System.out.println("gecersiz yas girdiniz");
            }
        }else if (cinsiyet=='K' || cinsiyet=='k') {

            if (yas>=60){
                System.out.println("emekli olabilirsin");

            } else if (yas<60 && yas>20) {
                System.out.println("emekli olabilmesi için: " +(60-yas)+ " yıl daha calişması  gerekir" );
            }else {
                System.out.println("gecersiz yaş aralıği girdiniz");
            }


        }else{
            System.out.println("Geçersiz bilgi girdiniz");
        }



        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        double kilo=79;
        double boy=179;

        double vke=(double)(kilo*10000 / (boy *boy));

        if (vke>=30){
            System.out.println("obez \nvke:" + vke);
        }else if (vke>25){
            System.out.println("kilolu \nvke:" + vke);
        } else if (vke>20) {
            System.out.println("normal \nvke:" + vke);
        } else if (vke>0) {
            System.out.println("zayıf \nvke" + vke);
        }else{
            System.out.println("yanlıs deger girdiniz");
        }


    }
}
