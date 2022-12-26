package Deneme_Soruları;

public class c33_WhileLoop {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun


        int sayı=4;
        int us=2;


                     SayıUssu(sayı,us);

    }

    public static void SayıUssu(int sayı,int us){
        int carpım=1;

        while (us>0){
            carpım*=sayı;
            us--;
        }

        System.out.println(carpım);


    }

}
