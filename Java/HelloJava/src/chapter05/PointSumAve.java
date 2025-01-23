package chapter05;

import java.util.Scanner;

public class PointSumAve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, sum = 0;
        do {
            System.out.print("사람 수 >> ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("사람 수를 1명 이상으로 입력해주세요");
            }
        } while (n <= 0);
        int[] points = new int[n]; // 배열로 선언해서 그방 크기를 n 만큼 설정
        System.out.println("점수를 입력하세요.");
        // 학생들의 점수를 입력 받기
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
            sum += points[i];
        }
        int max = 0;
        int min = points[0];
        for (int i = 0; i < n; i++){
            if (points[i]>=max){
                max = points[i];
            }
            if (points[i] <= min){
                min = points[i];
            }
        }
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균는 " + (double) sum/n + "입니다.");
        System.out.println("최고점는 " + max + "입니다.");
        System.out.println("최저점는 " + min + "입니다.");
    }
}
