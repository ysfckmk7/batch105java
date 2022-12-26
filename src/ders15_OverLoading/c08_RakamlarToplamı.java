package ders15_OverLoading;

public class c08_RakamlarToplamı {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.


        int sayı=1453;

        int bırlerbasamagı=0;
        int rakamlartoplam=0;

        while (sayı!=0){
            bırlerbasamagı=sayı%10;
            rakamlartoplam+=bırlerbasamagı;
            sayı/=10;

        }
        System.out.println(rakamlartoplam);


    }


}

