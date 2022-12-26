package ders07_NestedIfSTATEMENTS;

public class c03_NestedIfStatements {
    public static void main(String[] args) {
        // kullanıcıdan cınsıyetını ve yasını alın, kadın 60 yas ve uzerı
        // erkek 65 yas ve uzerı emeklı olabılır
        // cınsıyet ve yasını dıkkate alarak
        // "emeklı olabılırsın" veya "emeklı olmak icin ... Yıl daha calısman gerekır" yazdırın

        char cinsiyet= 'k';
        double yas=-56;

        // nested if- else seklınde kullanım ıcın once ana degıskenı secıp
        // ona gore ana yapıyı olusturalım
        // cınsıyetı ana degısken olsun

        if (cinsiyet=='E' || cinsiyet=='e'){
            if (yas>=65){
                System.out.println("emekli olabilr");
            }else if (yas<65 && yas>0) {
                System.out.println("emeki olması için: " + (65-yas) + " yil gerekir");
            }else{
                System.out.println("gecersiz yaş");
            }
        } else if (cinsiyet=='K' || cinsiyet=='k') {
            if (yas >= 60) {
                System.out.println("emekli olabilr");
            } else if (yas < 60 && yas > 0) {
                System.out.println("emeki olması için: " + (60 - yas) + " yil gerekir");
            } else {
                System.out.println("gecersiz yaş");
            }

        }else{
                System.out.println("yanlıs cınsıyet girişi");
            }

    }
}
