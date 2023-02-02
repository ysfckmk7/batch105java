package ders27_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder();
        // Kapasitesi 16 olan bos bır StringBuldier olusturur

        System.out.println(sb1); // bos bır satır yazdırır
        System.out.println(sb1.capacity());// 16


        StringBuilder sb2=new StringBuilder(11);
        System.out.println(sb2);// bos bır satır yazdırır
        System.out.println(sb2.capacity());// 11

        StringBuilder sb3=new StringBuilder("Java Candır");
        System.out.println(sb3);// Java Candır
        System.out.println(sb3.capacity());// 27  // bos StringBuldier capasitesi 16 oldugu ıcın uzerıne ekleme yapılmıstır.


        sb2.append("Java");
        System.out.println(sb2);// Java
        System.out.println(sb2.capacity());// 11

        sb2.append("Candır");
        System.out.println(sb2);// JavaCandır
        System.out.println(sb2.capacity());// 11


        sb2.append(".");
        System.out.println(sb2);// JavaCandır.
        System.out.println(sb2.capacity());// 24= 2 * 11 + 2  // otomatik formul






    }
}
