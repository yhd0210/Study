package chapter09.lecture;

public class GenericsExample {
    public static void main(String[] args) {
        // 자바 1.5 이전 (객체 타입에 대한 큰 범위의 자유를 부여)
        // 자바 1.5 이후 지네릭스 도입
        // 지네릭스는 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에
        // 컴파일 시 타입 체크를 해주는 기능임
        // 객체의 타입을 컴파일 시에 체크하기 때문에 타입 안정성을 높이고 형변환의 번거로움이 줄어듦
        // 예) ArrayList와 컬렉션 클래스는 다양한 종류의 객체를 담을 수 있지만 보통은 한 종류의 객체를 담는 경우가 더 많다.
        // 그런데도 꺼낼 때마다 타입체크를 하고 형변환 하는 것은 뷸편함.

        // 지네릭스의 장점
        // 1. 타입 안정성 제공
        // 2. 타입체크와 형변환을 생략할 수 있어 코드가 간결해짐
//        Box<Integer> box1 = new Box<Integer>();
//        box1.setItem(10);
//        Integer value1 =  box1.getItem();
//        System.out.println(value1);
//
//        Box<Boolean> box2 = new Box<Boolean>();
//        box2.setItem(false);
//        Boolean value2 = box2.getItem();
//        System.out.println(value2);
//
//        Box<String> box3 = new Box<>();
//        box3.setItem("ABC");
//        String item = box3.getItem();
//        System.out.println(item);
//
//        Box b = new Box();
//        b.setItem("ABC");
//        b.setItem(new Object());








    }
}
