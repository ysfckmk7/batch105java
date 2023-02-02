package ders30_overriding;

public class CAvcıKuslar extends BKuslar{
    protected void hareket(){
        System.out.println("ucarlar");
    }
    protected void beslenme(){
        System.out.println("et yerler");
    }
    protected void pence(){
        System.out.println("pencelıdırler");
    }
    protected void gaga(){
        System.out.println("sıvrı gagalı");
    }

    public static void main(String[] args) {

         CAvcıKuslar krt1=new CAvcıKuslar();

         krt1.hareket();// C ucarlar
         krt1.beslenme();// C et yerler
         krt1.pence();// C pencelıdırler
         krt1.gaga();// C sıvrı gagalı
         krt1.kanat();// B kanatlıdırlar
         krt1.solunum();// B akcıgerle nefes alırlar
         krt1.cogalma();// B yumurtayla cogalırlar
         krt1.omur();// A yasar ve olurler
        // Eger constructor ıle data turu aynı ıse
        // ozellıgın varıable veya method olmasına bakılmaksızın
        // o class'a gıdılır, o class veya parent class'larda
        // bulunan İLK DEGER kullanılır

        BKuslar krt2=new CAvcıKuslar();
        krt2.hareket();// C ucarlar
        krt2.beslenme();// C et yerler
         // krt2.pence();// BKuslar veya parent class'da yok, CTE verır
        krt2.gaga();// C sıvrı gagalı
        krt2.kanat();// B kanatlıdırlar
        krt2.solunum();// B akcıgerle nefes alırlar
        krt2.cogalma();// B yumurtayla cogalırlar
        krt2.omur();// A yasar ve olurler

        AHayvanlar krt3=new CAvcıKuslar();
        krt3.hareket();// C ucarlar
        krt3.beslenme();// C et yerler
        //krt2.pence();// AHayvanlar'da yok, CTE
        //krt3.gaga();// AHayvanlar'da yok, CTE
        //krt3.kanat();// AHayvanlar'da yok, CTE
        krt3.solunum();// B akcıgerle nefes alırlar
        krt3.cogalma();// B yumurtayla cogalırlar
        krt3.omur();// A yasar ve olurler



    }
}
