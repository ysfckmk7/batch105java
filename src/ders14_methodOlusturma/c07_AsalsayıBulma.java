package ders14_methodOlusturma;

public class c07_AsalsayıBulma {
    //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    //sonuclarini donduren bir method olusturun.




    public static void main(String[] args) {
        int sayı=23;

        System.out.println(asalsayıKontrolEt(sayı));//Asal sayıdır
        System.out.println(asalsayıKontrolEt(1980));// Asal değildir

        // Asal değildir


    }



    public static String asalsayıKontrolEt(int sayı){
        String sonuc="";

        for (int i =2; i <=(sayı-1) ; i++) {

            if (sayı%i==0){
                sonuc="Asal değildir";
                break;
            }
        }

        if (!sonuc.equals("Asal değildir")){
            sonuc="Asal sayıdır";
        }



        return sonuc;

    }
}



