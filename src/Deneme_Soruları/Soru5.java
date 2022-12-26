package Deneme_Soruları;

import java.util.Random;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {


        //Soru3: Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını alacak programı geliştirin.
        //Programı yazarken aşağıdaki özelliklere uygun yazınız.
        //Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin. Sabit elemanlı bir dizi vermeyin!
        //Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
        //Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return) etsin.



         int[] sayılar=new int[100];

        for (int i =0; i <100 ; i++) {
            Random rand=new Random();
            int sayı= rand.nextInt(1000);
            sayılar[i]=sayı;

        }


        double ort=ortalama(sayılar);
        System.out.println("ortalama:" +ort);


    }

    private static double ortalama(int[] dizi) {

        double toplam=0;

        for (int i =0; i <100; i++) {
            toplam+=dizi[i];

        }
        return toplam/100;

    }
}
