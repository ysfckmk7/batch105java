package Deneme_Soruları;

import java.util.Scanner;

public class c09_IfElseStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunadedi = 13;
        double listefiyati = 10;
        boolean musterikart = false;
        double toplamfiyat = 0;

        if (musterikart == true && urunadedi >= 10) {
            toplamfiyat = listefiyati * urunadedi * (0.80);
            System.out.println("%20 indirim fiyatı:" + toplamfiyat);
        } else if (musterikart == true && urunadedi < 10 && urunadedi > 0) {
            toplamfiyat = listefiyati * urunadedi * (0.85);
            System.out.println("%25 indirimli fiyatı:" + toplamfiyat);
        } else if (musterikart == false && urunadedi >= 10) {
            toplamfiyat = listefiyati * urunadedi * (0.85);
            System.out.println("%15 indirim fiyatı:" + toplamfiyat);
        } else if (musterikart == false && urunadedi < 10 && urunadedi > 0) {
        toplamfiyat = listefiyati * urunadedi * (0.90);
        System.out.println("%10 indirim fiyatı:" + toplamfiyat);
        }else{
            System.out.println("gecersiz bilgi girdiniz");
        }

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen km deger giriniz");
        double mesafe=scan.nextDouble();
        System.out.println("lutfen bir birim giriniz");
        String birim=scan.next();

        double metre=mesafe*1000;
        double santimetre=metre*1000;



        if (birim.equals("metre")){
            System.out.println(metre);
        } else if (birim.equals("santimetre")) {
            System.out.println(santimetre);
        }else{
            System.out.println("istediginiz birim sisteme kayitli degil");
        }


    }
}
