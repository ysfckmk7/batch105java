package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullanıcıyaArrayOlusturma {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize  donduren bir method olusturun.



        int[] kullanıcıArrayi=arrayOlustur();

        System.out.println(Arrays.toString(kullanıcıArrayi));
    }

    public static int[] arrayOlustur(){


        Scanner scan=new Scanner(System.in);
        System.out.println("olusturulacak array ın boyutunu giriniz");

        int lenght=scan.nextInt();

        int [] kullanıcıArrayi=new int[lenght];


        for (int i =0; i <lenght ; i++) {

            System.out.println("array'e eklenecek bir sayi giriniz");
            kullanıcıArrayi[i]=scan.nextInt();

        }

         return kullanıcıArrayi;
    }



}
