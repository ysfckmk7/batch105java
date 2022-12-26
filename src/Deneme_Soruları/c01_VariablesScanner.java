package Deneme_Soruları;

public class c01_VariablesScanner {
    public static void main(String[] args) {


        // 1-
        //Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdırın


        int sayi=3;// intejer sayi degeri tamsayı degerlerı alır
        double dbl=3.14;// double data turu ondalıklı sayıları alır
        boolean bl=true;// bu data turu true veya false dondurur

        //2-
        //Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdırın

        double dbll=3.14;
        int sayi2=13;

        System.out.println(dbll+sayi2);// 16.14

        System.out.println(dbll*sayi2);// 40.82

        //3-
        /*Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir*/

        String isim="John";
        String soyısım="Doe";
        int yas=44;


        System.out.println("isminiz:" + isim + "\nsoyisminiz:" + soyısım +
                "\nyasınız:" + yas + "\nKaydiniz basariyla tamamlanmistir" );














    }

}
