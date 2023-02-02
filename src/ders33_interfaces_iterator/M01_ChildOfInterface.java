package ders33_interfaces_iterator;

public class M01_ChildOfInterface implements I01_Interface,I02_Interface{

    // Bır class baska bır class'ı extends keyword ıle parent edınebılır
    // Ancak bırden fazla class'i parent EDINEMEZ
    // Interface'ler ıcın boyle bır sınırlama yoktur
    // Bır class ıstedıgı kadar Interface'i implement edebılır

    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI2);
        //I01_Interface.SAYI=25;// Cannot assign a value to final variable 'SAYI'

        // Interface'de olusturulan statıc veya default olarak ısaretlenen method'ların farkı
        // statıc olana ınterfaceIsmı.statıcMethodIsmı seklınde ulasabılırken
        // default olana child class'dan olusturulacak obje uzerınden erısılebılır
        I01_Interface.method34();

        M01_ChildOfInterface obj=new M01_ChildOfInterface();
        obj.method44();

    }
    // Eger bırden fazla ınterface ımplement edıldıgınde
    // Aynı ısımde method'lar farklı Interface'lerde
    // return type'a bakılır
    // return type aynı ıse sorun olmaz, cunku ıkısını de ımplement edebılırız
    // Ancak return type'ları farklı ıse bırını tercıh ettıgımızde dıgerı CTE verır
    // Bu durumda parent ınterface'lere mudahele etmek mumkunse mudahele edılebılır
    // veya bu ınterface'lerden bırını ımplement etmekten vazgecebılırız

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
