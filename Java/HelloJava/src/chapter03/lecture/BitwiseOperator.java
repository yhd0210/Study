package chapter03.lecture;

public class BitwiseOperator {
    public static void main(String[] args) {
        int data = 13;
        // 자바의 진법 변환은 Integer 클래스의 메소드 활용
        // 왜냐하면 출력 메소드는 기본적으로 10진수로 출력하기 때문임

        // 10진수 -> 다른 진법 출력
        System.out.println(Integer.toBinaryString(data)); // 1101, 2진수
        System.out.println(Integer.toOctalString(data)); // 15, 8진수
        System.out.println(Integer.toHexString(data)); // d, 16진수
        System.out.println();

        // 다른 진법 -> 10진수
        System.out.println(Integer.parseInt("1101",2));
        System.out.println(Integer.parseInt("15",8));
        System.out.println(Integer.parseInt("d",16));
        System.out.println();

        // 다양한 진법 리터럴 사용
        System.out.println(13); // 10진수 13
        System.out.println(0b1101); // 2진수 13
        System.out.println(015); // 8진수 13
        System.out.println(0xD); // 16진수 13
        System.out.println();

        // 2. 비트연산자
        // &, AND 비트연산자
        System.out.println(3 & 10);
        System.out.println(0b0011 & 0b1010);
        System.out.println(0x3 & 0xA);
        System.out.println();

        // |, OR 비트연산자
        System.out.println(3 | 10);
        System.out.println(0b0011 | 0b1010);
        System.out.println(0x3 | 0xA);
        System.out.println();

        // ^, XOR 비트연산자
        System.out.println(3^10);
        System.out.println(0b0011^0b1010);
        System.out.println(0x3 ^ 0xA);
        System.out.println();

        // ~, NOT 비트연산자
        System.out.println(~3);
        System.out.println(~0b0011);
        System.out.println(~0x3);
        System.out.println();

    }
}
