package chapter03.lecture;

public class ShiftOperator {
    public static void main(String[] args) {
        // 1. 산술 쉬프트(부호 변화가 없음 *2, /2 효과)
        // a << b, Left Shift, a의 비트르 왼쪽으로 b만큼 이동 시킴
        // 부호 비트를 유지, 오른쪽에 추가되는 값은 0으로 채움, x2의 효과
        System.out.printf("%32s\n","decimal 3 - LeftShift");
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3)).replace("", "0"));
        // 왼쪽으로 1비트 이동
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3<<1)).replace("", "0"));
        // 왼쪽으로 2비트 이동
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3<<2)).replace("", "0"));
        System.out.println();

        System.out.printf("%32s\n","decimal 3 - LeftShift");
        System.out.print(String.format("%32s\n", Integer.toBinaryString(-3)).replace("", "0"));
        // 왼쪽으로 1비트 이동
        System.out.print(String.format("%32s\n", Integer.toBinaryString(-3>>>1)).replace("", "0"));
        // 왼쪽으로 2비트 이동
        System.out.print(String.format("%32s\n", Integer.toBinaryString(-3>>>2)).replace("", "0"));
        System.out.println();

    }
}
