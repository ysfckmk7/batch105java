package ders24_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {

        int fiyat=100;

        // %10, %20 ve %30 indirim uygulayıp indirimli fiyati yazdıran 3 method olusturalım
        indirimliYap10(fiyat);// 90
        indirimYap20(fiyat);// 80
        indirimYap30(fiyat);// 70

        System.out.println(fiyat);// 100



    }
    public static void indirimliYap10(int fiyat){

        fiyat=fiyat*90/100;

        System.out.println("%10 indirimli fiyat : " + fiyat);
    }
    public static void indirimYap20(int fiyat){

        fiyat=fiyat*80/100;
        System.out.println("%20 indirimli fiyat : " + fiyat);
    }
    public static void indirimYap30(int fiyat){
        fiyat=fiyat*70/100;

        System.out.println("%30 indirimli fiyat : " + fiyat);

    }

}
