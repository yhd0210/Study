package chapter02;

// import문 : 다른 클래스 불러오기, package 선언 이후 && 클래스 선언 이전에 작성
import java.util.Scanner;

public class Scaninteger {
    public static void main(String[] args) {
        // import 문을 작성 하면 다른 package 의 클래스 사용 가능
        Scanner sc = new Scanner(System.in); // System.in << 표준 입력(키보드)||new 함수 << Memory 안에 Heap 공간에 새로운 공간 만드는 거

        // primitive type (기본, 원시 자료형)
        int value; // 정수 값을 담을 변수

        System.out.println("정수값 : ");

        // keyboard 를 통해 입력한 변수를 받는다
        value = sc.nextInt();

        System.out.println(value + "를 입력했습니다.");
    }
}
