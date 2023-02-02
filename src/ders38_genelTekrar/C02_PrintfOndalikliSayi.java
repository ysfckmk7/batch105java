package ders38_genelTekrar;

import java.util.Scanner;

public class C02_PrintfOndalikliSayi {
    public static void main(String[] args) {
        // Kullanıcıdan boy ve kilosunu alip
        // vucut kitle endeksini ve durumunu yazdiralim
        // kullanıcıdan kılo(kg) ve buyunu(cm) isteyip vucut kitle endeksinı hesaplayın
        // (kilo*10000/(boy*boy))
        // vucut kıtle endeksı 30 dan buyukse obez
        // 25-30 arası ıse kilolu
        // 20-25 arası ıse normal,
        // 20 den kucukse zayıf yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kilonuzu gırınız");
        double kilo = scan.nextDouble();
        System.out.println("lutfen boyunuzu cm olarak giriniz");
        double boy = scan.nextDouble();

        double vke = (double) (kilo * 10000 / (boy * boy));

       // System.out.println("vucut kıtle endeksı:" + vke );
        System.out.printf("vucut kıtle endeksı : %5.2f %n",vke);//%5: 5 rakamı sag dayalı 5 karakter bos bıraktı
        if (vke > 30) {                                         //.2f: . sınırlandırdı.2 rakamı vırgulden sonrakı rakam sayısı.
                                                                // f:ondalık sembolu
            System.out.println("obez");
        } else if (vke > 25) {
            System.out.println("kilolu");
        } else if (vke > 20) {
            System.out.println("normal");
        } else if (vke > 0) {
            System.out.println("zayıf");
        }else {
            System.out.println("yanlıs giriş");


        }
    }
}
