package ders06_IfElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class c04_IfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan bır karakter gırmesını ısteyın
        // gırılen karakterın buyuk harf olup olmadıgını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bır karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='A' && krk <='Z'){
            System.out.println("girilen:" + krk + ",harfi büyüktür");


        }else{
            System.out.println("girilen: " + krk + " harfi büyük değildir" );


        }
    }
}
