package chapter04;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, result = 0;
        do {
            System.out.print("2 이상의 정수값 : ");
            n = sc.nextInt();
        } while(n<2);
        // 소수 구하기
        do {
            if (n%i==0) {
                result += 1;
                System.out.print(i + " ");
            }
            i ++;
        } while (i<=n);
        System.out.println();
        // 출력문
        if (result == 2) {
            System.out.println("소수입니다.");
        }else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
