package ders10_stringManipulation;

public class c04_Endswiths {
    public static void main(String[] args) {
        String str="Java heryerde guzel";

        System.out.println(str.endsWith("guzel"));//true

        System.out.println(str.endsWith(""));// true // hıclık

        System.out.println(str.endsWith("Java heryerde guzel"));// true

        System.out.println(str.endsWith("Java"));// false







    }
}
