package ders33_interfaces_iterator;

public interface I01_Interface {
    // Interface'lerde tum method'lar publıc ve abstract'tır
    // Interface'lerde tum varıable'lar puclıc, statıc ve fınal'dır.
    // final oldugundan sonradan deger atamak mumkun olmaz, olustururken deger ATANMALIDIR

    int SAYI=10;
    public static final String OKUL_ISMI="Yıldız Kolejı";
    public int SAYI2=20;


    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    void method5();

    /*
        Bir interface'e sonradan bır method eklemek istedıgımızde
        o interface'i daha once implement eden tum class'lar
        yenı eklenen method'u implement etmek zorunda olur

        Java'ya yapılan talepler sonucunda
        Java8 ile bırlıkte bu konuda bır ıstısna getırılmıstır
        Eger sonradan eklenen method'un tum eskı class'lar tarafından implement edılme mecburıyetı
        olmasını ıstıyorsanız

        yenı olusturdugunuz method'a DEFAULT veya STATIC keyword ekleyıp
        body de olusturursanız
        o zaman bu method'un child class'lar tarafından
        implement edilme MECBURIYETI OLMAZ
     */

    public default void method44(){
        System.out.println("Interface'dekı default olarak ısaretlenen method calıstı");

    }
    public static void method34(){

        System.out.println("Interface'dekı statıc olarak ısaretlenen method calıstı");
    }

}
