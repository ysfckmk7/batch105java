package ders04_matematikselişlemler_incrementDecrement;

import java.util.Scanner;

public class c04_RakamlarToplamı {
    public static void main(String[] args) {

        // kullanıcının 4 basamaklı bır sayının
        //rakamlar toplamını veren bır kod yazınız

        int input=1453;


        int birlerbasamagı=0;
        int rakamlartoplamı=0;

        // bırler basamagı al
        birlerbasamagı=input% 10; //3
        //bırler basamagı rakamlar toplamına ekle
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;//3
        //bırler basamagından kurtul
        input=input/10;//145





        birlerbasamagı=input% 10; //5
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;//8
        input=input/10;//14


        birlerbasamagı=input% 10; //4
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;//12
        input=input/10;//1


        birlerbasamagı=input% 10; //1
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;//13
        input=input/10;//0

        System.out.println(rakamlartoplamı);











    }
}
