package ders22_arraysLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int [] arr={3,5,7,8,4,2,6,9,6,4,5};

        // bu array'deki 5'den buyuk olan tum elementleri toplayalım

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {


            if (arr[i]>5){

                toplam+=arr[i];
            }
        }
        System.out.println("For loop ile : " + toplam);// For loop ile : 36

        // for-each loop daha basıt bır kurgu ıle calısır
        // for-each loop'a 3 seyı soylememiz lazım
        // 1- hangi data turunde degıskenlerle ugrasacaksınız
        // 2- loop'un ıcerisınde herbir eleman geldıgınde hangı isimle işlem yapacaksınız
        // 3- hangi array veya collection'dan elemanlar gelecek

        toplam=0;

        for (int each:arr // arr'ye git herbir int'i bana getir

        ){
            if (each>5){
                toplam+=each;
            }

        }

        System.out.println("For-each ile : " + toplam);// For-each ile : 36


    }
}
