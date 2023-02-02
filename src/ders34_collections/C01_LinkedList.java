package ders34_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
            Collections objelerı bır arada tutan yapılardır
            Gercek hayattakı ıhtıyaclara gore Java farklı collectıon yapıları olusturmustur
            Bır uygulamada hangı collectıon'ı kullanacagımıza ıstedıgımız ozellıklere gore karar verırız

            Collectıons temel de 3 ana gruba ayrılır ve 3 Interface ıle kuralları belırlenmıstır
                 -List
                 -Queue
                 -Set
            Ancak Interface'lerden obje olusturulamayacagı ıcın
            child class'larının constructor'ları kullanılır
            Burada ozellıklerı belırleyen constructor'ları degıl DATA TURU olarak secılen collectıon'dır

            Ornegın Lınked List olustururken sececegımız data turu
            Queue, Deque, List veya ozellıklerını tasıyan LinkedList'ler olusturabılırız
         */

        LinkedList<List> ll1=new LinkedList<>();
        List<String> ll2=new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4=new LinkedList<>();

    }
}
