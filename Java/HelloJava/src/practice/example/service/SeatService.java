package practice.example.service;

import practice.example.entity.Reservation;
import practice.example.entity.Seat;

import java.util.List;

public class SeatService {

    // region Singleton
    private static SeatService instance;

    private SeatService() {}

    public static SeatService getInstance() {
        if(instance == null)
            instance = new SeatService();

        return instance;
    }
    // endregion

    private List<Seat> seatList = Seat.SEAT_LIST;

    public Seat findSeatById(long seatId) {
        for(Seat seat: seatList) {
            if(seat.getId() == seatId) {
                return seat;
            }
        }

        throw new RuntimeException("좌석 찾기 실패");
    }
}
