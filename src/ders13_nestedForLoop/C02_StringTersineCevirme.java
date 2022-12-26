package ders13_nestedForLoop;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input="Java her gecen gun guzellesıyor";
        String tersınput="";

        for (int i =input.length()-1; i >=0 ; i--) {

            tersınput+=input.substring(i,i+1);

        }
        System.out.print("Ters Hali:" + tersınput); // Ters Hali:royısellezug nug neceg reh avaJ







    }
}
