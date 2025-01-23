package chapter04;

import java.util.Scanner;

public class ThreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        do{
            System.out.print("세 자리의 정수값 : ");
            x = sc.nextInt();
        } while (x<100 || x>999);
        System.out.println("x = " + x);
    }
}
