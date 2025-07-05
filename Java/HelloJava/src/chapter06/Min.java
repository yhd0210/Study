package chapter06;

import java.util.Scanner;

public class Min {
    // 메소드 오버로딩 : 같은 이름의 메소드를 여러개 구현할 수 있는 기법
    // 메소드 시그니처가 달라야함, 파라미터 갯수, 데이터 타입, 작성 순서
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값:");
        int x = sc.nextInt();
        System.out.print("y값:");
        int y = sc.nextInt();
        System.out.print("z값:");
        int z = sc.nextInt();

        // 두 값의 최소값
        System.out.println("x, y의 최소값은 " + min(x, y) + "입니다.");
        System.out.println("x, y의 최소값은 " + min(x, y ,z) + "입니다.");

        System.out.print("배열 a의 요소 수:");
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }
        // 배열의 최소값
        System.out.println("배열 a의 최소값은 " + min(a) + "입니다.");
    }

    /*static int min(int a, int b) {
        return a < b? a : b;
    }

    static int min(int a, int b, int c) {
        int min = a;

        if(b < min)
            min = b;

        if(c < min)
            min = c;

        return min;
    }

    static int min(int [] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }*/

    // ...은 가변 길이 매개변수로, 0개이상의 int 객체를 전달할 수 있음
    // 이 값들은 내부적으로 배열로 처리됨. Java 5부터 도입
    // 가변 길이 매개변수는 메서드 매개변수의 마지막에만 사용할 수 있음
    static int min(int... a) {
        int min = a[0];
        for (int i = 1; i < a.length ; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
