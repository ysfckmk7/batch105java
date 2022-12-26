package ders26_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1991,6,22);
        LocalDate bugun=LocalDate.now();

        Period yas=Period.between(dogumTarihi,bugun);
        System.out.println(yas);// P31Y6M
        System.out.println(yas.getYears());// 31

        LocalDate baslangıc=LocalDate.of(2010,8,5);
        LocalDate bıtıs=LocalDate.of(2015,7,20);

        Period gecenZaman=Period.between(baslangıc,bıtıs);
        System.out.println(gecenZaman);// P4Y11M15D
        System.out.println(gecenZaman.getYears());// 4
        System.out.println(gecenZaman.getMonths());// 11
        System.out.println(gecenZaman.getDays());// 15


    }
}
