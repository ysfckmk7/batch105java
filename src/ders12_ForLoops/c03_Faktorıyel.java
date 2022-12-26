package ders12_ForLoops;

public class c03_Faktorıyel {
    public static void main(String[] args) {
        //kullanıcın verdıgı faktorıyelı bulalım

        int sayı=10;

        int faktorıyel=1;

        for (int i = sayı; i >=1 ; i--) {
            faktorıyel=faktorıyel*i;
        }
        System.out.println(faktorıyel);


        // 1 den 100 e kadr olan sayıları toplayın

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {

            toplam=toplam+i;
        }

        System.out.print(toplam);




    }
}
