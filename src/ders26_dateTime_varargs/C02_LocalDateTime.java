package ders26_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey"));// 2022-12-22T13:33:27.936082300
        System.out.println(ldt);//

        ldt=LocalDateTime.now();
        System.out.println(ldt);// 2022-12-22T13:33:57.142801200

        System.out.println(ldt.getDayOfWeek());// THURSDAY

        System.out.println(ldt.withYear(2030));// 2030-12-22T13:35:48.999542500 // hangi yılın tarıhını istıyorsak o tarıhe gıdıyoruz.


    }
}
