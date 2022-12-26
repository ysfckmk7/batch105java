package ders09_SringManipulations;

public class c05_Length {
    public static void main(String[] args) {
        String str="Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length()); //34
        // son karakteri yazdırın

        System.out.println(str.charAt(33)); // u
        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek ıcın kullanılır

        // sondan 3. karakteri yazdırın
        System.out.println(str.charAt(str.length()-3)); // g


    }
}
