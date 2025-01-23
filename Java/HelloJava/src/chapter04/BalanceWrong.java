package chapter04;

import java.util.Scanner;

public class BalanceWrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변수 A : ");
        int a = sc.nextInt();

        System.out.print("변수 B : ");
        int b = sc.nextInt();

        if(a>b)
            System.out.println("A가 크다.");
        else if(a < b)
            System.out.println("B가 크다");
        else
            System.out.println("A와 B가 같다");
    }
}
