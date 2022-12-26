package ders22_arraysLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun


        int input=28;
        System.out.println(tamBolenlerListesiOlustur(input));// [1, 2, 4, 7, 14, 28]

    }

    public static List<Integer> tamBolenlerListesiOlustur(int input){

        List<Integer> tambolenlerlistesi=new ArrayList<>();

        for (int i =1; i <=input; i++) {

            if(input % i ==0){
                tambolenlerlistesi.add(i);
            }

        }

          return tambolenlerlistesi;

    }
}
