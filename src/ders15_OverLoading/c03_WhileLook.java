package ders15_OverLoading;

public class c03_WhileLook {
    public static void main(String[] args) {
        // ıkı basakmaklı aralarında 1 bosluk olacak sekılde yazdırın

        for (int i =10; i <=99 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");

        int sayı=10;

        while (sayı<100){
            System.out.print(sayı+" ");

            sayı++;

        }
        System.out.println(sayı);


    }
}
