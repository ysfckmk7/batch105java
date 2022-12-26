package Deneme_Soruları;

public class c20_ForLoops {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        int sayi=5;

        int sayitoplam=0;

        for (int i = sayi; i >=1 ; i--) {
            sayitoplam=sayitoplam+i;
        }
        System.out.println(sayitoplam);//
        if (1<sayi){
        }else {
        }
        System.out.println(" ");

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin

        int sayı=10;

        int faktoriyel=1;

        for (int i = sayı; i >=1 ; i--) {

            faktoriyel=faktoriyel*i;

        }
        System.out.println(faktoriyel);


    }
}
