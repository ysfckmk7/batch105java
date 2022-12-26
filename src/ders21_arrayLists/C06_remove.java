package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {

        int [] arr={1,2,4,3,5,3,5,2,1,2,4,5,3,4,5};


        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar);// [1, 2, 3, 5, 3, 2, 1, 2, 4, 5, 3, 4, 5]

        /*
        Listemiz ıntejer'lardan olusuyorsa
        biz int bir deger yazdıgımızda hep index kabul ettıgınden
        istedıgmız elementi obje olarak girip sildirmek icin
        onceden tanımlamamız gerekir.
         */

        Integer silinecekObje=4;

        sayilar.remove(silinecekObje);
        System.out.println(sayilar);// [1, 2, 3, 5, 3, 2, 1, 2, 5, 3, 4, 5] // ilk gordugu 4'u sıldı.

        // tum 3'leri sildirin

        silinecekObje=3;

        while (sayilar.contains(silinecekObje)){
            sayilar.remove(silinecekObje);
        }
        System.out.println(sayilar);// [1, 2, 5, 2, 1, 2, 5, 4, 5] // dongude butun 3'leri silene kadar devam eder.

        silinecekObje=10;

        System.out.println(sayilar.remove(silinecekObje));// false// listede 10 olmadıgı ıcın false dondurdu.

        //sayilar.remove(20);// IndexOutOfBoundsException // listemizde 20. indeximiz olmadıgı ıcın hata verir.



    }
}
