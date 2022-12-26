package ders14_methodOlusturma;

public class c05_SubstrıngOlustur {
    /*
soru 1- Kullanicidan input olarak  bir String alın,
        baslangic ve bitis indexlerine gore baslangic index'i dahil,
        bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun
        kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin-
        kullanici input'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */

    public static void main(String[] args) {
        String input="Java ne kadar guzel";
        int basIndex=5;
        int bıtIndex=7;

        kendıSubstrıngMethodumuz(input,basIndex,bıtIndex);//ne
        kendıSubstrıngMethodumuz("Java",1,3);// av
        kendıSubstrıngMethodumuz("deneme",6,3);// Baslangıc ındexi,bıtıs ındexınden buyuk olamaz
        kendıSubstrıngMethodumuz("Java",6,8);// bitis indexi Strıngın sınırları dısında



    }
    public static void kendıSubstrıngMethodumuz(String input,int basIndex,int bıtIndex){


        if (basIndex>bıtIndex){
            System.out.println("Baslangıc ındexi,bıtıs ındexınden buyuk olamaz");
        } else if (bıtIndex>=input.length()) {
            System.out.println("bitis indexi Strıngın sınırları dısında ");
        }else{
            // baslangıc ve bıtıs ındexlerıne gore baslangıc ındexı dahıl
            // bıtıs ındex ı harıc olacak sekılde
            // aradakı harfleri yazdıran bır method olusturun

            for (int i =basIndex; i <bıtIndex ; i++) {

                System.out.print(input.charAt(i));
            }


            System.out.println("");

        }




    }




}
