package ders14_methodOlusturma;

import java.util.Scanner;

public class c01_Carpım {


        // main method icerisinde kullanıcıdan ıkı sayı alın
        // bu ıkı sayıyı parametre olarak kabul edıp, carpımlarını main methoda donduren bır method olusturun


            public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("lütfen ıkı sayı gırınız");
            double sayı1=scan.nextDouble();
            double sayı2=scan.nextDouble();


                System.out.println(carpımsonucu(sayı1,sayı2));

                 double carpımsonucu=carpımsonucu(6,2);
                System.out.println(carpımsonucu);

            }


        public static double carpımsonucu(double sayı1,double sayı2){
            System.out.println("carpım methodu calıstı");
            return sayı1*sayı2;

        }







    }

