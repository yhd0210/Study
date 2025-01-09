package chapter04;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();

        int daysInMonth = 0;
        // 31 - 1,3,5,7,8,10,12
        // 30 - 4,6,9,11
        // 28 - 2
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                System.out.println("유효하지 않은 월입니다.");
                break;
        }
        if (daysInMonth != 0) System.out.printf("%d 월은 %d 일까지 있습니다.", month, daysInMonth);
    }
}
