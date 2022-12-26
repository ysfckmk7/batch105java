package ders24_staticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {

        int[] arr={3,6,8};
        // bir method olusturun
        // method'da array'e 5 elementli yeni bir array atayin
        // ve yazdırın
        // main method'a dondukten sonra yıne arr'yi yazdırın

        
        arrayiDegıstır(arr);

        System.out.println(Arrays.toString(arr));// [3, 6, 8]

    }
    public static void arrayiDegıstır(int[] b){

        b=new int[5];

        System.out.println(Arrays.toString(b));// [0, 0, 0, 0, 0]

    }
}
