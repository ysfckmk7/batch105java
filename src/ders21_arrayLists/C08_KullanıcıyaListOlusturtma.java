package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullanıcıyaListOlusturtma {
    public static void main(String[] args) {

        // Soru2- Kullanıcıdan istedıgınız kadar ısım alıp,
        // Q'ya bastıgında girdıgı ısımlerı bıze Liste olarak dondurecek bir method olusturun

        System.out.println(listeOlustur());
    }

    public static List<String> listeOlustur(){

        List<String> isimler=new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        String girilenİsim="";


        while (!girilenİsim.equalsIgnoreCase("q")){

            System.out.println("Lutfen Listeye eklemek ıcın ısım giriniz"+
                    "\nBitirmek icın q'ya basın");
            girilenİsim=scan.nextLine();

            if (!girilenİsim.equalsIgnoreCase("q")){
                isimler.add(girilenİsim);

            }
        }

        return isimler;
    }
}
