package ders28_inheritance;

public class BDoktor extends APersonel{

    /*
       Olusturdugumuz Doktor class'inda isim soyisim gibi
       Personel class'inda olusturulan tum ozellıklerın olmasını ıstıyoruz
       Bu durumda 2 tercıh var
           1-istenen tum ozellıklerı Doktor class'ında yenıden olusturabılmek
           2-Doktor class'ını Personel'ın chıld'ı yapmak

       Doktor class'ını Personel class'ının chıld'ı yaptıgımızda
       Doktor class'ında olusturulan objeler
       sadece kendı class'larındakı ozellıklere sahıp olmaz
       aynı zamanda parent class'ı olan personel'dekı
       ozellıklere de sahıp olurlar

       Bır chıld class'dan obje olusturdugumuzda
       o objenın ozellıklerını belırlerken
       once kendı class'ına bakılır ve o ozellık varsa kullanılır
       eger kendı class'ında yoksa parent class'a bakılır


       Bır class extends keyword kullanarak baska bır class'ı
       kendısıne parent edınırse

         1-parent class'dakı tum ozellıklerı dırek kullanabılır
           (isim,soyisim,telefon,ozelSıgorta)
         2-ısterse parent class'da olan bır ozellıgı kendısıne uyarlayabılır
           (maas)
         3-ısterse parent class'da olmayan kendısıne ozel yenı ozellıkler olusturabılır
            (nobet)

     */

    public static void main(String[] args) {
    BDoktor dok1=new BDoktor();
    dok1.isim="Kemal";
    dok1.soyisim="Bulut";

        System.out.println(dok1.isim+","+dok1.soyisim+","+dok1.telefon);
        // Kemal,Bulut,Telefon atanmadı
        dok1.maas();// Doktor maası 30 * 8 * 25 :6000
        dok1.ozelSıgorta();// Tum personelin ozel saglık sıgortası yaptırılır
        dok1.nobet();// Doktorlar haftada 1 gun nobet tutar

    }

    public void maas(){
        System.out.println("Doktor maası 30 * 8 * 25 :" + 6000);
    }
    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutar");
    }

}
