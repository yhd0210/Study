package chapter06.lecture;

public class MathExample {
    public static void main(String[] args) {

        System.out.println("-1의 절대값은 " + Calculator.absoluteValue(-1) + "입니다.");
        System.out.println("2과 1의 합은 " + Calculator.add(2, 1) + "입니다.");
        System.out.println("2과 1의 차은 " + Calculator.subtract(2, 1) + "입니다.");
        System.out.println("2과 1의 곱은 " + Calculator.multiply(2, 1) + "입니다.");
        System.out.println("2를 1로 나누면 " + Calculator.divide(2, 1) + "입니다.");
        System.out.println("2의 4제곱은 " + Calculator.power(2, 4) + "입니다.");
        System.out.println("16의 제곱근은 " + Calculator.squareRoot(16) + "입니다.");

        // Math 클래스의 원주율 상수 호출
        double PI = Math.PI;
        double radius = 10.0; // 반지름
        System.out.println("반지름이 10인 원의 넓이는 " + PI * radius * radius);

        // 최대값 구하기
        System.out.println("9와 7 중 최대값: " + Math.max(9.0, 7.0));
        System.out.println("11, 7, 20 중 최대값: " + Math.max(Math.max(11, 7), 20));

        // Math 클래스의 루트 계산 메소드 호출
        double d = 16.0;
        double squareRoot = Math.sqrt(d);
        System.out.println("16.0의 제곱근: " + squareRoot);

        // Math 클래스의 제곱 메소드 호출
        double power = Math.pow(2, 3);
        System.out.println("2의 3제곱: " + power);
    }
}
