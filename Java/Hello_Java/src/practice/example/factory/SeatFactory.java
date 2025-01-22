package practice.example.factory;

import practice.example.entity.Seat;

import java.util.ArrayList;

public class SeatFactory {
    private static final ArrayList<Seat> cache = new ArrayList<>(10);

    static {
        cache.add(new Seat(1));
        cache.add(new Seat(2));
        cache.add(new Seat(3));
        cache.add(new Seat(4));
        cache.add(new Seat(5));
    }

    public static Seat from(int seatNumber) {
        // 캐시에 동일한 seatNumber를 가진 Seat 객체가 있는지 확인
        for (Seat seat : cache) {
            if (seat != null && seat.getId() == seatNumber) { // 동일한 ID 존재 시 반환
                return seat;
            }
        }

        // 동일한 seatNumber가 없으면 새로운 Seat 객체 생성 및 캐시에 추가
        Seat newSeat = new Seat(seatNumber);
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i) == null) { // 빈 공간에 추가
                cache.set(i, newSeat);
                return newSeat;
            }
        }

        // 빈 공간이 없다면 캐시에 새 Seat 추가 (캐시 크기 증가)
        cache.add(newSeat);
        return newSeat;
    }

    public static ArrayList<Seat> getSeats() {
        return cache;
    }

    public static void displaySeats() {
        for (Seat seat : cache) {
            System.out.println(seat);
        }
    }
}
