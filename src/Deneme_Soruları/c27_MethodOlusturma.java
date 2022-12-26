package Deneme_Soruları;

public class c27_MethodOlusturma {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun


        int sayı=15;
        int i=1;
        int tamsayıbol=0;


        while (sayı>0){
            if(sayı%i==0){
                tamsayıbol++;
                i++;


            }

            System.out.println(tamsayıbol);

        }






    }













}
