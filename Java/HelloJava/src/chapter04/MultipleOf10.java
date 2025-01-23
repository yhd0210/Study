package chapter04;

import java.util.Scanner;

public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 : ");
        int num = sc.nextInt();
        if (num < 0) System.out.println("음의 정수를 입력했습니다.");
        else if (num % 10 == 0) System.out.println("이 값은 10으로 나누어집니다.");
        else if ((num % 10 != 0)) System.out.println("이 값은 10으로 나누어지지 않습니다.");
    }
}
