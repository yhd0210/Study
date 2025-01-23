package chapter03;

import java.util.Scanner;

public class ShiftValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 x를 n비트 시프트 합니다.");
        System.out.print("x : ");
        int x = sc.nextInt();
        System.out.print("n : ");
        int n = sc.nextInt();

        int mPower = x * (int) Math.pow(2.0, n);
        int dPower = x / (int) Math.pow(2.0, n);
        int lShift = x << n;
        int rShift = x >> n;

        System.out.printf("[1] %d x (2의 %d승) = %d\n", x, n, mPower);
        System.out.printf("[2] %d / (2의 %d승) = %d\n", x, n, dPower);
        System.out.printf("[3] %d << %d = %d\n", x, n, lShift);
        System.out.printf("[4] %d >> %d = %d\n", x, n, rShift);

        System.out.println("[1]와 [3]의 값이 일치" + (mPower == lShift ? "합니다." : "하지 않습니다."));
        System.out.println("[2]와 [4]의 값이 일치" + (dPower == rShift ? "합니다.":"하지 않습니다."));
    }
}
