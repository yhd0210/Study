package chapter05;

import java.util.Scanner;

public class ScanStringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 >> ");
        String str = sc.next(); // ex) "안녕"

        System.out.print("반대로 읽으면 ");

        // 거꾸로 읽어서 출력하는 코드 작성
        // ex) "녕안"
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println(" 입니다.");
    }
}