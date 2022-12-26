package ders26_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {


        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);// 2022-12-22T13:38:51.678335600

        // sadece tarıhı 22/12/2022 olarak yazdıralım

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldt.format(format1));// 22/12/2022

        // Sadece tarihi 12.22.22 Thu seklınde yazdıralım

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("MM.dd.yy EEE");
        System.out.println(ldt.format(format2));// 12.22.22

        // Sadece zamanı 01:53 PM olarak yazdırın

        DateTimeFormatter format3=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format3));// 01:53 PM

        /*
           Format olustururken
           GÜN
           d: basta 0 varsa onu yazmadan gun numarası
           dd: tek haneli gunlerı 01 gıbı basına sıfır yazarak gun numarası
           DDD: yılın kacıncı gunu oldugunu yazar
           E,EE,EEE: gun ısmının ilk 3 harfı
           EEEE: gun ısmının tamamını

           AY (Ay ıcın M, dakıka ıcınm kullanılır)
           M:basta 0 varsa onu yazmadan ay numarası
           MM:tek hanelı ayları 01 gıbı basına sıfır yazarak ay numarası
           MMM:Ay isminin ilk 3 harfi
           MMMM:Ay isminin tamami

           YY:yılın son ıkı rakamını
           YYYY:Yılın tamamını

           saat:(24 saat uzerınden ıstıyorsak H,12 saat uzerınden ıstıyorsak h)

           HH:saatin tamamı, tek rakamlı saat olursa 02 gıbı
           H:tek rakamlı saat olursa sadece saati

           m:minute

           a yazarsak AM veya PM degerını yazar
         */

    }
}
