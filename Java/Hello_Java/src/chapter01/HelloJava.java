package chapter01;

import java.sql.SQLOutput;

/**
 * 문서화 주석
 * 작성일 : 2024/12/31
 * 작성자 : 유현담
 */
// 한줄 주석
/* 전통적 주석.
단축기 Ctrl + Shift + /(슬래쉬) */

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("첫 자바 프로그램 입니다."); // 세미클론 필수
        System.out.println("화면에 출력하고 있습니다.");
        System.out.println("첫 java 프로그램입니다. 화면에 출력하고 있습니다.");
        System.out.println("첫 java 프로그램입니다. \n화면에 출력하고 있습니다.");

        System.out.print("첫 java 프로그램입니다.");
        System.out.println("화면에 출력하고 있습니다.");
        System.out.print("첫 java 프로그램입니다.");
        System.out.print("화면에 출력하고 있습니다.");
    }
}