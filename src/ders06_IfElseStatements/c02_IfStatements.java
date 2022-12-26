package ders06_IfElseStatements;

import java.util.Scanner;

public class c02_IfStatements {
    public static void main(String[] args) {

        // kullanıcıdan bır ucgenın 3 kenar uzunlugunu alın
        // ucgen eskenar ise "Eşkenar Üçgen" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("3 kenar  uzunlugu gırınız");
        int s1= scan.nextInt();
        int s2=scan.nextInt();
        int s3= scan.nextInt();

        if (s1==s2 && s2==s3){
            System.out.println("Eşkenar Üçgen");


        }
    }
}
