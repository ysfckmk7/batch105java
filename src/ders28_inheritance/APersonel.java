package ders28_inheritance;

public class APersonel {

       protected String isim="isim atanmadı";
       protected  String soyisim="Soyisim atanmadı";
       protected  String telefon="Telefon atanmadı";

       protected void maas(){
            System.out.println("Hastanemızde uygulanan asgarı ucret : " + 1700);
        }

       protected  void ozelSıgorta(){
            System.out.println("Tum personelin ozel saglık sıgortası yaptırılır");
        }

        private void privateMethod(){
            System.out.println("private method");
        }




}
