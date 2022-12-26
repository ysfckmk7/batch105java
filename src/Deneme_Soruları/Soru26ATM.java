package Deneme_Soruları;

import java.util.Scanner;

public class Soru26ATM {
    public static void main(String[] args) {

        /*
        While dongusu yardımıyla bır atm programı yapmaya calısın.
        işlemler
        1-işlem:Bakiye Öğrenme
        2-işlem:Para Çekme
        3-işlem:Para Yatırma
        4-Çıkış:Q
         */

        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        String işlemler="1-işlem:Bakiye Öğrenme\n"
                          +"2-işlem:Para Çekme\n"
                          +"3-işlem:Para Yatırma\n"
                          +"4-Çıkış:Q";

        System.out.println("************************************");
        System.out.println(işlemler);
        System.out.println("************************************");


        while (true){
            System.out.println("işlemi seçiniz:");
            String işlem=scan.nextLine();

            if (işlem.equals("Q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }else if (işlem.equals("1")){
                System.out.println("Bakiyeniz:"+ bakiye);
            }else if (işlem.equals("2")){
                System.out.println("Çekmek istediğiniz tutarı giriniz:");
                int tutar=scan.nextInt();
                scan.nextLine();

                if (bakiye-tutar<0){
                    System.out.println("Yeterli Bakiye Yok, Bakiyeniz:" + bakiye);
                }else{
                    bakiye-=tutar;
                    System.out.println("Yeni Bakiyeniz:" + bakiye);
                }
            }else if (işlem.equals("3")){
                System.out.println( "Yatırmak istediğiniz tutar:");
                int tutar=scan.nextInt();
                scan.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni Bakiyeniz:" + bakiye);

            }else{
                System.out.println("Geçersiz İşlem...");

            }




        }





















    }
}
