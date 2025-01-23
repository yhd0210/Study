package chapter04;

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수:");
        int score = sc.nextInt();
        if (score > 100 || score < 0){ // 0 ~ 49
            System.out.println("잘못된 점수입니다.");
        } else if (score >= 80){ // 50 ~ 59
            System.out.println("수");
        } else if (score >= 70){ // 60 ~ 69
            System.out.println("우");
        } else if (score >= 60){ // 70 ~ 79
            System.out.println("미");
        } else if (score >= 50 ){ // 80 ~ 100
            System.out.println("양");
        } else if (score >= 0){
            System.out.println("가");
        }
    }
}
