package Deneme_Soruları;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {

        //Soru 10-)Klavyeden öğrencinin aldığı notu okuyan ve okunan bu nota göre öğrencinin durumunu değerlendiren
        // (Çok Güzel,Ortalamanın üzerinde, Ortalamanın altında gibi)
        //  bilgisayar programını Java programlama dilinde yazınız


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        int not=scan.nextInt();

        if (not>=85){
            System.out.println("Çok Güzel");
        } else if (not>=70) {
            System.out.println("Ortalamanın üzerinde");
        } else if (not>=45) {
            System.out.println("Ortalamanın altında");
        }else{
            System.out.println("Üzgünüm kaldınız");
        }

    }
}
