package ders06_IfElseStatements;

import java.util.Scanner;

public class c03_IfELSEStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 kenar  uzunlugu gırınız");
        int s1= scan.nextInt();
        int s2=scan.nextInt();
        int s3= scan.nextInt();

        if (s1==s2 && s2==s3){
            System.out.println("Eşkenar Üçgen");

        }else {
            System.out.println("eskenar ucgen degil");

        }
    }
}



