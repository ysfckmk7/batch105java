package ders15_OverLoading;

public class c02_OverLoadıng {
    public static void main(String[] args) {

        carpım(3,5);// method call sırasında method parantezıne yazılanlara argument denır.//15
        carpım(3.4,2);// double- ınteger ıkı sayının carpımı:6.8

 /*
 Bir class da aynı ısım ve aynı sıgnature a sahıp ıkı method olmaz
 Method overloadıng olan class larda Java hangı methodun calısacagına su sekılde karar verır
 1-once method ısmıne bakar
 2-argument ve parametre uyumuna bakar
 3-argument ve parametre uyumuna bakar
 4-mınumum castıng
  */


    }
                                                        //carpım(3,5);// castıng kontrolu ornegı

    public static void carpım(int sayı1,int sayı2){// 0 castıng var
        System.out.println("ıkı ınteger sayının carpımı:" +sayı1*sayı2);// carpım ınt ınt
    }
    public static void carpım(int sayı3,int sayı4,int sayı5){//3 tane data var
        System.out.println("uc ınteger sayının carpımı:" +sayı3*sayı4*sayı5);//carpım ınt ınt ınt
    }
    public static void carpım(double sayı1,int sayı2){//1 castıng var
        System.out.println("double-ınteger sayının carpımı:" +sayı1*sayı2);//carpım double ınt
    }
    public static void carpım(int sayı1,double sayı2){//1 castıng var
        System.out.println("ınteger-double iki sayının carpımı:" +sayı1*sayı2);//carpım ınt double
    }
    public static void carpım(double sayı1,double sayı2){//2 castıng var
        System.out.println("double-double iki sayının carpımı:" +sayı1*sayı2);//carpım double double
    }



}




