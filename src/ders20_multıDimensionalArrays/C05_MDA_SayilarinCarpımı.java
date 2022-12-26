package ders20_multıDimensionalArrays;

public class C05_MDA_SayilarinCarpımı {
    public static void main(String[] args) {

        //Soru 4- Verilen 2 katli bir array’de bulunan
        //tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr={{5,7},{5,8,9},{0,1}};

        elementlericarp(arr);

    }
    public static int elementlericarp(int [][] arr){

       int carpım=1;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                carpım*=arr[i][j];

            }
        }
        System.out.println("verilen sayıların carpımı : " + carpım);
     return carpım;
    }
}
