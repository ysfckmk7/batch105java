package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        // verilen bir array'deki tekrar eden sayilari
        // bir kere olacak sekilde array'i duzenleyın

        int [] arr={1,2,4,3,5,3,5,2,1,2,4,5,3,4,5};

        // bu soruyu array'le yapmak cok zor
        // bunun yerine bu array'in elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir list'e atalim

        List<Integer> tekrarsızListe=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!tekrarsızListe.contains(arr[i])){

                tekrarsızListe.add(arr[i]);

            }
        }

        // en son o list'deki elementleri array'e atamak gerekir
        // bunun icın once array'e yenı ve bos bır array degerı atayıp
        // sonra List'deki elementleri array'e tasıyalım

        arr=new int[tekrarsızListe.size()];

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=tekrarsızListe.get(i);


        }
        // array istenen hale geldi

        System.out.println("Array'in tekrarsız hali : " + Arrays.toString(arr));// Array'in tekrarsız hali : [1, 2, 4, 3, 5]
    }
}
