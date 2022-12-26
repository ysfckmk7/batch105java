package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class c07_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ısmını, soyısmını ve yasını alıp, asagıdakı formatta yazdırın
        // isminiz: John
        // Soyismininiz:Doe
        // Yasiniz:44
        // Kaydiniz basariyla tamamlanmiştir.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ısım giriniz");
        // strıng ıcın kullanılabılen next() sadece space e kadar olan kısmı alır
        //                             nextline() ıse satırda yazılan tum bılgıyı alır
        String isim = scan.nextLine();

        System.out.println("lutfen soyısım giriniz");
        String soyisim = scan.nextLine();

        System.out.println("lütfen yas giriniz");
        double yas= scan.nextDouble();

        System.out.println("isim:"+ isim+"\nsoyisim:"+ soyisim+"\nyaş:"+yas+"\nKaydınız basarıyla tamamlanmıstır");







    }
}
