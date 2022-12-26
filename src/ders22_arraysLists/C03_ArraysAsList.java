package ders22_arraysLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {

        Integer [] arr={1,2,3};

        // verilen bir array'i List'e cevirmek icin
        // bir list olusturup, for loop ile elementleri tasımayı tavsıye edıyoruz

        List<Integer> arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);// [1, 2, 3]

        // Bu yontemın 2 negatıf yonu vardır
        // 1- bu sekılde olusturulan list'ler esnek uzunluga sahıp degillerdir
        //    add, remove gıbı ozellıklerı kullanmak ıstersenız RunTımeExceptıon olusur

        //arraydenList.add(10);// UnsupportedOperationException
       //arraydenList.remove(1);// UnsupportedOperationException

        // 2- bu yontem kaynak olan array ile yenı olusturulan list'i birbirine baglar
        //    birinde yaptıgınız degısıklıgı, otomatık olarak dıgerıne de yansıtır

        System.out.println("Array : " + Arrays.toString(arr));// Array : [1, 2, 3]
        System.out.println("Liste : " + arraydenList);// Liste : [1, 2, 3]

        // sadece array'in bir elemanını degistırelım
        arr[0]=10;

        System.out.println("Array : " + Arrays.toString(arr));// Array : [10, 2, 3]
        System.out.println("Liste : " + arraydenList);// Liste : [10, 2, 3]

        /*
        Cok kullanıslı bır yontem olamdıgı ıcın ve ıstedıgımız
        sonucları dondurmedıgı icın kullanma geregı duymuyoruz
         */










    }
}
