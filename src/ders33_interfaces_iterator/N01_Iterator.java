package ders33_interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar);// [5, 23, 2, 9, 11]

        // index kullanmadan tum elementlerı 3 artırın

        for (Integer each:sayilar
             ) {
            each=each+3;
            System.out.print(each + " ");// 8 26 5 12 14
        }
        System.out.println("");
        System.out.println(sayilar);// [5, 23, 2, 9, 11]

        // index yapısını kullanmadan 5'den buyuk olan elementlerı sılın

        Iterator itr= sayilar.iterator();

        System.out.println(itr.next());// 5

        System.out.println(itr.next());// 23

        System.out.println(itr.next());// 2

        System.out.println(itr.next());// 9

        System.out.println(itr.next());// 11

        // tek tek yapmayıp bır loop ıle yapalım

        System.out.println(itr.hasNext());// false

        // iterator'da gerı donus yok
        // iterator nereye gıttıyse orada kalır, gerı donemez
        // tum lısteyı loop ıle yenıden yazdırmak ıcın yenıden bır ıtr olusturmalı veya
        // ıterator'a yenı deger atamalıyız

        itr=sayilar.iterator();

        System.out.println(itr.hasNext());// true

        while (itr.hasNext()){
            System.out.print(itr.next() + " ");// 5 23 2 9 11

        }


        // iterator kullanarak listedekı 5'den buyuk sayıları sılın

        itr=sayilar.iterator();

        while (itr.hasNext()){
            Integer sayi=(Integer) itr.next();
            if (sayi>5){
                itr.remove();
            }
        }
        System.out.println(" ");
        System.out.println(sayilar);// [5, 2]
    }
}
