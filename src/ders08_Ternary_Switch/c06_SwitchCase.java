package ders08_Ternary_Switch;

public class c06_SwitchCase {
    public static void main(String[] args) {
        // kullanıcıdan girdıgı gun numarasının
        // gun ısmını yazdırın

        int gunismi = 7;
        /*
        if (gunismi == 1) {
            System.out.println("pazartesi");

        } else if (gunismi == 2) {
            System.out.println("sali");

        } else if (gunismi == 3) {
            System.out.println("carsamba");

        } else if (gunismi == 4) {
            System.out.println("persembe");

        } else if (gunismi == 5) {
            System.out.println("cuma");

        } else if (gunismi == 6) {
            System.out.println("cumartesi");

        } else if (gunismi == 7) {
            System.out.println("pazar");

        }else {
            System.out.println("gecersiz haftanın gunu");
        }*/

        switch (gunismi){
            case 1:
                 System.out.println("pazartesi");
                 break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz haftanın gunu");


        }
    }
}