package chapter08.lecture;

class Person {
    void wake() {
        System.out.println("7시에 일어납니다.");
    }
}

class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    void method1() {
        Person localVar = new Person() {
            void work() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                super.wake();
                work();
            }
        };
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        // 익명 객체 필드 사용 (6시에 일어나서 출근하는 사람)
        anony.field.wake();

        // 익명 객체 로컬 변수 사용 (7시에 일어나서 산책하는 사람)
        anony.method1();

        // 익명 객체 매개값 사용
        anony.method2(new Person() {
            void study() {
                System.out.println("공부합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어납니다.");
                study();
            }
        });
    }
}
