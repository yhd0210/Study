package chapter04;

import java.util.Scanner;

public class Sort2Descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a : ");
        int a = sc.nextInt();
        System.out.print("정수 b : ");
        int b = sc.nextInt();
        if (a<b){
            int tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println("a >= b 가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
    }
}
