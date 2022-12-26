package Deneme_Soruları;

public class c30_WhileLoop {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayı=1453

                ;
        int rakamlartop=0;
        int birlerbas=0;

        while (sayı!=0){
            birlerbas=sayı%10;
            rakamlartop+=birlerbas;
            sayı/=10;




        }
        System.out.println(rakamlartop);





    }
}
