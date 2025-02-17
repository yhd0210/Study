package chapter08.lecture;

public class A {
    A () {
        System.out.println("A 객체가 생성됨");
    }

    // 인스턴스 클래스
    class B {
        public B() {
            System.out.println("B 객체가 생성됨");
        }
        int field1;
        void method1() {};
    }

    // 정적 클래스
    static class C {
        public C () {
            System.out.println("C 객체가 생성됨");
        }
        int field1;
        static int field2;
        void method1() {}
        static void method2() {}
    }

    void method() {
        class D {
            public D() {
                System.out.println("D 객체가 생성됨");
            }
            int field1;
            void method1() {};
        }

        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
