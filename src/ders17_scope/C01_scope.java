package ders17_scope;

public class C01_scope {
    public static void main(String[] args) {

        // bir method un icerisinde olusturulan variable larin scope u
        // içinde oluşturuldukları method dur
        // o method un dısından ULASILAMAZLAR

        int sayi=10;
        String isim="Ramazan";
        //System.out.println(dogruMu);


        for (int i = 0; i <10 ; i++) {
            String adres="Ankara";
        // bir loop icerisinde olusturulan variabler sadece o loop ıcerısınde gecerlidir

        }
        //System.out.println(adres);

        double pi;

       // System.out.println(pi);

       // local variable laer deger atanmadan olusturulabilır ancak KULLANILAMAZ
       // kullanmadan once deger atanmıs OLMALIDIR



    }
    public static void method1(){

        //System.out.println(sayi);
        //isim="tugay";

        boolean dogruMu=true;

    }

}
