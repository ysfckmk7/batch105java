package Deneme_Soruları;

import java.util.Scanner;

public class c29_WhileLoop {
    public static void main(String[] args) {
        //Soru : Kullanicidan Kullanicidan sifre isteyin
        // asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // kullanicinin yeni sifre girmesi isteyin Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        // sartlar :
        // sifrenin ilk karakteri kucuk harf olmali
        // sifrenin son karakteri rakam olmali


        Scanner scan=new Scanner(System.in);
        boolean sıfreGecerlıMI=false;
        String sıfre="";
        int bayrak;


        while (sıfreGecerlıMI!=true){
            System.out.println("lutfen bir sifre giriniz");
            sıfre=scan.nextLine();
            bayrak=0;

            if (!(sıfre.charAt(0)>='a' && sıfre.charAt(0)<='z')){
                System.out.println("sifrenin ilk karakteri kucuk harf olmali");
                bayrak++;
            }
            if (!(sıfre.charAt(sıfre.length()-1)>='0' && sıfre.charAt(sıfre.length()-1)<='9')){
                System.out.println("sifrenin son karakteri rakam olmali");
                bayrak++;
            }
            if (bayrak==0){
                sıfreGecerlıMI=true;
                System.out.println("sifreniz basari ile kaydedildi");
            }





        }







        }

    }

