package Deneme_Soruları;

public class c04_DataCasting {
    public static void main(String[] args) {
        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin



        int sayi1=5;
        int sayi2=9;
        int sayi3=15;

        double ort=((double) sayi1+sayi2+sayi3)/3;

        System.out.println(ort); // 9.666666666666666
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        char harf='a';

        System.out.println(""+(char)(harf+1)+(char)(harf+2)+(char)(harf+3));
        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        int sayi=111;

        byte by=(byte)sayi;
        System.out.println(by);
        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        double dbl1=125.4;
        double dbl2=12;

        System.out.println((int) (dbl1/dbl2)); //10

        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin

        double dobl=12.12;
        int tamsayı=12;

        System.out.println((int) (dobl/tamsayı));













    }
}
