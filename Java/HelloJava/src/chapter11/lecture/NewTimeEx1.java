package chapter11.lecture;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1999,12,31);
        LocalTime birthTime = LocalTime.of(23,59,59);

        System.out.println("today = " + today);
        System.out.println("now = " + now);
        System.out.println("birthDate = " + birthDate);
        System.out.println("birthTime = " + birthTime);

        System.out.println(birthDate.withYear(2000));

        System.out.println(birthDate);
        System.out.println(birthDate.plusDays(1));
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS));
        System.out.println(birthDate.minusDays(1));
        System.out.println(birthDate.minus(1,ChronoUnit.MONTHS));

        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));

        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());

    }
}
