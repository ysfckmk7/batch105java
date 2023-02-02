package ders33_interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_Listiterator {
    public static void main(String[] args) {

      List<Integer> sayilar=new ArrayList<>();

      sayilar.add(5);
      sayilar.add(23);
      sayilar.add(2);
      sayilar.add(9);
      sayilar.add(11);

      // tum elementlerı index kullanmadan 3 artırın
        System.out.println(sayilar);// [5, 23, 2, 9, 11]

        ListIterator lit=sayilar.listIterator();


        while (lit.hasNext()){

            Integer sayi= (Integer)lit.next();

            lit.set(sayi+3);
        }

        System.out.println(sayilar);// [8, 26, 5, 12, 14]

        // listedekı tum elementlerı ıterator kullanarak sondan basa dogru yazdırın

        // bır usttekı loop ile sona gıttıgımız ıcın ıterator suan en sonda
        // yanı olmasını ıstedıgımız yerde

        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " ");// 14 12 5 26 8
        }


    }
}
