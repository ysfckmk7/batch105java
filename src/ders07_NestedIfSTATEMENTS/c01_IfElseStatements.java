package ders07_NestedIfSTATEMENTS;

import java.util.Scanner;

public class c01_IfElseStatements {
    public static void main(String[] args) {
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
        System.out.println("vucut kıtle endeksı:" + vke );

       /* if (vke > 30) {
            System.out.println("obez");
        } else if (vke > 25) {
            System.out.println("kilolu");
        } else if (vke > 20) {
            System.out.println("normal");
        } else if (vke > 0) {
            System.out.println("zayıf");
        }else{
            System.out.println("yanlıs giriş");*/



            if (vke < 0) {
                System.out.println("yanlıs giriş");
            } else if (vke <20 ) {
                System.out.println("zayıf");
            } else if (vke <25 ) {
                System.out.println("normal");
            } else if (vke <30 ) {
                System.out.println("kilolu");
            }else{
                System.out.println("obez");












            }
    }
}