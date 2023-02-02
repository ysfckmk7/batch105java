package ders32_final_abstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("parent class'dakı mecburı overrıde edılecek method1'i overrıde ettık");
    }

    @Override
    public void method2() {
        System.out.println("parent class'dakı mecburı overrıde edılecek method2'i overrıde ettık");

    }

    /*
         Klasık ınherıtance ile parent child ilişkisi olusturdugumuzda
         Parent class'daki tum ozellıklerı otomatık olarak kazanırız
         Ancak method'ları Override etme MECBURIYETI YOKTUR
         Ister overrıde edıp kendımıze ozellıstırırız
         Istersek de parent class'dakı halıyle kullanırız
     */

    public static void main(String[] args) {
        //DParent obj1=new DParent();
        // 'DParent' is abstract; cannot be instantiated
        // Abstract class'ların constructor'ları vardır ama OBJE URETILEMEZ

        EChild chld1=new EChild();
        chld1.method1();// parent class'dakı mecburı overrıde edılecek method1'i overrıde ettık
        chld1.method2();// parent class'dakı mecburı overrıde edılecek method2'i overrıde ettık
        chld1.method3();// Parent class'daki method 3 calıstı

        DParent child2=new EChild();
        child2.method1();// parent class'dakı mecburı overrıde edılecek method1'i overrıde ettık
        child2.method2();// parent class'dakı mecburı overrıde edılecek method2'i overrıde ettık
        child2.method3();// Parent class'daki method 3 calıstı


    }
}
