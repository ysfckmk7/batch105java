package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int [] arr={2,4,6};

        // bu arr'e 4.bir element olarak 8 ekleyelim

        /*
        bu arr'e 4.bir element olarak 8 ekleyelim,
        ama yeni deger atanabilir

        once int[] arr2=[2, 4, 6, 8] seklınde yenı bir array olusturup
        sonra arr2 degerini arr'ye atayabilirim
         */


        // yeni array olusturalım
        // arr2'e konulacak datalarin turu
        // uzunlugu ise eskı array'in uzunlugunun 1 fazlası


        int [] arr2=new int[arr.length+1];// [0, 0, 0, 0]

        for (int i =0; i <arr.length; i++) {

            arr2[i]=arr[i];

        }

        System.out.println(Arrays.toString(arr2));// [2, 4, 6, 0]

        arr2[arr2.length-1]=8;

        System.out.println(Arrays.toString(arr2));// [2, 4, 6, 8]


        arr=arr2;

        System.out.println("arr'nin son hali: " + Arrays.toString(arr));// arr'nin son hali: [2, 4, 6, 8]





    }
}
