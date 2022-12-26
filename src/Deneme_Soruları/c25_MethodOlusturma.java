package Deneme_Soruları;

public class c25_MethodOlusturma {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

        AliYılmazIste();

    }

    public static void AliYılmazIste(){


        String isim="Ali";
        String soyisim="YILMAZ";
        //output : Ali Yilmaz

        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        System.out.println(isim+" "+soyisim);




    }






}
