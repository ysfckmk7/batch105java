package ders04_matematikselişlemler_incrementDecrement;

public class c06_Pre_Post_Increment {
    public static void main(String[] args) {
        int a=10;
        // a varıable nın degerı yazdırıp, sonra a nın degerını bır artırın
        System.out.println("a:"+a);//10
        a++;
        // a artık 11

        int b=10;

        //b varıablenın degerını bır artırın,sonra yazdırın
        ++b;
        System.out.println("b:"+b);//11

        int c=10;
        // c varıable nın degerı yazdırıp, sonra c nın degerını bır artırın
        System.out.println("c:"+ c++);

        int d=10;
        //d varıablenın degerını bır artırın,sonra yazdırın
        System.out.println("d:"+ ++d);

        /*
        c++ veya ++d yı yazdırma veya atama ıslemınde kullanırsanız
        c++ e post increment denır o satır ıcın islemı yapar sonra artırmayı yapar
        ++d ye ıse pre ıncrement denır,once artırma sonra ıslemı yapar

        işlemın oldugu satırın bır alt satırına gecırıldınde
        c de d de bır artmıstır
         */






















    }
}
