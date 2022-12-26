package Deneme_Soruları;

public class c18_StringManipulations {
    public static void main(String[] args) {

        // Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        // :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(yazdirin.

        String str = "GalatasaraY";
        String str1=str.substring(0,5);
        String str2=str.substring(6);
        int uzunluk=str.length();//11
        String gulme=str.substring(5,6).concat(" :)");
        String UZGUN=str.substring(5,6).concat(":(");


        if (uzunluk%2==0){
            System.out.println(str1+gulme+str2);


        }else{
            System.out.println(str1+UZGUN+str2);
        }





















    }
}
