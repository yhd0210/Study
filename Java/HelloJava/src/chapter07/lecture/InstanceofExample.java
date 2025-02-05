package chapter07.lecture;

public class InstanceofExample {
    // instance of : 객체 타입 확인 (맞는지 아닌지 유무만 확인 가능)
    // 다운 캐스팅 하기 전에 실제 instance를 확인하는 작업이 필요
    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        System.out.println("parentA는 Child 인스턴스가 맞나요? " + (parentA instanceof Child));
        System.out.println("parentA는 Parent 인스턴스가 맞나요? " + (parentA instanceof Parent));

        Parent parentB = new Parent();

        System.out.println("parentB는 Child 인스턴스가 맞나요? " + (parentB instanceof Child));
        System.out.println("parentB는 Parent 인스턴스가 맞나요? " + (parentB instanceof Parent));

        method1(parentB);
        method2(parentB); // 예외 발생

    }
    
    public static void method1(Parent parent) {
        if(parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환 실패");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent; // ClassCastException이 발생할 수 있음
        System.out.println("method2 - Child로 변환 성공");
    }
}
