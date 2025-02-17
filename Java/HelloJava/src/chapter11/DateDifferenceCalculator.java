package chapter11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 날짜를 입력하세요. (yyyy-MM-dd): ");
        String firstInput = scanner.nextLine();

        System.out.print("두 번째 날짜를 입력하세요. (yyyy-MM-dd): ");
        String secondInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);

        Period period = Period.between(firstDate, secondDate);

        System.out.println("두 날짜 간의 차이");
        System.out.println(period.getYears() + "년 " + period.getMonths() + "월 " + period.getDays() + "일");
    }
}
