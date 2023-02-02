package ders27_StringBuilder;

public class C04_AccessModifier {

        String str;
        // Access modifier' gozlerımız gormuyorsa
        // default access modıfıer var demektır

        // Bu class'da default constructor var
        // str'ın degerı null(default deger)
        // str'in access modifier'i default access modifier


    public static void main(String[] args) {

        D obj1=new D();
        System.out.println(obj1.isimDefault);// Furkan
        obj1.defaultStaticOlmayanMethod();
        // default access modifier'li static olmayan method caliştı

        // baska class'lardaki class uyelerıne erısımde
        // access modıfıer ve statıc keyword'u dıkkate alınmalıdır
        // statıc class uyelerını obje uzerınden kullanmaya gerek yoktur
        // illa da obje uzerınden kullanmak isterseniz
        // class uyesının ismini yazmanız gerekir


        System.out.println(obj1.isimDefaultStatic);// Sevilay
        System.out.println(D.isimDefaultStatic);// Sevilay

        D.isimDefaultStatic="Mehmet";

        obj1.defaultStaticMethod();
        D.defaultStaticMethod();
        // default access modifier'li static method çalişti



    }
}
