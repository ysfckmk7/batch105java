package ders17_scope;

public class C04_ClassVariables {
    public static void main(String[] args) {
        // C03 deki hastane ismini  yazdırmak istersek
        System.out.println(C03_ObjectVariables.hastaneisimi);// Yıldız hastanesi

        System.out.println(C03_ObjectVariables.hastasayısı);// 23453

        C03_ObjectVariables.hastasayısı++;
        C03_ObjectVariables.hastasayısı++;
        method1();

        System.out.println(C03_ObjectVariables.hastasayısı);// 23456
    }// kod takibi main method dan baslar
     // main method un sonuna gelindiğinde hersey biter
     // tüm değişimler resetlenir
     // variable degerleri bastaki hallerine döner

    public static void method1(){
        C03_ObjectVariables.hastasayısı++;
    }

}
