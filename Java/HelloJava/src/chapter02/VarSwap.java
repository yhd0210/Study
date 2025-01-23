package chapter02;

public class VarSwap {
    public static void main(String[] args) {
        // 변수 선언
        int a = 5, b = 10;
        // a 와 b 의 값을 바꿔보기
        int tmp = a;
        a = b;
        b = tmp;
        // 출력
        System.out.println("a값은 "+a);
        System.out.println("b값은 "+b);
    }
}