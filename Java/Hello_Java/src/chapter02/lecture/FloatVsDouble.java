package chapter02.lecture;

// float과 double 정밀도 비교
public class FloatVsDouble {
    public static void main(String[] args) {
        // float의 정밀도 (대략 소수 7자리)
        float f1 = 1.000_000_1f;
        System.out.println("f1 = " + f1);
        float f2 = 1.000_000_01f;
        System.out.println("f2 = " + f2);
        // double의 정밀도 (대략 소수 15자리)
        double d1 = 1.000_000_000_000_001;
        System.out.println("d1 = " + d1);
        double d2 = 1.000_000_000_000_000_1;
        System.out.println("d2 = " + d2);
    }
}