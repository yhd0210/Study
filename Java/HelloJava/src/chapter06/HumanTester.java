package chapter06;

public class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human("홍길동", 170, 60);
        Human chulsu = new Human("김철수", 166,72);

        System.out.println("이름:" + gildong.getName());
        System.out.println("신장:" + gildong.getHeight() + "cm");
        System.out.println("체중:" + gildong.getWeight() + "kg");
        System.out.println();
        System.out.println("이름:" + chulsu.getName());
        System.out.println("신장:" + chulsu.getHeight() + "cm");
        System.out.println("체중:" + chulsu.getWeight() + "kg");
        System.out.println();

        System.out.println(gildong.getName() + " 몸무게 5kg 증가 전 : " + gildong.getWeight());
        gildong.gainWeight(5);
        System.out.println(gildong.getName() + " 몸무게 5kg 증가 후 : " + gildong.getWeight());
    }
}
