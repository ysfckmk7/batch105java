package ders31_exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptions {
    public static void main(String[] args) {

        // Kullanıcıdan yasını gırmesını ısteyın

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen yasınızı gırınız");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalAccessException("hata");
            }else{
                System.out.println("Yasınız kaydedıldı");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}
