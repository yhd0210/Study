package chapter04;

import java.util.Scanner;

public class MinMaxEq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();
        System.out.print("정수 b : ");
        int b = sc.nextInt();

        if (a==b) System.out.println("두 값이 같습니다.");
        else{
            int min, max;
            if (a>b) {
                max = a;
                min = b;
            }
            else {
                max = b;
                min = a;
            }
            System.out.println("max = " + max);
            System.out.println("min = " + min);
        }
    }
}
