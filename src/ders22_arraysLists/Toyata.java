package ders22_arraysLists;

public class Toyata {

    String marka="Toyata";
    String model="Model belirtilmmiştir";
    int yil;
    int km;
    String renk;

    // default constructor şuna benzer

    public Toyata(){
        System.out.println("Toyata class'indaki cons. calıstı ");

    }

    /*
    Bir kod blogunun constructor olup olmadıgını anlamak ıcın
    2 seye bakmalıyız

    1- Constructor class ismi ile ayni isimde olmalıdır
    (dolayısıyle cons. isimleri buyuk harfle baslar)

    2- Constructor'larin return type'i olmaz

     */




    /*

    Java -'da her class obje uretmek uzere olusturulur
    bir obje olusturulup, ilk deger ataması yapılabılmesı icin de
    MUTLAKA constructor calısmalıdır

    Java'da her class'da mutlaka CONSTRUCTOR BULUNUR

    her class'da bızım constructor olusturmamıza gerek kalmaması ıcın
    Java her class'a otomatık olarak default constructor koyar

    default constructor GORUNMEZ
    default constructor parametresı olmayan
    ve body'sınde hıc kod bulunmayan bir constructor'dir

    Birr class'da gozlerımızle bir constructor gormuyorsak
    o class'da default constructor vardır

    eger kullanıcılar tarafından gozle gorunur bır
    constructor olusturulursa Java default constructor'i SILER.
    yanı gozlerımızle bir constructor goruyorsak
    o class' default costructor YOKTUR.
     */

}
