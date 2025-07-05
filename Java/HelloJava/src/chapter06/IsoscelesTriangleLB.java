package chapter06;

import java.util.Scanner;

public class IsoscelesTriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            putAsterisks(i+1);
            System.out.println();
        }
    }

    public static void putChar(char c, int n) {
        while(n-- > 0)
            System.out.print(c);
    }

    public static void putAsterisks(int n) {
        putChar('*', n);
    }
}
