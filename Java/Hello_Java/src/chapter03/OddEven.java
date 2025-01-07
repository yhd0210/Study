package chapter03;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 n을 입력하세요 : ");
        int n = sc.nextInt();

        boolean isOdd = (n%2 == 1);
        String result = isOdd?"n은 홀수입니다.":"n은 짝수입니다.";

        System.out.println(result);
    }
}
