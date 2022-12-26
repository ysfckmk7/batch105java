package ders05_Concatenation_Operatorler;

public class c01_Concatenation {
    public static void main(String[] args) {
        //sadece asagıda verılen varıable ları kullanarak ıstenen degerlerı yazdıralım

        String s1="java";
        String s2="Güzeldir";
        String s3=""; // hiclik
        String s4=" ";// space, bosluk

        int sayi1=4;
        int sayi2=3;

        // java Güzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2));// java Güzeldir7

         // java Güzeldir 12
        System.out.println(s1+s4+s2+s4+sayi1*sayi2);

        // 34 java

        System.out.println(s3+sayi2+sayi1+s4+s1);
        // java7 Güzeldir43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);







    }
}
