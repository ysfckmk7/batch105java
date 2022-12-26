package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {

        int [] arr={1,2,4,3,5,3,5,2,1,2,4,5,3,4,5};

        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexdeki degeri verdiğimiz yeni deger olarak atar


        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

                sayilar.add(arr[i]);
        }

        // Java'da set() u uptade icin kullanılır
        // add() ile set() farklıdır

        System.out.println(sayilar.set(0, 8));// [8, 9, 4, 3, 5, 3, 5, 2, 1, 2, 4, 5, 3, 4, 5]
        System.out.println(sayilar.set(1, 9));// [8, 9, 4, 3, 5, 3, 5, 2, 1, 2, 4, 5, 3, 4, 5]
        System.out.println(sayilar);


    }
}
