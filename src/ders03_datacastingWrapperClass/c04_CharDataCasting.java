package ders03_datacastingWrapperClass;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class c04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 97+98=195
        //kullanıcıdan char bır karakter alın
        //o karakterden sonra gelen 3 karakterı yazdırın
        //ornek input:a, output: bcd

        Scanner scan=new Scanner(System.in);
        System.out.println("karakter gırınız");
        char ch=scan.next().charAt(0);
        System.out.println( " " +(char)(ch+1)+ (char)(ch+2)+ (char)(ch+3));








    }
}
