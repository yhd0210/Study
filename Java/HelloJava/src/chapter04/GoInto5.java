package chapter04;

import java.util.Scanner;

public class GoInto5 {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 입력 받기
        System.out.print("정수값 : ");
        int num = sc.nextInt();
        // 출력 예시
        // 이 값은 5로 나누어집니다.
        // 이 값은 5로 나누어지지 않습니다.
        // 음의 정수를 입력했습니다.
        if (num < 0){
            System.out.println("음의 정수를 입력했습니다.");
        }
        else if (num % 5 == 0){
            System.out.println("이 값은 5로 나누어집니다.");
        }
        else if ((num % 5 != 0)){
            System.out.println("이 값은 5로 나누어지지 않습니다.");
        }
    }
}
