package ders13_nestedForLoop;

public class c05_NestedForLoopUcgen {
    public static void main(String[] args) {
        /*
        nested for loop kullanarak asagıdakı seklı yazdıralım
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int i =1; i <=5 ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println("");
        }



    }
}
