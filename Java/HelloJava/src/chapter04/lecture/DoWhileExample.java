package chapter04.lecture;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("양의 정수 입력 : ");

        do{
            number = sc.nextInt();
            if (number < 0){
                System.out.println("음의 정수를 입력하였습니다.");
            }
        } while(number < 0);
    }
}
