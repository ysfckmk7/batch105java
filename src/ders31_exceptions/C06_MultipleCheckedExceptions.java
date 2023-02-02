package ders31_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    public static void main(String[] args) {

        // metin txt dosyasındakı yazıları yazdıralım

        /*
            eger bırden fazla catch cumlemız varsa ve exception'lar arasında
            parent-child ilişkisi varsa

            1- ikisini de yazmak istiyorsak, once child exception, sonra parent yazılmalıdır
            aksi takdırde parent ustte olursa, tum exception'lari yakalacagından
            child exception'i yazmak anlamsız olur
            2- ikisini yazmak istemezsek, sadece parent exception yeterli olacaktır
            cunku parent daha kapsayıcıdır ve daha cok exception'i yakalar
         */


        try {
            FileInputStream fis=new FileInputStream("src/ders31_exceptions/metin.txt");
             int k=0;
             while ((k= fis.read())!=(-1)){
                 System.out.print((char)k);
             }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
