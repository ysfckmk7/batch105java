package ders06_IfElseStatements;

import java.util.Scanner;

public class c08_IfElseStatements {
    public static void main(String[] args) {

        // kullanıcıdan bır ucgenın 3 kenar uzunlugunu alın
        // kenar uzunlukları 0 veya negatıfse gecersız kenar uzunlugu yazdırın
        // ucgen eskenar ise "Eşkenar Üçgen" yazdırın, degilse "eskenar degil" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("3 kenar  uzunlugu gırınız");
        int s1= scan.nextInt();
        int s2=scan.nextInt();
        int s3= scan.nextInt();
        if (s1<=0 || s2<=0 || s3<=0 ) {
            System.out.println("gecersiz kenar uzunluğu" );
        }else if (s1==s2 && s2==s3){
                System.out.println("Eşkenar Üçgen" );
        }else{
            System.out.println("eskenar degil" );

        }



    }
}
