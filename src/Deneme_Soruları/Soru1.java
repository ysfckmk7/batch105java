package Deneme_Soruları;

import java.util.Random;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
    Random olarak 1 ile 100 arasinda bir sayi olusturun
    kullanicidan bu sayiyi bilmesini isteyin
    kullanici her deger girdiginde
    tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
    kullanici tuttugumuz sayiyi bildiginde
    tahmin sayisini ve

    - 3 veya daha az tahminde bildiyse "Vaowww"
    - 4-8 tahminde bildiyse "Aferin"
    - daha fazla tahminde bildiyse "basarisiz"
    yazdirin
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayı=scan.nextInt();

        Random rand=new Random();
        int tutulansayı=rand.nextInt(100);
        int sayac=0;


        while (tutulansayı!=sayı){

            if (tutulansayı>sayı){
                System.out.println("lutfen sayınızı buyultunuz");
                System.out.println("lutfen bir sayı giriniz");
                sayı=scan.nextInt();
                sayac++;
            }
            if (tutulansayı<sayı){
                System.out.println("lutfen sayınızı kucultunuz");
                System.out.println("lutfen bir sayı giriniz");
                sayı=scan.nextInt();
                sayac++;
            }
            if (tutulansayı==sayı) {
                sayac++;
                if (sayac <= 3) {
                    System.out.println(sayac + ".denemede bildiniz " + " Vaowww");

                } else if (sayac <= 8) {
                    System.out.println(sayac + ".denemede bildiniz " + " Aferin");
                } else {
                    System.out.println(sayac + ".denemede bildiniz " + " Basarisiz");
                }

            }
        }


    }


}

