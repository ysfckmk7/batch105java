package Deneme_Soruları;

public class c19_ForLoops {
    public static void main(String[] args) {
        //Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak yazdirin.

        for (int i = 1; i <=100 ; i++) {

            System.out.print(i+" ");
        }
        //Soru 2- Kullanicidan pozitif bir tamsayi alin,
        // 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.
        System.out.println(" ");

        int sayi=133;

        for (int i = 1; i<=sayi ; i++) {
            if (i%7==0) System.out.print(i+" ");
        }

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        System.out.println("");
        int sayı=10;

        int sayılartoplamı=0;

        for (int i =sayi; i >=1 ; i--) {

            sayılartoplamı=sayılartoplamı+i;
            System.out.println(sayılartoplamı); //133

            if (1<sayı){
                System.out.print("WARNİNG");
                break;
        }else{
                System.out.print("himmmm"+" ");
            }


        }



















    }
}
