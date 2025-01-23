package chapter02;

public class SumDiff {
    public static void main(String[] args) {
        System.out.println(82+17);
        System.out.println(82-17);
        System.out.println();

        System.out.print("82+17=");
        System.out.println(82+17);
        System.out.print("82-17=");
        System.out.println(82-17);
        System.out.println();

        System.out.println("82+17="+(82+17));
        System.out.println("82-17="+(82-17));
        System.out.println();

        // printf() : format형 출력 ( c언어 문법, 자바에서도 지원 )
        System.out.printf("82 + 17 = %d\n", 82 + 17);
        System.out.printf("82 - 17 = %d\n", 82 - 17);
    }
}
