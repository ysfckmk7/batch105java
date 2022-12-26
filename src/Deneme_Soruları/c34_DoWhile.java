package Deneme_Soruları;

import java.util.Scanner;

public class c34_DoWhile {
    public static void main(String[] args) {

        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.


        char harf='k';

        do {
            harf=(char)(harf+1);

            System.out.print(harf+" ");

        }while (harf<'t'-1);



    }
}
