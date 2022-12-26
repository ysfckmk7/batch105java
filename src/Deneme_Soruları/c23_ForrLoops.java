package Deneme_Soruları;

public class c23_ForrLoops {
    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin

        int sayi=17;
        boolean bayrak=false;


        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi%i==0 ){
                bayrak=true;
                break;

            }

        }
        if (bayrak){
            System.out.println( sayi +  " : asal sayı degildir");
        }else{
            System.out.println(sayi + ": asal sayıdır");
        }




    }
}
