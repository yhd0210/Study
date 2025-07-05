package practice;

import java.util.Scanner;

class CommandRangeException extends RuntimeException {
    public CommandRangeException() {}

    public CommandRangeException(String message) {
        super(message);
    }
}

class InsufficientBalance extends RuntimeException {
    public InsufficientBalance() {}

    public InsufficientBalance(String message) {
        super(message);
    }
}

public class Problem_04_7 {

    protected static int money = 0;

    public static void main(String[] args) {
        boolean run = true;
        while(run){
            try {
                run = commandProcess();
            } catch (InsufficientBalance e) {
                System.out.println(e.getMessage() + " 다시 커맨드창으로 이동합니다.");
                run = true;
            } catch (CommandRangeException e) {
                System.out.println(e.getMessage() + " 커맨드가 보이지 않으시면 옆 창구의 시각 장애인용 ATM기를 이용해주세요.");
                run = false;
            }
        }
    }

    public static boolean commandProcess() throws InsufficientBalance, CommandRangeException{
        int balance = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
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
                    throw new InsufficientBalance("잔고가 부족합니다.");
                } else money -= n;
                break;
            case 3:
                System.out.println("잔고>"+money);
                break;
            case 4:
                return false;
            default:
                throw new CommandRangeException("숫자를 잘못 입력하셨습니다.");
        }
        return true;
    }
}
