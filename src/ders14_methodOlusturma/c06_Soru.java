package ders14_methodOlusturma;

public class c06_Soru {
    //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //isim bosluk soyisim seklinde bize donduren bir method olusturun
    //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz


    public static void main(String[] args) {

        String isim="ÖMER";
        String soyisim="kesen";

        System.out.println(İsimSoyisimDüzenleme(isim, soyisim)); //Ömer Kesen
        System.out.println(İsimSoyisimDüzenleme("hEYSEM","RENKOGLU"));//Heysem Renkoglu

    }

    public static String İsimSoyisimDüzenleme(String isim,String soyisim){

        String YeniİsimSoyisim=isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " "
                                +soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();
        return YeniİsimSoyisim;


    }





}

