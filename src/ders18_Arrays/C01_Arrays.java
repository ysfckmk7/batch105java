package ders18_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


    int[] arr1={2,4,6,8,10};

    //array in bir elementine ulasmak ve uptade etmek istersek

        System.out.println(arr1[2]);// 6

        arr1[3]=20;
        System.out.println(arr1[3]);//20
        System.out.println(arr1.length);//5

        // son elementi yazdırın
        System.out.println(arr1[arr1.length-1]);//10


        // array in tüm elementlerini yazdirin

        for (int i =0; i <arr1.length ; i++) {

            System.out.print(arr1[i]+" ");
        }


        //arr1[5]=30;

        //array in uzunlugu sonradan degistirelemez
        //eger array de olmayan bir ındex e atama yapmak isterseniz
        //ArrayIndexOutOfBoundsException
        //bu hata Compile Time Error CTE degil
        //Run time error dur





    }

}
