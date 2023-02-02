package ders30_overriding;

public class FChild extends EParent{
    @Override
    protected void method1() {
        super.method1();
        // eger overrıddıng method ıle bırlıkte overrıdden method da calıssın ıstersek
        // overrıddıng method ıcınden super.method1(); yazabılırız
    }

    protected void method2() {

    }

    public void method3(){
        System.out.println("Child method3");

        // parent class2da aynı ısımde method olmasına ragmen
        // overrıde olarak gorunmedı
        // sebep: parent'daki method3 private access modifier'a sahip oldugundan
        // onu ayrı bır method olarak gorur, override olarak gormez
    }
}
