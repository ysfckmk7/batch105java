package Deneme_Soruları;

public class c11_SwitchStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin

        int AyNo=7;

        switch (AyNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("yanlıs ay numarası girdiniz");
        }

               //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
                //ve girilen harfin karsiligini yazdirin.
                //I : International S : Software T : Testing Q : Qualifications B: Board

                char harf='Q';

                String I="International ";
                String S="Software";
                String T="Testing ";
                String Q="Qualifications ";
                String B="Board";

                switch (harf){
                    case 'I':
                        System.out.println("International");
                        break;
                    case 'S':
                        System.out.println("Software");
                        break;
                    case 'T':
                        System.out.println("Testing");
                        break;
                    case 'Q':
                        System.out.println("Qualifications");
                        break;
                    case 'B':
                        System.out.println("Board");
                        break;
                    default:
                        System.out.println("yanlıs harf girdiniz:)");


                }







    }
}
