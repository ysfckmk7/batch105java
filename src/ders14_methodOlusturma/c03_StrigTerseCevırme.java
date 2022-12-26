package ders14_methodOlusturma;

public class c03_StrigTerseCevırme {

    // parametre olarak bır Strıng kabul edıp
    // Strıng ın terse cevrılmıs halını donduren bır method olusturun


    public static void main(String[] args) {

        String input="Java kod yazdıkca ogretılır";

        System.out.println(terseDondurme(input));// rılıtergo ackıdzay dok avaJ
        System.out.println(terseDondurme("hava cok guzel")); // lezug koc avah


    }
    public static String terseDondurme(String input) {
        String tersStr="";

        for (int i = input.length() - 1; i >= 0; i--) {
            tersStr+=input.charAt(i);
        }
        return tersStr;


    }




}
