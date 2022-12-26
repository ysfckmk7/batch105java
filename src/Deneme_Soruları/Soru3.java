package Deneme_Soruları;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        //Soru2: Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor.
        // Program aşağıdaki özellikleri sağlamalıdır.
        //Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
        //Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama, 2-Çıkarma vb…
        //Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin. Bu girilen iki sayıyı değişkenlerde saklayın.
        //Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın.


        Scanner scan=new Scanner(System.in);
        System.out.println("1:toplama \n2:cıkarma \n3:carpma \n4:bölme");
        System.out.println("lutfen 1.sayıyı gırınız");
        int sayı1=scan.nextInt();
        System.out.println("lutfen 2.sayıyı giriniz");
        int sayı2=scan.nextInt();
        System.out.println("lutfen işlem tercihini seciniz");
        int işlemtercıhı=scan.nextInt();

        if (işlemtercıhı==1){
            System.out.println(sayı1+sayı2);
        } else if (işlemtercıhı==2) {
            System.out.println(sayı1-sayı2);
        } else if (işlemtercıhı==3) {
            System.out.println(sayı1*sayı2);
        } else if (işlemtercıhı==4) {
            System.out.println(sayı1/sayı2);
        }else{
            System.out.println("yanlıs işlem tercihi yaptınız");
        }


    }
}
