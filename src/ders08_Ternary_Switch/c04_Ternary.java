package ders08_Ternary_Switch;

public class c04_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan bır ucgenın 3 kenar uzunlugunu alın
        // ucgen eskenar ıse "eskenar ucgen" yazdırın, degilse "eskenar degil" yazdırın

        int kenar1=0;
        int kenar2=0;
        int kenar3=0;

        System.out.println( kenar1>0 && kenar2>0 & kenar3>0 && kenar1==kenar2 && kenar2==kenar3    // cok uzun gorunuyor
                           ?"eskenar ucgen" :  "eskenar degil");

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0 && kenar2>0 & kenar3>0){
            System.out.println("eskenar ucgen");

        }else{
            System.out.println("eskenar degil");
        }

          // kullanıcıdan ıkı sayı alın ve buyuk olmayan sayıyı yazdırın


        int  sayi1=16;
        int  sayi2=11;

        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);






    }
}
