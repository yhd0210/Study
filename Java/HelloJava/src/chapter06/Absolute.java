package chapter06;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("int형 정수 a의 값: ");
        int a = sc.nextInt();
        System.out.print("long형 정수 b의 값: ");
        long b = sc.nextLong();
        System.out.print("float형 실수 c의 값: ");
        float c = sc.nextFloat();
        System.out.print("double형 실수 d의 값: ");
        double d = sc.nextDouble();

        System.out.println("a의 절대값은 " + absolute(a) + "입니다.");
        System.out.println("b의 절대값은 " + absolute(b) + "입니다.");
        System.out.println("c의 절대값은 " + absolute(c) + "입니다.");
        System.out.println("d의 절대값은 " + absolute(d) + "입니다.");
    }
    // 절대값 메서드 정의
    public static int absolute(int x) {
        return x < 0 ? -x : x;
    }
    public static long absolute(long x) {
        return x < 0 ? -x : x;
    }
    public static float absolute(float x) {
        return x < 0 ? -x : x;
    }
    public static double absolute(double x) {
        return x < 0 ? -x : x;
    }
}
