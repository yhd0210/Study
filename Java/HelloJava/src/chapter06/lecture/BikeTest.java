package chapter06.lecture;

public class BikeTest {
    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.drive();

        bike.accelerate(1);
        bike.accelerate(2);
        bike.accelerate(-1);

        bike.stop();
    }
}

