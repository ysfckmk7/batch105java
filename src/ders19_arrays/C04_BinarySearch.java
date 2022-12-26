package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int [] arr ={1,8,9,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8));// 7
        System.out.println(Arrays.binarySearch(arr,5));// -2
        System.out.println(Arrays.binarySearch(arr,1));// 0
        System.out.println(Arrays.binarySearch(arr,9));// 10
        /*
        Binary search method'unun dogru sonuclar verebilmesi için
        oncelikle sort method'u kullanılmalıdır

        sort() kullanmadan binarySearch() ile yapılan aramanın sonucu bellı olmaz
        dogru sonuc da verebılır, yanlıs sonuc da
         */


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [1, 1, 2, 3, 5, 7, 8, 8, 9]

        System.out.println(Arrays.binarySearch(arr,8));// 6
        System.out.println(Arrays.binarySearch(arr,5));// 4
        System.out.println(Arrays.binarySearch(arr,1));// 1
        System.out.println(Arrays.binarySearch(arr,9));// 8


        // array'de olmayan  bir eleman aratırsak

        System.out.println(Arrays.binarySearch(arr,-3));// -1
        System.out.println(Arrays.binarySearch(arr,4));// -5
        System.out.println(Arrays.binarySearch(arr,10));// -10
        System.out.println(Arrays.binarySearch(arr,100));// -10







    }
}
