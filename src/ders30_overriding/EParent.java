package ders30_overriding;

public class EParent extends DGrandParent{


    @Override
    protected void method1() {
        System.out.println("p method1");

        // @override notasyonu overriden method ile overriding method'u ilişiklendirir
        // eğer overriden method'da bu ilişkiyi bozacak bir değişiklik yapılırsa
        // @override CTE verir.
    }

    protected void method2(){
        System.out.println("P method2");
    }

    private void method3(){
        System.out.println("P method3");
    }
}
