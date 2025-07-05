package chapter11.lecture;

import chapter07.lecture.Car;

public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException{
        // 1
        Class clazz = Car.class;

        // 2
        clazz = Class.forName("chapter07.lecture.Car");

        // 3
        Car car = new Car();
        clazz = car.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());

    }
}
