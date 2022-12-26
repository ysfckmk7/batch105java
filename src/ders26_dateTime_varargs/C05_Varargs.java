package ders26_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        // verilen 2 sayıyı toplayıp yazdıran bir method olusturun
        
        topla(5,8);// 13
        topla(5,7,3);// 15
        topla(8,3,2);// 13
        topla(7,3,4,6);// 20
        
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Döet sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Üç sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("İki sayinin toplami : " + (sayi1+sayi2));
    }
}
