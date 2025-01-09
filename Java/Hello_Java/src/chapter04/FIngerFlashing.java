package chapter04;

import java.util.Random;
import java.util.Scanner;

public class FIngerFlashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("가위/바위/보 중에 하나를 선택하세요 > ");
        String userHand = sc.nextLine();

        System.out.print("컴퓨터가 낸 것 > ");
        int computerHand = rand.nextInt(3);
        switch (computerHand){
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
        switch (userHand){
            case "가위":
                if (computerHand == 0) System.out.println("비겼습니다.");
                else if (computerHand == 1) System.out.println("졌습니다.");
                else if (computerHand == 2) System.out.println("이겼습니다.");
                break;
            case "바위":
                if (computerHand == 0) System.out.println("이겼습니다.");
                else if (computerHand == 1) System.out.println("비겼습니다.");
                else if (computerHand == 2) System.out.println("졌습니다.");
                break;
            case "보":
                if (computerHand == 0) System.out.println("졌습니다.");
                else if (computerHand == 1) System.out.println("이겼습니다.");
                else if (computerHand == 2) System.out.println("비겼습니다.");
                break;
        }
    }
}
