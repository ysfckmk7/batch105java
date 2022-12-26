package ders25_İmmutableClasses;

import java.util.Arrays;

public class C02_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java";

        System.out.println(str.toUpperCase());//  JAVA

        str.toLowerCase();

        System.out.println(str);// Java

        // Strıng ımmutable oldugundan, method'lar kalıcı degısıklık yapamaz

        int[] arr={9,5,17};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));// [5, 9, 17]

        // Array mutable bır class oldugu ıcın method ıle yaptıgımız degısıklık kalıcı olur

    }
}
