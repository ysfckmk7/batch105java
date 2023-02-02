package ders34_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {

        // Deque double ended queue demektir
        // İki yonlu kuyruk

        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler);// [J, L]
        harfler.addFirst("B");
        System.out.println(harfler);// [B, J, L]

        System.out.println(harfler.removeFirst());// B
        System.out.println(harfler);// [J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler);// [A, J, L, A, K]

        // sona dogru olan A'yı sılın

        harfler.removeLastOccurrence("A");
        System.out.println(harfler);// [A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T"));// false

        LinkedList<String> karakterler=new LinkedList<>();
        karakterler.push("A");// addFirst() ile aynı işlemi yapar
        karakterler.push("B");
        System.out.println(karakterler);// [B, A]

        System.out.println(karakterler.clone());// [B, A]




    }
}
