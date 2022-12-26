package ders11_stringManipulation;

public class c05_repeat_trim {
    public static void main(String[] args) {
        String str="Java Guzeldir";
        System.out.println(str.repeat(4));//Java Guzeldir Java Guzeldir Java Guzeldir Java Guzeldir

        str="  Java guzeldir  ";

        System.out.println(str.length());//17

        str=str.trim();// boslukları sıler

        System.out.println(str);//Java guzeldir
        System.out.println(str.length());//13












    }

}
