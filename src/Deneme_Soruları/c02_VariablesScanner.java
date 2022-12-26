package Deneme_Soruları;

public class c02_VariablesScanner {
    public static void main(String[] args) {
        //4-
        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        int kenar1=5;
        int kenar2=7;
        int alan= kenar1*kenar2;

        System.out.println("Dikdörtgenın Alanı: " + kenar1*kenar2); //35
        System.out.println("Dikdörtgenın Alanı: " + alan);// 35
       //5-
        //Kullanicidan ismini, soyismini ve yasini alip
        // asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        String isim="j";
        String soyisim="Doe";
        int yas=44;

        System.out.println(isim+" "+soyisim+","+ " " +44 );
        //6-
        //- Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin

        double yarıcap=4;
        double cevre=2*3.14*yarıcap;
        double aln=3.14*yarıcap*yarıcap;

        System.out.println("cemberın cevresi: "+ cevre + "\ncemberin alanı: "+ aln);














    }
}
