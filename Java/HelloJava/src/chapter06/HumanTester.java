package chapter06;

public class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human("홍길동", 170, 60, new Day(2025,1,1));
        Human chulsu = new Human("김철수", 166,72, new Day(2024,1,1));

        System.out.println(gildong.getName() + " 몸무게 5kg 증가 전 : " + gildong.getWeight());
        gildong.gainWeight(5);
        System.out.println(gildong.getName() + " 몸무게 5kg 증가 후 : " + gildong.getWeight());
        System.out.println();

        System.out.println(gildong);
        System.out.println();
        System.out.println(chulsu);
    }
}
