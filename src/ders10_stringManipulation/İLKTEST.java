package ders10_stringManipulation;

public class İLKTEST {
    public static void main(String[] args) {
        // Gittiğiniz web sayfasından aldıgımız
        // String arama sonuclarında
        // arama sayısının 50 den fazla oldugunu test edın

        String input="1-48 of 77 results for \"nutella\"";

        int indexof=input.indexOf("of");//5
        int indexresults=input.indexOf("results");//11
        String sonucsayısıStrıng=input.substring(indexof+3,indexresults-1);//(8,10)

        int sonucsayısıint=Integer.parseInt(sonucsayısıStrıng);

        if (sonucsayısıint>50){
            System.out.println("nutella arama sonucu PASSED");
        }else{
            System.out.println("İstenen kadar sonuc yok,nutella arama sonucu FAİLED");
        }





















    }
}

