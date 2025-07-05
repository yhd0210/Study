package chapter08.lecture;

public class AAA {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B {
        void method() {
            // 모든 필드와 메소드에 접근할 수 있음
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            field2 = 10;
            method2();
        }
    }
}
