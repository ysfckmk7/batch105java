package ders12_ForLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {
       /*  sonsuz loop
        for (int i = 0; i >-10 ; i++) {
            System.out.println(i+" ");
        }
        */

        //ilk deger icin bıtıs sartı true olmuyorsa
        //for body sı devreye giremez

        for (int i = 0; i >10 ; i++) {
            System.out.println(i);
        }

        // bır loop u sonunu beklemeden bıtırmek ıstersek

        // kullanıcının verdıgı bır sayının asal sayı olup olmadıgını bulun
        // asal sayı: 1 ve kendısı dısında hic bır tamsayıya tam bolunmeyen sayı


        int sayi=5300;
        boolean bayrak=true;

        for (int i = 2; i <=sayi-1 ; i++) {
            if (sayi%i==0){
                // askımız bıttı
                bayrak=false;
                break;// break yazmamızın sebebı ılk asal olmayan sayıya bolundukten sonra durmasıdır
            }

        }

        System.out.println(bayrak+" ");

        if (bayrak){
            System.out.print("asal sayıdır");
        }else{
            System.out.print("asal sayı degildir");
        }

    }
}
