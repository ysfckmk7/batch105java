package Deneme_Soruları;

public class c26_MethodOlusturma {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //sonuclarini donduren bir method olusturun.

        AsalSayıIste();


    }
        public static void AsalSayıIste(){

        int sayi=1234567890;
        boolean asal=true;

            for (int i =2; i <=sayi-1 ; i++) {

                if (sayi%i==0){
                    System.out.println("Asal sayı değildir");
                    break;
                }else{
                    System.out.println("Asal sayıdır");
                    break;


                }
            }






        }









}
