package thisisjava.ch12.checkproblem.number8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) throws Exception{

        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2024,12,31);

        long untils = ld.until(ld2, ChronoUnit.DAYS);
        System.out.println(untils);




    }
}
