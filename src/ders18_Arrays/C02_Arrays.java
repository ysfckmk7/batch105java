package ders18_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr={"Ali", "Ulus", "Nesrin"};

        //Bu array in tüm elementlerini aralarında bir bosluk bırakılarak yazdıralım

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] + " ");// Ali Ulus Nesrin
        }
        // bu array i array olarak yazdıralım

        System.out.println(arr);// Ljava.lang.String;@2f7a2457
        //array bir obje / non-primitive data  oldugundan java referansını yazdırır
        //Array i array olarak yazdırmak isterseniz Array class indan yardım almalısınız

        System.out.println(Arrays.toString(arr)); // [Ali, Ulus, Nesrin]



    }
}
