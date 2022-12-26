package Deneme_Soruları;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {

        //Soru 6-)Ekrandan okunan 3  (String) karakter verinin
        //en büyüğünü bularak ekrana yazdıran bilgisayar programını Java programlama dilinde yazınız.

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 1. karakteri giriniz");
        String str1="Java ögrenmek guzeldir";

        System.out.println("lutfen 2. karakteri giriniz");
        String str2="Java dili diğer diller arasında daha komplekslidir";

        System.out.println("lutfen 3. karakteri giriniz");
        String str3="Java güzeldir";

        int İlkSayı=str1.length();
        int İkinciSayı=str2.length();
        int ÜçüncüSayı=str3.length();


        int EnBuyukSayı=5;

        if (İlkSayı>=İkinciSayı && İlkSayı<=ÜçüncüSayı){
           EnBuyukSayı=İlkSayı;

        } else if (İkinciSayı>=İlkSayı && İkinciSayı<=ÜçüncüSayı) {
            EnBuyukSayı=İkinciSayı;

        }else{
            EnBuyukSayı=ÜçüncüSayı;

        }

        System.out.println("EN BUYUK SAYI:" + EnBuyukSayı);
    }
}
