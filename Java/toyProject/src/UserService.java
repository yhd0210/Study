import java.util.Scanner;

public class UserService {

    public static Scanner scanner = new Scanner(System.in);
    private static String choice = "";

    public static void startSystem(){
        System.out.println("=== 은행 시스템 ===");
        BankSystem.login();
    }

    public static boolean loginSignUpPage () {
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("3. 시스템 종료");
        System.out.print("원하는 작업을 선택하세요: ");
        String retryChoice = scanner.nextLine();
        if (retryChoice.equals("2")) {
            if (BankSystem.register()) {
                System.out.println("이제 로그인해주세요.");
            }
        } else if (retryChoice.equals("3")) {
            return false;
        } else if (!retryChoice.equals("1")) {
            System.out.println("잘못된 선택입니다. 프로그램을 종료합니다.");
        }
        return true;
    }

    public static boolean userServicePage(User user) {
        System.out.println("\n1. 잔액 조회");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 송금");
        System.out.println("5. 계좌 추가");
        System.out.println("6. 로그아웃");
        System.out.print("원하는 작업을 선택하세요: ");
        choice = scanner.nextLine();
        switch (choice) {
            case "1": // 계좌 조회
                BankSystem.checkBalance(user.getUserName());
                break;
            case "2": // 입금
                System.out.print("입금할 금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                BankSystem.deposit(user.getUserName(), depositAmount);
                break;
            case "3": // 출금
                System.out.print("출금할 금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                BankSystem.withdraw(user.getUserName(), withdrawAmount);
                break;
            case "4": // 송금
                System.out.print("수취인 계좌번호를 입력하세요: ");
                String recipientAccount = scanner.nextLine();
                System.out.print("송금할 금액을 입력하세요: ");
                int transferAmount = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                BankSystem.transfer(user.getUserName(), recipientAccount, transferAmount);
                break;
            case "5": // 계좌 추가

            case "6": // 로그아웃
                System.out.println("로그아웃되었습니다.");
                return false;
            default:
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
        }
        return true;
    }
}