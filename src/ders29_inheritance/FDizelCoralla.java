package ders29_inheritance;

public class FDizelCoralla extends ECoralla{

    String motor="1.6 dızel motor";
    String yakit="Dizel";
    String guvenlik="Abs";
    String renk="Renk belirtilmedi";


    public static void main(String[] args) {

        DToyata c3=new FDizelCoralla();
        System.out.println(c3.motor);// T Motor belirtilmedi
        System.out.println(c3.yakit);// T Yakit belirtilmedi
        //System.out.println(c3.guvenlik);// CTE
        //System.out.println(c3.renk);// CTE

        System.out.println(c3.model);// T Model belirtilmedi
        //System.out.println(c3.uretımYerı);// CTE
        //System.out.println(c3.teker);// CTE
        //System.out.println(c3.vites);// CTE

        System.out.println(c3.marka);// T Toyata




        // Bazen child class'dan obje olusturmakla beraber
        // bu child class'ın parent class'ındakı hangı ozellıklerını
        // aldıgını bılmek ısteriz
        // Bu durumda data turunu constructor'ı kullanılan class'ın
        // parent class'larından secebılırız



        ECoralla c2=new FDizelCoralla();// data turu class'ından baslıyoruz
        System.out.println(c2.motor);// T Motor belirtilmedi
        System.out.println(c2.yakit);// T Yakit belirtilmedi
        //System.out.println(c2.guvenlik);// CTE
        //System.out.println(c2.renk);// CTE

        System.out.println(c2.model);// C Coralla
        System.out.println(c2.uretımYerı);// C Turkıye
        System.out.println(c2.teker);// C 205/55/14
        System.out.println(c2.vites);// C Vites belirtilmedi

        System.out.println(c2.marka);// T Toyata


        FDizelCoralla c1=new FDizelCoralla();
        System.out.println(c1.motor);// DC // 1.6 dızel motor // cagrılan sınıfları temsıl eder
        System.out.println(c1.yakit);// DC Dizel
        System.out.println(c1.guvenlik);// DC Abs
        System.out.println(c1.renk);// DC Renk belirtilmedi

        System.out.println(c1.model);// C Coralla
        System.out.println(c1.uretımYerı);// C Turkıye
        System.out.println(c1.teker);// C 205/55/14
        System.out.println(c1.vites);// C Vites belirtilmedi

        System.out.println(c1.marka);// T Toyata




    }

}
