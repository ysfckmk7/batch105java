package ders26_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {

        /*
           Argument olarak tamsayılar alıp
           ilk argument harıc gerıye kalanları toplayıp
           bulunan toplamı ılk argument ıle carpıp
           sonucu yadıran bir method olusturun
           (Not argument sayısı degısken olabılır)
         */
        
        işlemYap(3,4,5,8,1,2);// 60
        işlemYap(5,1);// 5
        işlemYap(4);// 0 // gerıyekalanların toplamı 0 oldugu ıcın sonuc sıfır.
        işlemYap(3,4,5,6);// 45
    }

    private static void işlemYap(int ilkSayi, int ... geriyeKalanlar) {

        int geriyeKalanlarToplamı=0;

        for (int each:geriyeKalanlar
             ) {
            geriyeKalanlarToplamı+=each;
        }

        System.out.println(geriyeKalanlarToplamı*ilkSayi);

    }
}
