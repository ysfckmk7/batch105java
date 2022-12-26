package ders10_stringManipulation;

public class c02_Contains {
    public static void main(String[] args) {

    String str="java ıle kodlama cok zevklı";

        System.out.println(str.contains("cok")); // true

        System.out.println(str.contains("odla")); // true
        System.out.println(str.contains("a")); //true
         //System.out.println(str.contains('s')); // parametre olarak char kabul etmez

        // CharSequence: char dizisi

        System.out.println(str.contains("Java")); // false

        String str2="java";
        System.out.println(str.contains(str2)); // true

        String str3="234 Ali Can";

        //str3.contains(2); //parantez ıcı STRİNG OLMALI
        str3.contains("2");




    }
}
