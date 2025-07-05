package chapter07.lecture;

public class Car {

    public int speed;

    protected int numberOfDoor;

    public Car() {}

    protected Car(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public void speedUp() {
        speed += 1;
        System.out.println("speed = " + speed);
    }
    
    // final 메소드
    public final void stop() {
        speed = 0;
        System.out.println("차를 멈춤");
    }
}
