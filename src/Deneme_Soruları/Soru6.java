package Deneme_Soruları;

import java.util.Random;

public class Soru6 {
    public static void main(String[] args) {
        //Soru5: Rastgele sayılardan oluşan 100 elemanlık tamsayı dizisi oluşturun.
        //Ardından tek ve çift sayıları bulan bir program yazın.



        int[] sayılar=new int[100];

        for (int i =0; i <100 ; i++) {
            Random rand=new Random();
            int sayı= rand.nextInt(100);
            sayılar[i]=sayı;


            if (i%2==0){
                System.out.print(i);
                System.out.println(" cift sayıdır");

            }else{
                System.out.print(i);
                System.out.println(" tek sayıdır");

            }

        }















    }
}
