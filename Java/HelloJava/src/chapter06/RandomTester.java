package chapter06;

import java.util.Random;
import java.util.Scanner;

public class RandomTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("난수를 생성합니다.");
        System.out.print("하한 값:");
        int a = sc.nextInt();
        System.out.print("상한 값:");
        int b = sc.nextInt();

        System.out.println("생성한 난수는 " + generateRandomNumberByRange(a, b) + "입니다");
    }
    public static int generateRandomNumberByRange(int min, int max) throws RuntimeException {
        if (min > max) {
            throw new RuntimeException("하한값이 상한값보다 큽니다.");
        }
        else if(max == min) {
            return min;
        }
        else {
            Random random = new Random();
            return 1 + random.nextInt(min-1, max);
        }
    }
}
