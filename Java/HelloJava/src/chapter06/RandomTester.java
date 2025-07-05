package chapter06;

import java.util.Random;
import java.util.Scanner;

public class RandomTester {
    // a 이상 b 이하의 난수 생성
    public static int generateRandomNumberByRange(int min, int max) throws RuntimeException {
        if(max < min) {
            throw new RuntimeException("하한값이 상한값보다 큽니다.");
        } else if (max == min) {
            return min;
        } else { // 유효한 min과 max를 입력 받았을때
            Random rand = new Random();
            return min + rand.nextInt(max - min + 1); // bound : 전봇대 전기줄 갯수
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("난수를 생성합니다.");
        System.out.print("하한값:");
        int a = sc.nextInt();
        System.out.print("상한값:");
        int b = sc.nextInt();

        System.out.println("생성한 난수는 " + generateRandomNumberByRange(a, b) + "입니다.");
    }
}
