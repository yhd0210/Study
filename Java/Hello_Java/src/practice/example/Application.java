package practice.example;

import practice.example.entity.Seat;
import practice.example.factory.SeatFactory;

public class Application {
    public static void main(String[] args) {
        System.out.println(SeatFactory.getSeats());

        Seat seat1 = SeatFactory.from(1);
        Seat seat2 = SeatFactory.from(1);

        SeatFactory.displaySeats();

        System.out.println(seat1==seat2);

    }
}
