package ders19_arrays;

import ders18_Arrays.C03_ArrayElementleriniArtirma;
import ders18_Arrays.C04_ArrayElementleriToplama;
import ders18_Arrays.C05_ArraydaElemanArama;
import ders18_Arrays.C06_KullanıcıyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlarıKullanma {
    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 2 artirin

        int [] arr={2,3,4};

        arr=C03_ArrayElementleriniArtirma.elementleri2Artır(arr);
        System.out.println(Arrays.toString(arr));

        // arr array'inin elementlerini toplayıp sonucu yazdırın

        System.out.println(C04_ArrayElementleriToplama.pozitifelementleritopla(arr));// 15

        // arr array'inde 10 elment olarak var mi ?

        C05_ArraydaElemanArama.elemanAra(arr,10);// Aranan sayi array de yok


        // kullanıcıdan deger alarak bir array olusturun

       int [] yeniArr=C06_KullanıcıyaArrayOlusturma.arrayOlustur();

        System.out.println(Arrays.toString(yeniArr));






    }


}
