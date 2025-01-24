package chapter06;

public class Human {

    private static int counter = 0; // 몇번까지 식별 번호를 부여했는가
    private int id;
    private String name;
    private int height;
    private int weight;
    private Day brithDay;

    // 생성자
    public Human (String name, int height, int weight, Day brithDay) {
        this.id = ++counter;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.brithDay = brithDay;
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

    public Day getBrithDay() {
        return brithDay;
    }

    // 메서드
    void gainWeight(int weight) {
        this.weight += weight;
    }
    void reduceWeight(int weight){
        this.weight -= weight;
    }

    @Override
    public String toString(){
        return "{" + name + ":" + height +"cm " + weight + "kg " + brithDay + " 출생}";
    }
}
