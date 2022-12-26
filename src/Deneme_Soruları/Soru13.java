package Deneme_Soruları;

import java.util.HashMap;
import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {

        //Soru 7-)Klavyeden okunan bir karakterin (char) küçük harf olduğunun kontrolünü yaparak
        //bu harfin büyük harf karşılığını ekrana yazdıran programı Java dilinde yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz.(char)");

        char harf='a';


        if (harf>='a' && harf<='z') {
            System.out.println("Girilen " + harf + " harfi küçük bir harftir");
        }
        System.out.println((char)(harf-32));

    }
}
