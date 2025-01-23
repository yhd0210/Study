package chapter02.lecture;

public class IntegerExample {
    public static void main(String[] args) {
        // 정수형 데이터 타입 : byte(1byte), short(2byte), int(4byte), long(8byte)
        // 1 byte == 8 bit, -128 ~ 127
        byte a = 127;
        // a += 1;
        System.out.println(a);

        // -32,768 ~ 32,767
        short b = 50;
        b = (byte) -32769;
        System.out.println(b);

        // -21억 ~ 21억
        int c = -10;
        c = 2_147_483_647;
        System.out.println(c);

        // -2^63 ~ 2^63-1
        long  d = -50;
        d = -9_223_372_036_854_775_807L;
        System.out.println(d);
    }
}
