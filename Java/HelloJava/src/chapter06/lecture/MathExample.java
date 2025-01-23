package chapter06.lecture;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(Calculator.absoluteValue(-5));
        System.out.println(Calculator.add(5,8));
        System.out.println(Calculator.divide(7,2));
        System.out.println(Calculator.power(7,2));
        System.out.println(Calculator.squareRoot(16));
        System.out.println(Calculator.subtract(6,2));

        double PI = Math.PI;
        double radius = 10.0;
        System.out.println(PI*radius*radius);

        System.out.println(Math.max(9.0,7.0));

        double d = 15.0;
        double squareRoot = Math.sqrt(d);

        double power = Math.pow(2, 3);
        System.out.println(power);
    }
}
