package ders12_ForLoops;

public class c02_ForLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");// 1 2 3 4 5 6 7 8 9 10
        }
        System.out.println(" ");
        // 2 basamaklı sayılardan 7 ıle bolunebılenlerı yan yana yazın

        for (int i = 10; i <100 ; i++) {
            if (i%7==0) System.out.print(i+" ");
            }
        System.out.println("");// 14 21 28 35 42 49 56 63 70 77 84 91 98

        // 13 den baslayarak 100 e kadr 7 er 7er yazdıralım

        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i+" "); // 13 20 27 34 41 48 55 62 69 76 83 90 97
        }
        System.out.println("");

        // 1 den 10 a kadr olan sayıların karelerını yazdıralım

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*i +" ");
        }


        }




    }

