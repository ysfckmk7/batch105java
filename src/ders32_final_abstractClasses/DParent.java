package ders32_final_abstractClasses;

public abstract class DParent {


    /* Child class'larin tamamında method1 ve method2'nın MUTLAKA OLAMSINI istiyoroz

        Java parent class'dakı ıstenen methodları child class'ların overrıde etmek
        ZORUNDA KALMASI ıcın abstract class'ını olusturmustur

        Bır class'ı abstract yapmak ıstersek class deklarasyonuna abstract yazmamız yeterlıdır

        Bır abstract class'ın ıcınde child class'ların overrıde etmesı
        MECBURI olan method'lar olabılecegı gıbı MECBURI olmayan method'lar da olabılır

        Child class'ların mutlaka OVERRIDE EDECEGI method'ları da abstract yaparız

        abstract yapılan tum method'lar child class'ların tamamında overrıde edılecegınden
        parent class'dakı abstract method'un body'ye ıhtıyacı olmaz
        Java'da abstract method'ların body'sı olmasına ızın vermez

        Abstract class'larda abstract method'lar bulundugu ıcın
        Abstract class'lardan OBJE URETILEMEZ

     */

    public abstract void method1();

    public abstract void method2();

    public void method3(){
        System.out.println("Parent class'daki method 3 calıstı");

    }

}
