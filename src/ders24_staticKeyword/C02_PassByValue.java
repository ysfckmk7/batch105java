package ders24_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        Java PassByValue kullanır
        Yannı method'lar arasında gonderılen varıable'ların
        kendileri degil, value'lari dıger method'a yollanır
         */


        int fiyat=100;
        // fiyat uzerınden %10 ındırım yapıp, ındırımlı fıyatı donduren bır method olusturun

        System.out.println(indirimYap10(fiyat));// 90
        System.out.println(indirimYap10(fiyat));// 90
        System.out.println(indirimYap10(fiyat));// 90
        System.out.println(indirimYap10(fiyat));// 90


        System.out.println(fiyat);// 100

        // eger ındırımlı fıyatın kalıcı olarak fıyatımızı degıstırmesını ıstersek
        // atama yaparız
        fiyat=indirimYap10(fiyat);


    }
    public static int indirimYap10(int a){

        a=a*90/100;


        return a;
    }
}
