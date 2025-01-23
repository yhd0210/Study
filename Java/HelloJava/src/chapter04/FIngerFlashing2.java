package chapter04;

import java.util.Random;
import java.util.Scanner;

public class FIngerFlashing2 {
    public static String[] value = new String[]{"가위", "바위", "보"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("가위바위보를 얼마나 할지 입력하세요 : ");
        int n = sc.nextInt();
        int cnt = 0, win = 0, lose = 0, equal = 0;

        while (true){
            System.out.println("---------------------------------------");
            System.out.print("가위/바위/보 중에 하나를 입력해 주세요 > ");
            String userHand = sc.next();
            System.out.println("---------------------------------------");
            System.out.print("컴퓨터가 낸 것 > ");
            int x = gameResult(userHand, computerHandResult(rand.nextInt(3)));
            cnt ++;
            if (x == 0){
                win++;
                System.out.println("---------------------------------------");
                System.out.printf("승 : %d | 패 : %d | 무 : %d\n", win, lose, equal);
                System.out.println("---------------------------------------");
            } else if (x == 1){
                lose++;
                System.out.println("---------------------------------------");
                System.out.printf("승 : %d | 패 : %d | 무 : %d\n", win, lose, equal);
                System.out.println("---------------------------------------");
            } else if (x == 2) {
                equal++;
                System.out.println("---------------------------------------");
                System.out.printf("승 : %d | 패 : %d | 무 : %d\n", win, lose, equal);
                System.out.println("---------------------------------------");
            }
            if (n==cnt){
                System.out.println("\n\n=========================================");
                System.out.printf("|| 총 전적 || 승 : %d || 패 : %d || 무 : %d ||\n", win, lose, equal);
                System.out.println("=========================================\n\n");
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
    public static String computerHandResult(int x) {
        String result = "";
        switch (x) {
            case 0:
                System.out.println(value[0]);
                result = value[0];
                break;
            case 1:
                System.out.println(value[1]);
                result = value[1];
                break;
            case 2:
                System.out.println(value[2]);
                result = value[2];
                break;
        }
        return result;
    }
    public static int gameResult(String a, String b){
        int result = 0;
        if ( a.equals(b)){
            System.out.println("비겼습니다.");
            result = 2;
        }
        else {
            switch(a){
                case "가위":
                    if (b.equals(value[1])) {
                        System.out.println("졌습니다.");
                        result = 1;
                    } else if (b.equals(value[2])) {
                        System.out.println("이겼습니다.");
                    }
                    break;
                case "바위":
                    if (b.equals(value[0])) {
                        System.out.println("이겼습니다.");
                    }
                    else if (b.equals(value[2])) {
                        System.out.println("졌습니다.");
                        result = 1;
                    }
                    break;
                case "보":
                    if (b.equals(value[0])) {
                        System.out.println("졌습니다.");
                        result = 1;
                    }
                    else if (b.equals(value[1])) {
                        System.out.println("이겼습니다.");
                    }
                    break;
            }
        }
        return result;
    }
}