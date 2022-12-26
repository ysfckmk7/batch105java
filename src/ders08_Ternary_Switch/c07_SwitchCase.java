package ders08_Ternary_Switch;

import java.util.Scanner;

public class c07_SwitchCase {
    public static void main(String[] args) {
        // j: java
        // D: Devolepment
        // K: Kit

        // Kullanıcıdan bır harf alın
        // Alınan harf J, D, K dan bırı ıse yukarıdakı kelımelerı yazdırın
        // Bu harflerden bırı degilse "gecersiz harf" yazdırın

        /*   char harf= 'K';  */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf =scan.next().charAt(0);


        switch (harf){
            case 'J':
            case 'j':
                System.out.println("java");
                break;
            case 'D':
            case  'd':
                System.out.println("Devolepment");
                break;
            case  'K':
            case  'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("gecersiz harf");







        }

    }
}
