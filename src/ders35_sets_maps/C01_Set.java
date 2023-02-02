package ders35_sets_maps;

import java.util.*;

public class C01_Set {
    public static void main(String[] args) {
        // Collections, objelerden olusan bır toplulugu bır arada tutan yapılardır
        // Data turu olarak Object secılırse, ıcerısıne her data turunden element konulabılır
        // ancak bu durumda elementlere ulasmak, onları uptade etmek gıbı ıslemler
        // normalden daha zor olabılır
        // hatta bazen mumkun olmayabılır

        Set<Object>karisikSet=new HashSet<>();

        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int[] arr=new int[3];
        arr[2]=23;
        arr[1]=10;
        karisikSet.add(arr);


        List<Object> karisikList=new ArrayList<>();
        karisikList.add("Hava");
        karisikList.add(44);

        karisikSet.add(karisikList);

        System.out.println(karisikList);// [Hava, 44]
        System.out.println(karisikSet);// [[I@48140564, Java, S, false, 12, [Hava, 44]]

        System.out.println(karisikSet.contains(44));// false
        System.out.println(karisikSet.contains(12));// true
        System.out.println(karisikSet.contains(23));// false

        System.out.println(karisikSet.size());// 6


    }
}
