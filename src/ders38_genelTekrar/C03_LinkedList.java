package ders38_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        // Verilen bir linkList'de
        // istenen iki index'deki elementlerin yerlerini degistirin

        LinkedList<String> isimler=new LinkedList<>();
        isimler.add("Said");
        isimler.add("Huseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Humeyra");

        System.out.println(isimler);// [Said, Huseyin, Hasan, Sevilay, Humeyra]

        // Hasan ile Humeyranın yerlerını degstırelım
        // buyuk bır lıstede ındex bılmeden yapalım
        String ilkisim="Hasan";
        String ikinciIsim="Humeyra";

        String temp="";

        temp=ilkisim;

        int ilkİsimIndex= isimler.indexOf(ilkisim);
        int ikinciIsimIindex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkİsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIindex,temp);

        System.out.println(isimler);// [Said, Huseyin, Humeyra, Sevilay, Hasan]


    }
}
