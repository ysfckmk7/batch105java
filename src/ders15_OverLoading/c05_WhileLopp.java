package ders15_OverLoading;

import java.util.Scanner;

public class c05_WhileLopp {
    public static void main(String[] args) {
        /*
        kullanıcıdan toplanmak uzere sayı alın
        sayıların toplamı 500 e esıt olur veya gecerse
        girilen sayı adedı,
        girilen sayıların toplamını ve
        "Bu kadar yeter" yazdırın
         */

        Scanner scan=new Scanner(System.in);

        double sayı=0;
        double toplam=0;
        int sayıadedi=0;


        while (toplam<500){
            System.out.println("Toplanmak ıcın sayı gırınız");
            sayı=scan.nextDouble();


             toplam+=sayı;
             sayıadedi++;



        }
        System.out.println("girilen "+ sayıadedi + "tane sayınının toplammı:"+toplam+"oldu.Bu kadar yeter");











    }
}
