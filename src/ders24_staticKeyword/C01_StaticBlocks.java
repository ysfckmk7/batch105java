package ders24_staticKeyword;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor calıstı");
   }

    public static void main(String[] args) {
        System.out.println("Main method calısmaya basladı");
    }
    static{
        // static block'lar class'daki tum yapılardan, hatta main method'dan bile once calısır
        // static block'da ıstedıgımız bır varıable'a baslangıc degerinin atanması
        // kullanıcıdan yetkı sorgulaması gıbı ıslemler yapılabılır
        // maın method calısmadan once yapılması gereken ıslem oldugunda kullanılır
        // method'larin ve statıc block'ların sıralaması java acısından onemlı degıldır
        // ancak bırden fazla statıc block varsa, kendi aralarında once usttekı calısır

        System.out.println("yukarıdakı Static block calıstı");
    }
    static {
        System.out.println("alttakı Static block calıstı");
    }
}
