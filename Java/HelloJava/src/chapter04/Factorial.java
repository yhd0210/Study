package chapter04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, result = 1;
        do {
            System.out.print("양의 정수값 : ");
            n = sc.nextInt();
        } while ( n <= 0);
//        for (int i = n; i > 1; i--){ // Top_down
//            result *= i;
//        }
        System.out.println("1부터 " + n + "까지의 곱은 " + rescursiveFactorial(n) + "입니다.");
    }
    public static int rescursiveFactorial(int n){ // Top-down
        if(n==1)
            return 1;
        return n * rescursiveFactorial(n-1);
    }
}
