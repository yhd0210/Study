package chapter07.lecture;

import chapter06.Day;
import chapter07.Car;
import chapter07.ExCar;

public class ExCarTester3 {
    public static void main(String[] args) {
        Car car1 = new ExCar("W221",
                1845, 1490, 5205, 90.0,
                new Day(2015, 12, 24));

        car1.move(10, 10);

        System.out.println("총 주행 거리:" + ((ExCar)car1).getTotalMileage());

        // 기본 자료형 형변환, 범위 : 좁음 -> 넒음 (업캐스팅), 넓음 -> 좁음 (다운 캐스팅)
        // 메모리 크가 (바이트)와는 상관이 없음
        int a = 1;
        // float b = (int) a; // 컴파일러가 자동 추가해줌
        float b = a; // 업캐스팅 (묵시적 형변환, 자동 형변환)

        float c = 1.1f;
        int d = (int) c; // 다운 캐스팅 (명시적 형변환), 오버 또는 언더플로우 가능성

        // 객체(클래스) 형변환, 상위 하위 개념

        // 묵시적 형변환, 자동 형변환 : 하위 참조변수(ExCar)에서 상위 참조변수(Car)로 캐스팅
        // 업캐스팅
        ExCar car2 = new ExCar("W221",
                1845, 1490, 5205, 90.0,
                new Day(2015, 12, 24));

        Car car3;
        // car3 = (Car) car2;
        car3 = car2; // car1의 실제 인스턴스는 ExCar, ExCar(하위) -> Car(상위) 캐스팅
        // 위 코드를 축약
        Car car4 = car2;


        // 명시적 형변환, 수동 형변환 : 상위 참조변수(Car)에서 하위 참조변수(ExCar)로 캐스팅
        // 다운 캐스팅
        // car4의 실제 인스턴스는 ExCar, Car(상위) -> ExCar(하위) 캐스팅
        ExCar car5 = (ExCar) car4;

        ((ExCar)car4).getTotalMileage();

        // 명시적 형변환 불가능한 경우
        // 강제 타입 변환은 실제 인스턴스 부모인 경우엔 자식이 메모리에 없기 때문에 ClassCastException 발생
        // 실제 인스턴스 타입에 따라 결정됨

        Car car6 = new Car("W221",
                1845, 1490, 5205, 90.0,
                new Day(2015, 12, 24));

        // 컴파일러 에러가 발생하지 않음...
        // 강제 형 변환(다운캐스팅)은 컴파일 단계에서 가능하지만, 실행 시점에 실제 인스턴스 타입에 따라 예외 발생
        // ClassCastException 발생
        ExCar car7 = (ExCar) car6;

        System.out.println(((ExCar)car6).getTotalMileage());

        // 컴파일러 에러 발생, 수동으로 형변환 필요 그러나 형변환 하더라도 ClassCastException 발생
//        Car car8 = new Car("W221",
//                1845, 1490, 5205, 90.0,
//                new Day(2015, 12, 24));


    }
}
