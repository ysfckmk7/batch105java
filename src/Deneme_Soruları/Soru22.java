package Deneme_Soruları;

import java.util.Scanner;

public class Soru22 {
    public static void main(String[] args) {

        //Soru 16-)Ekrandan n tane satıcının isminin ve aylık satışlarının girildiğini düşünelim.
        // Satışları 10000 YTL’nin üzerindeki ödül alacak satıcının ismini ekrana yazdıran Java programı yazınız

        Scanner scan=new Scanner(System.in);
        String str1="Ali";
        int str1kazanc=12000;

        String str2="Ahmet";
        int str2kazanc=9000;

        String str3="Ayşe";
        int str3kazanc=1000;

       if (str1kazanc>10000){
           System.out.println("ödül sahibi:" + str1);

       } else if (str2kazanc>10000) {
           System.out.println("ödül sahibi:" + str2);

       }else{
           System.out.println("ödül sahibi:" + str3);
       }


    }
}
