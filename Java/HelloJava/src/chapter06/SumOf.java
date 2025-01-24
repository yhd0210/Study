package chapter06;

import java.util.Scanner;

public class SumOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "]");
            x[i] = sc.nextInt();
        }
        System.out.println("모든 요소의 합은 " + sumOf1(x) + "입니다.");
        System.out.println("모든 요소의 합은 " + sumOf2(x) + "입니다.");
    }
    public static int sumOf1(int[] a ) {
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    private static int sumOf2(int[] a) {
        int sum = 0;
        for(int value : a) {
            sum += value;
        }
        return sum;
    }
}
