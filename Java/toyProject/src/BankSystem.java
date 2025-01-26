import java.util.*;

public class BankSystem {
    public static Scanner scanner = new Scanner(System.in);

    // 로그인
    public static boolean login() {
        System.out.print("사용자 이름을 입력하세요: ");
        String userName = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String userPW = scanner.nextLine();
        for (User user : User.getUserDb()) {
            if (user.getUserName().equals(userName) && user.getUserPW().equals(userPW)) {
                System.out.println("로그인 성공! 환영합니다, " + userName + "님.");
                UserToken.getUserTokensDb().add(new UserToken(userName,true));
                return true;
            }
        }
        System.out.println("로그인 실패: 사용자 이름 또는 비밀번호가 잘못되었습니다.");
        return false;
    }

    // 회원가입
    public static boolean register() {
        System.out.println("회원가입을 진행합니다.");
        System.out.print("사용자 이름을 입력하세요: ");
        String newUserName = scanner.nextLine();
        for (User user : User.getUserDb()) {
            if (user.getUserName().equals(newUserName)) {
                System.out.println("이미 존재하는 사용자 이름입니다. 다른 이름을 선택하세요.");
                return false;
            }
        }
        System.out.print("비밀번호를 입력하세요: ");
        String newUserPW = scanner.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String newUserPhone = scanner.nextLine();
        User.getUserDb().add(new User(newUserName, newUserPW, newUserPhone));
        System.out.println(newUserName + "님, 회원가입이 완료되었습니다.");
        return true;
    }

    // 잔고 확인
    public static void checkBalance(String userName) {
        List<Bank> userBanks = Bank.searchBankUser(userName);  // 사용자 계좌 리스트
        if (!userBanks.isEmpty()) {
            for (Bank bank : userBanks) {
                System.out.println("계좌번호: " + bank.getAccount() + ", 잔액: " + bank.getBalance() + "원");
            }
        } else {
            System.out.println("계좌 정보를 찾을 수 없습니다.");
        }
    }


    // 계좌 탐색
    public static void deposit(String userName, int amount) {
        List<Bank> userBanks = Bank.searchBankUser(userName);  // 사용자 계좌 리스트
        if (!userBanks.isEmpty()) {
            System.out.println("입금할 계좌를 선택하세요:");
            for (int i = 0; i < userBanks.size(); i++) {
                System.out.println((i + 1) + ". 계좌번호: " + userBanks.get(i).getAccount());
            }
            int choice = scanner.nextInt() - 1;
            scanner.nextLine(); // Clear buffer
            if (choice >= 0 && choice < userBanks.size()) {
                userBanks.get(choice).balance += amount;
                System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + userBanks.get(choice).getBalance() + "원");
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        } else {
            System.out.println("계좌 정보를 찾을 수 없습니다.");
        }
    }

    // 출금
    public static void withdraw(String userName, int amount) {
        List<Bank> userBanks = Bank.searchBankUser(userName);  // 사용자 계좌 리스트
        if (!userBanks.isEmpty()) {
            System.out.println("출금할 계좌를 선택하세요:");
            for (int i = 0; i < userBanks.size(); i++) {
                System.out.println((i + 1) + ". 계좌번호: " + userBanks.get(i).getAccount());
            }
            int choice = scanner.nextInt() - 1;
            scanner.nextLine(); // Clear buffer
            if (choice >= 0 && choice < userBanks.size()) {
                if (userBanks.get(choice).getBalance() >= amount) {
                    userBanks.get(choice).balance -= amount;
                    System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + userBanks.get(choice).getBalance() + "원");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        } else {
            System.out.println("계좌 정보를 찾을 수 없습니다.");
        }
    }

    // 송금
    public static void transfer(String senderName, String recipientAccount, int amount) {
        List<Bank> senderBanks = Bank.searchBankUser(senderName);  // 송금자 계좌 리스트
        Bank recipientBank = null;
        for (Bank bank : Bank.getBankDb()) {
            if (bank.getAccount().equals(recipientAccount)) {
                recipientBank = bank;  // 수취인 계좌 찾기
                break;
            }
        }

        if (senderBanks.isEmpty()) {
            System.out.println("송신자 계좌 정보를 찾을 수 없습니다.");
            return;
        }
        if (recipientBank == null) {
            System.out.println("수취인 계좌번호를 찾을 수 없습니다.");
            return;
        }

        System.out.println("송금할 계좌를 선택하세요:");
        for (int i = 0; i < senderBanks.size(); i++) {
            System.out.println((i + 1) + ". 계좌번호: " + senderBanks.get(i).getAccount());
        }
        int choice = scanner.nextInt() - 1;
        scanner.nextLine(); // Clear buffer
        if (choice >= 0 && choice < senderBanks.size()) {
            Bank senderBank = senderBanks.get(choice);
            if (senderBank.getBalance() >= amount) {
                senderBank.balance -= amount;
                recipientBank.balance += amount;
                System.out.println(amount + "원이 " + recipientBank.getUserName() + "님의 계좌로 송금되었습니다. 현재 잔액: " + senderBank.getBalance() + "원");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }
    // 계좌 추가 메서드
    public static void addNewAccount(String userName) {
        System.out.print("추가할 계좌 번호를 입력하세요: ");
        String newAccount = scanner.nextLine();

        // 기존 계좌번호 중복 확인
        for (Bank bank : Bank.getBankDb()) {
            if (bank.getAccount().equals(newAccount)) {
                System.out.println("이미 존재하는 계좌 번호입니다. 다시 시도하세요.");
                return;
            }
        }

        // 중복되지 않을 경우 계좌 추가
        Bank.getBankDb().add(new Bank(userName, newAccount, 0));
        System.out.println("계좌가 추가되었습니다. 계좌번호: " + newAccount);
    }

}

