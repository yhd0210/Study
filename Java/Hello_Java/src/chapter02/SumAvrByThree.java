package chapter02;

public class SumAvrByThree {
    public static void main(String[] args) {
        // 변수 선언
        int x = 63, y = 18, z = 52;
        // 합계 계산
        int sum = x+y+z , avg = sum / 3;
        // 출력
        System.out.println("x값은 "+ x + "입니다.");
        System.out.println("y값은 "+ y + "입니다.");
        System.out.println("z값은 "+ z + "입니다.");
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + avg + "입니다.");
    }
}
