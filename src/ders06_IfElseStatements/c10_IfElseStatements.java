package ders06_IfElseStatements;

public class c10_IfElseStatements {
    public static void main(String[] args) {
        // kullanıcıdan cınsıyetını ve yasını alın, kadın 60 yas ve uzerı
        // erkek 65 yas ve uzerı emeklı olabılır
        // cınsıyet ve yasını dıkkate alarak
        // "emeklı olabılırsın" veya "emeklı olmak icin ... Yıl daha calısman gerekır" yazdırın

        char cinsiyet='u';
        int yas=65;

        if (cinsiyet=='E' && yas>=65 ){
            System.out.println("emekli olabilir");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("emekli olabiLMEN İÇİN: " + (65-yas) + " yıl daha calısman gerekir");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("emekli olabilir");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("emekli olabilmen icin : "+ (60-yas) + " yıl daha calısman gerekir");
        }else{
            System.out.println("gecersiz giriş");
        }

    }
}
