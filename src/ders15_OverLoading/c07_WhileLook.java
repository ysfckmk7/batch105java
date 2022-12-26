package ders15_OverLoading;

public class c07_WhileLook {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //While loop kullanarak verilen sayinin istenen üssünü hesaplayip yazdiran bir method
        //olusturun

        int sayı=3;
        int us=4;


              sayıussu(sayı,us);

    }




    public static void sayıussu(int sayı,int us){

       int sonuc=1;

       while (us>0){
           sonuc*=sayı;

           us--;
       }
        System.out.println(sonuc);
    }



}
