package ders15_OverLoading;

import java.util.Scanner;

public class c06_WhileLoop {
    public static void main(String[] args) {

        //Soru :Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // kullanicinin yeni sifre girmesi isteyin
        // Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        // sartlar :
        // sifrenin ilk karakteri kucuk harf olmali
        //  sifrenin son karakteri rakam olmali

        Scanner scan=new Scanner(System.in);
        boolean sıfregecerlıMı=false;
        String sıfre="";
        int bayrak=0;

        while (sıfregecerlıMı!=true){
            System.out.println("lutfen bir sıfre giriniz");
            sıfre=scan.nextLine();
            bayrak=0;


            if (!(sıfre.charAt(0)>='a' && sıfre.charAt(0)<='z')){
                System.out.println("lutfen ilk karakteri kucuk harf girinız");
                bayrak++;
            }
            if (!(sıfre.charAt(sıfre.length()-1)>='0' && (sıfre.charAt(sıfre.length()-1)<='9'))){
                System.out.println("lutfen son karakterı rakam gırınız");
                bayrak++;

            }
            if (bayrak==0){
                sıfregecerlıMı=true;
                System.out.println("sifreniz basari ile kaydedildi");

            }



        }








    }
}
