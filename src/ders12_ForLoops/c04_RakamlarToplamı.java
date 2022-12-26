package ders12_ForLoops;

public class c04_RakamlarToplamı {
    public static void main(String[] args) {
        // kullanıcının verdıgı sayının rakamlar toplamını bulun

        long sayi=1453L;
        String sayistr=""+sayi;// sayının Strıngını aldık length ını yazdırmak için

        long birlerbasamagı=0;
        long rakamlartoplamı=0;

        for (int i = 1; i <=sayistr.length() ; i++) {


            birlerbasamagı=sayi%10;
            rakamlartoplamı=rakamlartoplamı+birlerbasamagı;
            sayi=sayi/10;

        }

        System.out.println(rakamlartoplamı); // 13



    }
}
