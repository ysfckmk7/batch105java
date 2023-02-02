package ders39_genelTekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {
    public static void main(String[] args) {
        // Kullanıcıdan pozıtıf bır tamsayı alıp
        // o sayıdan  sıfıra kadar olan pozıtıf tamsayıları toplayın


        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi girin");
        int sayi=scan.nextInt();


        toplaForLoop(sayi);
        System.out.println("Recursive toplam : "+ toplaRecursive(sayi));
    }

    public static int toplaRecursive(int sayi) {

        if (sayi>0){

            return (sayi + toplaRecursive(sayi-1));

        }else {

            return sayi;
        }
    }

    public static void toplaForLoop(int sayi) {

        int toplam=0;
        for (int i =sayi; i >=0 ; i--) {
            toplam+=i;

        }
        System.out.println("Toplam for loop ile : " + toplam);
    }
}
