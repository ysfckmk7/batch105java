package ders10_stringManipulation;

public class c05_Soru {
    public static void main(String[] args) {

        /*
           mail kontrolu yapan bır program hazırlayın
           1- mail @ isareti icermiyorsa "gecersiz email"
           2- @gmail.com ıcermiyorsa "gmail adresi giriniz"
           3-@gmail.com ile bitmiyorsa "yazim hatasi"
           seklınde sonuc yazdırın

         */

        String mailadresi="ysfckmk7@gmail.com";

        if (!mailadresi.contains("@")){

            System.out.println("gecersiz email");

        } else if (!mailadresi.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");

        } else if (!mailadresi.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");


        }else{
            System.out.println("mail basarı ıle kaydedıldı");
        }

    }


    }
