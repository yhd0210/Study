package chapter06;

public class Id {
    static int counter = 0; // 식별 번호를 몇 번까지 부여했는가?

    private long id; // 식별 번호

    public Id() {
        id = ++counter;
    }

    // 식별 번호 가져오기
    public long getId() {
        return id;
    }

    // 마지막에 부여한 식별 번호 가져오기
    public static long getMaxId() {
        return counter;
    }
}
