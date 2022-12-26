package Deneme_Soruları;

public class c22_ForLoops {
    public static void main(String[] args) {
        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak tum tamsayilari yazdirin,
        //3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz-
        // 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz-
        // hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        /*int sayi=110;

        for (int i = 1; i <=sayi ; i++) {

            if (i%3==0 && i%5==0) {
                System.out.print("fizzBuzz\n ");
            }else if (i%3==0) {
                System.out.print("fizz ");
            }else if (i%5==0) {
                System.out.print("buzz ");
            }else{
                System.out.print(i+ " " );
            }
        }
        System.out.println("");
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.*/

        String str="Galatasaray";

        for (int i =str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i)+ " ");

        }


        System.out.println("");


        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        String STR="BEŞİKTAŞ";

        for (int i =STR.length()-1; i >=0 ; i--) {

            String TERSsTR="";

            TERSsTR+=STR.substring(i,i+1);

            System.out.print(TERSsTR+ " ");
        }


    }
}
