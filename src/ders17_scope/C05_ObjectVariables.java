package ders17_scope;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        // C03 class ındakı instance variable lara nasıl ulasbılırız ?
        // instance variable ların dıger adı obje varıable larıdır
        // istance variable lara obje uzerınden ulasabılırız

        C03_ObjectVariables pers1=new C03_ObjectVariables();

        System.out.println(pers1.persİsmi);// isim girilmedi
        System.out.println(pers1.persYasi);// 0

        pers1.persİsmi="Süleyman";
        pers1.persTelefonu="05550000000";
        pers1.persYasi=33;

        System.out.println(pers1.persİsmi);// Süleyman
        System.out.println(pers1.persTelefonu);// 05550000000
        System.out.println(pers1.persYasi);// 33


        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.persİsmi="Latife";
        pers2.persYasi=32;
        pers2.persTelefonu="13115151";

        System.out.println(pers1.persİsmi);// Süleyman
        System.out.println(pers2.persİsmi);// Latife


        C03_ObjectVariables pers3=new C03_ObjectVariables();

        pers3.persİsmi="Heysem";
        pers3.persYasi=30;
        pers3.persTelefonu="123456";

        System.out.println(pers1.persYasi);// 33
        System.out.println(pers2.persYasi);// 32
        System.out.println(pers3.persYasi);// 30













    }
}
