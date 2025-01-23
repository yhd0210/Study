package practice;

import java.util.Scanner;

public class Problem_04_7 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        int money = 0, n = 0;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("-------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("-------------------------");
            System.out.print("선택>");
            balance = sc.nextInt();
            switch (balance){
                case 1:
                    System.out.print("예금액>");
                    n = sc.nextInt();
                    money += n;
                    break;
                case 2:
                    if (money == 0) {
                        System.out.println("계좌 잔고가 없습니다.");
                        break;
                    }
                    System.out.print("출금액>");
                    n = sc.nextInt();
                    if (money - n < 0){
                        System.out.println("계좌 잔고가 부족합니다.");
                    } else money -= n;
                    break;
                case 3:
                    System.out.println("잔고>"+money);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("숫자를 잘못 입력하셨습니다.");
            }
        }
    }
}
