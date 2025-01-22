package chapter06.lecture;

public class Calculator {
    public static double add (double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract (double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply (double num1, double num2) {
        return num1 * num2;
    }
    public static double divide (double num1, double num2) {
        return num1 / num2;
    }
    public static double power (double num1, double num2) {
        return Math.pow(num1, num2);
    }
    public static double squareRoot (double num) {
        if(num>=0)
            return Math.sqrt(num);
        else
            throw new ArithmeticException("음수의 제곱근은 표현 불가");
    }
    public static double absoluteValue (double num) {
        return Math.abs(num);
    }
}
