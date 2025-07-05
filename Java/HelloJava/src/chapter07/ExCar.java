package chapter07;

import chapter06.Day;

// 자식(하위, 서브) 클래스
// ExCar는 총 주행거리 추가
public class ExCar extends Car { // Car 클래스 상속
    
    private double totalMileage; // 총 주행 거리

    // 생성자
    public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        super(name, width, height, length, fuel, purchaseDay);
        this.totalMileage = 0;
    }

    // 총 주행 거리
    public double getTotalMileage() {
        return totalMileage;
    }

    // 사양 표시
    @Override
    public void putSpec() {
        super.putSpec();
        System.out.printf("총 주행 거리: %.2f km\n", totalMileage);
    }

    @Override
    public boolean move(double dx, double dy) {
        double distance = Math.sqrt(dx*dx + dy*dy);
        if(super.move(dx, dy)) {
            totalMileage += distance;
            return true;
        } else {
            return false;
        }
    }
}
