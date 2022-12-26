package Deneme_Soruları;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class c08_IfElseStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        String str="Galatasaray";
        String STRR=str.toUpperCase();


      if (str.equals(STRR)){
          System.out.println("büyük harf");
      }else{
          System.out.println("küçük harf");
      }


      //Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin



        char harf='k';

        if (harf>'a'&& harf<'z'){
            System.out.println((char)(harf-32));

      }else{
          System.out.println(harf);
      }







    }
}
