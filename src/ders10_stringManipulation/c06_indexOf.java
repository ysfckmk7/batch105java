package ders10_stringManipulation;

public class c06_indexOf {
    public static void main(String[] args) {
        String str="Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9

        System.out.println(str.indexOf('c'));// 8

        System.out.println(str.indexOf("hersey"));// 15

        System.out.println(str.indexOf("e", 9));// 13

        // 13.index deki e den bir sonraki e nın index ini bulalım

        System.out.println(str.indexOf("e",14));// 16

        // cumledekı 2. c nın index ini yazdırın

        int ilkindex= str.indexOf("c"); //8
        System.out.println(str.indexOf("c",ilkindex+1));// 22

        //System.out.println(str.indexOf("ali")); // olamayan herseyı -1 olarak dondurur.

        int ilkindex2= str.indexOf("h");// 1
        System.out.println(ilkindex2);

        System.out.println(str.indexOf("h",ilkindex2+1));// 6






    }
}
