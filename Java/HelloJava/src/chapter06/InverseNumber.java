package chapter06;

import java.util.ArrayList;
import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean needRetry;
        do {
            // 양의 정수 입력받기
            int n = readPositiveInt(sc);
            // 입력받은 숫자를 반대로 출력
            printInverseNumber(n);
            // 재시도 여부 확인
            needRetry = shouldRetry(sc);
        } while (needRetry);
    }
    public static int readPositiveInt(Scanner sc) {
        int n;
        do {
            System.out.print("양의 정수값: ");
            n = sc.nextInt();
        } while (n <= 0); // 양의 정수가 입력될 때까지 반복
        return n;
    }
    public static void printInverseNumber(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse(); // 숫자를 반대로 뒤집기
        System.out.println("반대로 읽으면 " + sb.toString() + "입니다.");
    }
    public static boolean shouldRetry(Scanner sc) {
        int input;
        do {
            System.out.print("다시 한번?: <Yes....1/No....0>: ");
            input = sc.nextInt();
        } while (input != 1 && input != 0); // 1 또는 0만 입력받을 때까지 반복
        return input == 1; // 1이면 재시도
    }
}
