package chapter04;

import java.util.Scanner;

public class IsoscelesTriangleRB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j = 0; j < n; j++){
                if (j<n-i-1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
