package chapter11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("날짜를 입력하세요 (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(input, formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("입력한 날짜의 요일 : " + dayOfWeek);
    }
}
