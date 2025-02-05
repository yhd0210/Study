package chapter06;

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 식별 번호:" + a.getId());
        System.out.println("b의 식별 번호:" + b.getId());

        /*// 클래스 변수 접근 원칙
        System.out.println("Id.counter = " + Id.counter);

        // 권장하지 않음 (인스턴스 변수로 혼동됨)
        System.out.println("a.counter = " + a.counter);
        System.out.println("b.counter = " + b.counter);*/

        // 권장
        System.out.println("마지막에 부여한 식별 번호 = " + Id.getMaxId());

        // 권장하지 않음
        System.out.println("마지막에 부여한 식별 번호 = " + a.getMaxId());
        System.out.println("마지막에 부여한 식별 번호 = " + b.getMaxId());
    }
}
