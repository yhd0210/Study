package chapter04.lecture;

import java.util.Scanner;

public class BusFareInDasejeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("만 나이 입력 : ");
        int age = sc.nextInt();
        if(age >= 0) {
            if (age >= 19) {
                System.out.println("1500원");
            } else if (age >= 13) {
                System.out.println("750원");
            } else if (age >= 6) {
                System.out.println("400원");
            } else {
                System.out.println("무료");
            }
        } else {
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }
}
