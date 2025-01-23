package chapter04;

import java.util.Scanner;

public class SquareShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정사각형을 표시합니다.");
        System.out.print("단수는 : ");
        int n = sc.nextInt();
        for (int i =1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
