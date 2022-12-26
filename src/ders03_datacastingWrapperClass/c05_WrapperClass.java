package ders03_datacastingWrapperClass;
import java.util.Scanner;
public class c05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="java cok guzel";
        /*
        primitive data turlerı sadece deger barındırırlar,hazır method'ları yoktur
        java'ya yapılan talepler sonuncunda java
        pirimitive data turlerı ile bazı hazır method'ların kullanılabılmesi icin
        Wrapper classlar pirimitive data turlerındekı degerlerı alırlar
        ancak method'ları da vardır
         */
        char krk='b';
        Character krkWrapper='c';
        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isDigit('7'));
        String str1="123";
        String str2="12";
        // str1 ve str2'nın  degerlerını matematıksel olarak toplayın
        System.out.println(str1+str2); //12312
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));//135
        //Integer.parseInteger(str) icine yazılan str rakamlardan olusuyorsa str'yı int'a cevirir
        //ancak bır karakter bıle rakam degılse hata verir

        System.out.println(Integer.MAX_VALUE);// 2147483647
        System.out.println(Short.MIN_VALUE); // -32768
















    }
}
