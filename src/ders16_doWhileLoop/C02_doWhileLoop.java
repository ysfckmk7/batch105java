package ders16_doWhileLoop;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        //10-11-12 sayılarını toplayan bır while loop olusturalım

        int sayı=10;
        int toplam=0;

        do {
            toplam+=sayı;
            sayı++;

        }while (sayı<=12);
        System.out.println(toplam);

        /*
        Do while loop un 2 avantajı vardır
        1- Loop body sı en az bır kere calısır
        (while loop da baslangıc degerı uygun degılse,Loop body sı hıc çalısmayabılır)

        2-while bıtıs kontrolu loop kadar calısır
        (while loop da bır kere fazla calısırdı
         */










    }
}
