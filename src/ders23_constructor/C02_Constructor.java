package ders23_constructor;

public class C02_Constructor {
    public static void main(String[] args) {



    /*
    Bir obje olusturulurken
    istediğimiz ozellıklerı dırek atayabilirsek
    sonradan tekrar bir atama işlemi yapmama gerek kalmaz

    Bu durumda atamayı tek tek bızım yapmamız yerıne
    constructor'ın atama yapmasını ıstemelıyız

    atama yapmak ıcın constructor'a parametre gondermelıyız
     */

        karesınıYazdır(5);// 25
        karesınıYazdır(10);// 100


        Car car1=new Car("BMW","5.20",2020,15000,"Beyaz");
        /*
        Car{marka='BMW'
          , model='5.20'
          , yil=2020
          , km=15000
          , renk='Beyaz'}

         */

        System.out.println(car1);

        Car car2=new Car("Tofas","Sahın",2010);
        System.out.println(car2);
        /*
        Car{marka='Tofas'
           , model='Sahın'
           , yil=2010
           , km=0
           , renk='Renk secilmedi'}
         */

        Car car3=new Car("Toyata","Coralla",2016,"Gri");

        System.out.println(car3);

        /*      Car{marka='Toyata'
                , model='Coralla'
                , yil=2016
                , km=0
                , renk='Gri'}

         */



}

public static void karesınıYazdır(int sayi){

    System.out.println(sayi*sayi);




    }
}