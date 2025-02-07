package chapter10;

import java.awt.*;
import java.util.Scanner;

public class ThrowAndCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sw(1. 검사 예외 발생시키기 / 2. 비검사 예외 발생시키기):");
        int sw = sc.nextInt();

        try {
            test(sw);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void test(int sw) throws Exception {
        check(sw);
    }
    static void check(int sw) throws Exception {
        switch (sw) {
            case 1:
                // 검사 예외, 대처가 필수인 예외
                // try문 또는 throws 절에 명시하지 않으면 컴파일 오류가 발생
                throw new Exception("검사 예외 발생");
            case 2:
                // 비검사 예외 대처가 필수는 아닌 예외
                // try문 또는 throws 절에 명시하지 않아도 컴파일 오류가 발생하지는 않음
                throw new RuntimeException("비검사 예외 발생");
        }
    }
}
