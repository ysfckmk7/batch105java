package ders08_Ternary_Switch;

public class c08_Switchcase {
    public static void main(String[] args) {
       // kullanıcıdan ay numarasını alıp mevsımı yazdırın

       int ayNo=12;

       switch (ayNo){
           case 12:
           case 1:
           case 2:
               System.out.println("kis mevsimi");
           break;
           case 3:
           case 4:
           case 5:
               System.out.println("ilkbahar mevsimi");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("yaz mevsimi");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("sonbahar mevsimi");
               break;
           default:
               System.out.println("yanlıs ay numarası girdiniz");









       }

    }
}

