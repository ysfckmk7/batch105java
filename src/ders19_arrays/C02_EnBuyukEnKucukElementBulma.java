package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementBulma {
    public static void main(String[] args) {
        // Verilen bir int array'de en kucuk ve en buyuk sayıları
        // yazdıran bir method olusturun.

        int [] arr={3,8,1,5,2,9};

      enBuyukEnKuccukElementYazdır(arr);

    }



    public static void enBuyukEnKuccukElementYazdır(int[] arr){

     Arrays.sort(arr);// [1, 2, 3, 5, 8, 9]

        System.out.println("En buyuk element : " + arr[arr.length-1]);
        System.out.println("En kucuk element : " + arr[0]);

    }
}
