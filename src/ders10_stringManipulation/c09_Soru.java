package ders10_stringManipulation;

public class c09_Soru {
    public static void main(String[] args) {

        /*
    kullanıcıdan bır cumle ve bır metın alın
    cumlede metnın durumuna gore
    1- cumle metnı ıcermıyor
    2- cumle metnı sadece 1 kere ıcerıyor
    3- cumle metnı bırden fazla ıcerıyor
    seceneklerınden uygun olanı yazdırın
     */

        String cümle = "java cok guzeldir cok.";
        String metin = "cok";


        int ilkindex=cümle.indexOf(metin);
        int sonindex=cümle.lastIndexOf(metin);


        if (ilkindex==-1){
            System.out.println("cumle metnı ıcermıyor");


        }else if (ilkindex==sonindex){
            System.out.println("cumle metnı sadece 1 kere ıcerıyor");


        }else {
            System.out.println("cumle metnı bırden fazla ıcerıyor");
        }








    }
}
