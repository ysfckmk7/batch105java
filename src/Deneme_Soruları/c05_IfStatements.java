package Deneme_Soruları;

public class c05_IfStatements {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        int sayı=14;

        if (sayı%5==0){
            System.out.println("Sayi 5’in tam kati");
        }else {
            System.out.println("Sayi 5’in tam kati degildir");
        }
        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        char harf='H';

        switch (harf){

            case 'o':
            case 'O':
                System.out.println("ocak");
                break;
            case 's':
            case 'S':
                System.out.println("subat");
                break;
            case 'm':
            case 'M':
                System.out.println("mart ve mayıs");
                break;
            case 'n':
            case 'N':
                System.out.println("nisan");
                break;
            case 'h':
            case 'H':
                System.out.println("haziran");
                break;
            case 't':
            case 'T':
                System.out.println("temmuz");
                break;
            case 'a':
            case 'A':
                System.out.println("agustos ve aralık");
                break;
            case 'e':
            case 'E':
                System.out.println("eylul ve ekim");
                break;
            case 'k':
            case 'K':
                System.out.println("kasım");
                break;
            default:
                System.out.println("yanlıs harf girdiniz");





        }









    }
}
