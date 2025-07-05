package chapter06;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean needRetry;
        
        do {
            // readPlusInt()
            // startRegion : 양의 정수만 입력 받기
            int n;

            do {
                System.out.print("양의 정수값:");
                n = sc.nextInt();
            } while(n <= 0);
            // endRegion : 양의 정수만 입력 받기


            // printInverseNumber()
            // startRegion : 입력 받은 n을 반대로 읽는 로직
            StringBuilder sb = new StringBuilder();

            sb.append(n);
            sb.reverse();

            System.out.println("반대로 읽으면 " + sb + "입니다.");
            // endRegion : 입력 받은 n을 반대로 읽는 로직

            // shouldRetry()
            // startRegion : 재시도 여부 확인
            int input;

            do {
                System.out.print("다시 한 번?: <Yes...1/No...0>:");
                input = sc.nextInt();
            } while(input != 1  && input != 0);

            needRetry = (input == 1);
            // endRegion : 재시도 여부 확인
                    
        } while(needRetry);
    }
}
