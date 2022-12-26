package Deneme_Soruları;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {

        //Soru 2-)Yarıçap Değerini Klavyeden okuyarak
        // bir dairenin alanını ve çevresini hesaplayan programı yazınız.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yarıcap degerini giriniz");
        int yarıcap=scan.nextInt();

        double alan=(3.14*yarıcap*yarıcap);

        double cevre=(2*3.14*yarıcap);

        System.out.println("daire alanı:" + alan);
        System.out.println("daire cevresi:" + cevre);
    }
}
