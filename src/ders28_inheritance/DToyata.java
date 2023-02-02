package ders28_inheritance;

public class DToyata extends CCar{



    DToyata(){
        System.out.println("Parametresiz Toyata constructor'i calıstı");
    }
    DToyata(String param1){
        System.out.println("Parametrelı toyata constructor'i calıstı");
    }


    String marka="Toyata";
    String uretımYerı="Toyata farklı ulkelerde uretılır";
}
