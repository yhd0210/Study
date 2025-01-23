package practice.example.entity;

public class Seat {

    private long id; // 좌석 번호
    private String description; // 설명

    public Seat(long id) {
        this.id = id;
        this.description = id + "번 좌석";
    }

    public long getId() { // id를 반환하는 getter 메서드
        return id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat seat)) return false;
        return id == seat.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
