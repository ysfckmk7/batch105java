package ders13_nestedForLoop;

public class c01_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String input="Java ne kadar güzel";


        for (int i =input.length()-1; i >=0 ; i--) { // "l" den "J" ye kadar ters yazdırıyoruz

            System.out.print(input.charAt(i));
        }









    }
}
