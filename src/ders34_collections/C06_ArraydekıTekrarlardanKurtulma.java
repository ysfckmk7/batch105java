package ders34_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekıTekrarlardanKurtulma {
    public static void main(String[] args) {
        // verılen bır arraydekı tekrar eden elementleri
        // sadece 1 defa yazarak array'i kısaltan kod yazın

        int[] arr={1,2,4,2,5,6,2,4,5,1,4,5,3,2,5,6,1,2,5,4,3};

        Set<Integer> arrSet=new HashSet<>();

        // array'deki tum elementlerı, Set'e ekleyelım

        for (Integer each:arr
             ) {
            arrSet.add(each);
        }
        System.out.println(arrSet);// [1, 2, 3, 4, 5, 6]

        // Set'dekı element sayısına esıt bır array olusturup
        // Set'dekı elementlerı oraya tasıyalım

        arr=new int[arrSet.size()];// [0, 0, 0, 0, 0, 0]

        int index=0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println("Array'in son hali : " + Arrays.toString(arr));// Array'in son hali : [1, 2, 3, 4, 5, 6]



    }
}
