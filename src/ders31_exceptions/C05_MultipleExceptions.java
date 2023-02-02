package ders31_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    public static void main(String[] args) {

        /*
            Eger bırden fazla exception olusma ihtimali varsa
            bu exception'lar bırbırınden bagımsız ıse
               1- tek try ıstenen kadar catch yapılabılır
               2- ıkısı ıcın ıc ıce try catch yapabılırım
               3- ıkı exception'i da kapsayan tek bır catch yapabılırım
         */

        String str="Java'da cok fazla exceptions var";
        int[] arr={3,5,1,3,2,6,3,6,8,5,2};

        // Kullanıcıdan bır tamsayı alın
        // ve girilen sayıyı index olarak kullanıp
        // str ve arr'den o indexdeki elementleri yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır ındex gırın");
        int index=scan.nextInt();

        //System.out.println("String'den ıstenen index'deki element : " + str.substring(index,index+1));
        //System.out.println("Array'den ıstenen ındexdekı element : " + arr[index]);


        /* 1. cozum

        try{
            System.out.println("String'den ıstenen index'deki element : " + str.substring(index,index+1));
            System.out.println("Array'den ıstenen ındexdekı element : " + arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Istenen ındex Strıng'ın sınırları dısında");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ıstenen ındex Array'in sınırları dısında");
        }

     */

        /* 2. cozum ıc ıce try catch

        try {
            try {
                System.out.println("String'den ıstenen index'deki element : " + str.substring(index,index+1));
                System.out.println("Array'den ıstenen ındexdekı element : " + arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Istenen ındex Strıng'ın sınırları dısında");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ıstenen ındex Array'in sınırları dısında");
        }

         */

        // 3. cozum tek ama daha kapsamlı exception kullanma

        try {
            System.out.println("String'den ıstenen index'deki element : " + str.substring(index, index + 1));
            System.out.println("Array'den ıstenen ındexdekı element : " + arr[index]);
        }catch (RuntimeException e){
            System.out.println("index String ve/veya Array'in sinirlari disinda");
            e.printStackTrace();
        }
    }

}
