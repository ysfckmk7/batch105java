package ders06_IfElseStatements;

import java.util.Scanner;

public class c05_IfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan yasını ısteyın, 65 yas ve uzerı ise "emekli olabilirsin" yazdırın
        // yoksa emekli olması icin calısması gereken yılı yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        double emeklıyas=scan.nextDouble();

        if (emeklıyas>=65){
            System.out.println( "emekli olabilirsin");


        }else{
            System.out.println("emekli olabilmesi için: " + (65-emeklıyas) + " sene daha çalışmalısın");

        }
    }
}
