package ders22_arraysLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_Constructor {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Random rand=new Random();

        List<Integer> sayılar=new ArrayList<>();

        // sayılar ArrayList class'ından olusturdugumuz bir objedir
        // ve olusturuldugu class'daki tum ozelliklere(method ve variable'lar) sahiptir

        /*
        Bir class'dan bir obje olusturdugumuzda
        o class'daki tum instance variable'larin bir kopyası olusturulup
        objemizle ilişkilendirilir

        ayrıca o class'da bulunan tum method'lar da objemizle ilişiklendirilir

        Bu işlemleri saglayan java yapısı CONSTRUCTOR'dir
        bu işleme de initialize ( ilk deger ataması) denır

        new keyword ile obje olusturulurken
        esıtlıgın sagında new ile birlikte classIsmi() yazılır

        iste bu classİsmi() o class'in constructor'idir
        constructor, bugune kadar gordugumuz yapılardan farklıdır

        Constructor, bir obje olusturmak istediğimizde devreye girer
        ve ilgili sınıfın tum ozellıklerını obje ile ilişiklendirir(initialize)
         */


    }
}
