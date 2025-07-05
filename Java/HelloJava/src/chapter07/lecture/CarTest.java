package chapter07.lecture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        // List<Integer> integerList = new LinkedList<>();

        Car sportsCar = new SportsCar();

        System.out.println("speed initValue : " + sportsCar.speed);

        sportsCar.speedUp();
    }
}
