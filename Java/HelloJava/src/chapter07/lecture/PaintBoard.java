package chapter07.lecture;

import java.util.ArrayList;
import java.util.List;

// 그릴 수 있는 객체를 나타내는 인터페이스
interface Drawable{
    void draw();
}

// 인테피이스를 상속하는 추상클래스
abstract class Shape implements Drawable {

    // Drawable 인터페이스의 메서드 구현
    // draw 구현을 강제하지 않고 기본 메서드 구현
    // 필요하면 오버라이딩을 하시오. (interface의 default 메서드로 대체 가능)
    public void draw() {
        System.out.println(" 도형을 그립니다.");
    }

    // 추상 메서드 : 구현체 클래스에서 반드시 구현되어야 함
    public abstract double calculateArea();
}

class Circle extends Shape {
    // 반지름
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw(){
        System.out.println("원");
        super.draw();
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("사각형");
        super.draw();
    }
}

public class PaintBoard {
    private List<Drawable> drawableList = new ArrayList<>();

    // 도형을 추가하는 메서드
    public void addShape(Drawable shape) {
        drawableList.add(shape);
    }

    // 모든 도형을 그리는 메서드
    public void drawAllShapes() {
        for(Drawable drawable : drawableList) {
            drawable.draw();
        }
    }

    // 각 도형의 넓이를 계산하여 출력하는 메서드
    public void printAllAreas() {
        for (Drawable drawable : drawableList) {
            if (drawable instanceof java.awt.Shape) {
                double area = ((Shape)drawable).calculateArea();

                System.out.println("도형의 넓이 : " + area);
            }
        }
    }
}
