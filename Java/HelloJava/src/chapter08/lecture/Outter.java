package chapter08.lecture;

public class Outter {
    // ~ Java version 7
    public void method1(final int arg) {
        final int localVaribale = 1;

        class Inner {
            public void method() {
                int result = arg + localVaribale;
            }
        }
    }

    // Java version 8 ~
    public void method2(int arg) {
        int localVaribale = 1;

        class Inner {
            public void method() {
                int result = arg + localVaribale;
            }
        }
    }
}
