package Deneme_Soruları;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {

        //Soru 4-)Klavyeden bir boy uzunluğu isteyiniz.
        // 175’e eşit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’,
        // 175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını yazdıracak şekilde programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();

        if (boy<=175){
            System.out.println("KISA BOYLUSUNUZ");
        }else{
            System.out.println("UZUN BOYLUSUNUZ");
        }


    }
}
