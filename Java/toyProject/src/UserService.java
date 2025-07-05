import java.util.Scanner;

public class UserService {

    public static Scanner scanner = new Scanner(System.in);
    private static String choice = "";

    public static User startSystem() {
        User user;
        System.out.println("=== 은행 시스템 ===");
        while (true) {
            if (loginSignUpPage()) {
                user = BankSystem.login();
                if(user != null){
                    return user;
                }
            } else {
                System.exit(0); // 회원가입 실패 또는 종료 선택 시 프로그램 종료
            }
        }
    }

    public static boolean loginSignUpPage() {
        while (true) {
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("3. 시스템 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            String retryChoice = scanner.nextLine();

            if (retryChoice.equals("1")) {
                return true; // 로그인 시도
            } else if (retryChoice.equals("2")) {
                if (BankSystem.register()) {
                    System.out.println("회원가입이 완료되었습니다. 이제 로그인해주세요.");
                    return true; // 회원가입 후 로그인 시도
                } else {
                    System.out.println("회원가입에 실패했습니다. 다시 시도해주세요.");
                }
            } else if (retryChoice.equals("3")) {
                System.out.println("시스템을 종료합니다.");
                System.exit(0); // 프로그램 종료
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }
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
            case "1": // 잔액 조회
                BankSystem.checkBalance(user.getUserName());
                break;

            case "2": // 입금
                System.out.print("입금할 금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기
                BankSystem.deposit(user.getUserName(), depositAmount);
                break;

            case "3": // 출금
                System.out.print("출금할 금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기
                BankSystem.withdraw(user.getUserName(), withdrawAmount);
                break;

            case "4": // 송금
                System.out.print("수취인 계좌번호를 입력하세요: ");
                String recipientAccount = scanner.nextLine();
                System.out.print("송금할 금액을 입력하세요: ");
                int transferAmount = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기
                BankSystem.transfer(user.getUserName(), recipientAccount, transferAmount);
                break;

            case "5": // 계좌 추가
                BankSystem.addNewAccount(user.getUserName());
                break;

            case "6": // 로그아웃
                System.out.println("로그아웃되었습니다.");
                return false;

            default:
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
        }
        return true;
    }
}
