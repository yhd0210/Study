package chapter04;

import java.util.Scanner;

public class IsoscelesTriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? : ");
        int n = sc.nextInt();
        for(int x = 0;x<n;x++){
            for(int y = 0; y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
