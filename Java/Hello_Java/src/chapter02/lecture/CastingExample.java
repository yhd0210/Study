package chapter02.lecture;

public class CastingExample {
    public static void main(String[] args) {
        // 수동 타입 변환 int -> byte (다운 케스팅)
        // 1byte : -128 ~ 127
        byte byteValue = (byte) 128;
        System.out.println(byteValue);

        // 4 byte
        int intValue = 44032;
        // 2 byte ( 0 ~ 65,535 )
        // 양수의 경우 오버플로우, 음수의 경우 언더플로우 발생 가능성을 개발자가 감수해야 함 ( 수동 타입 변환 시 )
        char charValue = (char) intValue;
        System.out.println("charValue = " + charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println("longValue = " + longValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println("doubleValue = " + doubleValue);
    }
}
