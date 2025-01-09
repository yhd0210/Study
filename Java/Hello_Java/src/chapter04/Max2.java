package chapter04;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 실수 입력 : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double max;
        max = (a>=b)?a:b;
        System.out.println("max = " + max);
    }
}
