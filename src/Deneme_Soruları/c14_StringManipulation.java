package Deneme_Soruları;

public class c14_StringManipulation {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String cümle="Hayattaki cok güzeldir  cok zordur";
        String Copycumle=cümle.toLowerCase();

        if (Copycumle.contains("ev") && Copycumle.contains("iş")){
            System.out.println("Hem ev lazim hem is");
        } else if (Copycumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (Copycumle.contains("iş")) {
            System.out.println("calismak guzeldir");

        }else{
            System.out.println("cok calisman lazim");
        }
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.


        String input1 =("15.30 €");
        String input2 =("11.40 €");      //output : 26.70 €

        String input="€";
        input1=input1.substring(0,5);
        input2=input2.substring(0,5);



        System.out.println(Double.parseDouble(input1)+Double.parseDouble(input2)+" "+ input);


    }
}
