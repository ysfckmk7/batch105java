package ders31_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis=new FileInputStream("src/ders31_exceptions/metin.txt");

        /*
            Bazi kodlari yazdıgımızda Java compıle tıme sırasında
            o kodlarda exception riskini gorur ve bızden bır cozum bekler

            Ozellıkle dosya okuma ve yazma ıle ılgılı
            IO (Input/Output) işlemlerınde Java'ya okuyamazsam, ya yazamazsam dıyerek
            bızden compile time'da cozum ıster

            bu durumda bız exception ile karsılasıldıgında
            kod dursun dıyorsak : method satırına throws keyword kullanarak
                                  beklenılen exception(lar)i deklare edebılırız
                                  Bu sadece olayın farkında oldugumuzu deklare eder
                                  exception fırlatmanın ve kodu durdurmanın onune gecmez
            kod calısmaya devam etsin : try-catch-(finally) blogu kullanabılırız

         */



    }
}
