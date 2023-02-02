package ders36_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayılarınıBulma {
    public static void main(String[] args) {

        // Verilen bır cumlede kullanılan her bır harfı
        // Ve kacar kez kullanıldıgını yazdırın

        // Ornek: Java candir
        // output: J=1, a=3, v=1, c=1, n=1, d=1, i=1, r=1


        String cumle="Java candir";

        //oncelıkle boslugu ve noktalama isaretlerını yok edelım
        cumle=cumle.replaceAll("\\W","");

        String[] cumleArr=cumle.split("");// [J, a, v, a, c, a, n, d, i, r]


        Map<String,Integer> kullanimSayilariMap=new TreeMap<>();

        for (int i =0; i <cumleArr.length ; i++) {
            // her bır elementı ele alıp
            // map'de key olarak yoksa value=1 olarak eklerız
            // map'de key olarak varsa value 1 artirilmali

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){
                kullanimSayilariMap.put(cumleArr[i],1);

            }else {
                int eskiValue=kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }
        }

        System.out.println(kullanimSayilariMap);
    }
}
