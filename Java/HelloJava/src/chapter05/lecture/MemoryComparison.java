package chapter05.lecture;

import java.util.Random;
import java.util.Scanner;

public class MemoryComparison {
    public static void main(String[] args) {
        // 기본 자료형 ( Primitive Type ) : 숫자 (int), 문자 (char) 등 단순 값을 지정
        int i = 1; // 메모리 번지에 i라는 이름의 라벨링을 붙임. 해당 값이 메모리 4byte 공간에 저장
        float f = 10.f;
        char c = 'A';

        // 참조 자료형 (Reference Type) : 클래스, 문자열(String), 배열 등
        // Heap 메모리에 객체를 만들고, 다른 곳에 그 주소를 저장함
        // new 연산자 : Heap 메모리에 새로운 객체를 만듦
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 문자열 리터럴 방식 : 문자열 객체 생성
        String str1 = "Hello"; // 리터럴로 선언된 문자열은 Heap 메모리의 String Constant Pool에 저장

        // String.valueOf() : 객체 생성을 최적화, 정적 팩토리 메서드 패펀, 객체 직접 생성 x 캡슐화해서 기존 문자열 재사용
        // 동일한 문자열을 반환할 수 있는 경우, 새로운 객체를 생성하지 않고 기존의 문자열의 주소 반환
        // 다양한 타입의 값을 문자열로 반환할 수 있음
        String str2 = String.valueOf("Hello");

        // new 연산자로 선언 : 무조건 새로운 공간을 만든다
        String str3 = new String("Hello");

        // == 비교 (주소값 비교)
        System.out.println("== 비교 : ");
        System.out.println("str1 == str2 : " + (str1 == str2)); // true, String Pool에 창조했기 떄문에
        System.out.println("str1 == str3 : " + (str1 == str3)); // false
        System.out.println("str2 == str3 : " + (str2 == str3)); // false
        System.out.println();

        // equals ( 값 비교 )
        System.out.println("equals() 비교 : ");
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true
        System.out.println("str2.equals(str3) : " + str2.equals(str3)); // true
        System.out.println();
    }
}
