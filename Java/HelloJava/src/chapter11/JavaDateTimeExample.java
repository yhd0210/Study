package chapter11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 날짜 및 시간" + now);

        LocalDateTime birthTime = LocalDateTime.of(2006,2,10,00,00,00);
        System.out.println("지정된 날짜 및 시간 : " + birthTime);

        LocalDateTime futureDate = now.plusDays(5);
        LocalDateTime pastTime = now.minusHours(3);
        System.out.println("5일후 : " + futureDate);
        System.out.println("3시간 전 : " + pastTime);

        LocalDateTime truncatedTime = now.truncatedTo(ChronoUnit.SECONDS);
        System.out.println("초 단위로 자른 시간 : " + truncatedTime );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("포맷팅된 날짜 : " + formattedTime);

        Instant nowUtc = Instant.now();
        System.out.println("UTC 기준 현재 시간 : " + nowUtc);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("서울 기준 현재 시간 : " + zonedDateTime1);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("도쿄 기준 현재 시간 : " + zonedDateTime2);

        LocalDate startDate = LocalDate.of(2024,1,1);
        LocalDate endDate = LocalDate.of(2024,2,1);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("두 날짜 사이의 일수 차이 : " + daysBetween + "일");

        boolean isAfter = now.isAfter(birthTime);
        boolean isBefore = now.isBefore(birthTime);
        boolean isEqual = now.isEqual(birthTime);
        System.out.println("현재 날짜가 지정된 날짜 이후인가? " + isAfter);
        System.out.println("현재 날짜가 지정된 날짜 이전인가? " + isBefore);
        System.out.println("현재 날짜가 지정된 날짜가 같은가? " + isEqual);

        Instant instantFromLDT = now.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("LocalDateTime -> Instant 변환 : " + instantFromLDT);
        System.out.println("ZoneId.systemDefault(): " + ZoneId.systemDefault());
    }
}
