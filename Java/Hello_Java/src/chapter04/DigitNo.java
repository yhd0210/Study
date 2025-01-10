package chapter04;

import java.util.Scanner;

public class DigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수값 자리수를 표시합니다.");
        int x, digit = 0;
        do {
            System.out.print("양의 정수값 > ");
            x = sc.nextInt();
        } while(x <= 0);
        while (true){
            x = x / 10;
            digit ++;
            if (x<1){
                break;
            }
        }
        System.out.println("입력한 숫자는 "+ digit + "자리입니다.");
    }
}
