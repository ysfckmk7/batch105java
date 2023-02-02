package ders27_StringBuilder;

public class C05_Encapsulation {
    public static void main(String[] args) {

        /*
            Access modifiers bir class uyesıne erısımı sınırlandırırken
            gorme yetkısı(read) ve degıstırme yetkısını(write) ayirt edemez

            Ama gercek hayatta buna ıhtıyac vardır
            Bazı class uyelerının readable olması ıstenırken
            Bazı class uyelerının sadece wrıteable olması ıstenır
            Ve bazı class uyelerı ıcın ıkı yetkı de ıstenır

            Java bu yetkılendırme ıslemını Encapsulation ile cozmustur

            Sadece yazma yetkısı ıcın setter()
            Sadece okuma yetkısı ıcın getter()

            Kodlarımızın daha anlasılır bır sekılde atama ve yazma ıslemlerını yapması ıcın de
            getter() ve setter() method'ları bırlıkte kullanılabılır
            Bazı developer'lar boyle yapmayı tercıh eder

         */

        EncapsuleClass obj1=new EncapsuleClass();

        obj1.setSatis(100);
        obj1.setSatis(200);
        obj1.setSatis(300);

        System.out.println(obj1.getToplamSatıs());// 600

        obj1.setHalkaAcıkSayı(400);
        System.out.println(obj1.getHalkaAcıkSayı());// 400


    }
}
