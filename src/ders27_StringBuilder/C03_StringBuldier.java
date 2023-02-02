package ders27_StringBuilder;

public class C03_StringBuldier {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");

        StringBuilder sb2=new StringBuilder("Java");

        String str="Java";

        System.out.println(sb1==sb2);// false
        System.out.println(sb1.equals(sb2));// false
        // StringBuldier metin eşitliğini sorgulamak için equals() kullanmaz
        System.out.println(sb1.compareTo(sb2));// 0

        StringBuilder sb3=new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3));// 2 // Java ile Hava karsılasırken.
        // ilk harfler farlı oldundan harflerın arasında kac harf olduguna  bakılır.

        sb3=new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3));// -10 // karsılastırmada "H" harfı "T" harfınden once oldugu ıcın eksı deger olur.

        sb3=new StringBuilder("Jaka");

        System.out.println(sb1.compareTo(sb3));// 11

        sb3=new StringBuilder("Javax");

        System.out.println(sb1.compareTo(sb3));// -1

        //System.out.println(sb1==str); // data turlerı farklı CTE verır

        System.out.println(sb1.equals(str));// false

        //System.out.println(sb1.compareTo(str));
        // compareTo SB'lar arasında calısır, farklı data turu kabul etmez









    }
}
