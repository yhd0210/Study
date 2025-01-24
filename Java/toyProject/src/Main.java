import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 은행 시스템 ===");

        while (true) {
            System.out.print("사용자 이름을 입력하세요: ");
            String userName = scanner.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            String userPW = scanner.nextLine();
            String choice = "";

            if (BankSystem.login(userName, userPW)) {
                while (true) {
                    System.out.println("\n1. 잔액 조회");
                    System.out.println("2. 입금");
                    System.out.println("3. 출금");
                    System.out.println("4. 송금");
                    System.out.println("5. 로그아웃");
                    System.out.println("6. 종료");
                    System.out.print("원하는 작업을 선택하세요: ");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            BankSystem.checkBalance(userName);
                            break;
                        case "2":
                            System.out.print("입금할 금액을 입력하세요: ");
                            int depositAmount = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            BankSystem.deposit(userName, depositAmount);
                            break;
                        case "3":
                            System.out.print("출금할 금액을 입력하세요: ");
                            int withdrawAmount = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            BankSystem.withdraw(userName, withdrawAmount);
                            break;
                        case "4":
                            System.out.print("수취인 계좌번호를 입력하세요: ");
                            String recipientAccount = scanner.nextLine();
                            System.out.print("송금할 금액을 입력하세요: ");
                            int transferAmount = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            BankSystem.transfer(userName, recipientAccount, transferAmount);
                            break;
                        case "5":
                            System.out.println("로그아웃되었습니다.");
                            break;
                        case "6":
                            System.out.println("종료합니다.");
                            break;
                        default:
                            System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    }

                    if (choice.equals("6") || choice.equals("5")) {
                        break;
                    }
                }
            } else {
                System.out.println("1. 다시 로그인");
                System.out.println("2. 회원가입");
                System.out.print("원하는 작업을 선택하세요: ");
                String retryChoice = scanner.nextLine();
                if (retryChoice.equals("2")) {
                    if (BankSystem.register()) {
                        System.out.println("이제 다시 로그인해주세요.");
                    }
                } else if (!retryChoice.equals("1")) {
                    System.out.println("잘못된 선택입니다. 프로그램을 종료합니다.");
                    break;
                }
            }
            if (choice.equals("6")) {
                break;
            }
        }
        scanner.close();
    }
}
