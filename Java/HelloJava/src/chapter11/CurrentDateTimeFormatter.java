package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss");
        String formattedDateTime1 = now.format(formatter1);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH:mm:ss");
        String formattedDateTime2 = now.format(formatter2);


        System.out.println("현재 날짜와 시간: " + formattedDateTime1);
        System.out.println("현재 날짜와 시간: " + formattedDateTime2);
    }
}
