package Deneme_Soruları;

import java.util.Scanner;

public class Soru21 {
    public static void main(String[] args) {
        //Soru 14-)Klavyeden okunan bir string ifadenin palindrome(tersten okununca da aynı)
        // olup olmadığını kontrol eden bilgisayar programını Java dilinde yazınız


        Scanner scan = new Scanner(System.in);
        String str = "adam";
        String tersstr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            tersstr += str.substring(i, i + 1);
        }

        if (str.equals(tersstr)) {
             System.out.println("str palindrome bir degere sahiptir ");

        } else {
            System.out.println("str palindrome bir degere sahip değildir");

        }

    }
}
