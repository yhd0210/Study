package chapter04;

import java.util.Scanner;

public class Sort3Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = 0;
        if (a>b){
            tmp = b;
            b = a;
            a = tmp;
        }
        if (b>c){
            tmp = c;
            c = b;
            b = tmp;
        }
        if (a>b){
            tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println("a <= b <= c가 되도록 정렬했습니다.");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
