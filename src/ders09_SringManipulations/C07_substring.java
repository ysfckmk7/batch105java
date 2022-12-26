package ders09_SringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java gun gectıkce güzelleşiyor";
        System.out.println(str.substring(5,8)); // gun
        // 5. ındexden baslar (8-5=3) karakter yazdırır
        // 5. ındex dahil (inclusive), 8. index haric(exclusıve)

        //gectıkce yazdıralım
        System.out.println(str.substring(9,17)); // gectıkce
        System.out.println(str.substring(3,7)); // a gu

        String isim="HASAN";
        // Verılen ismi ilk harfi buyuk, gerıye kalanlar kucuk harf olarak kaydedın
        isim= isim.substring(0,1).toUpperCase() +// ilk harfi alip buyuk harf yaptık
              isim.substring(1).toLowerCase();// 1. index ve sonrasını alip kucuk harf yaptık
        //System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()); // sout lada yapabiliriz

        System.out.println(isim); // Hasan

        // Sadece 3. harfi S yazdırın
        System.out.println(isim.substring(2,3).toUpperCase()); // S
        System.out.println(isim.substring(2,2)); // hıclık yazdırır
        //System.out.println(isim.substring(5,2));// StringIndexOutOfBoundsException// hata verir




















    }
}
