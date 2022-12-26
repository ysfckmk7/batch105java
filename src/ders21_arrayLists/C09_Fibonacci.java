package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

        // Soru-5 Kullanıcıdan pozıtıf bır tamsayı alıp,
        // o tamsayıdan kucuk Fibonacci sayılarını bır lıste olarak ve yazdırın
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 ...


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozıtıf bır tamsayı gırınız");
        int grilenSayi=scan.nextInt();

        if (grilenSayi<0){
            System.out.println("Fibonacci serisi icin 0'dan buyuk tamsayı girmelısın");
        } else if (grilenSayi==0) {
            System.out.println("0'dan kucuk fıbonaccı sayısı yoktur");
        } else if (grilenSayi==1) {
            System.out.println("1'den kucuk tek fıbonaccı sayısı vardır");
        }else{
            fibonacciSayilariniyazdır(grilenSayi);
        }


    }
    public static void fibonacciSayilariniyazdır(int girilenSayi){
        // buraya geldiyse girilen sayı 1'den buyuktur

        List<Integer> fibonacciListesi=new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayısı=0;
        int index=3; // ilk 3 eleman 0 1 1 oldugu ıcın 3.index'e geldik

        while (yeniFibonacciSayısı<girilenSayi){

            yeniFibonacciSayısı=fibonacciListesi.get(index-2) + fibonacciListesi.get(index-1);


            if (yeniFibonacciSayısı<girilenSayi){

                fibonacciListesi.add(yeniFibonacciSayısı);
            }
            index++;
        }

        System.out.println(fibonacciListesi);

    }
}
