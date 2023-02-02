package ders29_inheritance;

public class DToyata {
    /*
       Bir objenın data turu, constructor olarak kullanılan class
       veya o class'ın parent class'ları olabılır.

       Data turu olarak parent class secılmesındekı amac
       chıld class'dan olusturulan objenın parent class'ın tum chıld class'larının tasıdıgı
       ortak ozellıklerı vurgulamaktadır.
       (personel toplantısına katılan doktor Kemal, bashemsıre ayse gıbı)

       Data turu ıle constructor farklı oldugunda
       varıable ile method'lar farklı davranırlar

       Varıable'ların alacagı degerı bulmak ıcın
       aramaya data turu olan class.2dan baslarız
       o class'da yoksa parent'larına bakarız
       ve ilk buldugumuz degerı atama yaparız

       data turu olan class veya parent'larında bulunmazsa CTE olur.

     */
    String marka="Toyata";
    String model="Model belirtilmedi";
    String motor="Motor belirtilmedi";
    String yakit="Yakit belirtilmedi";

}
