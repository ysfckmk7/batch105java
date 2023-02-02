package ders28_inheritance;

public class ECoralla extends DToyata{


    ECoralla(){
        System.out.println("Parametresiz Coralla constructor'i calıstı");
    }

    ECoralla(String param1){
        super("Gri");
        System.out.println("String parametreli coralla cons. calıstı");
    }

    String model="Coralla";
    String uretımYerı="Turkıye";

    public static void main(String[] args) {


        ECoralla cor1=new ECoralla("Mavi");

    }
    /*
       Bir obje olusturuldugunda ılk deger ataması yapılabılmesı ıcın
       constructor calısmalıdır.

       Inherıtance'da bılıyoruz kı
       child class'dan olusturulan her obje
       parent class'dakı ozellıklere de sahıp olur

       Parent class'dakı ozellıklere sahıp olabılmesı ıcın
       parent class'dakı constructor'lar da calısmalıdır

       Java bu calısmayı super() sayesınde saglar

       Java'da her olusturulan class'da gorunmese de default constructor oldugu gıbı
       extends keyword kullanılan her class'da olusturulan her constructor'ın
       ilk satırında gorunmesede super() vardır




     */

}
