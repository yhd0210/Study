package chapter06;

import java.util.Scanner;

public class IsoscelesTriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수는 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            putAsterisk(i);
            System.out.println();
        }
    }
    public static void putChar(char c, int n){
        while(n-- > 0 )
            System.out.print(c);
    }
    public static void putAsterisk(int n) {
        putChar('*', n);
    }
}
