package chapter06;

public class Human {
    private String name;
    private int height;
    private int weight;

    // 생성자
    public Human (String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }

    // 메서드
    void gainWeight(int weight) {
        this.weight += weight;
    }
    void reduceWeight(int weight){
        this.weight -= weight;
    }
}
