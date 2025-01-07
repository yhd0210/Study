package chapter03;

import java.util.Scanner;

public class Diff2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변수 a : ");
        int a = sc.nextInt();

        System.out.print("변수 B : ");
        int b = sc.nextInt();

        int diff = a >= b ? a-b : b-a;

        System.out.println("두 값의 차는 " + diff + "입니다. ");
    }
}
