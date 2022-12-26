package ders10_stringManipulation;

public class c01_concatenation {
    public static void main(String[] args) {

       String str1="java";
       String str2="güzeldir";
       boolean bl= true;
       int sayi=20;
       double dbl=3.54;

        System.out.println(str1+bl+sayi); // javatrue20

        //System.out.println(bl+sayi);
        //String dısındakı data turlerınde toplama yapmamıza izin vermeyebilir

        System.out.println(sayi+dbl); //23.54 // genıs olan double turu oldugu ıcın double baz alındı

        //System.out.println(str1.concat(bl));
        //Contac() sadece String variable ları birlestirmek için kullanılır

        System.out.println(str1.concat(" ").concat(str2));//java güzeldir
        System.out.println(str1.concat(" ").concat("heccc").concat(" ")
                         .concat("hosss").concat(" ").concat("degilll"));









    }
 }
