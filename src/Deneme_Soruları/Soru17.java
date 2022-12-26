package Deneme_Soruları;

import java.util.Random;
import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {

        //Soru 11-)Klavyeden girilen herhangi bir yılın,
        // gene klavyeden girilen herhangi bir ayının kaç gün çektiğini hesaplayan
        // bilgisayar programını Java programlama dilinde yazınız


        Random rand=new Random();
        int Yıl= rand.nextInt(2022);
        System.out.println("Yıl:" + Yıl);
        int AySayısı=rand.nextInt(12);
        System.out.println("Yılın " + AySayısı + ".Ayı");

        switch (AySayısı){
            case 1:
                System.out.println("Ocak ayı 31 gün cekiyor.");
                break;
            case 2:
                System.out.println("Şubat ayı 28 gün cekiyor.");
                break;
            case 3:
                System.out.println("Mart ayı 31 gün cekiyor.");
                break;
            case 4:
                System.out.println("Nisan ayı 30 gün cekiyor.");
                break;
            case 5:
                System.out.println("Mayıs ayı 31 gün cekiyor.");
                break;
            case 6:
                System.out.println("Haziran ayı 30 gün cekiyor.");
                break;
            case 7:
                System.out.println("Temmuz ayı 31 gün cekiyor.");
                break;
            case 8:
                System.out.println("Ağustos ayı 31 gün cekiyor.");
                break;
            case 9:
                System.out.println("Eylül ayı 30 gün cekiyor.");
                break;
            case 10:
                System.out.println("Ekim ayı 31 gün cekiyor.");
                break;
            case 11:
                System.out.println("Kasım ayı 30 gün cekiyor.");
                break;
            case 12:
                System.out.println("Aralık ayı 31 gün cekiyor.");
                break;
            default:
                System.out.println("Yanlış bir ay ismi girdiniz.");

        }




    }
}
