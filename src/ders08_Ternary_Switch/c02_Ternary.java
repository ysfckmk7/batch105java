package ders08_Ternary_Switch;

public class c02_Ternary {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Ali";

        // verilen iki metin birbiri ile ayni ise "metinler aynı"
        // farklı ise "metinler farklı" yazdırın


        if (str1.equals(str2)){
            System.out.println( "metinler aynı");
        }else {
            System.out.println("metinler farklı");
        }

        System.out.println(str1.equals(str2) ? "metinler aynı" : "metinler farklı");







    }


    }

