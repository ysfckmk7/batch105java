package Deneme_Soruları;

public class c31_WhileLoop {
    public static void main(String[] args) {

        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip
        // bu halini bize donduren bir method olusturun.

        String str="Java ogrenmek cok guzel";

        System.out.println(TersCevırme(str));


    }

    public static String TersCevırme(String str){

       String terstr="";
       int i=str.length()-1;


        while (i>=0){
            terstr+=str.charAt(i);
            i--;


        }
        return terstr;


    }



}
