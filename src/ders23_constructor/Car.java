package ders23_constructor;

public class Car {
         /*

         Bir class'dan olusturulabılecek objelerin ozelliklerını
         vaarıable veya method'larla belirleyebiliriz

          */


    String marka = "Marka belirtilmemiştir";
    String model = "Model belirtilmmiştir";

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    int yil = 1900;
    int km;
    String renk = "Renk secilmedi";

    public Car() {

    }

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }

    public static void hareket() {
        System.out.println("Tum arabalar hareket eder");

    }

    public Car(String mrk, String mdl, int yl, int kmetre, String rnk) {
        marka = mrk;
        model = mdl;
        yil = yl;
        km = kmetre;
        renk = rnk;


    }

    /*
     Bir class'da gorunur bır constructor olusturdugumuzda
     Java default constructor'siler
     Bu durumda daha onceden default constructor'i kullanmak obje olusturan class'larda CTE olusur
     Bu tur sorunlara sebep OLMAMAK icin
     biz herhangı bır constructor olusturdugumuzda
     bır tane de parametresız constructor OLUSTURURUZ

     Constructor'da parametre olarak kullanıcıdan gelen degeri
     class level'dekı ınstance varıable' atamalıyız
     eger parametre ısmı ıle ınstance varıable ısmı farklı ıse sorun yok
     java otomatık olarak atamamızı anlayacaktır
     public Car(String mrk, String mdl, int yl, int kmetre, String rnk) gıbı

        marka = mrk;
        model = mdl;
        yil = yl;
        km = kmetre;
        renk = rnk;

    Eger parametre ısımlerını anlasılır olması ıcın ınstance varıable ıle aynı yaparsak
    Java'nın aynı ısımdekı ıkı varıable'ın hangısının parametre,hangısının ınstance olacagını bılmesı gerekır
    bu durumda ınstance varıable'i belırlemek ıcın basına this. yazarız

        public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;


     */


    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n, model='" + model + '\'' +
                "\n, yil=" + yil +
                "\n, km=" + km +
                "\n, renk='" + renk + '\'' +
                '}';
    }

}
