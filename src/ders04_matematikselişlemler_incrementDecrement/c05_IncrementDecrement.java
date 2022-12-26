package ders04_matematikselişlemler_incrementDecrement;

public class c05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=10;
        // bu sayıyı 3 artıralım ve yazalım

        sayi=sayi+3;
        System.out.println(sayi);//13
        sayi+=3;
        System.out.println(sayi);//16

        int s=10;
        // bu sayıyı 1 artıralım
        s=s+1;//11
        s+=1;//12
        s++;//13
        ++s;//14
        System.out.println(s);

        int t=10;
        t=t-1;//9
        t-=1;//8
        t--;//7
        --t;//6
        System.out.println(t);







    }
}
