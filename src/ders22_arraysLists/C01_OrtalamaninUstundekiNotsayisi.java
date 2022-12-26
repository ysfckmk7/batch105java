package ders22_arraysLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotsayisi {
    public static void main(String[] args) {

        // Ogretmenden ogrencı notlarını alıp bir list olusturun
        // ogretmen 100'den buyuk bır sayı gırıp, bıtırdıgınde
        // sınıf sayısını, sınıf ortalamasını ve kac kısının ortalamanın ustunde not aldıgını yazdırın


        List<Double> notlar=listeOlustur();
        System.out.println(notlar);

        raporla(notlar);


    }

    public static void raporla(List<Double> notlar) {
        // sınıf sayısını, sınıf ortalamasını ve kac kısının ortalamanın ustunde not aldıgını yazdırın

        int ogrencıSayısı=notlar.size();
        double notlarToplamı=0.0;
        double sınıfNotOrtalaması=0.0;
        int ortalamaUstundekıOgrencıSayısı=0;

        // notlar toplamını bulalım

        for (int i = 0; i <notlar.size() ; i++) {

            notlarToplamı += notlar.get(i);
        }

            // not ortalamasını bulalım

            sınıfNotOrtalaması=notlarToplamı/ogrencıSayısı;

            // ortalama ustundekı ogrencı sayısını bulalım

            for (int i = 0; i<notlar.size() ; i++) {

                if (notlar.get(i)>sınıfNotOrtalaması){
                    ortalamaUstundekıOgrencıSayısı++;
                }
            }

            // rapor ıcın ıstenenlerı yazdıralım

            System.out.println("Girilen not sayısı : " + ogrencıSayısı+
                    "\nGirilen notların ortalaması : " + sınıfNotOrtalaması+
                    "\nOrtalama uzerındekı not alan ogrencı sayısı : " + ortalamaUstundekıOgrencıSayısı);


    }

    public static List<Double> listeOlustur() {

            List<Double> notlar = new ArrayList<>();

            Scanner scan = new Scanner(System.in);

            Double girilenNot =5.0;


            while (girilenNot <=100) {

                System.out.println("Lutfen Listeye eklemek ıcın not giriniz" +
                        "\nBitirmek icın 100'den buyuk bır sayı yazın");
                girilenNot = scan.nextDouble();

                if (girilenNot <=100) {
                    notlar.add(girilenNot);

                }
            }

            return notlar;

    }
}
