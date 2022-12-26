package ders08_Ternary_Switch;

public class c05_NestedTernary {
    public static void main(String[] args) {
       // kullanıcıdan bır tamsayı alın
       // sayı pozıtıfse cıft sayı veya cıft sayı degil seceneklerınden uygun olanı yazdırın
       // sayı pozıtıf degılse , 3 basamaklı veya 3 basamaklı degil seceneklerinden uygun olanı yazdırın


       int sayi=-110;

       if (sayi>0){
           // cıft sayı veya cıft sayı degil seceneklerınden uygun olanı yazdırın
           System.out.println(sayi%2==0 ?"cift sayı" : "cift sayı degil");

       }else{
           // 3 basamaklı veya 3 basamaklı degil seceneklerinden uygun olanı yazdırın
           System.out.println(sayi<-99 && sayi>-1000 ? "3 basamaklı" : "3 basamaklı degil");

           String sonuc= sayi>0 ? sayi%2==0         // cok uzun ve karısık
                   ? "cift sayı" : "cıft sayı degıl"
                   :
                   sayi<-99 && sayi>-1000 ? "3 basamaklı" : "3 basamaklı degil";




       }



    }
}
