package ders03_datacastingWrapperClass;

public class c02_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi=20;
        /*
        genıs data turundekı bır degerı
        dar data turundekı  bır varıable'a atamak istersenız
        java sorumlulugu almanızı ister
        bu sorumlulugu almak ıcın
        cast edeceginiz degerin onune () icerisinde
        cast etmek istediğiniz data turu yazılır
        ancak bu durumda data kayıpları(double'den gecerken virgulden sonrası silinir)
        veya baskalasım olabılır(int'i byte cevirirsek tekrar basa doner)

         */
        short sh=(short) sayi; //20
        System.out.println(sh);
        double dbl=23.5;
        int sar=(int)dbl;
        System.out.println(sar); //23
        sar=17;
        byte byt=(byte)sar;
        System.out.println(byt);//17
        sar=128;
        byte byta=(byte)sar;
        System.out.println(byta);// -128






    }
}
