package chapter10;

import java.util.Scanner;

class RangeError extends RuntimeException {
    public RangeError(String message) {
        super(message);
    }
}

class ParameterRangeError extends RangeError {
    public ParameterRangeError(String message) {
        super(message);
    }
}

class ResultRangeError extends RangeError {
    public ResultRangeError(String message) {
        super(message);
    }
}

// 덧셈 계산기
// RangeError : 0 ~ 9가 아닌 범위 밖 에러 / 자식은 ParameterRangeError, ResultRangeError가 있음
// 입력되는 두 값은 범위 0~9에 속해야하며 아니면 예외를 발생 : ParameterRangeError (매개변수)
// return 되는 결과 값도 범위 0~9가 아니면 예외를 발생 : ResultRangeError (반환값)
public class RangeErrorTester {
    static boolean isValid(int n) {
        return n >= 0 && n <= 9;
    }

    static int add(int a, int b) throws RangeError {
        // 매개변수 범위 체크
        if (!isValid(a)) {
            throw new ParameterRangeError("매개변수 a의 값이 범위를 벗어났습니다: " + a);
        }
        if (!isValid(b)) {
            throw new ParameterRangeError("매개변수 b의 값이 범위를 벗어났습니다: " + b);
        }

        int result = a + b;

        // 결과값 범위 체크
        if (!isValid(result)) {
            throw new ResultRangeError("결과값이 범위를 벗어났습니다: " + result);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = sc.nextInt();
        System.out.print("정수 b: ");
        int b = sc.nextInt();

        try {
            System.out.println("합은 " + add(a, b) + "입니다.");
        } catch (RangeError e) {
            System.out.println("범위 밖 예외가 발생했습니다.\n" + e.getMessage());
        }
    }
}
