package ders19_arrays;

import java.util.Arrays;

public class C01_ElemanlariSagKaydırma {
    public static void main(String[] args) {

        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        //sondaki elementi de basa tasiyacak bir method olusturun,
        //array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int [] arr={4,5,6,7};

        arr=sagKaydır(arr);

        System.out.println(Arrays.toString(arr));// [7, 4, 5, 6]
    }

    public static int [] sagKaydır(int[] arr){

       int boskova=arr[arr.length-1];// son elementi bos kovaya koyduk

        for (int i =arr.length-2; i >=0 ; i--) {

            arr[i+1]=arr[i];

        }
        arr [0]=boskova;

        return arr;
    }
}
