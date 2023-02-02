package ders27_StringBuilder;

public class EncapsuleClass {
    /*
       Java class uyelerıne erısımın wrıte and read olarak ayrılması ıstendıgınde
       Encapsulation kullanılır

       Bunun için oncelıkle bu class uyelerıne normal yollarla erısım kapatılır

       sonra ıstedıgımız yetkıyı verecek publıc method olustururuz

     */
    private int satis;// satıs bolumunden deger gırılebılsın ama degerı gorunemesın ==> setter
    private int toplamSatıs=0;// gorulebılsın ==> getter
    private int halkaAcıkSayı=10;// herkese acık olsun ==> getter, setter

    public int getHalkaAcıkSayı() {
        return halkaAcıkSayı;
    }

    public void setHalkaAcıkSayı(int halkaAcıkSayı) {
        this.halkaAcıkSayı = halkaAcıkSayı;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatıs+=this.satis;
    }


    public int getToplamSatıs() {
        return toplamSatıs;
    }










}
