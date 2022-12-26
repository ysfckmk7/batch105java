package ders09_SringManipulations;

import java.util.Locale;

public class c01_toUpperCase {
    public static void main(String[] args) {

        String str= "java Mutluluktur";

        System.out.println(str.toUpperCase()); // JAVA MUTLULUKTUR
        System.out.println(str); // java Mutluluktur

        str=str.toUpperCase();
        System.out.println(str); // JAVA MUTLULUKTUR

        str= "ince mehmet";
        System.out.println(str.toUpperCase()); // INCE MEMHMET

        // str=str.toLowerCase();
        // System.out.println(str); // ince mehmet

        System.out.println(str.toLowerCase(Locale.ENGLISH)); // ince mehmet

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // ince mehmet










    }
}
