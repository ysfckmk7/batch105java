package Deneme_Soruları;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {

        //Soru 5-)Ekrandan okunan 3 sayısal verinin
        // en büyüğünü bularak ekrana yazdıran bilgisayar programını Java programlama dilinde yazınız.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. sayıyı giriniz");
        int sayı1=scan.nextInt();
        System.out.println("lutfen 2. sayıyı giriniz");
        int sayı2=scan.nextInt();
        System.out.println("lutfen 3. sayıyı giriniz");
        int sayı3=scan.nextInt();

        int maxsayı=7;

        if (sayı1>=sayı2 && sayı1>=sayı3){
           maxsayı=sayı1;
        } else if (sayı2>=sayı1 && sayı2>=sayı3) {
            maxsayı=sayı2;
        }else{
            maxsayı=sayı3;
        }

        System.out.println("Maksımum sayı:" + maxsayı);
    }
}
