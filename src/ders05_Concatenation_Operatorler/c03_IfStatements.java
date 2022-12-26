package ders05_Concatenation_Operatorler;

import java.util.Scanner;

public class c03_IfStatements {
    public static void main(String[] args) {

        // kullanıcıdan ıkı sayı alın
        // eger bırıncı sayı 100 den buyukse, "ılk sayı 100 den buyuk" yazdırın
        // eger ıkıncı sayı cıftse,"ıkıncı sayı cıft" yazdırın
        // eger ılk sayı, ıkıncı sayıdan buyukse, "ılk sayı daha buyuk" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ıkı sayı gırınız");
         int sayi1= scan.nextInt();
         int sayi2= scan.nextInt();
           // eger bırıncı sayı 100 den buyukse, "ılk sayı 100 den buyuk" yazdırın
         if(sayi1>100) {

             System.out.println("ılk sayı 100 den buyuk");
         }
          // eger ıkıncı sayı cıftse,"ıkıncı sayı cıft" yazdırın
        if(sayi2 % 2==0) {

             System.out.println("ıkıncı sayı cıft");
         }
          // eger ılk sayı, ıkıncı sayıdan buyukse, "ılk sayı daha buyuk" yazdırın
         if (sayi1>sayi2) {

             System.out.println("ılk sayı daha buyuk");



             ;




         }



    }
}

