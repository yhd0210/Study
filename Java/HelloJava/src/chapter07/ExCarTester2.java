package chapter07;

import chapter06.Day;

public class ExCarTester2 {
    public static void main(String[] args) {
        Car car1 = new ExCar("U211",
                1850,1500, 5200,80.0,
                new Day(2022,3,12));

        Car car2 = new ExCar("W211",
                1845,1490, 5205,90.0,
                new Day(2024,3,12));

        // 오버라이딩, 메시지를 받은 인스턴스는 자신의 형이 무엇인지 알고 있으며 적절한 동작을 한다.
        car1.putSpec(); // 사양 표시

        System.out.println();

        car2.putSpec(); // 사양 표시


    }
}
