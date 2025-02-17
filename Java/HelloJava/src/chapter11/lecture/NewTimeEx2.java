package chapter11.lecture;

import java.time.LocalDateTime;

public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.of(2015,12,31,12,34,56);
        LocalDateTime dt2 = LocalDateTime.now();

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println();
    }
}
