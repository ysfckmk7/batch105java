package ders27_StringBuilder;

import javax.swing.*;

public class D {

    private String isim="Mustafa";
    String isimDefault="Furkan";
    static String isimDefaultStatic="Sevilay";

    public static void main(String[] args) {

        // System.out.println(isim); // static olmadıgından, static main method içinde direkt kullanılmaz

        D obj1=new D();
        System.out.println(obj1.isim);

        staticMethod();

        System.out.println(obj1.isim);

    }

    private void staticOlmayanMethod(){
        isim="Huseyın";
        System.out.println(isim);
    }
    void defaultStaticOlmayanMethod(){
        System.out.println("default access modifier'li static olmayan method caliştı");
    }

     static void defaultStaticMethod(){
        System.out.println("default access modifier'li static method caliştı");

    }
    private static void staticMethod(){
        D obj1=new D();
        obj1.isim="Zafer";
        System.out.println(obj1.isim);
    }



}
