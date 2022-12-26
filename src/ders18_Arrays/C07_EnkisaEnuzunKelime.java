package ders18_Arrays;

public class C07_EnkisaEnuzunKelime {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki
        //en uzun ve en kisa kelimeleri yazdiran bir method olusturun.


        String [] arr={"Hasan", "Adem", "Senturk", "Omer Faruk"};


        enUzunEnKısaIsımlerıYazdır(arr);

    }


    public static void enUzunEnKısaIsımlerıYazdır(String[] arr){


        String enuzunKelime=arr[0];
        String enkısaKelime=arr[0];


        for (int i =1; i <arr.length ; i++) {

            if (arr[i].length()>enuzunKelime.length()){
                enuzunKelime=arr[i];
            }
            if (arr[i].length()<enkısaKelime.length()){
                enkısaKelime=arr[i];
            }
        }


        System.out.println(enkısaKelime);
        System.out.println(enuzunKelime);

    }




}
