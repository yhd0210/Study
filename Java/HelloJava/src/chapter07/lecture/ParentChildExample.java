package chapter07.lecture;

class Parent {
    public void method1() {
        System.out.println("Parent-method1()");
    }

    public void method2() {
        System.out.println("Parent-method2()");
    }
}

class Child extends Parent {
    @Override
    public void method2() {
        System.out.println("Parent-method2()");
    }

    public void method3() {
        System.out.println("Parent-method3()");
    }
}


public class ParentChildExample {
    public static void main(String[] args) {
        // Child child = new Child();

        // Parent parent = (Parent) child;
        Parent parent = new Child(); // 자동 타입 변환 : 앞에 (Parent) 생략

        parent.method1();
        parent.method2(); // 인스턴스가 Child이기 때문에 재정의된 메서드를 호출

        // parent.method3(); // 호출 불가능

        // 참조 변수 타입을 자식 타입으로 사용하면 될 것을 부모 타입으로 굳이 변환해서 사용하는 이유?
        // 호환성 필요 : 프로그램은 수많은 객체들이 서로 연결되고 각자의 역할을 하는데 이 객체들이 다른 객체로 교체 가능
        // 호환성 확보 : 부모클래스를 상속하는 자식 클래스는 부모가 가지고 있는 필드와 메소드를 갖고 있어 사용방법이 동일
        // 호환성 확보 및 다형성 보유 : 부모가 가진 필드를 확장하거나 메소드를 재정의해서 메소드의 실행 내용을 변경 가능
        // 결론 : 자식 타입을 부모 타입으로 변환하여 사용하면 교체가 쉬움
    }
}
