package chapter02;

// import문 : 다른 클래스 불러오기, package 선언 이후 && 클래스 선언 이전에 작성
import java.util.Scanner;

public class Scaninteger {
    public static void main(String[] args) {
        // import 문을 작성 하면 다른 package 의 클래스 사용 가능
        Scanner sc = new Scanner(System.in); // System.in << 표준 입력(키보드)||new 함수 << Memory 안에 Heap 공간에 새로운 공간 만드는 거

        // primitive type (기본, 원시 자료형)
        int value; // 정수 값을 담을 변수

        System.out.print("정수값 : ");

        // keyboard 를 통해 입력한 변수를 받는다
        value = sc.nextInt();

        System.out.printf("%d를 입력했습니다\n", value);

        // keyboard 로 입력한 정수 값에 10을 더하거나 뺀 값을 표시
        System.out.printf("10을 더한 값은 %d 입니다\n",(value+10));
        System.out.printf("10을 뺀 값은 %d 입니다\n", (value-10));

        // keyboard 로 엽력한 정수 값에 10을 곱하거나 나눈 값을 표시
        System.out.printf("10을 곱한 값은 %d 입니다\n", value*10);
        System.out.printf("10을 나눈 값은 %d 입니다\n", (value/10));

        // keyboard 로 입력한 정수 값에 10으로 나눈 나머지 표시
        System.out.printf("10으로 나머지 연산한 값은 %d 입니다\n",value%10);

        // keyboard 로 입력한 정수 값을 음수로 변환
        System.out.printf("음수로 변환한 값은 %d입니다\n", -value);
    }
}
