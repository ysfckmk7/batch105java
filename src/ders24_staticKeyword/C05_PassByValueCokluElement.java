package ders24_staticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {

        int[] arr={3,6,9,1,7};

        // bir method olusturup, arr'yi method'a yollayalım
        // method'da arr'in elementleri uzerınde degısıklık yapalım ve arr'yı yazdıralım


           elementleriDegiştir(arr);
        System.out.println(Arrays.toString(arr));// [13, 6, 19, 1, 7]
    }
    public static void elementleriDegiştir(int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b));// [13, 6, 19, 1, 7]



    }
}
