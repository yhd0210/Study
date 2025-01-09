package chapter04;

import java.util.Scanner;

public class Grade1 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("점수:");
        int score = sc.nextInt();
        if (score >= 0 && score < 49){
            System.out.println("가");
        } else if (score >= 50 && score <= 59){
            System.out.println("양");
        } else if (score >= 60 && score <= 69){
            System.out.println("미");
        } else if (score >= 70 && score <= 79){
            System.out.println("우");
        } else if (score >= 80 && score <= 100){
            System.out.println("수");
        } else {
            System.out.println("잘못된 점수입니다.");
        }
    }
}
