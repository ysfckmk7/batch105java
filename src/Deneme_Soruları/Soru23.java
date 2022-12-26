package Deneme_Soruları;

public class Soru23 {
    public static void main(String[] args) {
        //Soru 17-)Klavyeden okunan bir integer sayıyı basamak basamak
        // ve tersten ekrana yazdıran bilgisayar programını yazınız

        int sayı=123;
        String strsayı=""+sayı;
        String tersstr="";

        for (int i =strsayı.length()-1; i >=0 ; i--) {

            tersstr+=strsayı.substring(i,i+1);
        }
        System.out.println(tersstr);











    }
}
