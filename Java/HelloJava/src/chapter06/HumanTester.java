package chapter06;

public class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human("홍길동", 170, 60, new Day(2025, 1, 1)); // 2025년 1월 1일
        Human chulsu = new Human("김철수", 166, 72, new Day(2024, 1, 1)); // 2024년 1월 1일

        gildong.gainWeight(3); // 홍길동이 3kg 쪘다. gainWeight에 파라미터 전달
        chulsu.reduceWeight(5); // 김철수가 5kg 빠졌다. reduceWeight에 파라미터 전달

        System.out.println(gildong);
        System.out.println();
        System.out.println(chulsu);
    }
}
