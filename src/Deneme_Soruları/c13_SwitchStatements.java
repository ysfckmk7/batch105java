package Deneme_Soruları;

public class c13_SwitchStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        int gunNo=3;

        switch (gunNo){
            case 1:
                System.out.println("pazartesi:haftaici");
                break;
            case 2:
                System.out.println("sali:haftaici");
                break;
            case 3:
                System.out.println("carsamba:haftaici");
                break;
            case 4:
                System.out.println("persembe:haftaici");
                break;
            case 5:
                System.out.println("cuma:haftaici");
                break;
            case 6:
                System.out.println("cumartesi:haftasonu");
                break;
            case 7:
                System.out.println("pazar:haftasonu");
                break;
            default:
                System.out.println("hafta numarasını yanlıs girdiniz");

        }
        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin

        int AyNo=6;

        switch (AyNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kıs mevsımı");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilk bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("yanlıs mevsim numarası girdiniz");


        }









    }
}
