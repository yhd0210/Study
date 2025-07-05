package chapter06;

public class Human {

    // 필드
    private Id id; // 식별 번호

    private String name; // 이름

    private int height; // 신장

    private int weight; // 체중

    private Day birthDay; // 생일

    // 생성자
    public Human(String name, int height, int weight, Day birthDay) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthDay = birthDay;
    }

    // getter
    public Id getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Day getBirthDay() {
        return birthDay;
    }

    // 메서드
    void gainWeight(int weight) {
        this.weight += weight;
    }

    void reduceWeight(int weight) {
        this.weight -= weight;
    }

    // toString()
    @Override
    public String toString() {
        return "{ " + name + ": " + height + "cm " + weight + "kg " + birthDay + "출생 }";
    }
}
