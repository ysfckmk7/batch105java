package ders11_stringManipulation;

public class c01_nullPointer {
    public static void main(String[] args) {

        String str1="";
        //str1 e deger atanmıstır

        System.out.println(str1);// hıclık yazdırır
        System.out.println(str1.concat("Java"));//Java

        String str2;
        // str2 olusturuldu deger atanmadı
        //System.out.println(str2); // str2 e deger atanmadıgı ıcın yazdırmaz CTE yazdırır
        //System.out.println(str2.concat("Java")); deger atanmadıgı ıcın method la  kullanılamaz

        str2="Java candır";//
        System.out.println(str2);// Java candır
        System.out.println(str2.concat("."));// Java candır.


        String str3=null;// str3 e deger atanmamıstır
                         // null poınter ile javaya deger atamadıgımızın farkında oldugumuzu soyluyoruz

        System.out.println(str3); // null ısaretlendigini yazdırır

        //System.out.println(str3.concat("Java"));// NullPointerException
        System.out.println(str3 + " Java");//null Java
        //System.out.println(str3.toUpperCase());// NullPointerException





    }
}
