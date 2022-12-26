package Deneme_Soruları;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {

        //Soru 8-)Bir öğrenciye bir soru sorulsun ve öğrenciden cevap alınsın. Öğrencinin verdiği cevap doğru değilse,
        // bir defa daha sorunun sorulduğu durumun akış şemasını çiziniz ve Java programını yazınız


        Scanner scan=new Scanner(System.in);
        System.out.println("SORU: Aşağıdakı işlem sonucu nedir?\nX+20=25");

        System.out.println("lütfen cevap veriniz");
        int X=scan.nextInt();


        while (X!=20){
            System.out.println("lutfen doğru cevap veriniz");
            X=scan.nextInt();
        }

        if (X==20){
            System.out.println("Tebrikler Doğru Cevap Verdiniz");
        }




    }
}
