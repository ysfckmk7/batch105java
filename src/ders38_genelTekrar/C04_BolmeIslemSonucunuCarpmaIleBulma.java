package ders38_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {
        // Kullanıcıdan bolunecek sayi ve bolecek sayiyi alip
        // Bolme ıslemının sonucunu, carpma ıslemı ıle bulan ve yazdıran bır method olusturun
        // Bu islemi kullanıcı Q'ya basıncıya kadar devam ettırın

        Scanner scan =new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;

        do {
            System.out.println("Lutfen bolunecek tamsayiyi girin,\nbitirmek icin Q'ya basin");

            try {
                bolunecekSayi=scan.nextInt();
                System.out.println("Lutfen bolucek sayiyi giriniz");
                bolenSayi=scan.nextInt();
                bolumSonucuYazdir(bolunecekSayi,bolenSayi);
                
            } catch (InputMismatchException e) {

                String girilenStr=scan.nextLine();
                // 23.satirda nextInt() ile degeri alamadıysa, exception olusacak
                // bu satira gelecek ve biz o degeri nextLine() ile alacagiz

                if (girilenStr.equalsIgnoreCase("Q")){
                    devamEdelimMi=false;
                }else{
                    System.out.println("Bolunecek sayi tamsayi olmalidir");
                }
            }

        }while (devamEdelimMi);


    }

    private static void bolumSonucuYazdir(int bolunecekSayi, int bolenSayi) {
        // bolucek sayi ve bolen sayi negativ veya pozitif olabilir
        // bu durumda oncelikle isaret kontrolu yapmamiz lazim
        // isaret sorununu cozmek icin
        // once islem sonucunun ısaretini belirleyip


        int sonucIsareti=1;

        if (bolunecekSayi*bolenSayi<0){
            sonucIsareti=-1;
        }
        // sonra sayilari isaretten bagımsız hale getirelim

        bolunecekSayi=bolunecekSayi>=0 ? bolunecekSayi : bolunecekSayi*(-1);
        bolenSayi=bolenSayi>=0 ? bolenSayi : bolenSayi*(-1);

        int bolumSonucu=1;

        while (bolumSonucu*bolenSayi<bolunecekSayi){
            bolumSonucu++;
        }

      if (bolumSonucu*bolenSayi==bolunecekSayi){
          System.out.println("Bolme isleminin sonucu : " + bolumSonucu*sonucIsareti);
      }else{
          System.out.println("Bolme isleminin sonucu : " + (bolumSonucu-1)*sonucIsareti);
      }
    }
}
