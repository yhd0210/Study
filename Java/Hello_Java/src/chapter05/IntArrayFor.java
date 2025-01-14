package chapter05;

public class IntArrayFor {
    public static void main(String[] args) {
        int[] a = new int[5];
        // 배열 요소에 정수 대입
        for (int i = 0; i < a.length; i++) {
            a[i] = 5 - i;
        }
        // 배열 요소 출력
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
    }
}
