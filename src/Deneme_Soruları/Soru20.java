package Deneme_Soruları;

public class Soru20 {
    public static void main(String[] args) {

        // 1 den 100 kadar olan asal sayıları yazdırma.

        int sayac = 0;
        for (int i =2; i <=100 ; i++) {

            int kontrol=0;

            for (int j =2; j <i ; j++) {

                if (i % j == 0) {
                    kontrol = 1;
                    break;}
            }
               if (kontrol==0) {
                System.out.print(i+" ");
                sayac++;
               }

        }
    }
}
