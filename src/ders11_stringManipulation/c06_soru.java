package ders11_stringManipulation;

public class c06_soru {
    public static void main(String[] args) {
        //Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String cumle="Eve geldım, işler bırıkmıs";

        String cumlecopy=cumle.toLowerCase();
        System.out.println(cumlecopy); //eve geldım, işler bırıkmıs

        if (cumlecopy.contains("ev") && cumlecopy.contains("iş")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumlecopy.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumlecopy.contains("iş")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }


    }
}
