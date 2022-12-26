package ders11_stringManipulation;

public class c03_replaceAll {
    public static void main(String[] args) {
        String str= "J1ava2 G9uzel5dir8";
        //str dakı sayıları sılıp metnı Java Guzeldır halıne donusturelım

        System.out.println(str.replaceAll("\\d",""));//Java Guzeldir
        System.out.println(str.replaceAll("\\D",""));//12958

        String s1="ilk urun fiyatı:1250 tl";
        String s2="ıkıncı urun fiyatı:1500";
        //iki urunun fiyatını toplayın

       s1=s1.replaceAll("\\D","");
       s2=s2.replaceAll("\\D","");
        System.out.println(s1+s2);//12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2750

        String s3="123";
        String s4="450";
        int sayi=452;
        int sayi2=123;




















    }
}
