package ders08_Ternary_Switch;

public class c01_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan bır sayı alın
        // sayı pozıtıfse 2 katını yazdırın
        // sayı pozıtıf degılse sayıya 10 ekleyın


        int sayi=-7;

        if (sayi>0){
            System.out.println(sayi*2);

        }else{
            System.out.println(sayi+10);


            System.out.println(sayi>0 ? sayi*2 : sayi+10);

        }











    }
}
