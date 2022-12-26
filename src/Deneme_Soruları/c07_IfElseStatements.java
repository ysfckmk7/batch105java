package Deneme_Soruları;

public class c07_IfElseStatements {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int kenar1=7;
        int kenar2=7;
        int kenar3=7;

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2>0 && kenar1>0 && kenar3>0  ){
            System.out.println("Eskenar ucgen");
        }else{
            System.out.println("Eskenar degil");
        }

        //Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        int not=77;

        if (not>=50){
            System.out.println("Sinifi Gectin");
        }else{
            System.out.println("Maalesef kaldin");
        }

        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        int yas=50;

        if (yas>=65 ){
            System.out.println("Emekli olabilirsin");

        }else if (yas>20){
            System.out.println("Emekli olabilmesi için: " + (65-yas) + " yıl daha çalışman gereiyor");
        }else{
            System.out.println("yanlis yaş aralığı girdiniz");
        }
















    }
}
