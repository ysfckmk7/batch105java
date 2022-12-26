package Deneme_Soruları;

import java.util.Scanner;

public class c28_WhileLoop {
    public static void main(String[] args) {


        //Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin


        Scanner scan=new Scanner(System.in);
        int sayı=10;

        while (sayı<100){

            sayı++;


            if (sayı%7==0){

                System.out.print(sayı+ " ");
            }
        }




    }
}
