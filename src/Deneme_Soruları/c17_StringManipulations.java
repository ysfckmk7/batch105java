package Deneme_Soruları;

public class c17_StringManipulations {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        String sifre="nemutlutürkümdiyene9";
        int bayrak=0;

        if (!(sifre.charAt(0)>'a' && sifre.charAt(0)<'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            bayrak++;
        }
        if (!(sifre.length()>=10)){
            System.out.println(" uzunlugu en az 10 karakter olmali");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifre basariyla kaydedildi");
        }

        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        String isim="Ahmet";
        String soyisim="KUZUcu";
        String isimsoyisim;

        if (isim.length()>soyisim.length()){
              isimsoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
                         +soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        }else{
            isimsoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
                        +soyisim.toUpperCase();
        }
        System.out.println(isimsoyisim); // Ahmet KUZUCU






    }
}
