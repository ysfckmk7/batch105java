package ders20_multıDimensionalArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {

        // verilen multi dimensional String bir array'deki
        // en uzun String'i bulan kod yazınız

        String [][] arr={{"ilker","Nesrin"},{"Hasan","Heysem","Adem","Yusuf Enes"}};

        String enUzunKelime=arr[0][0];

        for (int i =0; i <arr.length ; i++) {

            for (int j =0; j <arr[i].length ; j++) {

               if ( arr[i][j].length()>enUzunKelime.length()){
                   enUzunKelime= arr[i][j];

               }
            }
        }

        System.out.println("en uzun kelime : " + enUzunKelime);

    }
}
