package ders20_multıDimensionalArrays;

import java.util.Arrays;

public class C02_MDA_Soru {
    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        //yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //output: [5, 7, 11]


        int[][] arr = {{3,4,5}, {2,3,6,7}};

        // inner 2 array olacagını ama bunların uzunluklarının degısebilecegını kabul ettık

        int ortakIndexSayısı=arr[0].length<arr[1].length ? arr[0].length : arr[1].length;

        int [] ortakIndexToplamlariArr=new int[ortakIndexSayısı];

        for (int i =0; i <ortakIndexToplamlariArr.length ; i++) {

            ortakIndexToplamlariArr[i]=arr[0][i]+arr[1][i];

        }

        System.out.println(Arrays.toString(ortakIndexToplamlariArr));// [5, 7, 11]
    }
}
