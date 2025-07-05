package chapter06;

import java.util.Scanner;

public class SignOf {
    public static void main(String[] args) {
        // x를 입력 받아 동적으로 동작하게끔 하려면?
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 x: ");
        int x = sc.nextInt();

        char sign = signOf(x); // '+', '-' 출력하는 부호 판별 메서드
        System.out.println("signOf(x)는 " + sign + "입니다.");
    }

    public static char signOf(int n) {
        char sign = '0';

        if(n > 0)
            sign = '+';
        else if (n < 0)
            sign = '-';

        return sign;
    }
}
