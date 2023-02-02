package ders31_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {

        String str="23";

        // str' a sayısal olarak 5 ekleyip yazdırın.
        System.out.println(Integer.parseInt(str)+5);

        // eger str ıcınde sayı olmayan bır karakter olursa NumberFormatException

        Object sayiObj=str;

        Integer sayiInt=(Integer)sayiObj;

        System.out.println(sayiInt);// ClassCastException

    }
}
