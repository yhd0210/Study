package chapter02;

import java.util.Scanner;

// 원의 넓이 : PI * r * r
public class Circle {
    public static void main(String[] args) {
        // 변수 선언문
        final double PI; // final : 1번만 대입 가능하고 이후 변경 불가, 상수 선언
        PI = Math.PI; // Math 클래스의 PI 상수 대입

        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 객체

        double radius; // 반지름 (입력받기)
        double area; // 넓이 (계산하기)

        System.out.print("반지름을 입력하세요 : ");
        radius = sc.nextDouble();
        area = radius * radius * PI;

        System.out.printf("원의 넖이는 %f 입니다.\n", area); // double형, 64bit, 정밀도 약 15자리
        System.out.println();

        System.out.printf("원의 넓이는 %.2f 입니다.\n", area); // 실수형 Format : 6자리 default
        System.out.printf("원의 넓이는 %.15f 입니다. \n",area); // 소수점 15자리까지 출력
        System.out.println();

        // 실수형은 보동소수점 형태로 저장
        // 부동소수점 : 지수부(10의 n승), 가수부(유효 숫자)
        System.out.printf("원의 널이는 %e 입니다. \n",area); // 지수형 format 출력 : 6자리 default
        System.out.printf("원의 널이는 %.15e 입니다. \n ", area); // 소수점 15자리까지 출력

    }
}
