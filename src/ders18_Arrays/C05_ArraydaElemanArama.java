package ders18_Arrays;

public class C05_ArraydaElemanArama {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin
        // var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

            int [] arr={1,2,4,5,3,6,7,4,2,3,5,1,3,2};

            int arananEleman=2;

            elemanAra(arr,arananEleman);

    }

    public static void elemanAra(int[] arr, int arananEleman){

        int sayac=0;

        for (int i =0; i <arr.length ; i++) {

            if (arr[i] == arananEleman) {
                sayac++;

            }
        }

            if (sayac==0){
                System.out.println("Aranan sayi array de yok");
            }else{
                System.out.println("Aranan " + arananEleman + " sayisi, arrayde " + sayac + " kere kullanılmiş");
            }
    }

}

