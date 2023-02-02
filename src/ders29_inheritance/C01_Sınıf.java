package ders29_inheritance;


class okul{

    String okulısmı="Yıldız Kolejı";
    String telefon="3123456543";

}

public class C01_Sınıf extends okul{
    String sınıf="11-C";
    String telefon="3123437434";

    C01_Sınıf(String telefon){

        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);

        System.out.println(okulısmı);
        System.out.println(this.okulısmı);
        System.out.println(super.okulısmı);

        System.out.println(sınıf);
        System.out.println(this.sınıf);
        // System.out.println(super.sınıf); // Java'da parent'da olmayan bırseyı chıl'dan gıdıp ıstemeyez.
        // Parent class'da aranan sınıf degerı olamadıgından CTE verır

    }

    public static void main(String[] args) {

        C01_Sınıf obj1=new C01_Sınıf("4222342323");

    }

}
