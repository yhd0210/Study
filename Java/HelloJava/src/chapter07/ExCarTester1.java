package chapter07;

import chapter06.Day;

public class ExCarTester1 {
    public static void main(String[] args) {
        Car car1 = new ExCar("U211",
                1850,1500, 5200,80.0,
                new Day(2022,3,12));

        ExCar car2 = new ExCar("W211",
                1845,1490, 5205,90.0,
                new Day(2024,3,12));

        Car x;      // 부모 참조 변수는
        x = car1;   // 자신의 클래스형 인스터느를 참조할 수 있다 (당연)
        x = car2;   // 하위(자식) 클래스형의 인스턴스도 참조할 수 있다!

        ExCar y;    // 자식 참조 변수는
        //y = car1; // 상위 클래스형의 인스턴스를 참조할 수 없다.
        y = car2;   // 자신의 클래스형 인스턴스를 참조할 수 있다

        System.out.println("y의 구입일:"+y.getPurchaseDay());
        System.out.println("y의 총 주행 거리:"+y.getTotalMileage());
    }
}
