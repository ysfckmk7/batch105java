package ders35_sets_maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_HashSet_TreeSet {
    public static void main(String[] args) {

        // bır hashSet ve bır treeSet olusturun
        // bır loop ıle ıclerıne rastgele 100000 sayı ekleyın
        // işlem surelerını karsılastırın

        Random rdn=new Random();
        int sayi;

        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();

        Long hashBaslangıc=System.currentTimeMillis();
        for (int i =0; i <100000 ; i++) {
            sayi=rdn.nextInt(1000000);
            hashSet.add(sayi);
        }
        Long hashBitis=System.currentTimeMillis();

        Long treeBaslangıc=System.currentTimeMillis();
        for (int i =0; i <100000 ; i++) {
            sayi=rdn.nextInt(1000000);
            treeSet.add(sayi);
        }

        Long treeBitis=System.currentTimeMillis();

        System.out.println("HashSet süre : " + (hashBitis-hashBaslangıc));
        System.out.println("TreeSet süre : " + (treeBitis-treeBaslangıc));
    }
}
