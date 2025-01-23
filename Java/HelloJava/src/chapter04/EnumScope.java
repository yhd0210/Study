package chapter04;

import java.util.Scanner;

public class EnumScope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 A : ");
        int a = sc.nextInt();
        System.out.print("정수 B : ");
        int b = sc.nextInt();

        if (a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        do {
            System.out.print(a + " ");
            a += 1;
        } while(a<=b);
        System.out.println();
    }
}
