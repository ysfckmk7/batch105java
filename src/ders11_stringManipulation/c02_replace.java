package ders11_stringManipulation;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class c02_replace {
    public static void main(String[] args) {

        String str="Java candır";

        System.out.println(str.replace('a', 'A'));//JAvA cAndır
        System.out.println(str.replace(' ','_'));//Java_candır
        System.out.println(str.replace("candır","cok guzeldir"));//Java cok guzeldir
        System.out.println(str.replace(" ",""));//Javacandır
        //String dekı tum "a" ları sılın
        System.out.println(str.replace("a",""));//Jv cndır

        //Java yerıne hava, candır yerıne guzel yazdıralım
        System.out.println(str.replace("Java","hava")
                              .replace("candır","guzel")); //hava guzel

        // sadece 1.a yı  A yapın
        System.out.println(str.replaceFirst("a","A"));//JAva candır


        System.out.println(str.replace(""," _"));//_J _a _v _a _  _c _a _n _d _ı _r _













    }
}
