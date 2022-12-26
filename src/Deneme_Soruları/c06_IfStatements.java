package Deneme_Soruları;

public class c06_IfStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        int sayi=9;

        if (sayi%3==0 && sayi%5==0) {
            System.out.println("hem 3 e hemde 5 e bölünebilen sayı");


        }else if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayı");


        } else if (sayi%5==0) {
            System.out.println("Bes ile bolunebilen sayi");



        }else{
            System.out.println("üc ve bes ile bölünemeyen sayı");
        }

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        int kenar1=7;
        int kenar2=24;
        int kenar3=25;

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0 && kenar2>0 && kenar3>0) {
            System.out.println("ucgen eskenar");

        }else{
            System.out.println("eskenar ucgen degildir");
        }
        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        double not=50;

        if (not>=50){
            System.out.println("sinifi gectin");

        }else{
            System.out.println("Maalesef kaldin");
        }















    }
}
