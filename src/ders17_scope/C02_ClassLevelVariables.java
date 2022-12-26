package ders17_scope;

public class C02_ClassLevelVariables {

    // class level variable lar method ların dısında olusturulur
    //genel kullanım en ustte olusturulmalıdır
    static String hastaneisimi="Yildiz hastanesi";
    static int hastasayısı=23453;
    static String basHekim;
    String persİsmi="isim girilmedi";
    String persTelefonu;
    int persYasi;


    public static void main(String[] args) {
        System.out.println(hastaneisimi); // Yildiz hastanesi
        System.out.println(basHekim); // null
        //System.out.println(persİsmi); static olmadıgı ıcın statık main method dan kullanılamaz

        /*
        Class level variable a deger ataması yapilmamis olursa
        Java bu variable lara data turune gore
        default olarak tanımlanan degerlerı atar
        default degerler;
        sayısal variaable lar:0
        boolen: false
        char:''
        Objeler (String dahil) : null
         */

    }

    public static void method1(){
        System.out.println(hastaneisimi);
        hastasayısı++;
       // System.out.println(persİsmi);// static olmadıgı ıcın statık main method dan kullanılamaz

    }

    public void method2(){

        System.out.println(hastaneisimi);// Yildiz hastanesi
        hastasayısı++;
        System.out.println(persİsmi);// isim girilmedi
        System.out.println(persYasi);// 0


    }

}
