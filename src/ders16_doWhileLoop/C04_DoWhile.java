package ders16_doWhileLoop;

public class C04_DoWhile {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true ,değilse false yazdırınız.
        // Ornek : input : 16, output: 4

        int sayı=15;
        int baslangıc=1;
        int bayrak=0;

        do {
            if (baslangıc*baslangıc==sayı) {
                System.out.println("true");
                bayrak++;
                break;
            }
             baslangıc++;


        }while (baslangıc*baslangıc<=sayı);

            if (bayrak==0){
                System.out.println("false");
            }


    }
}
