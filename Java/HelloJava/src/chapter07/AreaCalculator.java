package chapter07;

class Shape {
    // 부모 클래스 공통 구현
    public double calculateArea() {
        return 0.0; // 기본 구현
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 원의 면적 계산
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 직사각형의 면적 계산
    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // 반지름 5.0인 원
        Rectangle rectangle = new Rectangle(4.0, 6.0); // 가로 4.0, 세로 6.0인 직사각형

        // 원의 면적과 반지름 출력
        printArea(circle);

        printArea(rectangle);
    }

    static void printArea(Shape shape) {
        System.out.println("Shape Area: " + shape.calculateArea());
    }

    /*static void printArea(Circle circle) {
        System.out.println("Circle Area: " + circle.calculateArea());
    }

    static void printArea(Rectangle rectangle) {
        System.out.println("rectangle Area: " + rectangle.calculateArea());
    }*/
}
