package ders07_NestedIfSTATEMENTS;

public class c02_NestedIfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan aldıgı urun adedi ve liste fiyatını alin
        // kullanıcıya musteri kartı olup olmadıgını sorun
        // musteri kartı varsa 10 urunden fazla alırsa %20, az ise %15 indirim yapin
        // musteri karti yoksa 10 urunden fazla alırsa %15, az ise %10 indiriim yapın

        int urunadedi=-7;
        double listefiyati=10;
        boolean musterikart=false;
        double toplamfiyat=0;


        if(musterikart==true&& urunadedi>=10){
            toplamfiyat=(urunadedi*listefiyati*(0.8));
            System.out.println("%20 indirimli toplam fiyat:" + toplamfiyat);

        } else if (musterikart==true && urunadedi<10 && urunadedi>0) {
            toplamfiyat=(urunadedi*listefiyati*(0.85));
            System.out.println("%15 indirimli toplam fiyat:" + toplamfiyat);

        } else if (musterikart==false && urunadedi>=10 &&  urunadedi>0) {
            toplamfiyat=(urunadedi*listefiyati*(0.85));
            System.out.println("%15 indirimli tolam fiyat:" + toplamfiyat);

        } else if (musterikart==false && urunadedi<10 &&  urunadedi>0) {
            toplamfiyat=(urunadedi*listefiyati*(0.90));
            System.out.println("%10 indirimli toplam fiyat:" + toplamfiyat);


        }else{
            System.out.println("gecersiz giriş");

        }


    }
}
