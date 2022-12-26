package ders09_SringManipulations;

public class c02_Equals {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        String str3=new String("Ali");
        String str4= "Ali";

        System.out.println(str1==str2);// false
        System.out.println(str1==str3);// false
        System.out.println(str1==str4);// true

        /*
        == String leri karsilastırırken bekledıgımız sonucları vermeyebilir
        String lerde metinlerin aynı olup olmadiğini karsılastırmak için
        == yerine equals() kullanılır
         */

        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equals(str3));// true
        System.out.println(str1.equals(str4));// true







    }
}
