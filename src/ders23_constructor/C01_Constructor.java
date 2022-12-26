package ders23_constructor;

import ders22_arraysLists.Toyata;

public class C01_Constructor {
    public static void main(String[] args) {

        Car car1=new Car();
        Toyata toyata=new Toyata();

        System.out.println(car1);// Car{marka='Toyata', model='Model belirtilmmiştir', yil=0, km=0, renk='null'}

        System.out.println(toyata);// ders22_arraysLists.Toyata@3567135c
        // toyata bir obje oldugundan ozellıklerını dırek YAZDIRAMAYIZ, referansı yazdırır

        // bır class'dan olusturulan objelerın belırlı ozellıklerını kolayca yazdırabılmek ıcın
        // o class'da ıstenen ozellıkleri kapsayan bır toStrıng() olusturabılır


        /*
        toStrıng method'ndakı yazılanları ıstedıgımız sekıl ve formata uyarlayabılırız
        Car{marka='Toyata'
         , model='Model belirtilmmiştir'
         , yil=0
         , km=0
         , renk='null'}

         */
        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="siyah";

        System.out.println(car1);

        /*     Car{marka='Audi'
                , model='A4'
                , yil=2020
                , km=20000
                , renk='siyah'}

         */

    }

}
