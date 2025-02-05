package chapter07.lecture;

class AirPlane { // 비행기
    // 이륙, 비행, 착륙
    public void takeOff() {
        System.out.println("이륙합니다.");
    }

    public void fly() {
        System.out.println("일반 비행합니다.");
    }

    public void land() {
        System.out.println("착륙합니다.");
    }
}

class SupersonicAirplane extends AirPlane { // 초음속 비행기

    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly(); // Airplane 의 fly() 메서드 호출
        }
    }
}

public class AirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();

        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();

        sa.land();
    }
}
