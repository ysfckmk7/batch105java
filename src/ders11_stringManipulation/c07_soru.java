package ders11_stringManipulation;

public class c07_soru {
    public static void main(String[] args) {
        //: Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        String isim ="MeHmeT";
        String soyısım="HaRun";
        String yeniisimsoyisim;

        if (isim.length()>soyısım.length()){
            yeniisimsoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
                    +soyısım.substring(0,1).toUpperCase()+soyısım.substring(1).toLowerCase();


        }else {

            yeniisimsoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+
            " "+ soyısım.toUpperCase();

        }
        System.out.println(yeniisimsoyisim);// Mehmet Harun




    }
}
