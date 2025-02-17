package chapter11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// 올해 날짜 기준으로 올해 크리스마스(12.15)까지 남은 일수를 계산
// 크리스마스가 이미 지났다며느 내년 크리스마스까지 남은 일수를 계산
public class DaysUntilChristmas {
    public static void main(String[] args) {
        // 오늘 날짜 가져오기
        LocalDate today = LocalDate.now();

        // 올해 크리스마스 날짜 설정
        LocalDate christmas = LocalDate.of(today.getYear(), 12, 15);

        // 만약 크리스마스가 이미 지났다면 내년 크리스마스로 변경
        if (today.isAfter(christmas)) {
            christmas = christmas.plusYears(1);
        }

        // 오늘부터 남은 크리스마스까지의 일수 계산
        long daysUntilChristmas = ChronoUnit.DAYS.between(today, christmas);

        // 결과 출력
        System.out.println("크리스마스까지 " + daysUntilChristmas + "일 남았습니다!");
    }
}
