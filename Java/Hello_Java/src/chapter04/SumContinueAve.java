package chapter04;

import java.util.Scanner;

public class SumContinueAve {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("양의 정수를 더합니다.");
        System.out.print("몇 개를 더할까요? >> ");
        int n = sc.nextInt();
        int sum=0, count = 0;
        for (int i = 0; i < n; i++){
            System.out.print("정수 >> ");
            int temp = sc.nextInt();
            if (temp > 0 ) {
                sum += temp;
                count++;
            }
        }
        System.out.println("합계는 " + sum + "입니다.");
        if (count != 0) System.out.println("평균은 " + sum / count + "입니다.");
    }
}
