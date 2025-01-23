package chapter04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int targetNumber = 10 + rand.nextInt(90); // 맞춰야 하는 숫자 : 10 ~ 99 중에 생성
        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("10부터 99사이의 숫자를 맞추세요.");
        int guessNumber;
        while (true){
            System.out.print("숫자 입력 > ");
            guessNumber = sc.nextInt();
            if (guessNumber == targetNumber){
                System.out.println("정답입니다.");
                break;
            } else if(guessNumber > targetNumber){
                System.out.println("더 작은 숫자입니다.");
            } else if (guessNumber < targetNumber){
                System.out.println("더 큰 숫자입니다.");
            }
        }
    }
}
