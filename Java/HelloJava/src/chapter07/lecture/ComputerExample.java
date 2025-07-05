package chapter07.lecture;

class Calculator {
    // (default) : 같은 패키지 내에서만 호출 가능
    double areaCircle(double r) { // 반지름 값 필요
        System.out.println("Calculator 객체의 areaCircle() 실행");
        
        return 3.14 * r * r;
    }
}

class Computer extends Calculator {
    @Override // 생략 가능하지만 실수를 방지, 컴파일러가 오버라이딩 여부 확인
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");

        return Math.PI * r * r;
    }
}


public class ComputerExample {
    // 실행부
    public static void main(String[] args) {
        double radius = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(radius));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(radius));
        System.out.println();

        // 다형성
        // 부모클래스 변수명 = new 자식클래스();
        Calculator computer2 = new Computer();
        System.out.println("원 면적 : " + computer2.areaCircle(radius));
        System.out.println();
    }
}
