package practice.example.service;

import practice.example.entity.Reservation;
import practice.example.entity.Seat;
import practice.example.entity.User;
import practice.example.screen.frame.BaseFrame;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationService {
    // region Singleton
    private static ReservationService instance;

    private ReservationService() {}

    public static ReservationService getInstance() {
        if(instance == null)
            instance = new ReservationService();

        return instance;
    }
    // endregion

    private List<Reservation> reservationList = Reservation.RESERVATION_LIST;

    private SeatService seatService = SeatService.getInstance();


    public boolean reserveSeat(long seatId, long hours) {
        Seat findSeat = seatService.findSeatById(seatId);

        return createReservation(BaseFrame.currentUser, findSeat, hours);
    }

    private boolean createReservation(User user, Seat seat, long hours) {
        LocalDateTime now = LocalDateTime.now();

        Reservation entity = new Reservation(user, seat, now, now.plusHours(hours));

        // 예약 추가
        for(Reservation reservation : reservationList) {
            // 혹시나 겹치는 예악이 있는지 확인
            if(reservation.equals(entity)) // 한 좌석에 시간 구간이 겹치면 예약 불가능
                return false;
        }

        reservationList.add(entity);

        return true;

    }
}
