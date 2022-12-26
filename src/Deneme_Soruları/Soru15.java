package Deneme_Soruları;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {

        //Soru 9-)Klavyeden yılın kaçıncı ayında olduğumuzu alın (int olarak)
        // ve bunun hangi ay olduğunu ekrana yazdıran bilgisayar programını Java programlama dilinde yazınız.


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir ay numarası giriniz");
        int AyNo=scan.nextInt();

        switch (AyNo){
            case 1:
                System.out.println("Ocak");
            break;
            case 2:
                System.out.println("Şubat");
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;

            default:
                System.out.println("Yanlış ay numarası girdiniz");

        }







    }
}
