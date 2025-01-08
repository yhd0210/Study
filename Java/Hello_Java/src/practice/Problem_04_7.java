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
            if (balance == 1){
                System.out.print("예금액>");
                money = sc.nextInt();
            } else if(balance == 2){
                System.out.print("출금액>");
                n = sc.nextInt();
                money -= n;
            } else if (balance == 3){
                System.out.println("잔고>"+money);
            } else if (balance == 4){
                break;
            }
        }
    }
}
