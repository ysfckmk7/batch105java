package ders20_multıDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int [][] arr={{4,3,2},{1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length);// 5
        System.out.println(arr[2].length);// 3
        System.out.println(arr[1]);// [I@1d251891 // direk yazdırmaz referans yazdırır.

        System.out.println(Arrays.toString(arr[1]));// [1, 2]

        // tüm array'i yazdırmak ıstersek

        System.out.println(Arrays.deepToString(arr));// [[4, 3, 2], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]

        //System.out.println(arr[3][0]); //ArrayIndexOutOfBoundsException

    }
}
