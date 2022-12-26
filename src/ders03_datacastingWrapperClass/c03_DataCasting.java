package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class c03_DataCasting {
    public static void main(String[] args) {
        //kullanıcadan bır tamsayı alın
        //kullanıcı kac gırerse gırsın
        //konsolda -128 ile +127 arasında bır sonuc yazdıracak
        //kod yazınız
        Scanner scanner=new Scanner(System.in);
        System.out.println("tamsayı gırınız");
        int girilenSayi= scanner.nextInt();

        byte donusenSayi=(byte)girilenSayi;
        System.out.println("girdiğiniz "+ girilenSayi+"'nin donusmus hali:"+ donusenSayi);



    }
}
