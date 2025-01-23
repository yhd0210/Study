package chapter04;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("양의 정수값 : ");
            n = sc.nextInt();
        } while (n <= 0);
        do {
            System.out.println(n);
            n--;
            System.out.println("n의 값이 " + n + "이 됐습니다.");
        } while(n>=0);
    }
}
