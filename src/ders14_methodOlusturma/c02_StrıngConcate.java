package ders14_methodOlusturma;

public class c02_StrıngConcate {
    // verılen ıkı Strıng ı parametre olarak kabul edıp
    // bu ıkı Strıng ı aralarında bır bosluk olan tek bır Strıng olarak
    // main method a donduren bır method olusturun


    public static void main(String[] args) {

        String str1="Java";
        String str2="Candır";

        System.out.println(birlesım(str1,str2));//Java Candır
        System.out.println(birlesım("bu da","oldu"));// bu da oldu


    }

    public static String birlesım(String str1,String str2){

     return str1+" "+str2;


    }




}
