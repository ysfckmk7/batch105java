package ders03_datacastingWrapperClass;

public class c01_DataCasting {
    public static void main(String[] args) {
        /*
        bazı data turlerı asla bırbırıne cast edilemez
        */
        //String str=20;
        //boolean a="true";
        //int ab= true;
        double s=20;
        int sayi=15;
        long ln=sayi;  // eşitliğin sol tarafı long,sağ tarafı yani deger int
                       // java itiraz etmedi
        /*
        dar data turunden bır degeri
        genıs data turundekı varıable yaparsanız
        java bunu otomatık olarak yapar
         */
        short sh=23;
        int a=sh;
        long lng=sh;
        float fl=lng;
        /*
        ama tersını yapmak ıstersenız
        yanı buyuk data turundekı bır degeri
        kucuk data turundekı variable'a atamak istersenız java kabul etmez
         */
        double dbl=20;
        //a=dbl;
        //short abc=dbl;















    }
}
