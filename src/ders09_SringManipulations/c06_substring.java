package ders09_SringManipulations;

public class c06_substring {
    public static void main(String[] args) {
         String str="java ögren, ısı kap";

        System.out.println(str.substring(5));//  ögren, ısı kap
        System.out.println(str.substring(0));//  java ögren, ısı kap
        System.out.println(str.length());// 19 karakterlı
        // son karakteri  String olarak yazdiralim

        System.out.println(str.charAt(str.length() - 1));
        String sonharf=""+ str.charAt(str.length()-1);
        sonharf=str.substring(str.length()-1);
        System.out.println(sonharf); // p

        // son ındexdekı karakteri upper case olarak yazdırın
        System.out.println(str.substring(str.length()-1).toUpperCase());// P


         // son 3 harfı buyuk olarak yazdırın
        System.out.println(str.substring(str.length()-3).toUpperCase()); // KAP






    }
}
