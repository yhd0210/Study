package chapter06;

public class IntegerLimits {
    public static void main(String[] args) {
        System.out.println("정수형의 표현 범위");
        System.out.println("byte형: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short형: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int형 " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long형 " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        // Byte 객체 생성(Wrapper 클래스
        Byte value = Byte.valueOf("100");

        System.out.println(value);
    }
}
