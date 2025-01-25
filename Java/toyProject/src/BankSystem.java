import java.util.*;

public class BankSystem {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean login() {
        System.out.print("사용자 이름을 입력하세요: ");
        String userName = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String userPW = scanner.nextLine();
        for (User user : User.getUserDb()) {
            if (user.getUserName().equals(userName) && user.getUserPW().equals(userPW)) {
                System.out.println("로그인 성공! 환영합니다, " + userName + "님.");
                return true;
            }
        }
        System.out.println("로그인 실패: 사용자 이름 또는 비밀번호가 잘못되었습니다.");
        return false;
    }

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

    public static void checkBalance(String userName) {
        Bank userBank = Bank.searchBankUser(userName);  // Bank에서 계좌 정보 찾기
        if (userBank != null) {
            System.out.println(userBank.getUserName() + "님의 계좌는 " + userBank.getAccount() + "입니다.");
            System.out.println("잔액: " + userBank.getBalance() + "원");
        } else {
            System.out.println("계좌 정보를 찾을 수 없습니다.");
        }
    }



    public static void deposit(String userName, int amount) {
        Bank userBank = Bank.searchBankUser(userName);  // Bank에서 계좌 정보 찾기
        if (userBank != null) {
            userBank.balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + userBank.getBalance() + "원");
        } else {
            System.out.println("계좌 정보를 찾을 수 없습니다.");
        }
    }

    public static void withdraw(String userName, int amount) {
        Bank userBank = Bank.searchBankUser(userName);  // Bank에서 계좌 정보 찾기
        if (userBank != null) {
            if (userBank.getBalance() >= amount) {
                userBank.balance -= amount;
                System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + userBank.getBalance() + "원");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("계좌 정보를 찾을 수 없습니다.");
        }
    }

    public static void transfer(String senderName, String recipientAccount, int amount) {
        Bank senderBank = Bank.searchBankUser(senderName);  // 송금자 계좌 찾기
        Bank recipientBank = null;
        for (Bank bank : Bank.getBankDb()) {
            if (bank.getAccount().equals(recipientAccount)) {
                recipientBank = bank;  // 수취인 계좌 찾기
                break;
            }
        }

        if (senderBank == null) {
            System.out.println("송신자 계좌 정보를 찾을 수 없습니다.");
            return;
        }
        if (recipientBank == null) {
            System.out.println("수취인 계좌번호를 찾을 수 없습니다.");
            return;
        }
        if (senderBank.getBalance() >= amount) {
            senderBank.balance -= amount;
            recipientBank.balance += amount;
            System.out.println(amount + "원이 " + recipientBank.getUserName() + "님의 계좌로 송금되었습니다. 현재 잔액: " + senderBank.getBalance() + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

