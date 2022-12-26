package ders07_NestedIfSTATEMENTS;

import com.sun.tools.javac.Main;

public class c05Nestedifstatements {
    public static void main(String[] args) {
        // kullanıcıdan aldıgı urun adedi ve liste fiyatını alin
        // kullanıcıya musteri kartı olup olmadıgını sorun
        // musteri kartı varsa 10 urunden fazla alırsa %20, az ise %15 indirim yapin
        // musteri karti yoksa 10 urunden fazla alırsa %15, az ise %10 indiriim yapın

        int urunadedi=25;
        double listefiyati=20;
        boolean musterikart=false;
        double toplamfiyat=0;

        // ana degısken kart olsun

        if (musterikart){
            // kart var
            if (urunadedi<0){
                System.out.println("yanlıs urun adedı girişi");

            } else if (urunadedi<=10) {
                toplamfiyat=urunadedi*listefiyati*0.85;
                System.out.println("% 15 indirimli toplam satıs:" + toplamfiyat);
            }else{
                toplamfiyat=urunadedi*listefiyati*0.80;
                System.out.println(" 20 indirimli toplam satıs:" + toplamfiyat);
            }


        }else{
            //kart yok

            if (urunadedi<0){
                System.out.println("yanlıs urun adedı girişi");

            } else if (urunadedi<=10) {
                toplamfiyat=urunadedi*listefiyati*0.90;
                System.out.println("% 10 indirimli toplam satıs:" + toplamfiyat);
            }else{
                toplamfiyat=urunadedi*listefiyati*0.85;
                System.out.println("% 15 indirimli toplam satıs:" + toplamfiyat);

            }


        }







    }
}
