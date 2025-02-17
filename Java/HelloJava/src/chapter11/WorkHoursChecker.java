package chapter11;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkHoursChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("현재 시간을 입력하세요 (HH:mm): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime inputTime = LocalTime.parse(input, formatter);

        LocalTime workStart = LocalTime.of(9,0);
        LocalTime workEnd = LocalTime.of(18, 0);

        if(inputTime.isAfter(workStart) && inputTime.isBefore(workEnd)) {
            System.out.println("근무 중입니다.");
        } else {
            System.out.println("근무 시간이 아닙니다.");
        }
    }
}
