package ders26_dateTime_varargs;


public class C06_Varargs {
    public static void main(String[] args) {

        // oyle bır method oluturalım kı
        // kactane argument yazarsam yazayım
        // argumentlerin toplamını versın

        topla(5,6);// 11
        topla(5,8,2);// 15
        topla(4,5,9,8,7,6,2,3);// 44

        /*
            Varargs array altyapısını kullanır
            Temel hedef argument sayısı degısse bıle
            aynı data turundekı tum argumentleri alabılecek bır parametre olusturmaktadır
         */



    }

    private static void topla(int... sayilar) {


        int toplam1=0;
        for (int i =0; i <sayilar.length; i++) {
            toplam1+=sayilar[i];

        }
        System.out.println(toplam1);

        int toplam2=0;
        for (int each:sayilar
             ) {

            toplam2+=each;

        }
        System.out.println(toplam2);

    }
}
