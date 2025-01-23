package chapter06.lecture;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InitializationExample {
    public static int staticVariable = 10;
    public int instanceVariable = 10;

    static {
        System.out.println("정적 초기화 블록");
        staticVariable = 100;
    }

    {
        System.out.println("인스턴스 초기화 블록");
        System.out.println();
    }

    public InitializationExample() {
        System.out.println("생성자");
        instanceVariable = 200;
    }

    public static void main(String[] args) {
        new Scanner(System.in).nextLine();

        System.out.println("메인 메서드 수행");

        System.out.println(InitializationExample.staticVariable);

        InitializationExample obj = new InitializationExample();

        System.out.println(obj.instanceVariable);
    }
}
