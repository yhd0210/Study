package chapter04;

import java.util.Scanner;

public class SumBreakAve {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요? >> ");
        int n = sc.nextInt();
        int sum=0, i;
        for (i = 0; i < n; i++){
            System.out.print("정수(0으로 입력받으면 종료) : ");
            int temp = sc.nextInt();
            if (temp == 0) break;
            sum += temp;
        }
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + sum / i + "입니다.");
    }
}