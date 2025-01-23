package chapter04;

import java.util.Scanner;

public class IsoscelesTriangleRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
