package ders20_multıDimensionalArrays;

import ders18_Arrays.C06_KullanıcıyaArrayOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        C06_KullanıcıyaArrayOlusturma obj1=new C06_KullanıcıyaArrayOlusturma();


        List<Integer> sayilar = new ArrayList<>();

        //1- List primitive data kabul etmez
        //2- List bir interface oldugu icin dırek obje olusturulamaz
        //   Onun yerine sag tarafa ArrayList<>() yazarız


        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar);// [4, 5]




    }
}
