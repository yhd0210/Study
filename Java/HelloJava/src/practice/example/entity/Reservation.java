package practice.example.entity;

import practice.example.entity.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reservation extends BaseEntity {

    public static final List<Reservation> RESERVATION_LIST = new ArrayList<>();

    private static long counter = 0;

    {
        this.id = ++counter;
    }

    // 예약자
    private User user;

    // 예약 좌석
    private Seat seat;

    // 시작 시간
    private LocalDateTime startTime;

    // 종료 시간
    private LocalDateTime endTime;

    public Reservation(User user, Seat seat, LocalDateTime startTime, LocalDateTime endTime) {
        this.user = user;
        this.seat = seat;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "user=" + user +
                ", seat=" + seat +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;

        // 자리와 사용자 동일 여부 확인
        if(!Objects.equals(seat, that.seat) && !Objects.equals(user, that.user)) {
            return false;
        }

        // 예약 시간 겹침 여부 확인
        // 예약의 시작 시간이 다른 예약의 종료 시간보다 이전이고
        // 예약의 끝 시간이 다른 예약의 시작 시간보다 이후라면
        // 두 예약이 겹치는 것으로 간주할 수 있음
        return this.startTime.isBefore(that.endTime) && this.endTime.isAfter(that.startTime);
    }

    public User getUser() {
        return user;
    }

    public Seat getSeat() {
        return seat;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
