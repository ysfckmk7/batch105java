package ders38_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpimTablosu {
    public static void main(String[] args) {
        // Kullanıcıdan bır rakam alın ve carpım tablosu olusturun


        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;

        while (girilenSayi<=1 || girilenSayi>=10) {
            try {
                System.out.println("Carpım tablosu olusturmak ıcın bır rakam gırınız");
                girilenSayi=scan.nextInt();

                if (girilenSayi>1 && girilenSayi<10){
                    break;
                }
                System.out.println("Carpım tabolus ıcın 1'den buyuk pozıtıf bır rakam gırmelısınız");
            } catch (InputMismatchException e) {
                System.out.println("Carpım tabolus ıcın 1'den buyuk pozıtıf bır rakam gırmelısınız");
                scan.next();

            }


        }
        for (int i =1; i <=girilenSayi ; i++) {

            for (int j =1; j <=girilenSayi ; j++) {

                int carpim=i*j;

                System.out.printf("%5d  ",carpim);
            }
            System.out.println("");
        }
        /*
        sayilarin arasında 2 space var
        sayilarla 2 karakter seklınde yazılıp saga dayali yapıldı
        1   2  3  4   5
        2   4  6  8   10
        3   6  9  12  15
        4   8  12 16  20
        5  10  15 20  25
         */


    }
}
