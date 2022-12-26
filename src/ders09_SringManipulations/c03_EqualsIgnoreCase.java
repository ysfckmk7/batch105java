package ders09_SringManipulations;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class c03_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3= "ALI";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str2.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase("ALİ ")); // false// alı den sonra bır karakter bosluk var
        /*
        equalsIgnoreCase aynı metnın buyuk-kucuk harf kullanılarak olusturulan
        farklı yazımlarını bırbırıne esıt olarak kabul eder
        yanı equalsIgnoreCase ıcın ali, ALI, ALi, ALI, aLI, birbirine esittir
        ama kelimede farklılık varsa bunları tolere etmez

        "a li"  ile  "ali"  birbirine esit degildir
        "ali"  ile  "ALI."  birbirine esit degildir
         */







    }
}
