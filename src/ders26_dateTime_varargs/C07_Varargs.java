package ders26_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kactane string argument yazılırsa yazılsın
        // Argumentlerın en uzun olanını yazdıran bır method olusturun
        // Not : en uzun kelime olarak bırden fazla kelıme varsa, ılkını yazdırın


        enUzunYazdır("Ilyas","Berivan","Murat");// Berivan
        enUzunYazdır("Mehmet","Vahit","Nurcan","Java","Zafer","Kerime");// Mehmet
        
    }

    private static void enUzunYazdır(String... kelimeler) {

        String enUzunKelime=kelimeler[0];

        for (String eachKelime:kelimeler
             ) {

            if (eachKelime.length()>enUzunKelime.length()){

                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);

    }
}
