package ders39_genelTekrar;

public class C02_StringManipulation {
    public static void main(String[] args) {

        // Verilen bir cumlede istenen kelimenin kac kere gectigini bulup yazdiran
        // bir method olusturalim

        String cumle="Java basladi ve bitti. Java meger ne guzelmıs. Ne phyton ne C, Java en iyisi";

        String istenenKelime="ne";

        //kullanimSayisiBul1(cumle,istenenKelime);
        //kullanimSayisiBul2(cumle,istenenKelime);
        kullanimSayisiBul3(cumle,istenenKelime);


    }

    public static void kullanimSayisiBul3(String cumle, String istenenKelime) {
        // Java buldukca silerek yapildi
        // ama JaJavava varsa buradan 2 Java buluyordu
        // bunun yerine hiclik degil "_" kullandik ve sorun cozuldu
        int kullanimSayisi=0;

        while (cumle.contains(istenenKelime)){
            kullanimSayisi++;
            cumle=cumle.replaceFirst(istenenKelime,"_");
        }

        if (kullanimSayisi==0){
            System.out.println("Cumlede aranan kelime yok");
        }else{
            System.out.println("Kelime cumlede " + kullanimSayisi+ " adet kullanilmistir.");
        }



    }

    public static void kullanimSayisiBul2(String cumle, String istenenKelime) {
        int kullanimSayisi=0;
        // forloop ve substring ile yapalim
        for (int i =0; i <cumle.length()-istenenKelime.length() ; i++) {

            if (cumle.substring(i,i+istenenKelime.length()).equals(istenenKelime)) {
                kullanimSayisi++;
            }
            }

        if (kullanimSayisi==0){
                System.out.println("Cumlede aranan kelime yok");
        }else{
                System.out.println("Kelime cumlede " + kullanimSayisi+ " adet kullanilmistir.");
            }

        }


    public static void kullanimSayisiBul1(String cumle,String istenenKelime) {

        int kullanimSayisi=0;
        int index=0;

        while (index<cumle.length()){

            index=cumle.indexOf(istenenKelime,index);

            if (index==-1){
                if (kullanimSayisi==0){
                    System.out.println("Cumlede aranan kelime yok");
                    break;
                }else{
                    System.out.println("Kelime cumlede " + kullanimSayisi+ " adet kullanilmistir.");
                    break;
                }
            }else{
                kullanimSayisi++;
                index++;
            }

        }
    }
}
