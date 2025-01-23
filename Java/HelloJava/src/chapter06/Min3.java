package chapter06;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 3개를 입력 하세요");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(min(a,b,c));
    }
    public static int min(int a, int b,int c) {
        int m = Math.min(a, b);
        return Math.min(m, c);
    }
}
