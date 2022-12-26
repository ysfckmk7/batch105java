package ders24_staticKeyword;

public class C03_PassByValue {

    public static void main(String[] args) {

        int s=20;

        System.out.println(s);// 20

        // int s=30;
        // bir scope'da tanımlanan varıable'in yenıden tanımlama imkanı yoktur

        // String s="Hasan";
        // data turunun degıstırerek yenıden tanımlamak da mumkun degıldır
        // cunku kullanılırken varıable'in ismini yazdıgımızda hangi sayi variable'ini kullanacagı mechul olur



    }
    public static void method1(){
        method2(5);

        String s="Hasan";

        System.out.println(s.toLowerCase());


    }
    public static void method2(int s){
        s=s*s;

        System.out.println(s);//
    }
}
