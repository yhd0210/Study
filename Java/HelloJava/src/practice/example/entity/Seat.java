package practice.example.entity;

import practice.example.entity.base.BaseEntity;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

public class Seat extends BaseEntity {

    public static final List<Seat> SEAT_LIST = new ArrayList<>();

    private static final int numberOfSeats = 15;

    static {
        for (int i = 0; i <= numberOfSeats; i++) {
            SEAT_LIST.add(new Seat(i));
        }
    }

    private static long counter = 0;

    public String getDescription() {
        return description;
    }
    
    private String description; // 설명

    public Seat(long id) {
        this.id = id;
        this.description = id + "번 좌석";
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat seat)) return false;

        return id == seat.id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
