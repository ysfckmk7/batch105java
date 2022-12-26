package ders22_arraysLists;

public class ToyataRunner {
    public static void main(String[] args) {

        Toyata toyata1=new Toyata(); // Toyata class'ina gider gorunen constructor'ı calıstırır
                                     //  sonra kaldıgı yerden devam eder.

        System.out.println(toyata1.marka +","
                           +toyata1.model+","
                           +toyata1.yil+","
                           +toyata1.km+","
                           +toyata1.renk);
        // Toyata,Model belirtilmmiştir,0,0,null

        toyata1.model="Coralla";
        toyata1.yil=2020;
        toyata1.km=50000;

        System.out.println(toyata1.marka +","
                +toyata1.model+","
                +toyata1.yil+","
                +toyata1.km+","
                +toyata1.renk);
        // Toyata,Coralla,2020,50000,null









    }


}
